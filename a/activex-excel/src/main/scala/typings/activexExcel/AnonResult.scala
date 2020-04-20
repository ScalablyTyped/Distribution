package typings.activexExcel

import typings.activexExcel.Excel.XlXmlExportResult
import typings.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult extends js.Object {
  val Map: XmlMap
  val Result: XlXmlExportResult
  val Url: String
}

object AnonResult {
  @scala.inline
  def apply(Map: XmlMap, Result: XlXmlExportResult, Url: String): AnonResult = {
    val __obj = js.Dynamic.literal(Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResult]
  }
}

