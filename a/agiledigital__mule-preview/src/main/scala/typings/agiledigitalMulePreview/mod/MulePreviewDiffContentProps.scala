package typings.agiledigitalMulePreview.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MulePreviewDiffContentProps extends js.Object {
  val contentRoot: String
  val contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]
}

object MulePreviewDiffContentProps {
  @scala.inline
  def apply(contentRoot: String, contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): MulePreviewDiffContentProps = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentStrings = contentStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MulePreviewDiffContentProps]
  }
}

