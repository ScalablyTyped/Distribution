package typings.activexDashExcel

import typings.activexDashExcel.Excel.Workbook
import typings.activexDashExcel.Excel.XlXmlImportResult
import typings.activexDashExcel.Excel.XmlMap
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
    val __obj = js.Dynamic.literal(IsRefresh = IsRefresh.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IsRefresh]
  }
}

