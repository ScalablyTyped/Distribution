package typings.activexDashAccess.Access.EventHelperTypes

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
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    if (TargetFrameName != null) __obj.updateDynamic("TargetFrameName")(TargetFrameName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserControl_BeforeNavigate2_Parameter]
  }
}

