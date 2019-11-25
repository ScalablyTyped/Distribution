package typings.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get extends js.Object {
  var noAck: js.UndefOr[Boolean] = js.undefined
}

object Get {
  @scala.inline
  def apply(noAck: js.UndefOr[Boolean] = js.undefined): Get = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noAck)) __obj.updateDynamic("noAck")(noAck.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get]
  }
}

