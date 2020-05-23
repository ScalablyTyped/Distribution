package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkFormat extends js.Object {
  val Application: typings.activexExcel.Excel.Application
  var AutoUpdate: Boolean
  val Creator: XlCreator
  @JSName("Excel.LinkFormat_typekey")
  var ExcelDotLinkFormat_typekey: LinkFormat
  var Locked: Boolean
  val Parent: js.Any
  def Update(): Unit
}

object LinkFormat {
  @scala.inline
  def apply(
    Application: Application,
    AutoUpdate: Boolean,
    Creator: XlCreator,
    ExcelDotLinkFormat_typekey: LinkFormat,
    Locked: Boolean,
    Parent: js.Any,
    Update: () => Unit
  ): LinkFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoUpdate = AutoUpdate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Excel.LinkFormat_typekey")(ExcelDotLinkFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkFormat]
  }
}

