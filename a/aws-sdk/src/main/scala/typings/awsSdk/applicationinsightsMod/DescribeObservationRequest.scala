package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeObservationRequest extends StObject {
  
  /**
    * The ID of the observation.
    */
  var ObservationId: typings.awsSdk.applicationinsightsMod.ObservationId
}
object DescribeObservationRequest {
  
  inline def apply(ObservationId: ObservationId): DescribeObservationRequest = {
    val __obj = js.Dynamic.literal(ObservationId = ObservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObservationRequest]
  }
  
  extension [Self <: DescribeObservationRequest](x: Self) {
    
    inline def setObservationId(value: ObservationId): Self = StObject.set(x, "ObservationId", value.asInstanceOf[js.Any])
  }
}
