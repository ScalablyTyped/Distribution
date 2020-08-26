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
  def apply(): DescribeProblemObservationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProblemObservationsResponse]
  }
  @scala.inline
  implicit class DescribeProblemObservationsResponseOps[Self <: DescribeProblemObservationsResponse] (val x: Self) extends AnyVal {
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
    def setRelatedObservations(value: RelatedObservations): Self = this.set("RelatedObservations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedObservations: Self = this.set("RelatedObservations", js.undefined)
  }
  
}

