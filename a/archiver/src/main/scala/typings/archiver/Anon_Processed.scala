package typings.archiver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Processed extends js.Object {
  var processed: Double
  var total: Double
}

object Anon_Processed {
  @scala.inline
  def apply(processed: Double, total: Double): Anon_Processed = {
    val __obj = js.Dynamic.literal(processed = processed.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Processed]
  }
}

