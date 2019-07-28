package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.validationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an interface for listening for changes in the validity constraints represented by an {@link XValidator} . */
trait XValidityConstraintListener extends XEventListener {
  /**
    * called when the validity constraint represented by an {@link XValidator} , at which the listener is registered, changed.
    * @param Source The event source. The member {@link com.sun.star.lang.EventObject.Source} represents the validator component whose validity constraint changed.
    */
  def validityConstraintChanged(Source: EventObject): Unit
}

object XValidityConstraintListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    validityConstraintChanged: EventObject => Unit
  ): XValidityConstraintListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), validityConstraintChanged = js.Any.fromFunction1(validityConstraintChanged))
  
    __obj.asInstanceOf[XValidityConstraintListener]
  }
}

