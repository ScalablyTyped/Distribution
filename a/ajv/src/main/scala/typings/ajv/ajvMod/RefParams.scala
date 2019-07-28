package typings.ajv.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefParams extends ErrorParameters {
  var ref: String
}

object RefParams {
  @scala.inline
  def apply(ref: String): RefParams = {
    val __obj = js.Dynamic.literal(ref = ref)
  
    __obj.asInstanceOf[RefParams]
  }
}

