package typings.acorn.mod

import typings.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(options: Options, input: String) = this()
  def this(options: Options, input: String, startPos: Double) = this()
  def parse(): Program = js.native
}

