package typings.activexLibreoffice.com_.sun.star.uno

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * must be implemented by anyone who holds the adapter on the client side.
  * @see XWeak for description af concepts.
  */
trait XReference extends XInterface {
  /**
    * removes all references to the adapter.
    *
    * This method is called when the adapted object dies. The implementation of the client-side's weak reference must include removal of all references to
    * the adapter. Otherwise, the adapted object will be destroyed, but the adapter will be alive.
    */
  def dispose(): Unit
}

object XReference {
  @scala.inline
  def apply(acquire: () => Unit, dispose: () => Unit, queryInterface: `type` => js.Any, release: () => Unit): XReference = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XReference]
  }
}

