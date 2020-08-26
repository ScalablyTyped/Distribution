package typings.athenajs.anon

import typings.athenajs.athenajsNumbers.`1`
import typings.athenajs.athenajsNumbers.`2`
import typings.athenajs.athenajsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AIR extends js.Object {
  var AIR: `1` = js.native
  var LADDER: `3` = js.native
  var WALL: `2` = js.native
}

object AIR {
  @scala.inline
  def apply(AIR: `1`, LADDER: `3`, WALL: `2`): AIR = {
    val __obj = js.Dynamic.literal(AIR = AIR.asInstanceOf[js.Any], LADDER = LADDER.asInstanceOf[js.Any], WALL = WALL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AIR]
  }
  @scala.inline
  implicit class AIROps[Self <: AIR] (val x: Self) extends AnyVal {
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
    def setAIR(value: `1`): Self = this.set("AIR", value.asInstanceOf[js.Any])
    @scala.inline
    def setLADDER(value: `3`): Self = this.set("LADDER", value.asInstanceOf[js.Any])
    @scala.inline
    def setWALL(value: `2`): Self = this.set("WALL", value.asInstanceOf[js.Any])
  }
  
}

