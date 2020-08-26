package typings.amqpRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultExchangeName extends js.Object {
  var defaultExchangeName: js.UndefOr[String] = js.native
}

object DefaultExchangeName {
  @scala.inline
  def apply(): DefaultExchangeName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultExchangeName]
  }
  @scala.inline
  implicit class DefaultExchangeNameOps[Self <: DefaultExchangeName] (val x: Self) extends AnyVal {
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
    def setDefaultExchangeName(value: String): Self = this.set("defaultExchangeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultExchangeName: Self = this.set("defaultExchangeName", js.undefined)
  }
  
}

