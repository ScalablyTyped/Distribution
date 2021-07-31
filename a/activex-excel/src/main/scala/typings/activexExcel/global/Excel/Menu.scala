package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.MenuItems
import typings.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Menu")
@js.native
class Menu protected ()
  extends StObject
     with typings.activexExcel.Excel.Menu {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Caption: String = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  @JSName("Excel.Menu_typekey")
  var ExcelDotMenu_typekey: typings.activexExcel.Excel.Menu = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override def MenuItems(Index: js.Any): js.Any = js.native
  /* CompleteClass */
  @JSName("MenuItems")
  override val MenuItems_Original: MenuItems = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
}
