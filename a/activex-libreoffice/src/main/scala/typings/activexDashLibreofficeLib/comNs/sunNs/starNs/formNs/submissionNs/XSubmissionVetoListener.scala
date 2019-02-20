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

