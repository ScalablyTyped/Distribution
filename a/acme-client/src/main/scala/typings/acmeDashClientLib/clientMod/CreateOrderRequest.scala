package typings
package acmeDashClientLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOrderRequest extends js.Object {
  var identifiers: js.Array[Identifier]
  var notAfter: js.UndefOr[java.lang.String] = js.undefined
  var notBefore: js.UndefOr[java.lang.String] = js.undefined
}

object CreateOrderRequest {
  @scala.inline
  def apply(
    identifiers: js.Array[Identifier],
    notAfter: java.lang.String = null,
    notBefore: java.lang.String = null
  ): CreateOrderRequest = {
    val __obj = js.Dynamic.literal(identifiers = identifiers)
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter)
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore)
    __obj.asInstanceOf[CreateOrderRequest]
  }
}

