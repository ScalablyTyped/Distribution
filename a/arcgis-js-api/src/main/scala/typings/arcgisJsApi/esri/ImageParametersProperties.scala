package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bmp
import typings.arcgisJsApi.arcgisJsApiStrings.exclude
import typings.arcgisJsApi.arcgisJsApiStrings.gif
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.include
import typings.arcgisJsApi.arcgisJsApiStrings.jpg
import typings.arcgisJsApi.arcgisJsApiStrings.pdf
import typings.arcgisJsApi.arcgisJsApiStrings.png
import typings.arcgisJsApi.arcgisJsApiStrings.png24
import typings.arcgisJsApi.arcgisJsApiStrings.png32
import typings.arcgisJsApi.arcgisJsApiStrings.png8
import typings.arcgisJsApi.arcgisJsApiStrings.show
import typings.arcgisJsApi.arcgisJsApiStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageParametersProperties extends StObject {
  
  /**
    * Dots per inch setting for an module:esri/layersMapImageLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#dpi)
    */
  var dpi: js.UndefOr[Double] = js.native
  
  /**
    * Extent of map to be exported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * Map image format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#format)
    */
  var format: js.UndefOr[png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg] = js.native
  
  /**
    * Requested image height in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#height)
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Spatial reference of exported map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#imageSpatialReference)
    */
  var imageSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * Array of layer definition expressions that allows you to filter the features of individual layers in the exported map image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerDefinitions)
    */
  var layerDefinitions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of layer IDs, that represent which layers to include in the exported map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerIds)
    */
  var layerIds: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The option for displaying or hiding the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerOption)
    */
  var layerOption: js.UndefOr[show | hide | include | exclude] = js.native
  
  /**
    * Indicates whether or not the background of the dynamic image is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#transparent)
    */
  var transparent: js.UndefOr[Boolean] = js.native
  
  /**
    * Requested image width in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#width)
    */
  var width: js.UndefOr[Double] = js.native
}
object ImageParametersProperties {
  
  @scala.inline
  def apply(): ImageParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageParametersProperties]
  }
  
  @scala.inline
  implicit class ImageParametersPropertiesMutableBuilder[Self <: ImageParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    @scala.inline
    def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setFormat(value: png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImageSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "imageSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSpatialReferenceUndefined: Self = StObject.set(x, "imageSpatialReference", js.undefined)
    
    @scala.inline
    def setLayerDefinitions(value: js.Array[String]): Self = StObject.set(x, "layerDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerDefinitionsUndefined: Self = StObject.set(x, "layerDefinitions", js.undefined)
    
    @scala.inline
    def setLayerDefinitionsVarargs(value: String*): Self = StObject.set(x, "layerDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setLayerIds(value: js.Array[Double]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdsUndefined: Self = StObject.set(x, "layerIds", js.undefined)
    
    @scala.inline
    def setLayerIdsVarargs(value: Double*): Self = StObject.set(x, "layerIds", js.Array(value :_*))
    
    @scala.inline
    def setLayerOption(value: show | hide | include | exclude): Self = StObject.set(x, "layerOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerOptionUndefined: Self = StObject.set(x, "layerOption", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
