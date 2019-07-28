package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to be notified of events happening in an {@link OfficeDocument}
  *
  * This interface is the successor of the {@link XEventListener} interface, which should not be used anymore.
  * @see XDocumentEventBroadcaster
  * @since OOo 3.1
  */
trait XDocumentEventListener
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener {
  /** is called whenever a document event occurred */
  def documentEventOccured(Event: DocumentEvent): Unit
}

object XDocumentEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject => Unit,
    documentEventOccured: DocumentEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), documentEventOccured = js.Any.fromFunction1(documentEventOccured), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDocumentEventListener]
  }
}

