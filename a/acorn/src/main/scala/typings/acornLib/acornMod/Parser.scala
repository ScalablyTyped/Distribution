package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(options: Options, input: java.lang.String) = this()
  def this(options: Options, input: java.lang.String, startPos: scala.Double) = this()
  def parse(): estreeLib.estreeMod.Program = js.native
}

