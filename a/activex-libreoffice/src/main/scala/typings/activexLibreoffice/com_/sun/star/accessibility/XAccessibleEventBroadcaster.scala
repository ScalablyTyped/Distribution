package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to register listeners which are called whenever an accessibility event (see {@link AccessibleEventObject} ) occurs.
  * @see AccessibleEventObject
  * @see XAccessibleEventListener
  * @since OOo 1.1.2
  */
trait XAccessibleEventBroadcaster extends XInterface {
  /** registers the given {@link XAccessibleEventListener} . */
  def addAccessibleEventListener(xListener: XAccessibleEventListener): Unit
  /** unregisters the given {@link XAccessibleEventListener} . */
  def removeAccessibleEventListener(xListener: XAccessibleEventListener): Unit
}

object XAccessibleEventBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addAccessibleEventListener: XAccessibleEventListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAccessibleEventListener: XAccessibleEventListener => Unit
  ): XAccessibleEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener))
    __obj.asInstanceOf[XAccessibleEventBroadcaster]
  }
}

