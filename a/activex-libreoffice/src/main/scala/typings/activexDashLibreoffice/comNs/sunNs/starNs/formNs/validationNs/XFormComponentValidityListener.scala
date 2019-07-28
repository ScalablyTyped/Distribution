package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.validationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the listener interface to be notified of changes of a {@link XValidatableFormComponent} */
trait XFormComponentValidityListener extends XEventListener {
  /**
    * called when the validity and/or the value of the form component at which the listener is registered changed.
    * @param Source The member {@link com.sun.star.lang.EventObject.Source} represents the {@link XValidatableFormComponent} whose validity, value, or text ch
    */
  def componentValidityChanged(Source: EventObject): Unit
}

object XFormComponentValidityListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    componentValidityChanged: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFormComponentValidityListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), componentValidityChanged = js.Any.fromFunction1(componentValidityChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFormComponentValidityListener]
  }
}

