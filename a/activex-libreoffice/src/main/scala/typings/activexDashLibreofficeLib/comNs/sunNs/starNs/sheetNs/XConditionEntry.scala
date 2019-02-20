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

