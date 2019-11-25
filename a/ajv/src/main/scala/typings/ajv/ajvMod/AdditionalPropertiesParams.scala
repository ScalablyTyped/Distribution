package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalPropertiesParams extends ErrorParameters {
  var additionalProperty: String
}

object AdditionalPropertiesParams {
  @scala.inline
  def apply(additionalProperty: String): AdditionalPropertiesParams = {
    val __obj = js.Dynamic.literal(additionalProperty = additionalProperty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdditionalPropertiesParams]
  }
}

