package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the {@link XForms} models contained in the component */
trait XFormsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * access {@link XForms} model container.
    * @returns a container for the {@link XForms} models contained in the component
    */
  val XForms: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /**
    * access {@link XForms} model container.
    * @returns a container for the {@link XForms} models contained in the component
    */
  def getXForms(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
}

object XFormsSupplier {
  @scala.inline
  def apply(
    XForms: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: () => scala.Unit,
    getXForms: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XFormsSupplier = {
    val __obj = js.Dynamic.literal(XForms = XForms, acquire = js.Any.fromFunction0(acquire), getXForms = js.Any.fromFunction0(getXForms), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFormsSupplier]
  }
}

