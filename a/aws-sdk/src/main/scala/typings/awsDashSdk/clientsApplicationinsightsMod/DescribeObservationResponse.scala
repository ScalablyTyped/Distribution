package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeObservationResponse extends js.Object {
  /**
    * Information about the observation.
    */
  var Observation: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Observation] = js.undefined
}

object DescribeObservationResponse {
  @scala.inline
  def apply(Observation: Observation = null): DescribeObservationResponse = {
    val __obj = js.Dynamic.literal()
    if (Observation != null) __obj.updateDynamic("Observation")(Observation)
    __obj.asInstanceOf[DescribeObservationResponse]
  }
}

