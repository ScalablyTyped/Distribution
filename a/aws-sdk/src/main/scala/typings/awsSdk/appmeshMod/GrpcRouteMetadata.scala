package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcRouteMetadata extends js.Object {
  /**
    * Specify True to match anything except the match criteria. The default value is False.
    */
  var invert: js.UndefOr[Boolean] = js.native
  /**
    * An object that represents the data to match from the request.
    */
  var `match`: js.UndefOr[GrpcRouteMetadataMatchMethod] = js.native
  /**
    * The name of the route.
    */
  var name: HeaderName = js.native
}

object GrpcRouteMetadata {
  @scala.inline
  def apply(
    name: HeaderName,
    invert: js.UndefOr[Boolean] = js.undefined,
    `match`: GrpcRouteMetadataMatchMethod = null
  ): GrpcRouteMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.get.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRouteMetadata]
  }
}

