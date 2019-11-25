package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitParams extends ErrorParameters {
  var limit: Double
}

object LimitParams {
  @scala.inline
  def apply(limit: Double): LimitParams = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LimitParams]
  }
}

