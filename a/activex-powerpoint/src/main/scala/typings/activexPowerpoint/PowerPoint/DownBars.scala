package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownBars extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Border: ChartBorder
  val Creator: Double
  val Fill: ChartFillFormat
  val Format: ChartFormat
  val Interior: typings.activexPowerpoint.PowerPoint.Interior
  val Name: String
  val Parent: js.Any
  @JSName("PowerPoint.DownBars_typekey")
  var PowerPointDotDownBars_typekey: DownBars
  def Delete(): js.Any
  def Select(): js.Any
}

object DownBars {
  @scala.inline
  def apply(
    Application: Application,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => js.Any,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    PowerPointDotDownBars_typekey: DownBars,
    Select: () => js.Any
  ): DownBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("PowerPoint.DownBars_typekey")(PowerPointDotDownBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownBars]
  }
}

