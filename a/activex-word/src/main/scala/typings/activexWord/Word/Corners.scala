package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Corners extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Name: String
  val Parent: js.Any
  @JSName("Word.Corners_typekey")
  var WordDotCorners_typekey: Corners
  def Select(): js.Any
}

object Corners {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any,
    WordDotCorners_typekey: Corners
  ): Corners = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.Corners_typekey")(WordDotCorners_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corners]
  }
}

