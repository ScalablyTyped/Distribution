package typings
package artyomDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedCommand extends js.Object {
  var index: scala.Double
  var instruction: ArtyomCommand
  var wildcard: js.UndefOr[js.Any] = js.undefined
}

object MatchedCommand {
  @scala.inline
  def apply(index: scala.Double, instruction: ArtyomCommand, wildcard: js.Any = null): MatchedCommand = {
    val __obj = js.Dynamic.literal(index = index, instruction = instruction)
    if (wildcard != null) __obj.updateDynamic("wildcard")(wildcard)
    __obj.asInstanceOf[MatchedCommand]
  }
}

