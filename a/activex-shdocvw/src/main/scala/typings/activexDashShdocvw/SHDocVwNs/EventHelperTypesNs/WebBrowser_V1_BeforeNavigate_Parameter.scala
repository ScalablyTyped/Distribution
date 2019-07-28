package typings.activexDashShdocvw.SHDocVwNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBrowser_V1_BeforeNavigate_Parameter extends js.Object {
  var Cancel: Boolean
  val Flags: Double
  val Headers: String
  val PostData: js.Any
  val TargetFrameName: String
  val URL: String
}

object WebBrowser_V1_BeforeNavigate_Parameter {
  @scala.inline
  def apply(
    Cancel: Boolean,
    Flags: Double,
    Headers: String,
    PostData: js.Any,
    TargetFrameName: String,
    URL: String
  ): WebBrowser_V1_BeforeNavigate_Parameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Flags = Flags, Headers = Headers, PostData = PostData, TargetFrameName = TargetFrameName, URL = URL)
  
    __obj.asInstanceOf[WebBrowser_V1_BeforeNavigate_Parameter]
  }
}

