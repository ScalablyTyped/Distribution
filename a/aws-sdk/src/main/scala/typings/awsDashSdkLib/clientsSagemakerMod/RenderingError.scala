package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingError extends js.Object {
  /**
    * A unique identifier for a specific class of errors.
    */
  var Code: String
  /**
    * A human-readable message describing the error.
    */
  var Message: String
}

object RenderingError {
  @scala.inline
  def apply(Code: String, Message: String): RenderingError = {
    val __obj = js.Dynamic.literal(Code = Code, Message = Message)
  
    __obj.asInstanceOf[RenderingError]
  }
}

