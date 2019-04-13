package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResolverResponse extends js.Object {
  /**
    * The updated Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.undefined
}

object UpdateResolverResponse {
  @scala.inline
  def apply(resolver: Resolver = null): UpdateResolverResponse = {
    val __obj = js.Dynamic.literal()
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    __obj.asInstanceOf[UpdateResolverResponse]
  }
}

