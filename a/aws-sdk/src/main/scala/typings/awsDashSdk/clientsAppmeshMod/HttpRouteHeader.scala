package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRouteHeader extends js.Object {
  /**
    * Specify True to match the opposite of the HeaderMatchMethod method and value. The default value is False.
    */
  var invert: js.UndefOr[Boolean] = js.undefined
  /**
    * The HeaderMatchMethod object.
    */
  var `match`: js.UndefOr[HeaderMatchMethod] = js.undefined
  /**
    * A name for the HTTP header in the client request that will be matched on.
    */
  var name: HeaderName
}

object HttpRouteHeader {
  @scala.inline
  def apply(
    name: HeaderName,
    invert: js.UndefOr[scala.Boolean] = js.undefined,
    `match`: HeaderMatchMethod = null
  ): HttpRouteHeader = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[HttpRouteHeader]
  }
}

