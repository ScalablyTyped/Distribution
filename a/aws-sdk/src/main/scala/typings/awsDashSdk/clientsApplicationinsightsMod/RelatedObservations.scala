package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelatedObservations extends js.Object {
  /**
    * The list of observations related to the problem.
    */
  var ObservationList: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ObservationList] = js.undefined
}

object RelatedObservations {
  @scala.inline
  def apply(ObservationList: ObservationList = null): RelatedObservations = {
    val __obj = js.Dynamic.literal()
    if (ObservationList != null) __obj.updateDynamic("ObservationList")(ObservationList)
    __obj.asInstanceOf[RelatedObservations]
  }
}

