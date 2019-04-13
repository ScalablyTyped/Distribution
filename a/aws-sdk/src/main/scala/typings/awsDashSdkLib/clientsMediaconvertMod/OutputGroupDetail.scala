package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputGroupDetail extends js.Object {
  /**
    * Details about the output
    */
  var OutputDetails: js.UndefOr[__listOfOutputDetail] = js.undefined
}

object OutputGroupDetail {
  @scala.inline
  def apply(OutputDetails: __listOfOutputDetail = null): OutputGroupDetail = {
    val __obj = js.Dynamic.literal()
    if (OutputDetails != null) __obj.updateDynamic("OutputDetails")(OutputDetails)
    __obj.asInstanceOf[OutputGroupDetail]
  }
}

