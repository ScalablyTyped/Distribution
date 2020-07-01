package typings.apolloServerCore.anon

import typings.apolloCacheControl.mod.CacheScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<apollo-cache-control.apollo-cache-control.CacheHint> */
trait RequiredCacheHint extends js.Object {
  var maxAge: Double
  var scope: CacheScope
}

object RequiredCacheHint {
  @scala.inline
  def apply(maxAge: Double, scope: CacheScope): RequiredCacheHint = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredCacheHint]
  }
}

