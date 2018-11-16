package typings
package angularDashAnimateLib.angularDashAnimateMod.angularMod.animateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimateCssRunnerStart
  extends angularLib.angularMod.angularNs.IPromise[scala.Unit] {
  /**
               * Allows you to add done callbacks to the running animation
               *
               * @param callbackFn: the callback function to be run
               */
  def done(callbackFn: js.Function1[/* animationFinished */ scala.Boolean, scala.Unit]): scala.Unit = js.native
}

