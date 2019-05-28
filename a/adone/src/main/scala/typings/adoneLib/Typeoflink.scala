package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflink extends js.Object {
  /**
    * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def link(existingPath: nodeLib.fsMod.PathLike, newPath: nodeLib.fsMod.PathLike): js.Promise[scala.Unit]
}

object Typeoflink {
  @scala.inline
  def apply(link: (nodeLib.fsMod.PathLike, nodeLib.fsMod.PathLike) => js.Promise[scala.Unit]): Typeoflink = {
    val __obj = js.Dynamic.literal(link = js.Any.fromFunction2(link))
  
    __obj.asInstanceOf[Typeoflink]
  }
}

