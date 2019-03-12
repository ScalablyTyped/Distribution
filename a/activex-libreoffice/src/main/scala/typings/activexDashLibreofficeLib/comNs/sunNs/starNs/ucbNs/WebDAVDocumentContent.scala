package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DCP Document is a container for Document data/content.
  *
  * The data/content may be anything, a WebDAV server, like an HTTP server, does not necessarily mandate what type of data/content may be contained within
  * Documents. The type of data/content is defined by the MediaType property which is different from the content type returned from the {@link
  * XContent.getContentType()} method. The MediaType property is mapped to the equivalent WebDAV property and the WebDAV server calculates the value.
  * @see com.sun.star.ucb.WebDAVContentProvider
  * @see com.sun.star.ucb.WebDAVFolderContent
  */
trait WebDAVDocumentContent
  extends XCommandProcessor2
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XContent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeNotifier
     with XCommandInfoChangeNotifier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild

object WebDAVDocumentContent {
  @scala.inline
  def apply(
    ContentType: java.lang.String,
    Identifier: XContentIdentifier,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    abort: scala.Double => scala.Unit,
    acquire: () => scala.Unit,
    addCommandInfoChangeListener: XCommandInfoChangeListener => scala.Unit,
    addContentEventListener: XContentEventListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertiesChangeListener: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener) => scala.Unit,
    addProperty: (java.lang.String, scala.Double, js.Any) => scala.Unit,
    addPropertySetInfoChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener => scala.Unit,
    createCommandIdentifier: () => scala.Double,
    dispose: () => scala.Unit,
    execute: (Command, scala.Double, XCommandEnvironment) => js.Any,
    getContentType: () => java.lang.String,
    getIdentifier: () => XContentIdentifier,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    releaseCommandIdentifier: scala.Double => scala.Unit,
    removeCommandInfoChangeListener: XCommandInfoChangeListener => scala.Unit,
    removeContentEventListener: XContentEventListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertiesChangeListener: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener) => scala.Unit,
    removeProperty: java.lang.String => scala.Unit,
    removePropertySetInfoChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfoChangeListener => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit
  ): WebDAVDocumentContent = {
    val __obj = js.Dynamic.literal(ContentType = ContentType, Identifier = Identifier, Parent = Parent, abort = js.Any.fromFunction1(abort), acquire = js.Any.fromFunction0(acquire), addCommandInfoChangeListener = js.Any.fromFunction1(addCommandInfoChangeListener), addContentEventListener = js.Any.fromFunction1(addContentEventListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addProperty = js.Any.fromFunction3(addProperty), addPropertySetInfoChangeListener = js.Any.fromFunction1(addPropertySetInfoChangeListener), createCommandIdentifier = js.Any.fromFunction0(createCommandIdentifier), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction3(execute), getContentType = js.Any.fromFunction0(getContentType), getIdentifier = js.Any.fromFunction0(getIdentifier), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseCommandIdentifier = js.Any.fromFunction1(releaseCommandIdentifier), removeCommandInfoChangeListener = js.Any.fromFunction1(removeCommandInfoChangeListener), removeContentEventListener = js.Any.fromFunction1(removeContentEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction2(removePropertiesChangeListener), removeProperty = js.Any.fromFunction1(removeProperty), removePropertySetInfoChangeListener = js.Any.fromFunction1(removePropertySetInfoChangeListener), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[WebDAVDocumentContent]
  }
}

