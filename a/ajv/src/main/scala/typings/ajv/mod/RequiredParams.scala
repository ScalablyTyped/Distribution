package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredParams extends ErrorParameters {
  var missingProperty: String
}

object RequiredParams {
  @scala.inline
  def apply(missingProperty: String): RequiredParams = {
    val __obj = js.Dynamic.literal(missingProperty = missingProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredParams]
  }
}

