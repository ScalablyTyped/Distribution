package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatParams extends ErrorParameters {
  var format: java.lang.String
}

object FormatParams {
  @scala.inline
  def apply(format: java.lang.String): FormatParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[FormatParams]
  }
}

