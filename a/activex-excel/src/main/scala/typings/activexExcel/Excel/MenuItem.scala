package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem extends StObject {
  
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
  implicit class MenuItemMutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "Checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotMenuItem_typekey(value: MenuItem): Self = StObject.set(x, "Excel.MenuItem_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpContextID(value: Double): Self = StObject.set(x, "HelpContextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAction(value: String): Self = StObject.set(x, "OnAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBar(value: String): Self = StObject.set(x, "StatusBar", value.asInstanceOf[js.Any])
  }
}
