package typings
package awsDashSdkLib.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProblemObservationsResponse extends js.Object {
  /**
    * Observations related to the problem.
    */
  var RelatedObservations: js.UndefOr[RelatedObservations] = js.undefined
}

object DescribeProblemObservationsResponse {
  @scala.inline
  def apply(RelatedObservations: RelatedObservations = null): DescribeProblemObservationsResponse = {
    val __obj = js.Dynamic.literal()
    if (RelatedObservations != null) __obj.updateDynamic("RelatedObservations")(RelatedObservations)
    __obj.asInstanceOf[DescribeProblemObservationsResponse]
  }
}

