package typings.activexLibreoffice.com_.sun.star.form.submission

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is implemented by components which support submitting data. */
trait XSubmission extends XInterface {
  /**
    * registers the given listener to be notified when a submission occurs
    * @param listener the listener to register
    * @throws com::sun::star::lang::NoSupportException when the component does not support external components vetoing the submission
    */
  def addSubmissionVetoListener(listener: XSubmissionVetoListener): Unit
  /**
    * revokes a listener which has previously been registered to be notified when a submission occurs
    * @param listener the listener to revoke
    * @throws com::sun::star::lang::NoSupportException when the component does not support external components vetoing the submission
    */
  def removeSubmissionVetoListener(listener: XSubmissionVetoListener): Unit
  /**
    * tells the component to submit data
    * @throws com::sun::star::util::VetoException if the submission has been vetoed. Usually, this indicates that not all requirements for the submission, e.g.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurred during invoking the submission target
    */
  def submit(): Unit
  /**
    * tells the component to submit data
    * @param aHandler This handler allows additional user interaction, which may be necessary before the submission can be performed.
    * @throws com::sun::star::util::VetoException if the submission has been vetoed. Usually, this indicates that not all requirements for the submission, e.g.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurred during invoking the submission target
    */
  def submitWithInteraction(aHandler: XInteractionHandler): Unit
}

object XSubmission {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addSubmissionVetoListener: XSubmissionVetoListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSubmissionVetoListener: XSubmissionVetoListener => Unit,
    submit: () => Unit,
    submitWithInteraction: XInteractionHandler => Unit
  ): XSubmission = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSubmissionVetoListener = js.Any.fromFunction1(addSubmissionVetoListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSubmissionVetoListener = js.Any.fromFunction1(removeSubmissionVetoListener), submit = js.Any.fromFunction0(submit), submitWithInteraction = js.Any.fromFunction1(submitWithInteraction))
    __obj.asInstanceOf[XSubmission]
  }
}

