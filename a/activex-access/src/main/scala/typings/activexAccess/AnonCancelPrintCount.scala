package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelPrintCount extends js.Object {
  var Cancel: Double
  var PrintCount: Double
}

object AnonCancelPrintCount {
  @scala.inline
  def apply(Cancel: Double, PrintCount: Double): AnonCancelPrintCount = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PrintCount = PrintCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelPrintCount]
  }
}

