package typings
package archiverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProcessedBytes extends js.Object {
  var processedBytes: scala.Double
  var totalBytes: scala.Double
}

object Anon_ProcessedBytes {
  @scala.inline
  def apply(processedBytes: scala.Double, totalBytes: scala.Double): Anon_ProcessedBytes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("processedBytes")(processedBytes)
    __obj.updateDynamic("totalBytes")(totalBytes)
    __obj.asInstanceOf[Anon_ProcessedBytes]
  }
}

