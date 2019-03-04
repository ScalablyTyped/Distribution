package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to notify listeners about mail merge events.
  *
  * Registered listeners will be notified with a {@link com.sun.star.text.MailMergeEvent} when a document is about to get merged.
  * @see com.sun.star.text.MailMerge
  * @see com.sun.star.text.MailMergeEvent
  * @since OOo 1.1.2
  */
trait XMailMergeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Notifies the listener about mail merge events.
    * @param aEvent The Event containing the model of the document to be merged that is send to the listener.
    */
  def notifyMailMergeEvent(aEvent: MailMergeEvent): scala.Unit
}

object XMailMergeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    notifyMailMergeEvent: js.Function1[MailMergeEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMailMergeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, notifyMailMergeEvent = notifyMailMergeEvent, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XMailMergeListener]
  }
}

