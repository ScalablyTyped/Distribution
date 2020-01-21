package typings.agiledigitalMulePreview.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MulePreviewDiffUrlProps extends js.Object {
  val contentRoot: String
  val contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]
}

object MulePreviewDiffUrlProps {
  @scala.inline
  def apply(contentRoot: String, contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): MulePreviewDiffUrlProps = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrls = contentUrls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MulePreviewDiffUrlProps]
  }
}

