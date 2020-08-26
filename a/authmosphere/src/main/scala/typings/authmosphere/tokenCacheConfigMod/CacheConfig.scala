package typings.authmosphere.tokenCacheConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheConfig extends js.Object {
  var percentageLeft: Double = js.native
}

object CacheConfig {
  @scala.inline
  def apply(percentageLeft: Double): CacheConfig = {
    val __obj = js.Dynamic.literal(percentageLeft = percentageLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheConfig]
  }
  @scala.inline
  implicit class CacheConfigOps[Self <: CacheConfig] (val x: Self) extends AnyVal {
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
    def setPercentageLeft(value: Double): Self = this.set("percentageLeft", value.asInstanceOf[js.Any])
  }
  
}

