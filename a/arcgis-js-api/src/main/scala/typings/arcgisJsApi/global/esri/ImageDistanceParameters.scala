package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageDistanceParametersProperties
import typings.arcgisJsApi.esri.PixelSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageDistanceParameters")
@js.native
/**
		 * Input parameters used by the [ImageryLayer.measureDistanceAndAngle()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measureDistanceAndAngle) or [imageService.measureDistanceAndAngle()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measureDistanceAndAngle) methods to perform imagery distance and angle mensuration.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html)
		 */
open class ImageDistanceParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageDistanceParameters {
  def this(properties: ImageDistanceParametersProperties) = this()
  
  /**
  		 * Specifies the [mosaic rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html) on how individual images should be mosaicked when the measure is computed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureParameters.html#mosaicRule)
  		 */
  /* CompleteClass */
  var mosaicRule: typings.arcgisJsApi.esri.MosaicRule = js.native
  
  /**
  		 * Specifies the pixel size.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureParameters.html#pixelSize)
  		 */
  /* CompleteClass */
  var pixelSize: PixelSize = js.native
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ImageDistanceParameters {
  
  @JSGlobal("__esri.ImageDistanceParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageDistanceParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageDistanceParameters]
}
