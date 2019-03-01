package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.submissionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implement by components which want to observe (and probably veto) the submission of data.
  * @see XSubmission
  */
trait XSubmissionVetoListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when a component, at which the listener has been registered, is about to submit its data.
    * @param event The submission event. The {@link com.sun.star.lang.EventObject.Source} member of the structure describes the component which is about to su
    * @throws com::sun::star::util::VetoException when the submission is vetoed. {@link com.sun.star.uno.Exception.Message} should contain a justification for
    */
  def submitting(event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XSubmissionVetoListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    submitting: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit]
  ): XSubmissionVetoListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("submitting")(submitting)
    __obj.asInstanceOf[XSubmissionVetoListener]
  }
}

