package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedObservations extends js.Object {
  /**
    * The list of observations related to the problem.
    */
  var ObservationList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ObservationList] = js.native
}

object RelatedObservations {
  @scala.inline
  def apply(ObservationList: ObservationList = null): RelatedObservations = {
    val __obj = js.Dynamic.literal()
    if (ObservationList != null) __obj.updateDynamic("ObservationList")(ObservationList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedObservations]
  }
}

