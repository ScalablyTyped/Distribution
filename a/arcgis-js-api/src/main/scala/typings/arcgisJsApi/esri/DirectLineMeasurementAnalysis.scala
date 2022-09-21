package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectLineMeasurementAnalysis
  extends StObject
     with Accessor {
  
  /**
    * Ending point for the measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DirectLineMeasurementAnalysis.html#endPoint)
    */
  var endPoint: Point = js.native
  
  /**
    * Starting point for the measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DirectLineMeasurementAnalysis.html#startPoint)
    */
  var startPoint: Point = js.native
  
  /**
    * Unit system (imperial, metric) or specific unit used for computing the distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DirectLineMeasurementAnalysis.html#unit)
    */
  var unit: SystemOrLengthUnit = js.native
}
