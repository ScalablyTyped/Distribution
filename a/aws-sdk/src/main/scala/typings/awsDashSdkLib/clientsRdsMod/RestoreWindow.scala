package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreWindow extends js.Object {
  /**
    * The earliest time you can restore an instance to.
    */
  var EarliestTime: js.UndefOr[TStamp] = js.undefined
  /**
    * The latest time you can restore an instance to.
    */
  var LatestTime: js.UndefOr[TStamp] = js.undefined
}

object RestoreWindow {
  @scala.inline
  def apply(EarliestTime: TStamp = null, LatestTime: TStamp = null): RestoreWindow = {
    val __obj = js.Dynamic.literal()
    if (EarliestTime != null) __obj.updateDynamic("EarliestTime")(EarliestTime)
    if (LatestTime != null) __obj.updateDynamic("LatestTime")(LatestTime)
    __obj.asInstanceOf[RestoreWindow]
  }
}

