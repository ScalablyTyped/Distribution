package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoWalls extends js.Object {
  val Application: js.Any
  val Border: IMsoBorder
  val Creator: Double
  val Fill: ChartFillFormat
  val Format: IMsoChartFormat
  val Interior: IMsoInterior
  val Name: String
  @JSName("Office.IMsoWalls_typekey")
  var OfficeDotIMsoWalls_typekey: IMsoWalls
  val Parent: js.Any
  var PictureType: js.Any
  var PictureUnit: js.Any
  var Thickness: Double
  def ClearFormats(): js.Any
  def Paste(): Unit
  def Select(): js.Any
}

object IMsoWalls {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    ClearFormats: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Format: IMsoChartFormat,
    Interior: IMsoInterior,
    Name: String,
    OfficeDotIMsoWalls_typekey: IMsoWalls,
    Parent: js.Any,
    Paste: () => Unit,
    PictureType: js.Any,
    PictureUnit: js.Any,
    Select: () => js.Any,
    Thickness: Double
  ): IMsoWalls = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), PictureType = PictureType.asInstanceOf[js.Any], PictureUnit = PictureUnit.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Thickness = Thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoWalls_typekey")(OfficeDotIMsoWalls_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoWalls]
  }
}

