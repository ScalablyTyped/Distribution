package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResolverResponse extends js.Object {
  /**
    * The Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.undefined
}

object CreateResolverResponse {
  @scala.inline
  def apply(resolver: Resolver = null): CreateResolverResponse = {
    val __obj = js.Dynamic.literal()
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    __obj.asInstanceOf[CreateResolverResponse]
  }
}

