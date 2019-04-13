package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumParams extends ErrorParameters {
  var allowedValues: js.Array[_]
}

object EnumParams {
  @scala.inline
  def apply(allowedValues: js.Array[_]): EnumParams = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues)
  
    __obj.asInstanceOf[EnumParams]
  }
}

