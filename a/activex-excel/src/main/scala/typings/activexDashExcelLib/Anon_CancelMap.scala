package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelMap extends js.Object {
  var Cancel: scala.Boolean
  val Map: activexDashExcelLib.ExcelNs.XmlMap
  val Url: java.lang.String
  val Wb: activexDashExcelLib.ExcelNs.Workbook
}

object Anon_CancelMap {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    Map: activexDashExcelLib.ExcelNs.XmlMap,
    Url: java.lang.String,
    Wb: activexDashExcelLib.ExcelNs.Workbook
  ): Anon_CancelMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Map")(Map)
    __obj.updateDynamic("Url")(Url)
    __obj.updateDynamic("Wb")(Wb)
    __obj.asInstanceOf[Anon_CancelMap]
  }
}

