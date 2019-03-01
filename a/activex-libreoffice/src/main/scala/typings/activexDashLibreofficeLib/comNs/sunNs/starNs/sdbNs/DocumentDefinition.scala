package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a sub document of a {@link OfficeDatabaseDocument} .
  *
  * Usual instances of a `DocumentDefinition` are forms and reports.
  *
  * Note that the `DocumentDefinition` does not denote the actual document (i.e. an object supporting the {@link com.sun.star.frame.XModel} interface),
  * but only a shortcut to access and load those actual documents.
  */
trait DocumentDefinition
  extends DefinitionContent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XSubDocument {
  /** Indicates if the document is to be used as template, for example, if a report is to be filled with data. */
  var AsTemplate: scala.Boolean
  /** is the name of the document. If the document is part of the container, it is not possible to alter the name. */
  var Name: java.lang.String
}

object DocumentDefinition {
  @scala.inline
  def apply(
    AsTemplate: scala.Boolean,
    ContentType: java.lang.String,
    HierarchicalName: java.lang.String,
    Identifier: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentIdentifier,
    Name: java.lang.String,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    abort: js.Function1[scala.Double, scala.Unit],
    acquire: js.Function0[scala.Unit],
    addCommandInfoChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandInfoChangeListener, 
      scala.Unit
    ],
    addContentEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentEventListener, 
      scala.Unit
    ],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    addProperty: js.Function3[java.lang.String, scala.Double, js.Any, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addPropertySetInfoChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    close: js.Function0[scala.Boolean],
    composeHierarchicalName: js.Function1[java.lang.String, java.lang.String],
    createCommandIdentifier: js.Function0[scala.Double],
    createNewContent: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfo, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent
    ],
    dispose: js.Function0[scala.Unit],
    execute: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Command, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment, 
      js.Any
    ],
    getContentType: js.Function0[java.lang.String],
    getHierarchicalName: js.Function0[java.lang.String],
    getIdentifier: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentIdentifier],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    open: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent],
    openDesign: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent],
    queryCreatableContentsInfo: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfo]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    releaseCommandIdentifier: js.Function1[scala.Double, scala.Unit],
    removeCommandInfoChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandInfoChangeListener, 
      scala.Unit
    ],
    removeContentEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentEventListener, 
      scala.Unit
    ],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    removeProperty: js.Function1[java.lang.String, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removePropertySetInfoChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    store: js.Function0[scala.Unit]
  ): DocumentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AsTemplate")(AsTemplate)
    __obj.updateDynamic("ContentType")(ContentType)
    __obj.updateDynamic("HierarchicalName")(HierarchicalName)
    __obj.updateDynamic("Identifier")(Identifier)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addCommandInfoChangeListener")(addCommandInfoChangeListener)
    __obj.updateDynamic("addContentEventListener")(addContentEventListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertiesChangeListener")(addPropertiesChangeListener)
    __obj.updateDynamic("addProperty")(addProperty)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addPropertySetInfoChangeListener")(addPropertySetInfoChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("composeHierarchicalName")(composeHierarchicalName)
    __obj.updateDynamic("createCommandIdentifier")(createCommandIdentifier)
    __obj.updateDynamic("createNewContent")(createNewContent)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getContentType")(getContentType)
    __obj.updateDynamic("getHierarchicalName")(getHierarchicalName)
    __obj.updateDynamic("getIdentifier")(getIdentifier)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("openDesign")(openDesign)
    __obj.updateDynamic("queryCreatableContentsInfo")(queryCreatableContentsInfo)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseCommandIdentifier")(releaseCommandIdentifier)
    __obj.updateDynamic("removeCommandInfoChangeListener")(removeCommandInfoChangeListener)
    __obj.updateDynamic("removeContentEventListener")(removeContentEventListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertiesChangeListener")(removePropertiesChangeListener)
    __obj.updateDynamic("removeProperty")(removeProperty)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removePropertySetInfoChangeListener")(removePropertySetInfoChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[DocumentDefinition]
  }
}

