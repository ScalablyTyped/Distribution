package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterColormapRendererProperties extends js.Object {
  
  /**
    * A colormap info array containing mappings for pixel and RGB color values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html#colormapInfos)
    */
  var colormapInfos: js.UndefOr[js.Array[ColormapInfoProperties]] = js.native
}
object RasterColormapRendererProperties {
  
  @scala.inline
  def apply(): RasterColormapRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterColormapRendererProperties]
  }
  
  @scala.inline
  implicit class RasterColormapRendererPropertiesOps[Self <: RasterColormapRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColormapInfosVarargs(value: ColormapInfoProperties*): Self = this.set("colormapInfos", js.Array(value :_*))
    
    @scala.inline
    def setColormapInfos(value: js.Array[ColormapInfoProperties]): Self = this.set("colormapInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColormapInfos: Self = this.set("colormapInfos", js.undefined)
  }
}
