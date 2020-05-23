package typings.activexLibreoffice.com_.sun.star.form.submission

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by a component which allows access to a component which can submit data.
  * @see XSubmission
  */
trait XSubmissionSupplier extends XInterface {
  /** specifies the {@link XSubmission} instance to which the submission request should be delegated. */
  var Submission: XSubmission
}

object XSubmissionSupplier {
  @scala.inline
  def apply(
    Submission: XSubmission,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSubmissionSupplier = {
    val __obj = js.Dynamic.literal(Submission = Submission.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSubmissionSupplier]
  }
}

