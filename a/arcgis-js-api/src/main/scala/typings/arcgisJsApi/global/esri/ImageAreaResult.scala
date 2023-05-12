package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageAreaResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageAreaResult")
@js.native
/**
  * Image service area and perimeter measurement result returned when the [ImageryLayer.measureAreaAndPerimeter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measureAreaAndPerimeter) or [imageService.measureAreaAndPerimeter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measureAreaAndPerimeter) methods resolve successfully.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAreaResult.html)
  */
open class ImageAreaResult ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageAreaResult {
  def this(properties: ImageAreaResultProperties) = this()
  
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
object ImageAreaResult {
  
  @JSGlobal("__esri.ImageAreaResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageAreaResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageAreaResult]
}
