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
  def apply(tick: js.Function0[scala.Unit]): Behavior = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tick")(tick)
    __obj.asInstanceOf[Behavior]
  }
}

