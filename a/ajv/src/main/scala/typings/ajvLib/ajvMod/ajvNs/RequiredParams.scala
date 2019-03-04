package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredParams extends ErrorParameters {
  var missingProperty: java.lang.String
}

object RequiredParams {
  @scala.inline
  def apply(missingProperty: java.lang.String): RequiredParams = {
    val __obj = js.Dynamic.literal(missingProperty = missingProperty)
  
    __obj.asInstanceOf[RequiredParams]
  }
}

