package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputGroupDetail extends js.Object {
  /**
    * Details about the output
    */
  var OutputDetails: js.UndefOr[__listOfOutputDetail] = js.native
}

object OutputGroupDetail {
  @scala.inline
  def apply(OutputDetails: __listOfOutputDetail = null): OutputGroupDetail = {
    val __obj = js.Dynamic.literal()
    if (OutputDetails != null) __obj.updateDynamic("OutputDetails")(OutputDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputGroupDetail]
  }
}

