package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRouteHeader extends js.Object {
  /**
    * Specify True to match anything except the match criteria. The default value is False.
    */
  var invert: js.UndefOr[Boolean] = js.native
  /**
    * The HeaderMatchMethod object.
    */
  var `match`: js.UndefOr[HeaderMatchMethod] = js.native
  /**
    * A name for the HTTP header in the client request that will be matched on.
    */
  var name: HeaderName = js.native
}

object HttpRouteHeader {
  @scala.inline
  def apply(
    name: HeaderName,
    invert: js.UndefOr[scala.Boolean] = js.undefined,
    `match`: HeaderMatchMethod = null
  ): HttpRouteHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRouteHeader]
  }
}

