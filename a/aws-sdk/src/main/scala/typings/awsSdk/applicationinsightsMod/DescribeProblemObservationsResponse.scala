package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProblemObservationsResponse extends js.Object {
  /**
    * Observations related to the problem.
    */
  var RelatedObservations: js.UndefOr[typings.awsSdk.applicationinsightsMod.RelatedObservations] = js.native
}

object DescribeProblemObservationsResponse {
  @scala.inline
  def apply(RelatedObservations: RelatedObservations = null): DescribeProblemObservationsResponse = {
    val __obj = js.Dynamic.literal()
    if (RelatedObservations != null) __obj.updateDynamic("RelatedObservations")(RelatedObservations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProblemObservationsResponse]
  }
}

