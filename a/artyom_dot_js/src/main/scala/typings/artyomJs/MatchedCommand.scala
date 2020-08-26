package typings.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchedCommand extends js.Object {
  var index: Double = js.native
  var instruction: ArtyomCommand = js.native
  var wildcard: js.UndefOr[js.Any] = js.native
}

object MatchedCommand {
  @scala.inline
  def apply(index: Double, instruction: ArtyomCommand): MatchedCommand = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedCommand]
  }
  @scala.inline
  implicit class MatchedCommandOps[Self <: MatchedCommand] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstruction(value: ArtyomCommand): Self = this.set("instruction", value.asInstanceOf[js.Any])
    @scala.inline
    def setWildcard(value: js.Any): Self = this.set("wildcard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWildcard: Self = this.set("wildcard", js.undefined)
  }
  
}

