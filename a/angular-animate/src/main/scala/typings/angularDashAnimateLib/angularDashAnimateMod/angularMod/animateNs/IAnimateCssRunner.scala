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

