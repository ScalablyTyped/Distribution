package typings.activexDashShdocvw.SHDocVw.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBrowser_V1_NewWindow_Parameter extends js.Object {
  val Flags: Double
  val Headers: String
  val PostData: js.Any
  var Processed: Boolean
  val TargetFrameName: String
  val URL: String
}

object WebBrowser_V1_NewWindow_Parameter {
  @scala.inline
  def apply(
    Flags: Double,
    Headers: String,
    PostData: js.Any,
    Processed: Boolean,
    TargetFrameName: String,
    URL: String
  ): WebBrowser_V1_NewWindow_Parameter = {
    val __obj = js.Dynamic.literal(Flags = Flags, Headers = Headers, PostData = PostData, Processed = Processed, TargetFrameName = TargetFrameName, URL = URL)
  
    __obj.asInstanceOf[WebBrowser_V1_NewWindow_Parameter]
  }
}

