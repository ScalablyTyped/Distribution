package typings.apolloClient.anon

import typings.apolloCache.mod.ApolloCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache[TCacheShape] extends js.Object {
  var cache: ApolloCache[TCacheShape]
  def getCacheKey(obj: Id): js.Any
}

object Cache {
  @scala.inline
  def apply[TCacheShape](cache: ApolloCache[TCacheShape], getCacheKey: Id => js.Any): Cache[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], getCacheKey = js.Any.fromFunction1(getCacheKey))
    __obj.asInstanceOf[Cache[TCacheShape]]
  }
}

