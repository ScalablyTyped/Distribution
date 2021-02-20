package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishObject extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var AutoRepublish: Boolean = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  val DivID: String = js.native
  
  @JSName("Excel.PublishObject_typekey")
  var ExcelDotPublishObject_typekey: PublishObject = js.native
  
  var Filename: String = js.native
  
  var HtmlType: XlHtmlType = js.native
  
  val Parent: js.Any = js.native
  
  def Publish(): Unit = js.native
  def Publish(Create: Boolean): Unit = js.native
  
  val Sheet: String = js.native
  
  val Source: String = js.native
  
  val SourceType: XlSourceType = js.native
  
  var Title: String = js.native
}
