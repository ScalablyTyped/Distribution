package typings.agiledigitalMulePreview.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MulePreviewUrlProps extends js.Object {
  val contentRoot: String
  val contentUrl: String
}

object MulePreviewUrlProps {
  @scala.inline
  def apply(contentRoot: String, contentUrl: String): MulePreviewUrlProps = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MulePreviewUrlProps]
  }
}

