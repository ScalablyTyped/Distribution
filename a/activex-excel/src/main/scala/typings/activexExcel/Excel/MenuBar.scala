package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuBar extends StObject {
  
  def Activate(): Unit
  
  val Application: typings.activexExcel.Excel.Application
  
  val BuiltIn: Boolean
  
  var Caption: String
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  @JSName("Excel.MenuBar_typekey")
  var ExcelDotMenuBar_typekey: MenuBar
  
  val Index: Double
  
  def Menus(Index: js.Any): Menu
  @JSName("Menus")
  val Menus_Original: Menus
  
  val Parent: js.Any
  
  def Reset(): Unit
}
object MenuBar {
  
  @scala.inline
  def apply(
    Activate: () => Unit,
    Application: Application,
    BuiltIn: Boolean,
    Caption: String,
    Creator: XlCreator,
    Delete: () => Unit,
    ExcelDotMenuBar_typekey: MenuBar,
    Index: Double,
    Menus: Menus,
    Parent: js.Any,
    Reset: () => Unit
  ): MenuBar = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Menus = Menus.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset))
    __obj.updateDynamic("Excel.MenuBar_typekey")(ExcelDotMenuBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuBar]
  }
  
  @scala.inline
  implicit class MenuBarMutableBuilder[Self <: MenuBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: () => Unit): Self = StObject.set(x, "Activate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltIn(value: Boolean): Self = StObject.set(x, "BuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcelDotMenuBar_typekey(value: MenuBar): Self = StObject.set(x, "Excel.MenuBar_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenus(value: Menus): Self = StObject.set(x, "Menus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction0(value))
  }
}
