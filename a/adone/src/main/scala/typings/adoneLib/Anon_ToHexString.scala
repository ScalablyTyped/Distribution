package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToHexString extends js.Object {
  def toHexString(): java.lang.String
}

object Anon_ToHexString {
  @scala.inline
  def apply(toHexString: () => java.lang.String): Anon_ToHexString = {
    val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString))
  
    __obj.asInstanceOf[Anon_ToHexString]
  }
}

