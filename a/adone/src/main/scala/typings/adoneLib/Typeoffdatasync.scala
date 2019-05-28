package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoffdatasync extends js.Object {
  /**
    * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: scala.Double): js.Promise[scala.Unit]
}

object Typeoffdatasync {
  @scala.inline
  def apply(__promisify__ : scala.Double => js.Promise[scala.Unit]): Typeoffdatasync = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Typeoffdatasync]
  }
}

