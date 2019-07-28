package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a collection of forms. */
trait XFormsSupplier extends XInterface {
  /**
    * accesses the forms.
    *
    * {{program example here, see documentation}}
    * @returns the container of all the top-level forms belonging to the component.
    */
  val Forms: XNameContainer
  /**
    * accesses the forms.
    *
    * {{program example here, see documentation}}
    * @returns the container of all the top-level forms belonging to the component.
    */
  def getForms(): XNameContainer
}

object XFormsSupplier {
  @scala.inline
  def apply(
    Forms: XNameContainer,
    acquire: () => Unit,
    getForms: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFormsSupplier = {
    val __obj = js.Dynamic.literal(Forms = Forms, acquire = js.Any.fromFunction0(acquire), getForms = js.Any.fromFunction0(getForms), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFormsSupplier]
  }
}

