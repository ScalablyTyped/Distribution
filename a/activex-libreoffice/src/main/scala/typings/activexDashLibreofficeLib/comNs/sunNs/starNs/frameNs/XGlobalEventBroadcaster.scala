package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the unified interface of {@link theGlobalEventBroadcaster} singleton.
  * @since LibreOffice 4.0
  */
trait XGlobalEventBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentEventBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentEventListener

object XGlobalEventBroadcaster {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    Events: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace,
    acquire: () => scala.Unit,
    addDocumentEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentEventListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventListener => scala.Unit,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    documentEventOccured: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.DocumentEvent => scala.Unit,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getEvents: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace,
    has: js.Any => scala.Boolean,
    hasElements: () => scala.Boolean,
    insert: js.Any => scala.Unit,
    notifyDocumentEvent: (java.lang.String, XController2, js.Any) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: js.Any => scala.Unit,
    removeDocumentEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentEventListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventListener => scala.Unit
  ): XGlobalEventBroadcaster = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, Events = Events, acquire = js.Any.fromFunction0(acquire), addDocumentEventListener = js.Any.fromFunction1(addDocumentEventListener), addEventListener = js.Any.fromFunction1(addEventListener), createEnumeration = js.Any.fromFunction0(createEnumeration), disposing = js.Any.fromFunction1(disposing), documentEventOccured = js.Any.fromFunction1(documentEventOccured), getElementType = js.Any.fromFunction0(getElementType), getEvents = js.Any.fromFunction0(getEvents), has = js.Any.fromFunction1(has), hasElements = js.Any.fromFunction0(hasElements), insert = js.Any.fromFunction1(insert), notifyDocumentEvent = js.Any.fromFunction3(notifyDocumentEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeDocumentEventListener = js.Any.fromFunction1(removeDocumentEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XGlobalEventBroadcaster]
  }
}

