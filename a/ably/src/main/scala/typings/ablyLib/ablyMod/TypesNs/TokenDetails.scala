package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenDetails extends js.Object {
  var capability: java.lang.String
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var expires: scala.Double
  var issued: scala.Double
  var token: java.lang.String
}

object TokenDetails {
  @scala.inline
  def apply(
    capability: java.lang.String,
    expires: scala.Double,
    issued: scala.Double,
    token: java.lang.String,
    clientId: java.lang.String = null
  ): TokenDetails = {
    val __obj = js.Dynamic.literal(capability = capability, expires = expires, issued = issued, token = token)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    __obj.asInstanceOf[TokenDetails]
  }
}

