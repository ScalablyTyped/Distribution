package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Abstract base interface for any conditional format
  *
  * Is extended by any conditional format entry, e.g. color scale, data bar, icon set, date formats, condition formats
  */
trait XConditionEntry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Type: scala.Double
  def getType(): scala.Double
}

object XConditionEntry {
  @scala.inline
  def apply(
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    getType: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XConditionEntry = {
    val __obj = js.Dynamic.literal(Type = Type, acquire = acquire, getType = getType, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XConditionEntry]
  }
}

