package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageryTileMixinProperties extends js.Object {
  
  /**
    * Defines a band combination using 0-based band indexes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#bandIds)
    */
  var bandIds: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#renderer)
    */
  var renderer: js.UndefOr[
    ClassBreaksRendererProperties | UniqueValueRendererProperties | RasterStretchRendererProperties | RasterShadedReliefRendererProperties | RasterColormapRendererProperties
  ] = js.native
  
  /**
    * The URL of the REST endpoint of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#url)
    */
  var url: js.UndefOr[String] = js.native
}
object ImageryTileMixinProperties {
  
  @scala.inline
  def apply(): ImageryTileMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageryTileMixinProperties]
  }
  
  @scala.inline
  implicit class ImageryTileMixinPropertiesOps[Self <: ImageryTileMixinProperties] (val x: Self) extends AnyVal {
    
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
    def setBandIdsVarargs(value: Double*): Self = this.set("bandIds", js.Array(value :_*))
    
    @scala.inline
    def setBandIds(value: js.Array[Double]): Self = this.set("bandIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandIds: Self = this.set("bandIds", js.undefined)
    
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setRenderer(
      value: ClassBreaksRendererProperties | UniqueValueRendererProperties | RasterStretchRendererProperties | RasterShadedReliefRendererProperties | RasterColormapRendererProperties
    ): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
