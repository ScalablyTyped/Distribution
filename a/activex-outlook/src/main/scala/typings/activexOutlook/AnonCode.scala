package typings.activexOutlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  val Code: Double
  val Description: String
}

object AnonCode {
  @scala.inline
  def apply(Code: Double, Description: String): AnonCode = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCode]
  }
}

