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
    abort: scala.Double => scala.Unit,
    acquire: () => scala.Unit,
    addCommandInfoChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandInfoChangeListener => scala.Unit,
    addContentEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentEventListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertiesChangeListener: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener) => scala.Unit,
    addProperty: (java.lang.String, scala.Double, js.Any) => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addPropertySetInfoChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    close: () => scala.Boolean,
    composeHierarchicalName: java.lang.String => java.lang.String,
    createCommandIdentifier: () => scala.Double,
    createNewContent: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfo => activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent,
    dispose: () => scala.Unit,
    execute: (activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Command, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment) => js.Any,
    getContentType: () => java.lang.String,
    getHierarchicalName: () => java.lang.String,
    getIdentifier: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentIdentifier,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    open: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    openDesign: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    queryCreatableContentsInfo: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfo],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    releaseCommandIdentifier: scala.Double => scala.Unit,
    removeCommandInfoChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandInfoChangeListener => scala.Unit,
    removeContentEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentEventListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertiesChangeListener: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener) => scala.Unit,
    removeProperty: java.lang.String => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removePropertySetInfoChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    store: () => scala.Unit
  ): DocumentDefinition = {
    val __obj = js.Dynamic.literal(AsTemplate = AsTemplate, ContentType = ContentType, HierarchicalName = HierarchicalName, Identifier = Identifier, Name = Name, Parent = Parent, PropertySetInfo = PropertySetInfo, abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), addCommandInfoChangeListener = js.Any.fromFunction1(addCommandInfoChangeListener), addContentEventListener = js.Any.fromFunction1(addContentEventListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addProperty = js.Any.fromFunction3(addProperty), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addPropertySetInfoChangeListener = js.Any.fromFunction1(addPropertySetInfoChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), close = js.Any.fromFunction0(close), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), createNewContent = js.Any.fromFunction1(createNewContent), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction3(execute), getContentType = js.Any.fromFunction0(getContentType), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getIdentifier = js.Any.fromFunction0(getIdentifier), getParent = js.Any.fromFunction0(getParent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), open = js.Any.fromFunction0(open), openDesign = js.Any.fromFunction0(openDesign), queryCreatableContentsInfo = js.Any.fromFunction0(queryCreatableContentsInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier), removeCommandInfoChangeListener = js.Any.fromFunction1(removeCommandInfoChangeListener), removeContentEventListener = js.Any.fromFunction1(removeContentEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction2(removePropertiesChangeListener), removeProperty = js.Any.fromFunction1(removeProperty), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removePropertySetInfoChangeListener = js.Any.fromFunction1(removePropertySetInfoChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setParent = js.Any.fromFunction1(setParent), setPropertyValue = js.Any.fromFunction2(setPropertyValue), store = js.Any.fromFunction0(store))
  
    __obj.asInstanceOf[DocumentDefinition]
  }
}

