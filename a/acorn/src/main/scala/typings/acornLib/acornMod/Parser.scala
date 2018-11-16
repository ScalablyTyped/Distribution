package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Parser")
@js.native
class Parser protected ()
  extends acornLib.acornMod.acornNs.Parser {
  def this(options: acornLib.acornMod.acornNs.Options, input: java.lang.String) = this()
  def this(options: acornLib.acornMod.acornNs.Options, input: java.lang.String, startPos: scala.Double) = this()
  /* CompleteClass */
  override def parse(): estreeLib.estreeMod.Program = js.native
}

