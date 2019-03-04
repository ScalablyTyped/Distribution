package typings
package artyomDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtyomCommand extends js.Object {
  var action: js.Function
  var description: js.UndefOr[java.lang.String] = js.undefined
  var indexes: js.Array[_]
  var smart: js.UndefOr[scala.Boolean] = js.undefined
}

object ArtyomCommand {
  @scala.inline
  def apply(
    action: js.Function,
    indexes: js.Array[_],
    description: java.lang.String = null,
    smart: js.UndefOr[scala.Boolean] = js.undefined
  ): ArtyomCommand = {
    val __obj = js.Dynamic.literal(action = action, indexes = indexes)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart)
    __obj.asInstanceOf[ArtyomCommand]
  }
}

