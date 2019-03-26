package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gid extends js.Object {
  /**
    * Asynchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike, uid: scala.Double, gid: scala.Double): js.Promise[scala.Unit]
}

object Anon_Gid {
  @scala.inline
  def apply(__promisify__ : (nodeLib.fsMod.PathLike, scala.Double, scala.Double) => js.Promise[scala.Unit]): Anon_Gid = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction3(__promisify__))
  
    __obj.asInstanceOf[Anon_Gid]
  }
}

