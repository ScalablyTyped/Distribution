package typings.arangodb.atArangodbFoxxQueuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  var created: Double
  var data: js.Any
  var delayUntil: Double
  var failure: js.UndefOr[String] = js.undefined
  var failures: js.Array[js.Object]
  var maxFailures: Double
  var modified: Double
  var queue: String
  var repeatDelay: Double
  var repeatTimes: Double
  var repeatUntil: Double
  var runFailures: Double
  var runs: Double
  var status: String
  var success: js.UndefOr[String] = js.undefined
  var `type`: Script
  def abort(): Unit
}

object Job {
  @scala.inline
  def apply(
    abort: () => Unit,
    created: Double,
    data: js.Any,
    delayUntil: Double,
    failures: js.Array[js.Object],
    maxFailures: Double,
    modified: Double,
    queue: String,
    repeatDelay: Double,
    repeatTimes: Double,
    repeatUntil: Double,
    runFailures: Double,
    runs: Double,
    status: String,
    `type`: Script,
    failure: String = null,
    success: String = null
  ): Job = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), created = created, data = data, delayUntil = delayUntil, failures = failures, maxFailures = maxFailures, modified = modified, queue = queue, repeatDelay = repeatDelay, repeatTimes = repeatTimes, repeatUntil = repeatUntil, runFailures = runFailures, runs = runs, status = status)
    __obj.updateDynamic("type")(`type`)
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Job]
  }
}

