package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuBar extends js.Object {
  
  def Activate(): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val BuiltIn: Boolean = js.native
  
  var Caption: String = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  @JSName("Excel.MenuBar_typekey")
  var ExcelDotMenuBar_typekey: MenuBar = js.native
  
  val Index: Double = js.native
  
  def Menus(Index: js.Any): Menu = js.native
  @JSName("Menus")
  val Menus_Original: Menus = js.native
  
  val Parent: js.Any = js.native
  
  def Reset(): Unit = js.native
}
