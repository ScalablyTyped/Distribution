package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnSelect extends js.Object {
  def onSelect(): Unit
}

object Anon_OnSelect {
  @scala.inline
  def apply(onSelect: () => Unit): Anon_OnSelect = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
  
    __obj.asInstanceOf[Anon_OnSelect]
  }
}

