package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationString extends js.Object {
  var operation: String
}

object OperationString {
  @scala.inline
  def apply(operation: String): OperationString = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationString]
  }
}

