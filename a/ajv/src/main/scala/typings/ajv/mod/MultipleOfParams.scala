package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleOfParams extends ErrorParameters {
  var multipleOf: Double
}

object MultipleOfParams {
  @scala.inline
  def apply(multipleOf: Double): MultipleOfParams = {
    val __obj = js.Dynamic.literal(multipleOf = multipleOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleOfParams]
  }
}

