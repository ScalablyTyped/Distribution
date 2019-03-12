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

object XAutoFormattable {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    autoFormat: java.lang.String => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAutoFormattable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), autoFormat = js.Any.fromFunction1(autoFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAutoFormattable]
  }
}

