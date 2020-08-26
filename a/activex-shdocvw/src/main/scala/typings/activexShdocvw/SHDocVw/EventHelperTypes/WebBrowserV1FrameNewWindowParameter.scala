package typings.activexShdocvw.SHDocVw.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebBrowserV1FrameNewWindowParameter extends js.Object {
  val Flags: Double = js.native
  val Headers: String = js.native
  val PostData: js.Any = js.native
  var Processed: Boolean = js.native
  val TargetFrameName: String = js.native
  val URL: String = js.native
}

object WebBrowserV1FrameNewWindowParameter {
  @scala.inline
  def apply(
    Flags: Double,
    Headers: String,
    PostData: js.Any,
    Processed: Boolean,
    TargetFrameName: String,
    URL: String
  ): WebBrowserV1FrameNewWindowParameter = {
    val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], Processed = Processed.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserV1FrameNewWindowParameter]
  }
  @scala.inline
  implicit class WebBrowserV1FrameNewWindowParameterOps[Self <: WebBrowserV1FrameNewWindowParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlags(value: Double): Self = this.set("Flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: String): Self = this.set("Headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostData(value: js.Any): Self = this.set("PostData", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessed(value: Boolean): Self = this.set("Processed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetFrameName(value: String): Self = this.set("TargetFrameName", value.asInstanceOf[js.Any])
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
  }
  
}

