package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var Caption: String = js.native
  
  var Checked: Boolean = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Excel.MenuItem_typekey")
  var ExcelDotMenuItem_typekey: MenuItem = js.native
  
  var HelpContextID: Double = js.native
  
  var HelpFile: String = js.native
  
  val Index: Double = js.native
  
  var OnAction: String = js.native
  
  val Parent: js.Any = js.native
  
  var StatusBar: String = js.native
}
object MenuItem {
  
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Checked: Boolean,
    Creator: XlCreator,
    Delete: () => Unit,
    Enabled: Boolean,
    ExcelDotMenuItem_typekey: MenuItem,
    HelpContextID: Double,
    HelpFile: String,
    Index: Double,
    OnAction: String,
    Parent: js.Any,
    StatusBar: String
  ): MenuItem = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Checked = Checked.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Enabled = Enabled.asInstanceOf[js.Any], HelpContextID = HelpContextID.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], OnAction = OnAction.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StatusBar = StatusBar.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.MenuItem_typekey")(ExcelDotMenuItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  
  @scala.inline
  implicit class MenuItemOps[Self <: MenuItem] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("Checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotMenuItem_typekey(value: MenuItem): Self = this.set("Excel.MenuItem_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpContextID(value: Double): Self = this.set("HelpContextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpFile(value: String): Self = this.set("HelpFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAction(value: String): Self = this.set("OnAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBar(value: String): Self = this.set("StatusBar", value.asInstanceOf[js.Any])
  }
}
