package typings.apolloServerCore.anon

import typings.apolloCacheControl.mod.CacheScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<apollo-cache-control.apollo-cache-control.CacheHint> */
@js.native
trait RequiredCacheHint extends js.Object {
  var maxAge: Double = js.native
  var scope: CacheScope = js.native
}

object RequiredCacheHint {
  @scala.inline
  def apply(maxAge: Double, scope: CacheScope): RequiredCacheHint = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredCacheHint]
  }
  @scala.inline
  implicit class RequiredCacheHintOps[Self <: RequiredCacheHint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: CacheScope): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

