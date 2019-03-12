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
  def apply(end: () => scala.Unit, start: () => IAnimateCssRunnerStart): IAnimateCssRunner = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[IAnimateCssRunner]
  }
}

