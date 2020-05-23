package typings.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var Content: String
  val ContentControl: typings.activexWord.Word.ContentControl
}

object Content {
  @scala.inline
  def apply(Content: String, ContentControl: typings.activexWord.Word.ContentControl): Content = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

