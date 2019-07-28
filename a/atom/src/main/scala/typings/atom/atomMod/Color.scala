package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /** Returns a string in the form '#abcdef'. */
  def toHexString(): String
  /** Returns a string in the form 'rgba(25, 50, 75, .9)'. */
  def toRGBAString(): String
}

object Color {
  @scala.inline
  def apply(toHexString: () => String, toRGBAString: () => String): Color = {
    val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString), toRGBAString = js.Any.fromFunction0(toRGBAString))
  
    __obj.asInstanceOf[Color]
  }
}

