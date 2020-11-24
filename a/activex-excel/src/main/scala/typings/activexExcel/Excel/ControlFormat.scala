package typings.activexExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlFormat extends js.Object {
  
  def AddItem(Text: String): Unit = js.native
  def AddItem(Text: String, Index: Double): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  var DropDownLines: Double = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Excel.ControlFormat_typekey")
  var ExcelDotControlFormat_typekey: ControlFormat = js.native
  
  var LargeChange: Double = js.native
  
  var LinkedCell: String = js.native
  
  def List(): SafeArray[String] = js.native
  def List(Index: Double): String = js.native
  
  var ListCount: Double = js.native
  
  var ListFillRange: String = js.native
  
  var ListIndex: Double = js.native
  
  var LockedText: Boolean = js.native
  
  var Max: Double = js.native
  
  var Min: Double = js.native
  
  var MultiSelect: Double = js.native
  
  val Parent: js.Any = js.native
  
  var PrintObject: Boolean = js.native
  
  def RemoveAllItems(): Unit = js.native
  
  def RemoveItem(Index: Double): Unit = js.native
  def RemoveItem(Index: Double, Count: Double): Unit = js.native
  
  var SmallChange: Double = js.native
  
  var Value: Double = js.native
  
  var _Default: Double = js.native
}
