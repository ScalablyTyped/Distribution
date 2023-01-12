package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItem extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var Caption: String
  
  var Checked: Boolean
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  var Enabled: Boolean
  
  /* private */ @JSName("Excel.MenuItem_typekey")
  var ExcelDotMenuItem_typekey: MenuItem
  
  var HelpContextID: Double
  
  var HelpFile: String
  
  val Index: Double
  
  var OnAction: String
  
  val Parent: Any
  
  var StatusBar: String
}
object MenuItem {
  
  inline def apply(
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
    Parent: Any,
    StatusBar: String
  ): MenuItem = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Checked = Checked.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Enabled = Enabled.asInstanceOf[js.Any], HelpContextID = HelpContextID.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], OnAction = OnAction.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StatusBar = StatusBar.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.MenuItem_typekey")(ExcelDotMenuItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "Checked", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setExcelDotMenuItem_typekey(value: MenuItem): Self = StObject.set(x, "Excel.MenuItem_typekey", value.asInstanceOf[js.Any])
    
    inline def setHelpContextID(value: Double): Self = StObject.set(x, "HelpContextID", value.asInstanceOf[js.Any])
    
    inline def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setOnAction(value: String): Self = StObject.set(x, "OnAction", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setStatusBar(value: String): Self = StObject.set(x, "StatusBar", value.asInstanceOf[js.Any])
  }
}
