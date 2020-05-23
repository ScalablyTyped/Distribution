package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Corners extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  @JSName("Excel.Corners_typekey")
  var ExcelDotCorners_typekey: Corners
  val Name: String
  val Parent: js.Any
  def Select(): js.Any
}

object Corners {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotCorners_typekey: Corners,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any
  ): Corners = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Excel.Corners_typekey")(ExcelDotCorners_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corners]
  }
}

