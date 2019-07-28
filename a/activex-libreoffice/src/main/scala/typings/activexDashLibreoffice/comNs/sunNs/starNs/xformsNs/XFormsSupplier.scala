package typings.activexDashLibreoffice.comNs.sunNs.starNs.xformsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the {@link XForms} models contained in the component */
trait XFormsSupplier extends XInterface {
  /**
    * access {@link XForms} model container.
    * @returns a container for the {@link XForms} models contained in the component
    */
  val XForms: XNameContainer
  /**
    * access {@link XForms} model container.
    * @returns a container for the {@link XForms} models contained in the component
    */
  def getXForms(): XNameContainer
}

object XFormsSupplier {
  @scala.inline
  def apply(
    XForms: XNameContainer,
    acquire: () => Unit,
    getXForms: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFormsSupplier = {
    val __obj = js.Dynamic.literal(XForms = XForms, acquire = js.Any.fromFunction0(acquire), getXForms = js.Any.fromFunction0(getXForms), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFormsSupplier]
  }
}

