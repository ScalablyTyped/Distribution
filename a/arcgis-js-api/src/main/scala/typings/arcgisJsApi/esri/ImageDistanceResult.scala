package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageDistanceResult
  extends StObject
     with Accessor
     with JSONSupport
     with BaseImageMeasureResult {
  
  /**
    * An object containing the azimuth angle measurement values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceResult.html#azimuthAngle)
    */
  var azimuthAngle: MeasurementValue = js.native
  
  /**
    * An object containing results of the distance measurement between two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceResult.html#distance)
    */
  var distance: MeasurementValue = js.native
  
  /**
    * An object containing elevation angle measurement values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceResult.html#elevationAngle)
    */
  var elevationAngle: MeasurementValue = js.native
}
