package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access contents via a unique ID. */
trait XUniqueIDAccess extends XInterface {
  /** @returns the element with the specified unique ID. */
  def getByUniqueID(ID: String): js.Any
  /** removes the element with the specified unique ID from this container. */
  def removeByUniqueID(ID: String): Unit
}

object XUniqueIDAccess {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getByUniqueID: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByUniqueID: String => Unit
  ): XUniqueIDAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByUniqueID = js.Any.fromFunction1(getByUniqueID), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByUniqueID = js.Any.fromFunction1(removeByUniqueID))
    __obj.asInstanceOf[XUniqueIDAccess]
  }
}

