package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the basic functionality for an object in the hierarchy of sub documents of a {@link OfficeDatabaseDocument} .
  * @see DocumentDefinition
  * @see DocumentContainer
  */
trait DefinitionContent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Content
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XHierarchicalName

object DefinitionContent {
  @scala.inline
  def apply(
    ContentType: java.lang.String,
    HierarchicalName: java.lang.String,
    Identifier: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentIdentifier,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    abort: scala.Double => scala.Unit,
    acquire: () => scala.Unit,
    addCommandInfoChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandInfoChangeListener => scala.Unit,
    addContentEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentEventListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertiesChangeListener: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener) => scala.Unit,
    addProperty: (java.lang.String, scala.Double, js.Any) => scala.Unit,
    addPropertySetInfoChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener => scala.Unit,
    composeHierarchicalName: java.lang.String => java.lang.String,
    createCommandIdentifier: () => scala.Double,
    createNewContent: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfo => activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent,
    dispose: () => scala.Unit,
    execute: (activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.Command, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandEnvironment) => js.Any,
    getContentType: () => java.lang.String,
    getHierarchicalName: () => java.lang.String,
    getIdentifier: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentIdentifier,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    queryCreatableContentsInfo: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.ContentInfo],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    releaseCommandIdentifier: scala.Double => scala.Unit,
    removeCommandInfoChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XCommandInfoChangeListener => scala.Unit,
    removeContentEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentEventListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertiesChangeListener: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener) => scala.Unit,
    removeProperty: java.lang.String => scala.Unit,
    removePropertySetInfoChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit
  ): DefinitionContent = {
    val __obj = js.Dynamic.literal(ContentType = ContentType, HierarchicalName = HierarchicalName, Identifier = Identifier, Parent = Parent, abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), addCommandInfoChangeListener = js.Any.fromFunction1(addCommandInfoChangeListener), addContentEventListener = js.Any.fromFunction1(addContentEventListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addProperty = js.Any.fromFunction3(addProperty), addPropertySetInfoChangeListener = js.Any.fromFunction1(addPropertySetInfoChangeListener), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), createNewContent = js.Any.fromFunction1(createNewContent), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction3(execute), getContentType = js.Any.fromFunction0(getContentType), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), getIdentifier = js.Any.fromFunction0(getIdentifier), getParent = js.Any.fromFunction0(getParent), queryCreatableContentsInfo = js.Any.fromFunction0(queryCreatableContentsInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier), removeCommandInfoChangeListener = js.Any.fromFunction1(removeCommandInfoChangeListener), removeContentEventListener = js.Any.fromFunction1(removeContentEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction2(removePropertiesChangeListener), removeProperty = js.Any.fromFunction1(removeProperty), removePropertySetInfoChangeListener = js.Any.fromFunction1(removePropertySetInfoChangeListener), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[DefinitionContent]
  }
}

