package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitParams extends ErrorParameters {
  var limit: scala.Double
}

object LimitParams {
  @scala.inline
  def apply(limit: scala.Double): LimitParams = {
    val __obj = js.Dynamic.literal(limit = limit)
  
    __obj.asInstanceOf[LimitParams]
  }
}

