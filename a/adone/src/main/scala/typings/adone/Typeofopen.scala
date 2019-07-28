package typings.adone

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofopen extends js.Object {
  /**
    * Asynchronous open(2) - open and possibly create a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
    */
  def __promisify__(path: PathLike, flags: String): js.Promise[Double] = js.native
  def __promisify__(path: PathLike, flags: String, mode: String): js.Promise[Double] = js.native
  def __promisify__(path: PathLike, flags: String, mode: Double): js.Promise[Double] = js.native
  def __promisify__(path: PathLike, flags: Double): js.Promise[Double] = js.native
  def __promisify__(path: PathLike, flags: Double, mode: String): js.Promise[Double] = js.native
  def __promisify__(path: PathLike, flags: Double, mode: Double): js.Promise[Double] = js.native
}

