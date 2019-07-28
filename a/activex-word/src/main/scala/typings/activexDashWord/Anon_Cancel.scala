package typings.activexDashWord

import typings.activexDashWord.WordNs.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var Cancel: Boolean
  val Doc: Document
}

object Anon_Cancel {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document): Anon_Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Doc = Doc)
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

