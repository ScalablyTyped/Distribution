package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends the {@link XFormsSupplier} with convenience methods */
trait XFormsSupplier2 extends XFormsSupplier {
  /**
    * determines whether there are currently forms available at all
    *
    * If you need read access to the forms collection, then you might check the existence of forms using {@link hasForms()} , and if it returns `FALSE` ,
    * you can do as if {@link XFormsSupplier.getForms()} would have returned an empty container.
    *
    * Semantically, {@link hasForms()} is equivalent to calling XElementAccess::hasElements() on the container returned by {@link XFormsSupplier.getForms()}
    * . But when using the latter, the implementation is forced to create a empty container, which might be potentially expensive.
    */
  def hasForms(): scala.Boolean
}

object XFormsSupplier2 {
  @scala.inline
  def apply(
    Forms: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: () => scala.Unit,
    getForms: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    hasForms: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XFormsSupplier2 = {
    val __obj = js.Dynamic.literal(Forms = Forms, acquire = js.Any.fromFunction0(acquire), getForms = js.Any.fromFunction0(getForms), hasForms = js.Any.fromFunction0(hasForms), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFormsSupplier2]
  }
}

