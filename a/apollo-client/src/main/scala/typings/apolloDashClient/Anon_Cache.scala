package typings.apolloDashClient

import typings.apolloDashCache.apolloDashCacheMod.ApolloCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache[TCacheShape] extends js.Object {
  var cache: ApolloCache[TCacheShape]
  def getCacheKey(obj: Anon_Id): js.Any
}

object Anon_Cache {
  @scala.inline
  def apply[TCacheShape](cache: ApolloCache[TCacheShape], getCacheKey: Anon_Id => js.Any): Anon_Cache[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], getCacheKey = js.Any.fromFunction1(getCacheKey))
  
    __obj.asInstanceOf[Anon_Cache[TCacheShape]]
  }
}

