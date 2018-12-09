package typings
package ansiLib.ansiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi", "Cursor")
@js.native
class Cursor protected ()
  extends ansiLib.ansiMod.ansiNs.Cursor {
  def this(stream: nodeLib.streamMod.Stream) = this()
  def this(stream: nodeLib.streamMod.Stream, options: CursorOptions) = this()
}

