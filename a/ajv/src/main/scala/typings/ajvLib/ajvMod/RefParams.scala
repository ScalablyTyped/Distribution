package typings
package ajvLib.ajvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefParams extends ErrorParameters {
  var ref: java.lang.String
}

object RefParams {
  @scala.inline
  def apply(ref: java.lang.String): RefParams = {
    val __obj = js.Dynamic.literal(ref = ref)
  
    __obj.asInstanceOf[RefParams]
  }
}

