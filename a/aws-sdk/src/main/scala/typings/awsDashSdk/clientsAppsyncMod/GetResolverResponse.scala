package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverResponse extends js.Object {
  /**
    * The Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.native
}

object GetResolverResponse {
  @scala.inline
  def apply(resolver: Resolver = null): GetResolverResponse = {
    val __obj = js.Dynamic.literal()
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverResponse]
  }
}

