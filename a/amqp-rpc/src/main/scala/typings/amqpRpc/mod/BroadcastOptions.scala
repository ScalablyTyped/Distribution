package typings.amqpRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var onComplete: js.UndefOr[js.Any] = js.native
  var onResponse: js.UndefOr[js.Any] = js.native
  var ttl: js.UndefOr[Double] = js.native
}

object BroadcastOptions {
  @scala.inline
  def apply(): BroadcastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastOptions]
  }
  @scala.inline
  implicit class BroadcastOptionsOps[Self <: BroadcastOptions] (val x: Self) extends AnyVal {
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setOnComplete(value: js.Any): Self = this.set("onComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnResponse(value: js.Any): Self = this.set("onResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnResponse: Self = this.set("onResponse", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

