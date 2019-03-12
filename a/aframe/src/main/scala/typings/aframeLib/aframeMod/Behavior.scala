package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Behavior extends js.Object {
  def tick(): scala.Unit
}

object Behavior {
  @scala.inline
  def apply(tick: () => scala.Unit): Behavior = {
    val __obj = js.Dynamic.literal(tick = js.Any.fromFunction0(tick))
  
    __obj.asInstanceOf[Behavior]
  }
}

