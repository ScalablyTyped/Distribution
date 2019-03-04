package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternParams extends ErrorParameters {
  var pattern: java.lang.String
}

object PatternParams {
  @scala.inline
  def apply(pattern: java.lang.String): PatternParams = {
    val __obj = js.Dynamic.literal(pattern = pattern)
  
    __obj.asInstanceOf[PatternParams]
  }
}

