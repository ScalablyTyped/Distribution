package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to control notification behavior of a broadcaster.
  * @since OOo 3.0
  */
trait XBroadcaster extends XInterface {
  /**
    * suspends broadcasts to the registered listeners.
    *
    * The calls to {@link XBroadcaster.lockBroadcasts()} and {@link XBroadcaster.unlockBroadcasts()} may be nested and even overlapping, but they must be in
    * pairs. While there is at least one lock remaining, no broadcasts are sent to registered listeners.
    */
  def lockBroadcasts(): Unit
  /**
    * resumes the broadcasts which were suspended by {@link XBroadcaster.lockBroadcasts()} .
    *
    * The calls to {@link XBroadcaster.lockBroadcasts()} and {@link XBroadcaster.unlockBroadcasts()} may be nested and even overlapping, but they must be in
    * pairs. While there is at least one lock remaining, no broadcasts are sent to registered listeners.
    *
    * Pending broadcasts will be sent immediately after the last call to {@link XBroadcaster.lockBroadcasts()} is matched by a call to {@link
    * XBroadcaster.unlockBroadcasts()} . An implementation can decide to broadcast all pending notification in order or batch them in single broadcasts.
    */
  def unlockBroadcasts(): Unit
}

object XBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    lockBroadcasts: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    unlockBroadcasts: () => Unit
  ): XBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), lockBroadcasts = js.Any.fromFunction0(lockBroadcasts), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unlockBroadcasts = js.Any.fromFunction0(unlockBroadcasts))
  
    __obj.asInstanceOf[XBroadcaster]
  }
}

