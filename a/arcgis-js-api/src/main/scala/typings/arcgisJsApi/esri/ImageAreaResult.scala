package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageAreaResult
  extends StObject
     with Accessor
     with JSONSupport
     with BaseImageMeasureResult {
  
  /**
    * An object containing results of the area measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAreaResult.html#area)
    */
  var area: MeasurementValue = js.native
  
  /**
    * An object containing results of the perimeter measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAreaResult.html#perimeter)
    */
  var perimeter: MeasurementValue = js.native
}
