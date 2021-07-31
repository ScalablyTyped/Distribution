package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Menus
import typings.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.MenuBar")
@js.native
class MenuBar protected ()
  extends StObject
     with typings.activexExcel.Excel.MenuBar {
  
  /* CompleteClass */
  override def Activate(): Unit = js.native
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val BuiltIn: Boolean = js.native
  
  /* CompleteClass */
  var Caption: String = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  @JSName("Excel.MenuBar_typekey")
  var ExcelDotMenuBar_typekey: typings.activexExcel.Excel.MenuBar = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override def Menus(Index: js.Any): typings.activexExcel.Excel.Menu = js.native
  /* CompleteClass */
  @JSName("Menus")
  override val Menus_Original: Menus = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Reset(): Unit = js.native
}
