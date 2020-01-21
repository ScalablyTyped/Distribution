package typings.archiver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProcessed extends js.Object {
  var processed: Double
  var total: Double
}

object AnonProcessed {
  @scala.inline
  def apply(processed: Double, total: Double): AnonProcessed = {
    val __obj = js.Dynamic.literal(processed = processed.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProcessed]
  }
}

