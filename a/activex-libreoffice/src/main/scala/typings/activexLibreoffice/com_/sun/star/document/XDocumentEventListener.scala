package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
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
  extends typings.activexLibreoffice.com_.sun.star.lang.XEventListener {
  /** is called whenever a document event occurred */
  def documentEventOccured(Event: DocumentEvent): Unit
}

object XDocumentEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: typings.activexLibreoffice.com_.sun.star.lang.EventObject => Unit,
    documentEventOccured: DocumentEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), documentEventOccured = js.Any.fromFunction1(documentEventOccured), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentEventListener]
  }
}

