package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefParams extends ErrorParameters {
  var ref: java.lang.String
}

object RefParams {
  @scala.inline
  def apply(ref: java.lang.String): RefParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[RefParams]
  }
}

