package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeObservationResponse extends js.Object {
  /**
    * Information about the observation.
    */
  var Observation: js.UndefOr[typings.awsSdk.applicationinsightsMod.Observation] = js.native
}

object DescribeObservationResponse {
  @scala.inline
  def apply(Observation: Observation = null): DescribeObservationResponse = {
    val __obj = js.Dynamic.literal()
    if (Observation != null) __obj.updateDynamic("Observation")(Observation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObservationResponse]
  }
}

