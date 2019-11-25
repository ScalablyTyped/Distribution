package typings.activexDashShdocvw.SHDocVw.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBrowser_V1_FrameNewWindow_Parameter extends js.Object {
  val Flags: Double
  val Headers: String
  val PostData: js.Any
  var Processed: Boolean
  val TargetFrameName: String
  val URL: String
}

object WebBrowser_V1_FrameNewWindow_Parameter {
  @scala.inline
  def apply(
    Flags: Double,
    Headers: String,
    PostData: js.Any,
    Processed: Boolean,
    TargetFrameName: String,
    URL: String
  ): WebBrowser_V1_FrameNewWindow_Parameter = {
    val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], Processed = Processed.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebBrowser_V1_FrameNewWindow_Parameter]
  }
}

