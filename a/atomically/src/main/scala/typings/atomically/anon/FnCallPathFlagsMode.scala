package typings.atomically.anon

import typings.node.fsMod.Mode
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathFlagsMode extends js.Object {
  def apply(path: PathLike, flags: OpenMode): js.Promise[Double] = js.native
  def apply(path: PathLike, flags: OpenMode, mode: Mode): js.Promise[Double] = js.native
}

