package typings.activexExcel.anon

import typings.activexExcel.Excel.XlXmlImportResult
import typings.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsRefreshMap extends js.Object {
  val IsRefresh: Boolean
  val Map: XmlMap
  val Result: XlXmlImportResult
}

object IsRefreshMap {
  @scala.inline
  def apply(IsRefresh: Boolean, Map: XmlMap, Result: XlXmlImportResult): IsRefreshMap = {
    val __obj = js.Dynamic.literal(IsRefresh = IsRefresh.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRefreshMap]
  }
}

