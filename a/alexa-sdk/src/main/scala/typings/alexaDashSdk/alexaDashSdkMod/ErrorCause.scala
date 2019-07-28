package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCause extends js.Object {
  var requestId: String
}

object ErrorCause {
  @scala.inline
  def apply(requestId: String): ErrorCause = {
    val __obj = js.Dynamic.literal(requestId = requestId)
  
    __obj.asInstanceOf[ErrorCause]
  }
}

