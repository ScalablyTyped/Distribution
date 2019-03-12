package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.officeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
trait Quickstart
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XFastPropertySet {
  /** The first two parameters are ignored */
  def createAndSetVeto(p1: scala.Boolean, p2: scala.Boolean, DisableVeto: scala.Boolean): scala.Unit
  def createAutoStart(bQuickstart: scala.Boolean, bAutostart: scala.Boolean): scala.Unit
  def createDefault(): scala.Unit
  def createStart(bQuickstart: scala.Boolean): scala.Unit
}

object Quickstart {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createAndSetVeto: (scala.Boolean, scala.Boolean, scala.Boolean) => scala.Unit,
    createAutoStart: (scala.Boolean, scala.Boolean) => scala.Unit,
    createDefault: () => scala.Unit,
    createStart: scala.Boolean => scala.Unit,
    getFastPropertyValue: scala.Double => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFastPropertyValue: (scala.Double, js.Any) => scala.Unit
  ): Quickstart = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAndSetVeto = js.Any.fromFunction3(createAndSetVeto), createAutoStart = js.Any.fromFunction2(createAutoStart), createDefault = js.Any.fromFunction0(createDefault), createStart = js.Any.fromFunction1(createStart), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue))
  
    __obj.asInstanceOf[Quickstart]
  }
}

