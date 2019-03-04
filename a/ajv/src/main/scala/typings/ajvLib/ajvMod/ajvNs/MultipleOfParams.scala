package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleOfParams extends ErrorParameters {
  var multipleOf: scala.Double
}

object MultipleOfParams {
  @scala.inline
  def apply(multipleOf: scala.Double): MultipleOfParams = {
    val __obj = js.Dynamic.literal(multipleOf = multipleOf)
  
    __obj.asInstanceOf[MultipleOfParams]
  }
}

