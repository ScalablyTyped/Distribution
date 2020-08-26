package typings.atomically.anon

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.BaseEncodingOptions
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOptions extends js.Object {
  def apply(path: PathLike): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  def apply(path: PathLike, options: BaseEncodingOptions): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
}

