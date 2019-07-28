package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExecutionTime extends js.Object {
  var executionTime: Double
  var filtered: Double
  var fullCount: Double
  var httpRequests: Double
  var scannedFull: Double
  var scannedIndex: Double
  var writesExecuted: Double
  var writesIgnored: Double
}

object Anon_ExecutionTime {
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
  ): Anon_ExecutionTime = {
    val __obj = js.Dynamic.literal(executionTime = executionTime, filtered = filtered, fullCount = fullCount, httpRequests = httpRequests, scannedFull = scannedFull, scannedIndex = scannedIndex, writesExecuted = writesExecuted, writesIgnored = writesIgnored)
  
    __obj.asInstanceOf[Anon_ExecutionTime]
  }
}

