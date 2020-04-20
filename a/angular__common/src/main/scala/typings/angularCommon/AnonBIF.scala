package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBIF extends js.Object {
  var BIF: js.Array[String]
}

object AnonBIF {
  @scala.inline
  def apply(BIF: js.Array[String]): AnonBIF = {
    val __obj = js.Dynamic.literal(BIF = BIF.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBIF]
  }
}

