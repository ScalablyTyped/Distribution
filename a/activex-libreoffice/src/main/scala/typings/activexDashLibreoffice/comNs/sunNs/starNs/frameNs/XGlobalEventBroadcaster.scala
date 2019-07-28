package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.DocumentEvent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XDocumentEventBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XDocumentEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XEventBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XEventsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the unified interface of {@link theGlobalEventBroadcaster} singleton.
  * @since LibreOffice 4.0
  */
trait XGlobalEventBroadcaster
  extends XSet
     with XEventsSupplier
     with XDocumentEventBroadcaster
     with XEventBroadcaster
     with XDocumentEventListener

object XGlobalEventBroadcaster {
  @scala.inline
  def apply(
    ElementType: `type`,
    Events: XNameReplace,
    acquire: () => Unit,
    addDocumentEventListener: XDocumentEventListener => Unit,
    addEventListener: XEventListener => Unit,
    createEnumeration: () => XEnumeration,
    disposing: EventObject => Unit,
    documentEventOccured: DocumentEvent => Unit,
    getElementType: () => `type`,
    getEvents: () => XNameReplace,
    has: js.Any => Boolean,
    hasElements: () => Boolean,
    insert: js.Any => Unit,
    notifyDocumentEvent: (String, XController2, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: js.Any => Unit,
    removeDocumentEventListener: XDocumentEventListener => Unit,
    removeEventListener: XEventListener => Unit
  ): XGlobalEventBroadcaster = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, Events = Events, acquire = js.Any.fromFunction0(acquire), addDocumentEventListener = js.Any.fromFunction1(addDocumentEventListener), addEventListener = js.Any.fromFunction1(addEventListener), createEnumeration = js.Any.fromFunction0(createEnumeration), disposing = js.Any.fromFunction1(disposing), documentEventOccured = js.Any.fromFunction1(documentEventOccured), getElementType = js.Any.fromFunction0(getElementType), getEvents = js.Any.fromFunction0(getEvents), has = js.Any.fromFunction1(has), hasElements = js.Any.fromFunction0(hasElements), insert = js.Any.fromFunction1(insert), notifyDocumentEvent = js.Any.fromFunction3(notifyDocumentEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeDocumentEventListener = js.Any.fromFunction1(removeDocumentEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XGlobalEventBroadcaster]
  }
}

