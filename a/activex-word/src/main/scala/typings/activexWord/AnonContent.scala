package typings.activexWord

import typings.activexWord.Word.ContentControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var Content: String
  val ContentControl: typings.activexWord.Word.ContentControl
}

object AnonContent {
  @scala.inline
  def apply(Content: String, ContentControl: ContentControl): AnonContent = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

