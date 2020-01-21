package typings.archiver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProcessedBytes extends js.Object {
  var processedBytes: Double
  var totalBytes: Double
}

object AnonProcessedBytes {
  @scala.inline
  def apply(processedBytes: Double, totalBytes: Double): AnonProcessedBytes = {
    val __obj = js.Dynamic.literal(processedBytes = processedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProcessedBytes]
  }
}

