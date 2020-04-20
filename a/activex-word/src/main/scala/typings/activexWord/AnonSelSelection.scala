package typings.activexWord

import typings.activexWord.Word.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelSelection extends js.Object {
  val Sel: Selection
}

object AnonSelSelection {
  @scala.inline
  def apply(Sel: Selection): AnonSelSelection = {
    val __obj = js.Dynamic.literal(Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelSelection]
  }
}

