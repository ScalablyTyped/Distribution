package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoffchown extends js.Object {
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: Double, uid: Double, gid: Double): js.Promise[Unit]
}

object Typeoffchown {
  @scala.inline
  def apply(__promisify__ : (Double, Double, Double) => js.Promise[Unit]): Typeoffchown = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction3(__promisify__))
  
    __obj.asInstanceOf[Typeoffchown]
  }
}

