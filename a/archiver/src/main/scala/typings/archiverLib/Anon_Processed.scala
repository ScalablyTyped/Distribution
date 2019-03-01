package typings
package archiverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Processed extends js.Object {
  var processed: scala.Double
  var total: scala.Double
}

object Anon_Processed {
  @scala.inline
  def apply(processed: scala.Double, total: scala.Double): Anon_Processed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("processed")(processed)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Anon_Processed]
  }
}

