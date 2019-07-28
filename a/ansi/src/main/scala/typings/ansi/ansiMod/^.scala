package typings.ansi.ansiMod

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(stream: Stream): Cursor = js.native
  def apply(stream: Stream, options: CursorOptions): Cursor = js.native
}

