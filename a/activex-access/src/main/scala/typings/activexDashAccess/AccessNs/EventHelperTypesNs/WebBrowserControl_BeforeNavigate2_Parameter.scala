package typings.activexDashAccess.AccessNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBrowserControl_BeforeNavigate2_Parameter extends js.Object {
  var Cancel: Boolean
  val Headers: js.Any
  val PostData: js.Any
  val TargetFrameName: String | Null
  val URL: String
  val flags: Double
  val pDisp: js.Any
}

object WebBrowserControl_BeforeNavigate2_Parameter {
  @scala.inline
  def apply(
    Cancel: Boolean,
    Headers: js.Any,
    PostData: js.Any,
    URL: String,
    flags: Double,
    pDisp: js.Any,
    TargetFrameName: String = null
  ): WebBrowserControl_BeforeNavigate2_Parameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Headers = Headers, PostData = PostData, URL = URL, flags = flags, pDisp = pDisp)
    if (TargetFrameName != null) __obj.updateDynamic("TargetFrameName")(TargetFrameName)
    __obj.asInstanceOf[WebBrowserControl_BeforeNavigate2_Parameter]
  }
}

