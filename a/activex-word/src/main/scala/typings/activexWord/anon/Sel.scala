package typings.activexWord.anon

import typings.activexWord.Word.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sel extends js.Object {
  var Cancel: Boolean
  val Sel: Selection
}

object Sel {
  @scala.inline
  def apply(Cancel: Boolean, Sel: Selection): Sel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sel]
  }
}

