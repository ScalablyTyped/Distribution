package typings.activexDashExcel

import typings.activexDashExcel.Excel.Workbook
import typings.activexDashExcel.Excel.XlXmlExportResult
import typings.activexDashExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Map extends js.Object {
  val Map: XmlMap
  val Result: XlXmlExportResult
  val Url: String
  val Wb: Workbook
}

object Anon_Map {
  @scala.inline
  def apply(Map: XmlMap, Result: XlXmlExportResult, Url: String, Wb: Workbook): Anon_Map = {
    val __obj = js.Dynamic.literal(Map = Map, Result = Result, Url = Url, Wb = Wb)
  
    __obj.asInstanceOf[Anon_Map]
  }
}

