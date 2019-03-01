package typings
package angularDashAnimateLib.angularDashAnimateMod.angularMod.animateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimateCssRunner extends js.Object {
  /**
    * Ends (aborts) the animation
    */
  def end(): scala.Unit
  /**
    * Starts the animation
    *
    * @returns The animation runner with a done function for supplying a callback.
    */
  def start(): IAnimateCssRunnerStart
}

object IAnimateCssRunner {
  @scala.inline
  def apply(end: js.Function0[scala.Unit], start: js.Function0[IAnimateCssRunnerStart]): IAnimateCssRunner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[IAnimateCssRunner]
  }
}

