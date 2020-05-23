package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to write this object to an URL or read it from an URL. */
trait XPersist extends XInterface {
  /** reads all the persistent data of the object from the URL. */
  def read(URL: String): Unit
  /** writes all the persistent data of the object to the URL. */
  def write(URL: String): Unit
}

object XPersist {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    read: String => Unit,
    release: () => Unit,
    write: String => Unit
  ): XPersist = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[XPersist]
  }
}

