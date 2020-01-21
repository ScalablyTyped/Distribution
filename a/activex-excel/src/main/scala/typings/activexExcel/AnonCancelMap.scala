package typings.activexExcel

import typings.activexExcel.Excel.Workbook
import typings.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelMap extends js.Object {
  var Cancel: Boolean
  val Map: XmlMap
  val Url: String
  val Wb: Workbook
}

object AnonCancelMap {
  @scala.inline
  def apply(Cancel: Boolean, Map: XmlMap, Url: String, Wb: Workbook): AnonCancelMap = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelMap]
  }
}

