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

object XMailMergeBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addMailMergeEventListener: js.Function1[XMailMergeListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeMailMergeEventListener: js.Function1[XMailMergeListener, scala.Unit]
  ): XMailMergeBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addMailMergeEventListener")(addMailMergeEventListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeMailMergeEventListener")(removeMailMergeEventListener)
    __obj.asInstanceOf[XMailMergeBroadcaster]
  }
}

