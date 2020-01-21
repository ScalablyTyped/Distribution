package typings.apolloCacheControl.mod.graphqlTypeDefinitionAugmentingMod

import typings.apolloCacheControl.AnonCacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolveInfo extends js.Object {
  var cacheControl: AnonCacheHint
}

object GraphQLResolveInfo {
  @scala.inline
  def apply(cacheControl: AnonCacheHint): GraphQLResolveInfo = {
    val __obj = js.Dynamic.literal(cacheControl = cacheControl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphQLResolveInfo]
  }
}

