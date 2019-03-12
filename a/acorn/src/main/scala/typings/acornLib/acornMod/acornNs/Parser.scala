package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  def parse(): estreeLib.estreeMod.Program
}

object Parser {
  @scala.inline
  def apply(parse: () => estreeLib.estreeMod.Program): Parser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse))
  
    __obj.asInstanceOf[Parser]
  }
}

