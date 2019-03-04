package typings
package activexDashShdocvwLib.SHDocVwNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBrowser_V1_FrameNewWindow_Parameter extends js.Object {
  val Flags: scala.Double
  val Headers: java.lang.String
  val PostData: js.Any
  var Processed: scala.Boolean
  val TargetFrameName: java.lang.String
  val URL: java.lang.String
}

object WebBrowser_V1_FrameNewWindow_Parameter {
  @scala.inline
  def apply(
    Flags: scala.Double,
    Headers: java.lang.String,
    PostData: js.Any,
    Processed: scala.Boolean,
    TargetFrameName: java.lang.String,
    URL: java.lang.String
  ): WebBrowser_V1_FrameNewWindow_Parameter = {
    val __obj = js.Dynamic.literal(Flags = Flags, Headers = Headers, PostData = PostData, Processed = Processed, TargetFrameName = TargetFrameName, URL = URL)
  
    __obj.asInstanceOf[WebBrowser_V1_FrameNewWindow_Parameter]
  }
}

