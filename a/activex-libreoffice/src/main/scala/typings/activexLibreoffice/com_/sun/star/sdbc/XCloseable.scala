package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for the releasing of resources acquired by the implementing object. */
trait XCloseable extends XInterface {
  /**
    * releases all resources connected to an object.
    * @throws SQLException if a database access error occurs.
    */
  def close(): Unit
}

object XCloseable {
  @scala.inline
  def apply(acquire: () => Unit, close: () => Unit, queryInterface: `type` => js.Any, release: () => Unit): XCloseable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), close = js.Any.fromFunction0(close), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCloseable]
  }
}

