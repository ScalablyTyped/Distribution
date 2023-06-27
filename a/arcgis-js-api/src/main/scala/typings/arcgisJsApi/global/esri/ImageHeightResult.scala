package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageHeightResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageHeightResult")
@js.native
/**
		 * Image service height mensuration result returned when the [ImageryLayer.measureHeight()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measureHeight) or [imageService.measureHeight()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measureHeight) methods resolve successfully.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightResult.html)
		 */
open class ImageHeightResult ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageHeightResult {
  def this(properties: ImageHeightResultProperties) = this()
  
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
object ImageHeightResult {
  
  @JSGlobal("__esri.ImageHeightResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageHeightResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageHeightResult]
}
