package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive container events.
  *
  * Container events are provided **only** for notification purposes. The VCL will automatically handle add and remove operations internally.
  * @deprecated Deprecated
  */
trait XVclContainerListener extends XEventListener {
  /** is invoked when a window has been added to the VCL container window. */
  def windowAdded(e: VclContainerEvent): Unit
  /** is invoked when a window has been removed from the VCL container window. */
  def windowRemoved(e: VclContainerEvent): Unit
}

object XVclContainerListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    windowAdded: VclContainerEvent => Unit,
    windowRemoved: VclContainerEvent => Unit
  ): XVclContainerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), windowAdded = js.Any.fromFunction1(windowAdded), windowRemoved = js.Any.fromFunction1(windowRemoved))
    __obj.asInstanceOf[XVclContainerListener]
  }
}

