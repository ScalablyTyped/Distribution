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
    abort: js.Function0[scala.Unit],
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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("delayUntil")(delayUntil)
    __obj.updateDynamic("failures")(failures)
    __obj.updateDynamic("maxFailures")(maxFailures)
    __obj.updateDynamic("modified")(modified)
    __obj.updateDynamic("queue")(queue)
    __obj.updateDynamic("repeatDelay")(repeatDelay)
    __obj.updateDynamic("repeatTimes")(repeatTimes)
    __obj.updateDynamic("repeatUntil")(repeatUntil)
    __obj.updateDynamic("runFailures")(runFailures)
    __obj.updateDynamic("runs")(runs)
    __obj.updateDynamic("status")(status)
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Job]
  }
}

