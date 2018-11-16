package typings
package angularDashMocksLib.angularDashMocksMod.angularMod.animateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAnimateService extends js.Object {
  /**
         * This method will close all pending animations (both Javascript and CSS) and it will also flush any remaining
         * animation frames and/or callbacks.
         */
  def closeAndFlush(): scala.Unit
  /**
         * This method is used to flush the pending callbacks and animation frames to either start
         * an animation or conclude an animation. Note that this will not actually close an
         * actively running animation (see `closeAndFlush()`} for that).
         */
  def flush(): scala.Unit
}

