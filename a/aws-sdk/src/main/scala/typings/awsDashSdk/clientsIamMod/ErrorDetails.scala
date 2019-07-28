package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetails extends js.Object {
  /**
    * The error code associated with the operation failure.
    */
  var Code: stringType
  /**
    * Detailed information about the reason that the operation failed.
    */
  var Message: stringType
}

object ErrorDetails {
  @scala.inline
  def apply(Code: stringType, Message: stringType): ErrorDetails = {
    val __obj = js.Dynamic.literal(Code = Code, Message = Message)
  
    __obj.asInstanceOf[ErrorDetails]
  }
}

