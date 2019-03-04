package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParams extends ErrorParameters {
  var `type`: java.lang.String
}

object TypeParams {
  @scala.inline
  def apply(`type`: java.lang.String): TypeParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TypeParams]
  }
}

