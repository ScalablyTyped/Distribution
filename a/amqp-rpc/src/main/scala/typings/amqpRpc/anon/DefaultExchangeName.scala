package typings.amqpRpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultExchangeName extends js.Object {
  var defaultExchangeName: js.UndefOr[String] = js.undefined
}

object DefaultExchangeName {
  @scala.inline
  def apply(defaultExchangeName: String = null): DefaultExchangeName = {
    val __obj = js.Dynamic.literal()
    if (defaultExchangeName != null) __obj.updateDynamic("defaultExchangeName")(defaultExchangeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultExchangeName]
  }
}

