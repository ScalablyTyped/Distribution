package typings.activexWord.anon

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var Cancel: Boolean
  val Doc: Document
}

object Cancel {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

