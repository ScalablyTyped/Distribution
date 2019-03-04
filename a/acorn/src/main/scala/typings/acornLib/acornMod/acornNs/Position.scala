package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position
  extends estreeLib.estreeMod.Position {
  def offset(n: scala.Double): Position
}

object Position {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, offset: js.Function1[scala.Double, Position]): Position = {
    val __obj = js.Dynamic.literal(column = column, line = line, offset = offset)
  
    __obj.asInstanceOf[Position]
  }
}

