package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a method to apply TableAutoFormats to a cell range. */
trait XAutoFormattable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * applies an AutoFormat to the cell range of the current context.
    * @param aName is the name of the AutoFormat to apply.
    * @throws com::sun::star::lang::IllegalArgumentException if the specified AutoFormat does not exist.
    */
  def autoFormat(aName: java.lang.String): scala.Unit
}

