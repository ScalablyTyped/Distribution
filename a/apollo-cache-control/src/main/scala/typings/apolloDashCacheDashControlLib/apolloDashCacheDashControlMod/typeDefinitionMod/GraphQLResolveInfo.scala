package typings
package apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolveInfo extends js.Object {
  var cacheControl: apolloDashCacheDashControlLib.Anon_CacheHint
}

object GraphQLResolveInfo {
  @scala.inline
  def apply(cacheControl: apolloDashCacheDashControlLib.Anon_CacheHint): GraphQLResolveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cacheControl")(cacheControl)
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
}

