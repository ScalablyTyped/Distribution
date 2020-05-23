package typings.activexAccess.Access.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBrowserControlBeforeNavigate2Parameter extends js.Object {
  var Cancel: Boolean
  val Headers: js.Any
  val PostData: js.Any
  val TargetFrameName: String | Null
  val URL: String
  val flags: Double
  val pDisp: js.Any
}

object WebBrowserControlBeforeNavigate2Parameter {
  @scala.inline
  def apply(
    Cancel: Boolean,
    Headers: js.Any,
    PostData: js.Any,
    URL: String,
    flags: Double,
    pDisp: js.Any,
    TargetFrameName: String = null
  ): WebBrowserControlBeforeNavigate2Parameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserControlBeforeNavigate2Parameter]
  }
}

