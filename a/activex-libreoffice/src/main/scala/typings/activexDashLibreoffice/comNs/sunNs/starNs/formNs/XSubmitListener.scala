package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives notifications about data being submitted.
  *
  * The submission may be canceled, so the listener has the possibility of verifying the data before submission.
  * @deprecated DeprecatedThis interface is superseded by the com::sun::star::form::submission::XSubmissionVetoListener interface. New implementations should use
  * @see XSubmit
  */
trait XSubmitListener extends XEventListener {
  /**
    * is invoked when a component is about to submit it's data.
    * @param Event the event happened
    * @returns `TRUE` when submitting was approved, otherwise `FALSE` .
    */
  def approveSubmit(Event: EventObject): Boolean
}

object XSubmitListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveSubmit: EventObject => Boolean,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSubmitListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveSubmit = js.Any.fromFunction1(approveSubmit), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSubmitListener]
  }
}

