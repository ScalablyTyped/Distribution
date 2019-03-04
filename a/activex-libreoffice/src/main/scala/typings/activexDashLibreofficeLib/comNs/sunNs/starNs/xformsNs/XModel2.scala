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
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    cloneBinding: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
    ],
    cloneSubmission: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, XSubmission],
    createBinding: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    createSubmission: js.Function0[XSubmission],
    getBinding: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
    ],
    getBindings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet],
    getDataTypeRepository: js.Function0[XDataTypeRepository],
    getDefaultInstance: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument],
    getID: js.Function0[java.lang.String],
    getInstanceDocument: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument
    ],
    getInstances: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSubmission: js.Function1[java.lang.String, XSubmission],
    getSubmissions: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet],
    initialize: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rebuild: js.Function0[scala.Unit],
    recalculate: js.Function0[scala.Unit],
    refresh: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    revalidate: js.Function0[scala.Unit],
    setID: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    submit: js.Function1[java.lang.String, scala.Unit],
    submitWithInteraction: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      scala.Unit
    ]
  ): XModel2 = {
    val __obj = js.Dynamic.literal(Bindings = Bindings, DataTypeRepository = DataTypeRepository, DefaultInstance = DefaultInstance, ID = ID, Instances = Instances, PropertySetInfo = PropertySetInfo, Submissions = Submissions, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, cloneBinding = cloneBinding, cloneSubmission = cloneSubmission, createBinding = createBinding, createSubmission = createSubmission, getBinding = getBinding, getBindings = getBindings, getDataTypeRepository = getDataTypeRepository, getDefaultInstance = getDefaultInstance, getID = getID, getInstanceDocument = getInstanceDocument, getInstances = getInstances, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSubmission = getSubmission, getSubmissions = getSubmissions, initialize = initialize, queryInterface = queryInterface, rebuild = rebuild, recalculate = recalculate, refresh = refresh, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, revalidate = revalidate, setID = setID, setPropertyValue = setPropertyValue, submit = submit, submitWithInteraction = submitWithInteraction)
  
    __obj.asInstanceOf[XModel2]
  }
}

