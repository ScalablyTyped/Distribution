package typings
package arangodbLib.atArangodbFoxxQueuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobOptions extends js.Object {
  var backOff: js.UndefOr[(js.Function1[/* failureCount */ scala.Double, scala.Double]) | scala.Double] = js.undefined
  var delayUntil: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  var failure: js.UndefOr[JobCallback] = js.undefined
  var maxFailures: js.UndefOr[scala.Double] = js.undefined
  var repeatDelay: js.UndefOr[scala.Double] = js.undefined
  var repeatTimes: js.UndefOr[scala.Double] = js.undefined
  var repeatUntil: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  var success: js.UndefOr[JobCallback] = js.undefined
}

