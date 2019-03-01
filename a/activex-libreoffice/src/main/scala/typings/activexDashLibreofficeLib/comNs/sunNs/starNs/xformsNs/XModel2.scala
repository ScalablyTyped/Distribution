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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bindings")(Bindings)
    __obj.updateDynamic("DataTypeRepository")(DataTypeRepository)
    __obj.updateDynamic("DefaultInstance")(DefaultInstance)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Instances")(Instances)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Submissions")(Submissions)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("cloneBinding")(cloneBinding)
    __obj.updateDynamic("cloneSubmission")(cloneSubmission)
    __obj.updateDynamic("createBinding")(createBinding)
    __obj.updateDynamic("createSubmission")(createSubmission)
    __obj.updateDynamic("getBinding")(getBinding)
    __obj.updateDynamic("getBindings")(getBindings)
    __obj.updateDynamic("getDataTypeRepository")(getDataTypeRepository)
    __obj.updateDynamic("getDefaultInstance")(getDefaultInstance)
    __obj.updateDynamic("getID")(getID)
    __obj.updateDynamic("getInstanceDocument")(getInstanceDocument)
    __obj.updateDynamic("getInstances")(getInstances)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getSubmission")(getSubmission)
    __obj.updateDynamic("getSubmissions")(getSubmissions)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("rebuild")(rebuild)
    __obj.updateDynamic("recalculate")(recalculate)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("revalidate")(revalidate)
    __obj.updateDynamic("setID")(setID)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("submit")(submit)
    __obj.updateDynamic("submitWithInteraction")(submitWithInteraction)
    __obj.asInstanceOf[XModel2]
  }
}

