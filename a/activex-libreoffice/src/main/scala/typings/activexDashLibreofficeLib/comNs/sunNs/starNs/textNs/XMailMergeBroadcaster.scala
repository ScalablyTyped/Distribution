package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows for adding/removing of mail merge event listeners.
  *
  * Registered listeners will be notified with a {@link com.sun.star.text.MailMergeEvent} when a document is about to get merged.
  * @see com.sun.star.text.MailMergeEvent
  * @see com.sun.star.text.MailMerge
  * @since OOo 1.1.2
  */
trait XMailMergeBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Adds an entry to the list of mail merge listeners.
    * @param xListener The listener to be added.
    */
  def addMailMergeEventListener(xListener: XMailMergeListener): scala.Unit
  /**
    * Removes an entry to the list of mail merge listeners.
    * @param xListener The listener to be removed.
    */
  def removeMailMergeEventListener(xListener: XMailMergeListener): scala.Unit
}

