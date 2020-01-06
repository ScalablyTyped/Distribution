package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreWindow extends js.Object {
  /**
    * The earliest time you can restore an instance to.
    */
  var EarliestTime: js.UndefOr[TStamp] = js.native
  /**
    * The latest time you can restore an instance to.
    */
  var LatestTime: js.UndefOr[TStamp] = js.native
}

object RestoreWindow {
  @scala.inline
  def apply(EarliestTime: TStamp = null, LatestTime: TStamp = null): RestoreWindow = {
    val __obj = js.Dynamic.literal()
    if (EarliestTime != null) __obj.updateDynamic("EarliestTime")(EarliestTime.asInstanceOf[js.Any])
    if (LatestTime != null) __obj.updateDynamic("LatestTime")(LatestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreWindow]
  }
}

