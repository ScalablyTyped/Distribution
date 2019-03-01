package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelMapUrl extends js.Object {
  var Cancel: scala.Boolean
  val Map: activexDashExcelLib.ExcelNs.XmlMap
  val Url: java.lang.String
}

object Anon_CancelMapUrl {
  @scala.inline
  def apply(Cancel: scala.Boolean, Map: activexDashExcelLib.ExcelNs.XmlMap, Url: java.lang.String): Anon_CancelMapUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Map")(Map)
    __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[Anon_CancelMapUrl]
  }
}

