package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExecutionTime extends js.Object {
  var executionTime: Double
  var filtered: Double
  var fullCount: Double
  var httpRequests: Double
  var scannedFull: Double
  var scannedIndex: Double
  var writesExecuted: Double
  var writesIgnored: Double
}

object AnonExecutionTime {
  @scala.inline
  def apply(
    executionTime: Double,
    filtered: Double,
    fullCount: Double,
    httpRequests: Double,
    scannedFull: Double,
    scannedIndex: Double,
    writesExecuted: Double,
    writesIgnored: Double
  ): AnonExecutionTime = {
    val __obj = js.Dynamic.literal(executionTime = executionTime.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], fullCount = fullCount.asInstanceOf[js.Any], httpRequests = httpRequests.asInstanceOf[js.Any], scannedFull = scannedFull.asInstanceOf[js.Any], scannedIndex = scannedIndex.asInstanceOf[js.Any], writesExecuted = writesExecuted.asInstanceOf[js.Any], writesIgnored = writesIgnored.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExecutionTime]
  }
}

