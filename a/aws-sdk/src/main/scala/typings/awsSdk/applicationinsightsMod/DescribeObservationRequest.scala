package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeObservationRequest extends StObject {
  
  /**
    * The ID of the observation.
    */
  var ObservationId: typings.awsSdk.applicationinsightsMod.ObservationId = js.native
}
object DescribeObservationRequest {
  
  @scala.inline
  def apply(ObservationId: ObservationId): DescribeObservationRequest = {
    val __obj = js.Dynamic.literal(ObservationId = ObservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObservationRequest]
  }
  
  @scala.inline
  implicit class DescribeObservationRequestMutableBuilder[Self <: DescribeObservationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObservationId(value: ObservationId): Self = StObject.set(x, "ObservationId", value.asInstanceOf[js.Any])
  }
}
