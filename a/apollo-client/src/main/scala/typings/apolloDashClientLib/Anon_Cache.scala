package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache[TCacheShape] extends js.Object {
  var cache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape]
  def getCacheKey(obj: Anon_Id): js.Any
}

object Anon_Cache {
  @scala.inline
  def apply[TCacheShape](
    cache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape],
    getCacheKey: Anon_Id => js.Any
  ): Anon_Cache[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache, getCacheKey = js.Any.fromFunction1(getCacheKey))
  
    __obj.asInstanceOf[Anon_Cache[TCacheShape]]
  }
}

