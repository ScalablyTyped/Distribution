package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCause extends js.Object {
  var requestId: java.lang.String
}

object ErrorCause {
  @scala.inline
  def apply(requestId: java.lang.String): ErrorCause = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[ErrorCause]
  }
}

