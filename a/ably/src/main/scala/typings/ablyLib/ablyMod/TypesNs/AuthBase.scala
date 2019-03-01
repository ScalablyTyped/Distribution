package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthBase extends js.Object {
  var clientId: java.lang.String
}

object AuthBase {
  @scala.inline
  def apply(clientId: java.lang.String): AuthBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientId")(clientId)
    __obj.asInstanceOf[AuthBase]
  }
}

