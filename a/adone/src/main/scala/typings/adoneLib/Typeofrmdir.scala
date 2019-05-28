package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrmdir extends js.Object {
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike): js.Promise[scala.Unit]
}

object Typeofrmdir {
  @scala.inline
  def apply(__promisify__ : nodeLib.fsMod.PathLike => js.Promise[scala.Unit]): Typeofrmdir = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Typeofrmdir]
  }
}

