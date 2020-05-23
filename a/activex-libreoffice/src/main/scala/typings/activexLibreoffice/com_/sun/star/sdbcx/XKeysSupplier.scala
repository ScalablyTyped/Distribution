package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for access to a container of keys, typically used for a table definition object. */
trait XKeysSupplier extends XInterface {
  /**
    * returns the container of keys.
    * @returns the keys
    */
  val Keys: XIndexAccess
  /**
    * returns the container of keys.
    * @returns the keys
    */
  def getKeys(): XIndexAccess
}

object XKeysSupplier {
  @scala.inline
  def apply(
    Keys: XIndexAccess,
    acquire: () => Unit,
    getKeys: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XKeysSupplier = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getKeys = js.Any.fromFunction0(getKeys), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XKeysSupplier]
  }
}

