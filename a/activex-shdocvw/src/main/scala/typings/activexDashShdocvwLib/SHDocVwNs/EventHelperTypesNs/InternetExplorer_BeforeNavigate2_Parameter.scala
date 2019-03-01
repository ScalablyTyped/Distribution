package typings
package activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternetExplorer_BeforeNavigate2_Parameter extends js.Object {
  var Cancel: scala.Boolean
  val Flags: js.Any
  val Headers: js.Any
  val PostData: js.Any
  val TargetFrameName: js.Any
  val URL: js.Any
  val pDisp: js.Any
}

object InternetExplorer_BeforeNavigate2_Parameter {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    Flags: js.Any,
    Headers: js.Any,
    PostData: js.Any,
    TargetFrameName: js.Any,
    URL: js.Any,
    pDisp: js.Any
  ): InternetExplorer_BeforeNavigate2_Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Flags")(Flags)
    __obj.updateDynamic("Headers")(Headers)
    __obj.updateDynamic("PostData")(PostData)
    __obj.updateDynamic("TargetFrameName")(TargetFrameName)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("pDisp")(pDisp)
    __obj.asInstanceOf[InternetExplorer_BeforeNavigate2_Parameter]
  }
}

