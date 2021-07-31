package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object submission {
  
  /** is implemented by components which support submitting data. */
  trait XSubmission
    extends StObject
       with XInterface {
    
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
    
    @scala.inline
    implicit class XSubmissionMutableBuilder[Self <: XSubmission] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddSubmissionVetoListener(value: XSubmissionVetoListener => Unit): Self = StObject.set(x, "addSubmissionVetoListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveSubmissionVetoListener(value: XSubmissionVetoListener => Unit): Self = StObject.set(x, "removeSubmissionVetoListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubmitWithInteraction(value: XInteractionHandler => Unit): Self = StObject.set(x, "submitWithInteraction", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * is implemented by a component which allows access to a component which can submit data.
    * @see XSubmission
    */
  trait XSubmissionSupplier
    extends StObject
       with XInterface {
    
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
    
    @scala.inline
    implicit class XSubmissionSupplierMutableBuilder[Self <: XSubmissionSupplier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubmission(value: XSubmission): Self = StObject.set(x, "Submission", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * is implement by components which want to observe (and probably veto) the submission of data.
    * @see XSubmission
    */
  trait XSubmissionVetoListener
    extends StObject
       with XEventListener {
    
    /**
      * is invoked when a component, at which the listener has been registered, is about to submit its data.
      * @param event The submission event. The {@link com.sun.star.lang.EventObject.Source} member of the structure describes the component which is about to su
      * @throws com::sun::star::util::VetoException when the submission is vetoed. {@link com.sun.star.uno.Exception.Message} should contain a justification for
      */
    def submitting(event: EventObject): Unit
  }
  object XSubmissionVetoListener {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      disposing: EventObject => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      submitting: EventObject => Unit
    ): XSubmissionVetoListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), submitting = js.Any.fromFunction1(submitting))
      __obj.asInstanceOf[XSubmissionVetoListener]
    }
    
    @scala.inline
    implicit class XSubmissionVetoListenerMutableBuilder[Self <: XSubmissionVetoListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubmitting(value: EventObject => Unit): Self = StObject.set(x, "submitting", js.Any.fromFunction1(value))
    }
  }
}
