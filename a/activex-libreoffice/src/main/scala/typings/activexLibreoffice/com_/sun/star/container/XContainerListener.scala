package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** receives events when the content of the related container changes. */
trait XContainerListener extends XEventListener {
  /** is invoked when a container has inserted an element. */
  def elementInserted(Event: ContainerEvent): Unit
  /** is invoked when a container has removed an element. */
  def elementRemoved(Event: ContainerEvent): Unit
  /** is invoked when a container has replaced an element. */
  def elementReplaced(Event: ContainerEvent): Unit
}

object XContainerListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    elementInserted: ContainerEvent => Unit,
    elementRemoved: ContainerEvent => Unit,
    elementReplaced: ContainerEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContainerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), elementInserted = js.Any.fromFunction1(elementInserted), elementRemoved = js.Any.fromFunction1(elementRemoved), elementReplaced = js.Any.fromFunction1(elementReplaced), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContainerListener]
  }
}

