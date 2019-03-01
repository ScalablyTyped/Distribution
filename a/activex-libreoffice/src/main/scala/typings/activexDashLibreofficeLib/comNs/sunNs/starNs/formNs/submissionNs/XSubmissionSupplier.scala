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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSubmissionSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Submission")(Submission)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSubmissionSupplier]
  }
}

