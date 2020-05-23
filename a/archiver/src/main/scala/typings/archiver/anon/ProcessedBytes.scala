package typings.archiver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessedBytes extends js.Object {
  var processedBytes: Double
  var totalBytes: Double
}

object ProcessedBytes {
  @scala.inline
  def apply(processedBytes: Double, totalBytes: Double): ProcessedBytes = {
    val __obj = js.Dynamic.literal(processedBytes = processedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedBytes]
  }
}

