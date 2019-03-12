package typings
package arangodbLib.atArangodbFoxxQueuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  var created: scala.Double
  var data: js.Any
  var delayUntil: scala.Double
  var failure: js.UndefOr[java.lang.String] = js.undefined
  var failures: js.Array[js.Object]
  var maxFailures: scala.Double
  var modified: scala.Double
  var queue: java.lang.String
  var repeatDelay: scala.Double
  var repeatTimes: scala.Double
  var repeatUntil: scala.Double
  var runFailures: scala.Double
  var runs: scala.Double
  var status: java.lang.String
  var success: js.UndefOr[java.lang.String] = js.undefined
  var `type`: Script
  def abort(): scala.Unit
}

object Job {
  @scala.inline
  def apply(
    abort: () => scala.Unit,
    created: scala.Double,
    data: js.Any,
    delayUntil: scala.Double,
    failures: js.Array[js.Object],
    maxFailures: scala.Double,
    modified: scala.Double,
    queue: java.lang.String,
    repeatDelay: scala.Double,
    repeatTimes: scala.Double,
    repeatUntil: scala.Double,
    runFailures: scala.Double,
    runs: scala.Double,
    status: java.lang.String,
    `type`: Script,
    failure: java.lang.String = null,
    success: java.lang.String = null
  ): Job = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), created = created, data = data, delayUntil = delayUntil, failures = failures, maxFailures = maxFailures, modified = modified, queue = queue, repeatDelay = repeatDelay, repeatTimes = repeatTimes, repeatUntil = repeatUntil, runFailures = runFailures, runs = runs, status = status)
    __obj.updateDynamic("type")(`type`)
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Job]
  }
}

