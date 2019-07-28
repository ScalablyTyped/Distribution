package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.XlXmlImportResult
import typings.activexDashExcel.ExcelNs.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsRefreshMap extends js.Object {
  val IsRefresh: Boolean
  val Map: XmlMap
  val Result: XlXmlImportResult
}

object Anon_IsRefreshMap {
  @scala.inline
  def apply(IsRefresh: Boolean, Map: XmlMap, Result: XlXmlImportResult): Anon_IsRefreshMap = {
    val __obj = js.Dynamic.literal(IsRefresh = IsRefresh, Map = Map, Result = Result)
  
    __obj.asInstanceOf[Anon_IsRefreshMap]
  }
}

