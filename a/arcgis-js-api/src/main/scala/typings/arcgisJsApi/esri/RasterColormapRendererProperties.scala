package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterColormapRendererProperties extends StObject {
  
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
  implicit class RasterColormapRendererPropertiesMutableBuilder[Self <: RasterColormapRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColormapInfos(value: js.Array[ColormapInfoProperties]): Self = StObject.set(x, "colormapInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColormapInfosUndefined: Self = StObject.set(x, "colormapInfos", js.undefined)
    
    @scala.inline
    def setColormapInfosVarargs(value: ColormapInfoProperties*): Self = StObject.set(x, "colormapInfos", js.Array(value :_*))
  }
}
