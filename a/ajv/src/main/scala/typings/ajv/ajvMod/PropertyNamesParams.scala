package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyNamesParams extends ErrorParameters {
  var propertyName: String
}

object PropertyNamesParams {
  @scala.inline
  def apply(propertyName: String): PropertyNamesParams = {
    val __obj = js.Dynamic.literal(propertyName = propertyName)
  
    __obj.asInstanceOf[PropertyNamesParams]
  }
}

