package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Reference Resolved Broadcaster.
  *
  * This interface is used to manipulate reference resolved listener.
  */
trait XReferenceResolvedBroadcaster extends XInterface {
  /**
    * Adds a new reference resolved listener for a element collector.
    *
    * When the element collector has completely collected that element, this listener will receive a notification.
    * @param referenceId the id of the element collector for which the new listener is added
    * @param listener the listener to be added
    */
  def addReferenceResolvedListener(referenceId: Double, listener: XReferenceResolvedListener): Unit
  /**
    * Removes a listener from a element collector.
    *
    * When a listener is removed, it will not receive notification when collection completes.
    * @param referenceId the id of the element collector from which the listener is removed
    * @param listener the listener to be removed
    */
  def removeReferenceResolvedListener(referenceId: Double, listener: XReferenceResolvedListener): Unit
}

object XReferenceResolvedBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addReferenceResolvedListener: (Double, XReferenceResolvedListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeReferenceResolvedListener: (Double, XReferenceResolvedListener) => Unit
  ): XReferenceResolvedBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addReferenceResolvedListener = js.Any.fromFunction2(addReferenceResolvedListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeReferenceResolvedListener = js.Any.fromFunction2(removeReferenceResolvedListener))
    __obj.asInstanceOf[XReferenceResolvedBroadcaster]
  }
}

