package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is called whenever a document event occurred */
  def documentEventOccured(Event: DocumentEvent): scala.Unit
}

