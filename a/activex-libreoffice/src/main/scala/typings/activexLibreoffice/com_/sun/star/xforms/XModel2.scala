package typings.activexLibreoffice.com_.sun.star.xforms

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XSet
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.xml.dom.XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
@js.native
trait XModel2
  extends XPropertySet
     with XModel

object XModel2 {
  @scala.inline
  def apply(
    Bindings: XSet,
    DataTypeRepository: XDataTypeRepository,
    DefaultInstance: XDocument,
    ID: String,
    Instances: XSet,
    PropertySetInfo: XPropertySetInfo,
    Submissions: XSet,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    cloneBinding: XPropertySet => XPropertySet,
    cloneSubmission: XPropertySet => XSubmission,
    createBinding: () => XPropertySet,
    createSubmission: () => XSubmission,
    getBinding: String => XPropertySet,
    getBindings: () => XSet,
    getDataTypeRepository: () => XDataTypeRepository,
    getDefaultInstance: () => XDocument,
    getID: () => String,
    getInstanceDocument: String => XDocument,
    getInstances: () => XSet,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSubmission: String => XSubmission,
    getSubmissions: () => XSet,
    initialize: () => Unit,
    queryInterface: `type` => js.Any,
    rebuild: () => Unit,
    recalculate: () => Unit,
    refresh: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    revalidate: () => Unit,
    setID: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    submit: String => Unit,
    submitWithInteraction: (String, XInteractionHandler) => Unit
  ): XModel2 = {
    val __obj = js.Dynamic.literal(Bindings = Bindings.asInstanceOf[js.Any], DataTypeRepository = DataTypeRepository.asInstanceOf[js.Any], DefaultInstance = DefaultInstance.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Submissions = Submissions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cloneBinding = js.Any.fromFunction1(cloneBinding), cloneSubmission = js.Any.fromFunction1(cloneSubmission), createBinding = js.Any.fromFunction0(createBinding), createSubmission = js.Any.fromFunction0(createSubmission), getBinding = js.Any.fromFunction1(getBinding), getBindings = js.Any.fromFunction0(getBindings), getDataTypeRepository = js.Any.fromFunction0(getDataTypeRepository), getDefaultInstance = js.Any.fromFunction0(getDefaultInstance), getID = js.Any.fromFunction0(getID), getInstanceDocument = js.Any.fromFunction1(getInstanceDocument), getInstances = js.Any.fromFunction0(getInstances), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSubmission = js.Any.fromFunction1(getSubmission), getSubmissions = js.Any.fromFunction0(getSubmissions), initialize = js.Any.fromFunction0(initialize), queryInterface = js.Any.fromFunction1(queryInterface), rebuild = js.Any.fromFunction0(rebuild), recalculate = js.Any.fromFunction0(recalculate), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), revalidate = js.Any.fromFunction0(revalidate), setID = js.Any.fromFunction1(setID), setPropertyValue = js.Any.fromFunction2(setPropertyValue), submit = js.Any.fromFunction1(submit), submitWithInteraction = js.Any.fromFunction2(submitWithInteraction))
    __obj.asInstanceOf[XModel2]
  }
}

