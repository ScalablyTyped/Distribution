package typings.angularAnimations.browserBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEngineInstruction extends js.Object {
  var `type`: AnimationTransitionInstructionType
}

object AnimationEngineInstruction {
  @scala.inline
  def apply(`type`: AnimationTransitionInstructionType): AnimationEngineInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEngineInstruction]
  }
}

