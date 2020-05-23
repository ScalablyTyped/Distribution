package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HiLoLines extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Border: ChartBorder
  val Creator: Double
  val Format: ChartFormat
  val Name: String
  val Parent: js.Any
  @JSName("PowerPoint.HiLoLines_typekey")
  var PowerPointDotHiLoLines_typekey: HiLoLines
  def Delete(): js.Any
  def Select(): js.Any
}

object HiLoLines {
  @scala.inline
  def apply(
    Application: Application,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => js.Any,
    Format: ChartFormat,
    Name: String,
    Parent: js.Any,
    PowerPointDotHiLoLines_typekey: HiLoLines,
    Select: () => js.Any
  ): HiLoLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("PowerPoint.HiLoLines_typekey")(PowerPointDotHiLoLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HiLoLines]
  }
}

