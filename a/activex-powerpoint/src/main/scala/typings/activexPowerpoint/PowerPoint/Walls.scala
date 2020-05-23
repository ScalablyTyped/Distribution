package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Walls extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Border: ChartBorder
  val Creator: Double
  val Fill: ChartFillFormat
  val Format: ChartFormat
  val Interior: typings.activexPowerpoint.PowerPoint.Interior
  val Name: String
  val Parent: js.Any
  var PictureType: js.Any
  var PictureUnit: js.Any
  @JSName("PowerPoint.Walls_typekey")
  var PowerPointDotWalls_typekey: Walls
  var Thickness: Double
  def ClearFormats(): js.Any
  def Paste(): Unit
  def Select(): js.Any
}

object Walls {
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
    PictureUnit: js.Any,
    PowerPointDotWalls_typekey: Walls,
    Select: () => js.Any,
    Thickness: Double
  ): Walls = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), PictureType = PictureType.asInstanceOf[js.Any], PictureUnit = PictureUnit.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Thickness = Thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Walls_typekey")(PowerPointDotWalls_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Walls]
  }
}

