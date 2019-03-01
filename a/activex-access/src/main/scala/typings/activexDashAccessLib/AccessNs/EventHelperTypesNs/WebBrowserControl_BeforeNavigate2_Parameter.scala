package typings
package activexDashAccessLib.AccessNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBrowserControl_BeforeNavigate2_Parameter extends js.Object {
  var Cancel: scala.Boolean
  val Headers: js.Any
  val PostData: js.Any
  val TargetFrameName: java.lang.String | scala.Null
  val URL: java.lang.String
  val flags: scala.Double
  val pDisp: js.Any
}

object WebBrowserControl_BeforeNavigate2_Parameter {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    Headers: js.Any,
    PostData: js.Any,
    URL: java.lang.String,
    flags: scala.Double,
    pDisp: js.Any,
    TargetFrameName: java.lang.String = null
  ): WebBrowserControl_BeforeNavigate2_Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Headers")(Headers)
    __obj.updateDynamic("PostData")(PostData)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("pDisp")(pDisp)
    if (TargetFrameName != null) __obj.updateDynamic("TargetFrameName")(TargetFrameName)
    __obj.asInstanceOf[WebBrowserControl_BeforeNavigate2_Parameter]
  }
}

