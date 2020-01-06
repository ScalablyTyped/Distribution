package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeObservationRequest extends js.Object {
  /**
    * The ID of the observation.
    */
  var ObservationId: typings.awsDashSdk.clientsApplicationinsightsMod.ObservationId = js.native
}

object DescribeObservationRequest {
  @scala.inline
  def apply(ObservationId: ObservationId): DescribeObservationRequest = {
    val __obj = js.Dynamic.literal(ObservationId = ObservationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeObservationRequest]
  }
}

