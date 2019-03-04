package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternRequiredParams extends ErrorParameters {
  var missingPattern: java.lang.String
}

object PatternRequiredParams {
  @scala.inline
  def apply(missingPattern: java.lang.String): PatternRequiredParams = {
    val __obj = js.Dynamic.literal(missingPattern = missingPattern)
  
    __obj.asInstanceOf[PatternRequiredParams]
  }
}

