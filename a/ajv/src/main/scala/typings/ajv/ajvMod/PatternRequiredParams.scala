package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternRequiredParams extends ErrorParameters {
  var missingPattern: String
}

object PatternRequiredParams {
  @scala.inline
  def apply(missingPattern: String): PatternRequiredParams = {
    val __obj = js.Dynamic.literal(missingPattern = missingPattern)
  
    __obj.asInstanceOf[PatternRequiredParams]
  }
}

