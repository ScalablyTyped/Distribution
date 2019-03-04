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
    addPropertySetInfoChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener, 
      scala.Unit
    ],
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
    removePropertySetInfoChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener, 
      scala.Unit
    ],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): DefinitionContent = {
    val __obj = js.Dynamic.literal(ContentType = ContentType, HierarchicalName = HierarchicalName, Identifier = Identifier, Parent = Parent, abort = abort, acquire = acquire, addCommandInfoChangeListener = addCommandInfoChangeListener, addContentEventListener = addContentEventListener, addEventListener = addEventListener, addPropertiesChangeListener = addPropertiesChangeListener, addProperty = addProperty, addPropertySetInfoChangeListener = addPropertySetInfoChangeListener, composeHierarchicalName = composeHierarchicalName, createCommandIdentifier = createCommandIdentifier, createNewContent = createNewContent, dispose = dispose, execute = execute, getContentType = getContentType, getHierarchicalName = getHierarchicalName, getIdentifier = getIdentifier, getParent = getParent, queryCreatableContentsInfo = queryCreatableContentsInfo, queryInterface = queryInterface, release = release, releaseCommandIdentifier = releaseCommandIdentifier, removeCommandInfoChangeListener = removeCommandInfoChangeListener, removeContentEventListener = removeContentEventListener, removeEventListener = removeEventListener, removePropertiesChangeListener = removePropertiesChangeListener, removeProperty = removeProperty, removePropertySetInfoChangeListener = removePropertySetInfoChangeListener, setParent = setParent)
  
    __obj.asInstanceOf[DefinitionContent]
  }
}

