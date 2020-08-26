package typings.agiledigitalMulePreview.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MulePreviewUrlProps extends js.Object {
  val contentRoot: String = js.native
  val contentUrl: String = js.native
}

object MulePreviewUrlProps {
  @scala.inline
  def apply(contentRoot: String, contentUrl: String): MulePreviewUrlProps = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MulePreviewUrlProps]
  }
  @scala.inline
  implicit class MulePreviewUrlPropsOps[Self <: MulePreviewUrlProps] (val x: Self) extends AnyVal {
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
    def setContentRoot(value: String): Self = this.set("contentRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
  }
  
}

