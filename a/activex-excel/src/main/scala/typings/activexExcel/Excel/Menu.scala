package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var Caption: String = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Excel.Menu_typekey")
  var ExcelDotMenu_typekey: Menu = js.native
  
  val Index: Double = js.native
  
  def MenuItems(Index: js.Any): js.Any = js.native
  @JSName("MenuItems")
  val MenuItems_Original: MenuItems = js.native
  
  val Parent: js.Any = js.native
}
