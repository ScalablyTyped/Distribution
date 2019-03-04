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
    acquire: js.Function0[scala.Unit],
    addDocumentEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentEventListener, 
      scala.Unit
    ],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventListener, scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    documentEventOccured: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.DocumentEvent, scala.Unit],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getEvents: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace],
    has: js.Function1[js.Any, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insert: js.Function1[js.Any, scala.Unit],
    notifyDocumentEvent: js.Function3[java.lang.String, XController2, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[js.Any, scala.Unit],
    removeDocumentEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentEventListener, 
      scala.Unit
    ],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XEventListener, scala.Unit]
  ): XGlobalEventBroadcaster = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, Events = Events, acquire = acquire, addDocumentEventListener = addDocumentEventListener, addEventListener = addEventListener, createEnumeration = createEnumeration, disposing = disposing, documentEventOccured = documentEventOccured, getElementType = getElementType, getEvents = getEvents, has = has, hasElements = hasElements, insert = insert, notifyDocumentEvent = notifyDocumentEvent, queryInterface = queryInterface, release = release, remove = remove, removeDocumentEventListener = removeDocumentEventListener, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[XGlobalEventBroadcaster]
  }
}

