package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesLines extends js.Object {
  val Application: js.Any
  val Border: ChartBorder
  val Creator: Double
  val Format: ChartFormat
  val Name: String
  val Parent: js.Any
  @JSName("Word.SeriesLines_typekey")
  var WordDotSeriesLines_typekey: SeriesLines
  def Delete(): js.Any
  def Select(): js.Any
}

object SeriesLines {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => js.Any,
    Format: ChartFormat,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any,
    WordDotSeriesLines_typekey: SeriesLines
  ): SeriesLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.SeriesLines_typekey")(WordDotSeriesLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLines]
  }
}

