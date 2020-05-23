package typings.activexLibreoffice.com_.sun.star.uno

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the server-side interface to a weak adapter.
  *
  * The implementation of {@link XAdapter} must know but not hold the adapted object, because it must not affect the lifetime of the adapted object.
  * @see XWeak for description of concepts.
  */
trait XAdapter extends XInterface {
  /**
    * adds a reference to the adapter.
    *
    * All added references are called when the adapted object dies.
    */
  def addReference(xRef: XReference): Unit
  /** queries the adapted object if it is alive. */
  def queryAdapted(): XInterface
  /** removes a reference from the adapter. */
  def removeReference(xRef: XReference): Unit
}

object XAdapter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addReference: XReference => Unit,
    queryAdapted: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeReference: XReference => Unit
  ): XAdapter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addReference = js.Any.fromFunction1(addReference), queryAdapted = js.Any.fromFunction0(queryAdapted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeReference = js.Any.fromFunction1(removeReference))
    __obj.asInstanceOf[XAdapter]
  }
}

