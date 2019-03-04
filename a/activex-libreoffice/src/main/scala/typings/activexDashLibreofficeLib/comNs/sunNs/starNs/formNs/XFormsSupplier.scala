package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a collection of forms. */
trait XFormsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * accesses the forms.
    *
    * {{program example here, see documentation}}
    * @returns the container of all the top-level forms belonging to the component.
    */
  val Forms: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /**
    * accesses the forms.
    *
    * {{program example here, see documentation}}
    * @returns the container of all the top-level forms belonging to the component.
    */
  def getForms(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
}

object XFormsSupplier {
  @scala.inline
  def apply(
    Forms: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: js.Function0[scala.Unit],
    getForms: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFormsSupplier = {
    val __obj = js.Dynamic.literal(Forms = Forms, acquire = acquire, getForms = getForms, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFormsSupplier]
  }
}

