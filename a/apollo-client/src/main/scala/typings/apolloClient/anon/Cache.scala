package typings.apolloClient.anon

import typings.apolloCache.mod.ApolloCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache[TCacheShape] extends js.Object {
  var cache: ApolloCache[TCacheShape] = js.native
  def getCacheKey(obj: Id): js.Any = js.native
}

object Cache {
  @scala.inline
  def apply[TCacheShape](cache: ApolloCache[TCacheShape], getCacheKey: Id => js.Any): Cache[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], getCacheKey = js.Any.fromFunction1(getCacheKey))
    __obj.asInstanceOf[Cache[TCacheShape]]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache[_], TCacheShape] (val x: Self with Cache[TCacheShape]) extends AnyVal {
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
    def setCache(value: ApolloCache[TCacheShape]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCacheKey(value: Id => js.Any): Self = this.set("getCacheKey", js.Any.fromFunction1(value))
  }
  
}

