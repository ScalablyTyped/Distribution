package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfParams extends ErrorParameters {
  var failingKeyword: String
}

object IfParams {
  @scala.inline
  def apply(failingKeyword: String): IfParams = {
    val __obj = js.Dynamic.literal(failingKeyword = failingKeyword.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IfParams]
  }
}

