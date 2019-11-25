package typings.activexDashExcel

import typings.activexDashExcel.Excel.Workbook
import typings.activexDashExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelMap extends js.Object {
  var Cancel: Boolean
  val Map: XmlMap
  val Url: String
  val Wb: Workbook
}

object Anon_CancelMap {
  @scala.inline
  def apply(Cancel: Boolean, Map: XmlMap, Url: String, Wb: Workbook): Anon_CancelMap = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelMap]
  }
}

