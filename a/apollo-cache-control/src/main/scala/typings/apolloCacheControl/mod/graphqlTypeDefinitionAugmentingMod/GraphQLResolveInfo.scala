package typings.apolloCacheControl.mod.graphqlTypeDefinitionAugmentingMod

import typings.apolloCacheControl.anon.CacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolveInfo extends js.Object {
  var cacheControl: CacheHint
}

object GraphQLResolveInfo {
  @scala.inline
  def apply(cacheControl: CacheHint): GraphQLResolveInfo = {
    val __obj = js.Dynamic.literal(cacheControl = cacheControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
}

