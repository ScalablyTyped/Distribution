package typings.atAngularAnimations.browserBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementInstructionMap extends js.Object {
  var _map: js.Any
  def append(element: js.Any, instructions: js.Array[AnimationTimelineInstruction]): Unit
  def clear(): Unit
  def consume(element: js.Any): js.Array[AnimationTimelineInstruction]
  def has(element: js.Any): Boolean
}

object ElementInstructionMap {
  @scala.inline
  def apply(
    _map: js.Any,
    append: (js.Any, js.Array[AnimationTimelineInstruction]) => Unit,
    clear: () => Unit,
    consume: js.Any => js.Array[AnimationTimelineInstruction],
    has: js.Any => Boolean
  ): ElementInstructionMap = {
    val __obj = js.Dynamic.literal(_map = _map.asInstanceOf[js.Any], append = js.Any.fromFunction2(append), clear = js.Any.fromFunction0(clear), consume = js.Any.fromFunction1(consume), has = js.Any.fromFunction1(has))
  
    __obj.asInstanceOf[ElementInstructionMap]
  }
}

