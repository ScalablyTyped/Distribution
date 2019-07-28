package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XMailMergeBroadcaster extends XInterface {
  /**
    * Adds an entry to the list of mail merge listeners.
    * @param xListener The listener to be added.
    */
  def addMailMergeEventListener(xListener: XMailMergeListener): Unit
  /**
    * Removes an entry to the list of mail merge listeners.
    * @param xListener The listener to be removed.
    */
  def removeMailMergeEventListener(xListener: XMailMergeListener): Unit
}

object XMailMergeBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addMailMergeEventListener: XMailMergeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeMailMergeEventListener: XMailMergeListener => Unit
  ): XMailMergeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addMailMergeEventListener = js.Any.fromFunction1(addMailMergeEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeMailMergeEventListener = js.Any.fromFunction1(removeMailMergeEventListener))
  
    __obj.asInstanceOf[XMailMergeBroadcaster]
  }
}

