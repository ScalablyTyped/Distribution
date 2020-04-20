package typings.algoliaCacheCommon.mod

import typings.algoliaCacheCommon.ReadonlyPromiseany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheEvents[TValue] extends js.Object {
  /**
    * The callback when the given `key` is missing from the cache.
    */
  def miss(value: TValue): ReadonlyPromiseany
}

object CacheEvents {
  @scala.inline
  def apply[TValue](miss: TValue => ReadonlyPromiseany): CacheEvents[TValue] = {
    val __obj = js.Dynamic.literal(miss = js.Any.fromFunction1(miss))
    __obj.asInstanceOf[CacheEvents[TValue]]
  }
}

