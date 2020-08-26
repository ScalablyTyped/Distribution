package typings.atomically.anon

import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(path: PathLike): js.Promise[js.UndefOr[String]] = js.native
  def apply(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[String] = js.native
  def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
  def apply(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
  def apply(path: PathLike, options: Mode): js.Promise[js.UndefOr[String]] = js.native
}

