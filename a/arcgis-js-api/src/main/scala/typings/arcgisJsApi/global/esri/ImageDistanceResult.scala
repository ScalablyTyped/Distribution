package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageDistanceResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageDistanceResult")
@js.native
/**
		 * Image service distance and angle measurement result returned when the [ImageryLayer.measureDistanceAndAngle()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measureDistanceAndAngle) or [imageService.measureDistanceAndAngle()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measureDistanceAndAngle) methods resolve successfully.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceResult.html)
		 */
open class ImageDistanceResult ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageDistanceResult {
  def this(properties: ImageDistanceResultProperties) = this()
  
  /**
  		 * Name of the raster dataset used in the area and height measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureResult.html#name)
  		 */
  /* CompleteClass */
  var name: String = js.native
  
  /**
  		 * Sensor name of the raster dataset used in the area and height measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureResult.html#sensorName)
  		 */
  /* CompleteClass */
  var sensorName: String = js.native
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ImageDistanceResult {
  
  @JSGlobal("__esri.ImageDistanceResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageDistanceResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageDistanceResult]
}
