package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Floor extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Border: ChartBorder
  val Creator: Double
  val Fill: ChartFillFormat
  val Format: ChartFormat
  val Interior: typings.activexPowerpoint.PowerPoint.Interior
  val Name: String
  val Parent: js.Any
  var PictureType: js.Any
  @JSName("PowerPoint.Floor_typekey")
  var PowerPointDotFloor_typekey: Floor
  var Thickness: Double
  def ClearFormats(): js.Any
  def Paste(): Unit
  def Select(): js.Any
}

object Floor {
  @scala.inline
  def apply(
    Application: Application,
    Border: ChartBorder,
    ClearFormats: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    Paste: () => Unit,
    PictureType: js.Any,
    PowerPointDotFloor_typekey: Floor,
    Select: () => js.Any,
    Thickness: Double
  ): Floor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), PictureType = PictureType.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Thickness = Thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Floor_typekey")(PowerPointDotFloor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Floor]
  }
}

