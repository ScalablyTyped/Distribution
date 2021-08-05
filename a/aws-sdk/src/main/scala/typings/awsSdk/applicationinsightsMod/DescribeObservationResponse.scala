package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeObservationResponse extends StObject {
  
  /**
    * Information about the observation.
    */
  var Observation: js.UndefOr[typings.awsSdk.applicationinsightsMod.Observation] = js.undefined
}
object DescribeObservationResponse {
  
  inline def apply(): DescribeObservationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeObservationResponse]
  }
  
  extension [Self <: DescribeObservationResponse](x: Self) {
    
    inline def setObservation(value: Observation): Self = StObject.set(x, "Observation", value.asInstanceOf[js.Any])
    
    inline def setObservationUndefined: Self = StObject.set(x, "Observation", js.undefined)
  }
}
