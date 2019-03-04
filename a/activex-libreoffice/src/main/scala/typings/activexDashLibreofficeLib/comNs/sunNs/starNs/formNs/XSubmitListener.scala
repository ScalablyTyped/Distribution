package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

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
trait XSubmitListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when a component is about to submit it's data.
    * @param Event the event happened
    * @returns `TRUE` when submitting was approved, otherwise `FALSE` .
    */
  def approveSubmit(Event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Boolean
}

object XSubmitListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    approveSubmit: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Boolean],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSubmitListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, approveSubmit = approveSubmit, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSubmitListener]
  }
}

