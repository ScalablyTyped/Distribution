package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternParams extends ErrorParameters {
  var pattern: String
}

object PatternParams {
  @scala.inline
  def apply(pattern: String): PatternParams = {
    val __obj = js.Dynamic.literal(pattern = pattern)
  
    __obj.asInstanceOf[PatternParams]
  }
}

