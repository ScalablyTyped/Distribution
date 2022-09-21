package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSample
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Name-value pairs of fields and field values associated with the [sample location](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#location).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#attributes)
    */
  var attributes: Any = js.native
  
  /**
    * The sample location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#location)
    */
  var location: Point = js.native
  
  /**
    * The location id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#locationId)
    */
  var locationId: Double = js.native
  
  /**
    * The pixel value associated with the sampled location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#pixelValue)
    */
  var pixelValue: js.Array[Double] = js.native
  
  /**
    * The raster id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#rasterId)
    */
  var rasterId: Double = js.native
  
  /**
    * The resolution representing the average of source raster's resolutions in x and y axes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#resolution)
    */
  var resolution: Double = js.native
}
