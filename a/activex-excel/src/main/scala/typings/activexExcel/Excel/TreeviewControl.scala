package typings.activexExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeviewControl extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var Drilled: js.Any = js.native
  @JSName("Excel.TreeviewControl_typekey")
  var ExcelDotTreeviewControl_typekey: TreeviewControl = js.native
  var Hidden: SafeArray[SafeArray[String]] = js.native
  val Parent: js.Any = js.native
}

object TreeviewControl {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Drilled: js.Any,
    ExcelDotTreeviewControl_typekey: TreeviewControl,
    Hidden: SafeArray[SafeArray[String]],
    Parent: js.Any
  ): TreeviewControl = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Drilled = Drilled.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.TreeviewControl_typekey")(ExcelDotTreeviewControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeviewControl]
  }
  @scala.inline
  implicit class TreeviewControlOps[Self <: TreeviewControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrilled(value: js.Any): Self = this.set("Drilled", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotTreeviewControl_typekey(value: TreeviewControl): Self = this.set("Excel.TreeviewControl_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: SafeArray[SafeArray[String]]): Self = this.set("Hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
  
}

