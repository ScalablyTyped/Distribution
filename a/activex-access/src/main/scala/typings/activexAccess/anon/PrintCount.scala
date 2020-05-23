package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintCount extends js.Object {
  var Cancel: Double
  var PrintCount: Double
}

object PrintCount {
  @scala.inline
  def apply(Cancel: Double, PrintCount: Double): PrintCount = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PrintCount = PrintCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCount]
  }
}

