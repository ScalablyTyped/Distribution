package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageryTileMixinProperties extends StObject {
  
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
  implicit class ImageryTileMixinPropertiesMutableBuilder[Self <: ImageryTileMixinProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandIds(value: js.Array[Double]): Self = StObject.set(x, "bandIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandIdsUndefined: Self = StObject.set(x, "bandIds", js.undefined)
    
    @scala.inline
    def setBandIdsVarargs(value: Double*): Self = StObject.set(x, "bandIds", js.Array(value :_*))
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setRenderer(
      value: ClassBreaksRendererProperties | UniqueValueRendererProperties | RasterStretchRendererProperties | RasterShadedReliefRendererProperties | RasterColormapRendererProperties
    ): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
