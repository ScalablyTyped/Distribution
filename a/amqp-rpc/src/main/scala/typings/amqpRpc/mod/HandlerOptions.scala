package typings.amqpRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerOptions extends js.Object {
  var autoDelete: js.UndefOr[Boolean] = js.native
  var durable: js.UndefOr[Boolean] = js.native
  var exclusive: js.UndefOr[Boolean] = js.native
  var queueName: js.UndefOr[String] = js.native
}

object HandlerOptions {
  @scala.inline
  def apply(): HandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerOptions]
  }
  @scala.inline
  implicit class HandlerOptionsOps[Self <: HandlerOptions] (val x: Self) extends AnyVal {
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
    def setAutoDelete(value: Boolean): Self = this.set("autoDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDelete: Self = this.set("autoDelete", js.undefined)
    @scala.inline
    def setDurable(value: Boolean): Self = this.set("durable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurable: Self = this.set("durable", js.undefined)
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    @scala.inline
    def setQueueName(value: String): Self = this.set("queueName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueName: Self = this.set("queueName", js.undefined)
  }
  
}

