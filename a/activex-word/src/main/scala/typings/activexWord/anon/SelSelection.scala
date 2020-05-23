package typings.activexWord.anon

import typings.activexWord.Word.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelSelection extends js.Object {
  val Sel: Selection
}

object SelSelection {
  @scala.inline
  def apply(Sel: Selection): SelSelection = {
    val __obj = js.Dynamic.literal(Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelSelection]
  }
}

