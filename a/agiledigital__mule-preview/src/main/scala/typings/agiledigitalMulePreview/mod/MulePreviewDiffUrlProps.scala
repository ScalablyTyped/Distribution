package typings.agiledigitalMulePreview.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MulePreviewDiffUrlProps extends js.Object {
  val contentRoot: String = js.native
  val contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
}

object MulePreviewDiffUrlProps {
  @scala.inline
  def apply(contentRoot: String, contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): MulePreviewDiffUrlProps = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrls = contentUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[MulePreviewDiffUrlProps]
  }
  @scala.inline
  implicit class MulePreviewDiffUrlPropsOps[Self <: MulePreviewDiffUrlProps] (val x: Self) extends AnyVal {
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
    def setContentUrls(value: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Self = this.set("contentUrls", value.asInstanceOf[js.Any])
  }
  
}

