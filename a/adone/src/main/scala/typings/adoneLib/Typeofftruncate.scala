package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofftruncate extends js.Object {
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  def __promisify__(fd: scala.Double): js.Promise[scala.Unit] = js.native
  def __promisify__(fd: scala.Double, len: scala.Double): js.Promise[scala.Unit] = js.native
}

