package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DCP Folder is a container for other DCP Folders or Documents.
  * @see com.sun.star.ucb.GnomeVFSContentProvider
  * @see com.sun.star.ucb.GnomeVFSDocumentContent
  */
trait GnomeVFSFolderContent
  extends XCommandProcessor2
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XContent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeNotifier
     with XCommandInfoChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild
     with XContentCreator

object GnomeVFSFolderContent {
  @scala.inline
  def apply(
    ContentType: java.lang.String,
    Identifier: XContentIdentifier,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    abort: js.Function1[scala.Double, scala.Unit],
    acquire: js.Function0[scala.Unit],
    addCommandInfoChangeListener: js.Function1[XCommandInfoChangeListener, scala.Unit],
    addContentEventListener: js.Function1[XContentEventListener, scala.Unit],
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
    createCommandIdentifier: js.Function0[scala.Double],
    createNewContent: js.Function1[ContentInfo, XContent],
    dispose: js.Function0[scala.Unit],
    execute: js.Function3[Command, scala.Double, XCommandEnvironment, js.Any],
    getContentType: js.Function0[java.lang.String],
    getIdentifier: js.Function0[XContentIdentifier],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    queryCreatableContentsInfo: js.Function0[activexDashInteropLib.SafeArray[ContentInfo]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    releaseCommandIdentifier: js.Function1[scala.Double, scala.Unit],
    removeCommandInfoChangeListener: js.Function1[XCommandInfoChangeListener, scala.Unit],
    removeContentEventListener: js.Function1[XContentEventListener, scala.Unit],
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
  ): GnomeVFSFolderContent = {
    val __obj = js.Dynamic.literal(ContentType = ContentType, Identifier = Identifier, Parent = Parent, abort = abort, acquire = acquire, addCommandInfoChangeListener = addCommandInfoChangeListener, addContentEventListener = addContentEventListener, addEventListener = addEventListener, addPropertiesChangeListener = addPropertiesChangeListener, addProperty = addProperty, addPropertySetInfoChangeListener = addPropertySetInfoChangeListener, createCommandIdentifier = createCommandIdentifier, createNewContent = createNewContent, dispose = dispose, execute = execute, getContentType = getContentType, getIdentifier = getIdentifier, getParent = getParent, queryCreatableContentsInfo = queryCreatableContentsInfo, queryInterface = queryInterface, release = release, releaseCommandIdentifier = releaseCommandIdentifier, removeCommandInfoChangeListener = removeCommandInfoChangeListener, removeContentEventListener = removeContentEventListener, removeEventListener = removeEventListener, removePropertiesChangeListener = removePropertiesChangeListener, removeProperty = removeProperty, removePropertySetInfoChangeListener = removePropertySetInfoChangeListener, setParent = setParent)
  
    __obj.asInstanceOf[GnomeVFSFolderContent]
  }
}

