package typings.activexDashExcel

import typings.activexDashExcel.Excel.XlXmlExportResult
import typings.activexDashExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MapResult extends js.Object {
  val Map: XmlMap
  val Result: XlXmlExportResult
  val Url: String
}

object Anon_MapResult {
  @scala.inline
  def apply(Map: XmlMap, Result: XlXmlExportResult, Url: String): Anon_MapResult = {
    val __obj = js.Dynamic.literal(Map = Map, Result = Result, Url = Url)
  
    __obj.asInstanceOf[Anon_MapResult]
  }
}

