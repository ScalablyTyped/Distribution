package typings.atApolloProtobufjs.extDescriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageOptions extends js.Object {
  var mapEntry: js.UndefOr[Boolean] = js.undefined
}

object IMessageOptions {
  @scala.inline
  def apply(mapEntry: js.UndefOr[Boolean] = js.undefined): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mapEntry)) __obj.updateDynamic("mapEntry")(mapEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageOptions]
  }
}

