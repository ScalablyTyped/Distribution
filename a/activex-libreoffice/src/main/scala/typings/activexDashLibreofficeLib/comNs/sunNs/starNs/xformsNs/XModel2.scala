package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XModel2
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XModel

object XModel2 {
  @scala.inline
  def apply(
    Bindings: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet,
    DataTypeRepository: XDataTypeRepository,
    DefaultInstance: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument,
    ID: java.lang.String,
    Instances: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Submissions: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    cloneBinding: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    cloneSubmission: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet => XSubmission,
    createBinding: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    createSubmission: () => XSubmission,
    getBinding: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getBindings: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet,
    getDataTypeRepository: () => XDataTypeRepository,
    getDefaultInstance: () => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument,
    getID: () => java.lang.String,
    getInstanceDocument: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument,
    getInstances: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getSubmission: java.lang.String => XSubmission,
    getSubmissions: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet,
    initialize: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    rebuild: () => scala.Unit,
    recalculate: () => scala.Unit,
    refresh: () => scala.Unit,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    revalidate: () => scala.Unit,
    setID: java.lang.String => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    submit: java.lang.String => scala.Unit,
    submitWithInteraction: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler) => scala.Unit
  ): XModel2 = {
    val __obj = js.Dynamic.literal(Bindings = Bindings, DataTypeRepository = DataTypeRepository, DefaultInstance = DefaultInstance, ID = ID, Instances = Instances, PropertySetInfo = PropertySetInfo, Submissions = Submissions, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cloneBinding = js.Any.fromFunction1(cloneBinding), cloneSubmission = js.Any.fromFunction1(cloneSubmission), createBinding = js.Any.fromFunction0(createBinding), createSubmission = js.Any.fromFunction0(createSubmission), getBinding = js.Any.fromFunction1(getBinding), getBindings = js.Any.fromFunction0(getBindings), getDataTypeRepository = js.Any.fromFunction0(getDataTypeRepository), getDefaultInstance = js.Any.fromFunction0(getDefaultInstance), getID = js.Any.fromFunction0(getID), getInstanceDocument = js.Any.fromFunction1(getInstanceDocument), getInstances = js.Any.fromFunction0(getInstances), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSubmission = js.Any.fromFunction1(getSubmission), getSubmissions = js.Any.fromFunction0(getSubmissions), initialize = js.Any.fromFunction0(initialize), queryInterface = js.Any.fromFunction1(queryInterface), rebuild = js.Any.fromFunction0(rebuild), recalculate = js.Any.fromFunction0(recalculate), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), revalidate = js.Any.fromFunction0(revalidate), setID = js.Any.fromFunction1(setID), setPropertyValue = js.Any.fromFunction2(setPropertyValue), submit = js.Any.fromFunction1(submit), submitWithInteraction = js.Any.fromFunction2(submitWithInteraction))
  
    __obj.asInstanceOf[XModel2]
  }
}

