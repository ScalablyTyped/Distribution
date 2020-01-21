package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyNamesParams extends ErrorParameters {
  var propertyName: String
}

object PropertyNamesParams {
  @scala.inline
  def apply(propertyName: String): PropertyNamesParams = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropertyNamesParams]
  }
}

