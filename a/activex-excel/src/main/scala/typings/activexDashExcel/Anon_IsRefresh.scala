package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.Workbook
import typings.activexDashExcel.ExcelNs.XlXmlImportResult
import typings.activexDashExcel.ExcelNs.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsRefresh extends js.Object {
  val IsRefresh: Boolean
  val Map: XmlMap
  val Result: XlXmlImportResult
  val Wb: Workbook
}

object Anon_IsRefresh {
  @scala.inline
  def apply(IsRefresh: Boolean, Map: XmlMap, Result: XlXmlImportResult, Wb: Workbook): Anon_IsRefresh = {
    val __obj = js.Dynamic.literal(IsRefresh = IsRefresh, Map = Map, Result = Result, Wb = Wb)
  
    __obj.asInstanceOf[Anon_IsRefresh]
  }
}

