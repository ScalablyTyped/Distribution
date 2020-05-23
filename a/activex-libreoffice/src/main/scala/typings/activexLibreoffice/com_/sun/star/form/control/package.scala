package typings.activexLibreoffice.com_.sun.star.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object control {
  /**
    * describes a control which can be used for visually grouping controls
    *
    * The model of the control has to support the {@link com.sun.star.form.component.GroupBox} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  type GroupBox = typings.activexLibreoffice.com_.sun.star.awt.UnoControlGroupBox
  /**
    * This service specifies the model for control which provides controller functionality for a {@link com.sun.star.form.component.DataForm} , such as
    * navigating or filtering the form.
    * @see com.sun.star.form.component.NavigationToolBar
    */
  type NavigationToolBar = typings.activexLibreoffice.com_.sun.star.awt.UnoControl
  /**
    * specifies a button control which can execute external submissions
    *
    * The model of the control has to support the {@link com.sun.star.form.component.SubmitButton} service.
    *
    * The control is clickable. When clicked (by mouse or keyboard, or programmatically), the following happens:  1. Any
    * com::sun::star::form::submission::XSubmissionVetoListeners registered at the component are given the chance to veto the submission. 2. The model of
    * the control is examined for an external submission object. That is, com::sun::star::form::submission::XSubmissionSupplier::getSubmission() is called
    * at the model. ;  If there is such a submission object, its {@link com.sun.star.form.submission.XSubmission.submit()} method is invoked. 3. If there is
    * no external submission, the parent object of the model is examined for the presence of the {@link com.sun.star.form.XSubmit} interface. If it is
    * present, it's {@link com.sun.star.form.XSubmit.submit()} method is invoked. ;  Since the parent object of a submit button can only be a {@link
    * com.sun.star.form.component.Form} , this means that SubmitButtons are also able to submit com::sun::star::form::component::HTMLForms.
    */
  type SubmitButton = typings.activexLibreoffice.com_.sun.star.form.submission.XSubmission
}
