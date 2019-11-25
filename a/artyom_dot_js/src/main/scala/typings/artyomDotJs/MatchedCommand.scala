package typings.artyomDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedCommand extends js.Object {
  var index: Double
  var instruction: ArtyomCommand
  var wildcard: js.UndefOr[js.Any] = js.undefined
}

object MatchedCommand {
  @scala.inline
  def apply(index: Double, instruction: ArtyomCommand, wildcard: js.Any = null): MatchedCommand = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any])
    if (wildcard != null) __obj.updateDynamic("wildcard")(wildcard.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedCommand]
  }
}

