package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Characters extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var Caption: String = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Null = js.native
  
  @JSName("Excel.Characters_typekey")
  var ExcelDotCharacters_typekey: Characters = js.native
  
  val Font: typings.activexExcel.Excel.Font = js.native
  
  def Insert(): String = js.native
  def Insert(String: String): String = js.native
  
  val Parent: js.Any = js.native
  
  var PhoneticCharacters: String = js.native
  
  var Text: String = js.native
}
