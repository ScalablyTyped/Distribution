package typings.amqpRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultExchangeName extends js.Object {
  var defaultExchangeName: js.UndefOr[String] = js.undefined
}

object AnonDefaultExchangeName {
  @scala.inline
  def apply(defaultExchangeName: String = null): AnonDefaultExchangeName = {
    val __obj = js.Dynamic.literal()
    if (defaultExchangeName != null) __obj.updateDynamic("defaultExchangeName")(defaultExchangeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultExchangeName]
  }
}

