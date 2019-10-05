package typings.angularDashAnimate.angularDashAnimateMod.angularMod.animate

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimateCssRunnerStart extends IPromise[Unit] {
  /**
    * Allows you to add done callbacks to the running animation
    *
    * @param callbackFn: the callback function to be run
    */
  def done(callbackFn: js.Function1[/* animationFinished */ Boolean, Unit]): Unit = js.native
}

