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
  def apply(parse: js.Function0[estreeLib.estreeMod.Program]): Parser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[Parser]
  }
}

