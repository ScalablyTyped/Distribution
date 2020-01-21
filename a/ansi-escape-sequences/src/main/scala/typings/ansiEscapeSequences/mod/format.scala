package typings.ansiEscapeSequences.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi-escape-sequences", "format")
@js.native
object format extends js.Object {
  def apply(str: String): String = js.native
  def apply(str: String, styles: js.Array[Style_]): String = js.native
  def apply(str: String, styles: Style_): String = js.native
}

