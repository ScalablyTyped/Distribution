package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrintCount extends js.Object {
  var Cancel: Double
  var PrintCount: Double
}

object AnonPrintCount {
  @scala.inline
  def apply(Cancel: Double, PrintCount: Double): AnonPrintCount = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PrintCount = PrintCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrintCount]
  }
}

