package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the information regarding named tokens */
trait NameToken extends js.Object {
  var Index: scala.Double
  var Sheet: scala.Double
}

object NameToken {
  @scala.inline
  def apply(Index: scala.Double, Sheet: scala.Double): NameToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Index")(Index)
    __obj.updateDynamic("Sheet")(Sheet)
    __obj.asInstanceOf[NameToken]
  }
}

