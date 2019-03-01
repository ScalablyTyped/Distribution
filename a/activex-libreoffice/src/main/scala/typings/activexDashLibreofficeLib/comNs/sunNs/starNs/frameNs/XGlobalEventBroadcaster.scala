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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("Events")(Events)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDocumentEventListener")(addDocumentEventListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("createEnumeration")(createEnumeration)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("documentEventOccured")(documentEventOccured)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getEvents")(getEvents)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("notifyDocumentEvent")(notifyDocumentEvent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeDocumentEventListener")(removeDocumentEventListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[XGlobalEventBroadcaster]
  }
}

