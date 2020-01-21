package typings.activexWord

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocHandledBoolean extends js.Object {
  val Doc: Document
  var Handled: Boolean
}

object AnonDocHandledBoolean {
  @scala.inline
  def apply(Doc: Document, Handled: Boolean): AnonDocHandledBoolean = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDocHandledBoolean]
  }
}

