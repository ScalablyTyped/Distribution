package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  var Caption: String
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  var Enabled: Boolean
  
  /* private */ @JSName("Excel.Menu_typekey")
  var ExcelDotMenu_typekey: Menu
  
  val Index: Double
  
  def MenuItems(Index: js.Any): js.Any
  @JSName("MenuItems")
  val MenuItems_Original: MenuItems
  
  val Parent: js.Any
}
object Menu {
  
  inline def apply(
    Application: Application,
    Caption: String,
    Creator: XlCreator,
    Delete: () => Unit,
    Enabled: Boolean,
    ExcelDotMenu_typekey: Menu,
    Index: Double,
    MenuItems: MenuItems,
    Parent: js.Any
  ): Menu = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Enabled = Enabled.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MenuItems = MenuItems.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Menu_typekey")(ExcelDotMenu_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Menu]
  }
  
  extension [Self <: Menu](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setExcelDotMenu_typekey(value: Menu): Self = StObject.set(x, "Excel.Menu_typekey", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setMenuItems(value: MenuItems): Self = StObject.set(x, "MenuItems", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
