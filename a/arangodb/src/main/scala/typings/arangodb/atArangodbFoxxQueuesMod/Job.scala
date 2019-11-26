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
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delayUntil = delayUntil.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], maxFailures = maxFailures.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], repeatDelay = repeatDelay.asInstanceOf[js.Any], repeatTimes = repeatTimes.asInstanceOf[js.Any], repeatUntil = repeatUntil.asInstanceOf[js.Any], runFailures = runFailures.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (failure != null) __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

