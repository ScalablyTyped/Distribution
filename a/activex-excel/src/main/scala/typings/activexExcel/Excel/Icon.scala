package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.Icon_typekey")
  var ExcelDotIcon_typekey: Icon = js.native
  
  val Index: Double = js.native
  
  def Parent(Index: Double): Icon = js.native
  @JSName("Parent")
  val Parent_Original: IconSet = js.native
}
