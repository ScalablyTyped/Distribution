package typings.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtyomCommand extends js.Object {
  var action: js.Function
  var description: js.UndefOr[String] = js.undefined
  var indexes: js.Array[_]
  var smart: js.UndefOr[Boolean] = js.undefined
}

object ArtyomCommand {
  @scala.inline
  def apply(
    action: js.Function,
    indexes: js.Array[_],
    description: String = null,
    smart: js.UndefOr[Boolean] = js.undefined
  ): ArtyomCommand = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomCommand]
  }
}

