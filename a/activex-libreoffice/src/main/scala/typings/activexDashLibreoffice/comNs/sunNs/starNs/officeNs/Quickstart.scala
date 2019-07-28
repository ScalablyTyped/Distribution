package typings.activexDashLibreoffice.comNs.sunNs.starNs.officeNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XFastPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
trait Quickstart extends XFastPropertySet {
  /** The first two parameters are ignored */
  def createAndSetVeto(p1: Boolean, p2: Boolean, DisableVeto: Boolean): Unit
  def createAutoStart(bQuickstart: Boolean, bAutostart: Boolean): Unit
  def createDefault(): Unit
  def createStart(bQuickstart: Boolean): Unit
}

object Quickstart {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createAndSetVeto: (Boolean, Boolean, Boolean) => Unit,
    createAutoStart: (Boolean, Boolean) => Unit,
    createDefault: () => Unit,
    createStart: Boolean => Unit,
    getFastPropertyValue: Double => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFastPropertyValue: (Double, js.Any) => Unit
  ): Quickstart = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAndSetVeto = js.Any.fromFunction3(createAndSetVeto), createAutoStart = js.Any.fromFunction2(createAutoStart), createDefault = js.Any.fromFunction0(createDefault), createStart = js.Any.fromFunction1(createStart), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue))
  
    __obj.asInstanceOf[Quickstart]
  }
}

