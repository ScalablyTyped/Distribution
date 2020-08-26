package typings.activexLibreoffice.com_.sun.star.xforms

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.form.submission.XSubmissionVetoListener
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a submission object, associated with an {@link XModel} */
@js.native
trait XSubmission
  extends XPropertySet
     with XNamed
     with typings.activexLibreoffice.com_.sun.star.form.submission.XSubmission

object XSubmission {
  @scala.inline
  def apply(
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addSubmissionVetoListener: XSubmissionVetoListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeSubmissionVetoListener: XSubmissionVetoListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    submit: () => Unit,
    submitWithInteraction: XInteractionHandler => Unit
  ): XSubmission = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addSubmissionVetoListener = js.Any.fromFunction1(addSubmissionVetoListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeSubmissionVetoListener = js.Any.fromFunction1(removeSubmissionVetoListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), submit = js.Any.fromFunction0(submit), submitWithInteraction = js.Any.fromFunction1(submitWithInteraction))
    __obj.asInstanceOf[XSubmission]
  }
}

