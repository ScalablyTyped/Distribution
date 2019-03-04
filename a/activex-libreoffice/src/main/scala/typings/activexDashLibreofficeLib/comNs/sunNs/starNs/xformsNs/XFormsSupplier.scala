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
    acquire: js.Function0[scala.Unit],
    getXForms: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFormsSupplier = {
    val __obj = js.Dynamic.literal(XForms = XForms, acquire = acquire, getXForms = getXForms, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFormsSupplier]
  }
}

