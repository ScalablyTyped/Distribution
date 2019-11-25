package typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod.typeDefinitionMod

import typings.apolloDashCacheDashControl.Anon_CacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolveInfo extends js.Object {
  var cacheControl: Anon_CacheHint
}

object GraphQLResolveInfo {
  @scala.inline
  def apply(cacheControl: Anon_CacheHint): GraphQLResolveInfo = {
    val __obj = js.Dynamic.literal(cacheControl = cacheControl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
}

