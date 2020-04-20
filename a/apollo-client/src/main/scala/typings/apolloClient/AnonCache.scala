package typings.apolloClient

import typings.apolloCache.mod.ApolloCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCache[TCacheShape] extends js.Object {
  var cache: ApolloCache[TCacheShape]
  def getCacheKey(obj: AnonId): js.Any
}

object AnonCache {
  @scala.inline
  def apply[TCacheShape](cache: ApolloCache[TCacheShape], getCacheKey: AnonId => js.Any): AnonCache[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], getCacheKey = js.Any.fromFunction1(getCacheKey))
    __obj.asInstanceOf[AnonCache[TCacheShape]]
  }
}

