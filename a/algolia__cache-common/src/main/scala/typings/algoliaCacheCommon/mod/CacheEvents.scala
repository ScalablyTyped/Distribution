package typings.algoliaCacheCommon.mod

import typings.algoliaCacheCommon.anon.ReadonlyPromiseany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheEvents[TValue] extends js.Object {
  /**
    * The callback when the given `key` is missing from the cache.
    */
  def miss(value: TValue): ReadonlyPromiseany = js.native
}

object CacheEvents {
  @scala.inline
  def apply[TValue](miss: TValue => ReadonlyPromiseany): CacheEvents[TValue] = {
    val __obj = js.Dynamic.literal(miss = js.Any.fromFunction1(miss))
    __obj.asInstanceOf[CacheEvents[TValue]]
  }
  @scala.inline
  implicit class CacheEventsOps[Self <: CacheEvents[_], TValue] (val x: Self with CacheEvents[TValue]) extends AnyVal {
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
    def setMiss(value: TValue => ReadonlyPromiseany): Self = this.set("miss", js.Any.fromFunction1(value))
  }
  
}

