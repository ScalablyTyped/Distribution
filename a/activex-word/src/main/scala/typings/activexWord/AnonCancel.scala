package typings.activexWord

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var Cancel: Boolean
  val Doc: Document
}

object AnonCancel {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document): AnonCancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancel]
  }
}

