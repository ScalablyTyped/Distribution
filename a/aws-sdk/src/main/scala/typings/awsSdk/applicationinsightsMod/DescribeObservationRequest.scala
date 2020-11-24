package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeObservationRequest extends js.Object {
  
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
  implicit class DescribeObservationRequestOps[Self <: DescribeObservationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObservationId(value: ObservationId): Self = this.set("ObservationId", value.asInstanceOf[js.Any])
  }
}
