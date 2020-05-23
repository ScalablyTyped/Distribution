package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OLEFormat extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.OLEFormat_typekey")
  var ExcelDotOLEFormat_typekey: OLEFormat = js.native
  val Object: js.Any = js.native
  val Parent: js.Any = js.native
  val progID: String = js.native
  def Activate(): Unit = js.native
  def Verb(): Unit = js.native
  def Verb(Verb: XlOLEVerb): Unit = js.native
}

