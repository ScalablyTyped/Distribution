package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropLines extends js.Object {
  val Application: js.Any
  val Border: ChartBorder
  val Creator: Double
  val Format: ChartFormat
  val Name: String
  val Parent: js.Any
  @JSName("Word.DropLines_typekey")
  var WordDotDropLines_typekey: DropLines
  def Delete(): Unit
  def Select(): Unit
}

object DropLines {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => Unit,
    Format: ChartFormat,
    Name: String,
    Parent: js.Any,
    Select: () => Unit,
    WordDotDropLines_typekey: DropLines
  ): DropLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.DropLines_typekey")(WordDotDropLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropLines]
  }
}

