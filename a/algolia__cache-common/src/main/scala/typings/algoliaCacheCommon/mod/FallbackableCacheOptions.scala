package typings.algoliaCacheCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FallbackableCacheOptions extends js.Object {
  /**
    * List of caches order by priority.
    */
  val caches: js.Array[Cache] = js.native
}

object FallbackableCacheOptions {
  @scala.inline
  def apply(caches: js.Array[Cache]): FallbackableCacheOptions = {
    val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackableCacheOptions]
  }
  @scala.inline
  implicit class FallbackableCacheOptionsOps[Self <: FallbackableCacheOptions] (val x: Self) extends AnyVal {
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
    def setCachesVarargs(value: Cache*): Self = this.set("caches", js.Array(value :_*))
    @scala.inline
    def setCaches(value: js.Array[Cache]): Self = this.set("caches", value.asInstanceOf[js.Any])
  }
  
}

