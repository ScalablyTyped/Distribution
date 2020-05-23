package typings.archiver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Processed extends js.Object {
  var processed: Double
  var total: Double
}

object Processed {
  @scala.inline
  def apply(processed: Double, total: Double): Processed = {
    val __obj = js.Dynamic.literal(processed = processed.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processed]
  }
}

