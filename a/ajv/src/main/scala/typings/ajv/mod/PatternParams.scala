package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternParams extends ErrorParameters {
  var pattern: String
}

object PatternParams {
  @scala.inline
  def apply(pattern: String): PatternParams = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatternParams]
  }
}

