package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResolverResponse extends js.Object {
  /**
    * The updated Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.native
}

object UpdateResolverResponse {
  @scala.inline
  def apply(resolver: Resolver = null): UpdateResolverResponse = {
    val __obj = js.Dynamic.literal()
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResolverResponse]
  }
}

