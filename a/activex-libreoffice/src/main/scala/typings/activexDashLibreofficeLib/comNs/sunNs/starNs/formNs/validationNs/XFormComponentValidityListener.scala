package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the listener interface to be notified of changes of a {@link XValidatableFormComponent} */
trait XFormComponentValidityListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * called when the validity and/or the value of the form component at which the listener is registered changed.
    * @param Source The member {@link com.sun.star.lang.EventObject.Source} represents the {@link XValidatableFormComponent} whose validity, value, or text ch
    */
  def componentValidityChanged(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XFormComponentValidityListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    componentValidityChanged: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFormComponentValidityListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, componentValidityChanged = componentValidityChanged, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFormComponentValidityListener]
  }
}

