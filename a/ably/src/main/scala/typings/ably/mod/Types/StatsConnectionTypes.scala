package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsConnectionTypes extends js.Object {
  var all: StatsResourceCount = js.native
  var plain: StatsResourceCount = js.native
  var tls: StatsResourceCount = js.native
}

object StatsConnectionTypes {
  @scala.inline
  def apply(all: StatsResourceCount, plain: StatsResourceCount, tls: StatsResourceCount): StatsConnectionTypes = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], plain = plain.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsConnectionTypes]
  }
  @scala.inline
  implicit class StatsConnectionTypesOps[Self <: StatsConnectionTypes] (val x: Self) extends AnyVal {
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
    def setAll(value: StatsResourceCount): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlain(value: StatsResourceCount): Self = this.set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def setTls(value: StatsResourceCount): Self = this.set("tls", value.asInstanceOf[js.Any])
  }
  
}

