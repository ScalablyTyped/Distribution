package typings
package activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBrowser_V1_FrameBeforeNavigate_Parameter extends js.Object {
  var Cancel: scala.Boolean
  val Flags: scala.Double
  val Headers: java.lang.String
  val PostData: js.Any
  val TargetFrameName: java.lang.String
  val URL: java.lang.String
}

object WebBrowser_V1_FrameBeforeNavigate_Parameter {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    Flags: scala.Double,
    Headers: java.lang.String,
    PostData: js.Any,
    TargetFrameName: java.lang.String,
    URL: java.lang.String
  ): WebBrowser_V1_FrameBeforeNavigate_Parameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Flags = Flags, Headers = Headers, PostData = PostData, TargetFrameName = TargetFrameName, URL = URL)
  
    __obj.asInstanceOf[WebBrowser_V1_FrameBeforeNavigate_Parameter]
  }
}

