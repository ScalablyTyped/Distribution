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
    val __obj = js.Dynamic.literal(Cancel = Cancel, Headers = Headers, PostData = PostData, URL = URL, flags = flags, pDisp = pDisp)
    if (TargetFrameName != null) __obj.updateDynamic("TargetFrameName")(TargetFrameName)
    __obj.asInstanceOf[WebBrowserControl_BeforeNavigate2_Parameter]
  }
}

