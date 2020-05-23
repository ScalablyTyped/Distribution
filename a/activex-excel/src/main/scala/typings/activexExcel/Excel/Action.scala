package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  val Caption: String
  val Content: String
  val Coordinate: String
  val Creator: XlCreator
  @JSName("Excel.Action_typekey")
  var ExcelDotAction_typekey: Action
  val Name: String
  val Parent: js.Any
  val Type: XlActionType
  def Execute(): Unit
}

object Action {
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Content: String,
    Coordinate: String,
    Creator: XlCreator,
    ExcelDotAction_typekey: Action,
    Execute: () => Unit,
    Name: String,
    Parent: js.Any,
    Type: XlActionType
  ): Action = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Coordinate = Coordinate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Action_typekey")(ExcelDotAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

