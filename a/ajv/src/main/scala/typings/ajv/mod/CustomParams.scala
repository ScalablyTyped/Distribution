package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomParams extends ErrorParameters {
  var keyword: String
}

object CustomParams {
  @scala.inline
  def apply(keyword: String): CustomParams = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomParams]
  }
}

