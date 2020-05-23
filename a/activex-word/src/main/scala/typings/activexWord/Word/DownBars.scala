package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownBars extends js.Object {
  val Application: js.Any
  val Border: ChartBorder
  val Creator: Double
  val Fill: ChartFillFormat
  val Format: ChartFormat
  val Interior: typings.activexWord.Word.Interior
  val Name: String
  val Parent: js.Any
  @JSName("Word.DownBars_typekey")
  var WordDotDownBars_typekey: DownBars
  def Delete(): js.Any
  def Select(): js.Any
}

object DownBars {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => js.Any,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any,
    WordDotDownBars_typekey: DownBars
  ): DownBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.DownBars_typekey")(WordDotDownBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownBars]
  }
}

