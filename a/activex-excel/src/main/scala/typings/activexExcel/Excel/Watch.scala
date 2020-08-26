package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watch extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Watch_typekey")
  var ExcelDotWatch_typekey: Watch = js.native
  val Parent: js.Any = js.native
  val Source: js.Any = js.native
  def Delete(): Unit = js.native
}

object Watch {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotWatch_typekey: Watch,
    Parent: js.Any,
    Source: js.Any
  ): Watch = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Watch_typekey")(ExcelDotWatch_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Watch]
  }
  @scala.inline
  implicit class WatchOps[Self <: Watch] (val x: Self) extends AnyVal {
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
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setExcelDotWatch_typekey(value: Watch): Self = this.set("Excel.Watch_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: js.Any): Self = this.set("Source", value.asInstanceOf[js.Any])
  }
  
}

