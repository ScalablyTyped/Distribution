package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.submissionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by a component which allows access to a component which can submit data.
  * @see XSubmission
  */
trait XSubmissionSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** specifies the {@link XSubmission} instance to which the submission request should be delegated. */
  var Submission: XSubmission
}

object XSubmissionSupplier {
  @scala.inline
  def apply(
    Submission: XSubmission,
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSubmissionSupplier = {
    val __obj = js.Dynamic.literal(Submission = Submission, acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSubmissionSupplier]
  }
}

