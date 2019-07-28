package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredParams extends ErrorParameters {
  var missingProperty: String
}

object RequiredParams {
  @scala.inline
  def apply(missingProperty: String): RequiredParams = {
    val __obj = js.Dynamic.literal(missingProperty = missingProperty)
  
    __obj.asInstanceOf[RequiredParams]
  }
}

