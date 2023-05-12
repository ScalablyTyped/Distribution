package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ImagePointResult
import typings.arcgisJsApi.esri.ImagePointResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportImagePointResultMod {
  
  @JSImport("esri/rest/support/ImagePointResult", JSImport.Namespace)
  @js.native
  /**
    * Image service point or centroid measurement result returned when the [ImageryLayer.measurePointOrCentroid()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measurePointOrCentroid) or [imageService.measurePointOrCentroid()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measurePointOrCentroid) methods resolve successfully.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePointResult.html)
    */
  open class ^ ()
    extends StObject
       with ImagePointResult {
    def this(properties: ImagePointResultProperties) = this()
    
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
  @JSImport("esri/rest/support/ImagePointResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ImagePointResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ImagePointResult]
}
