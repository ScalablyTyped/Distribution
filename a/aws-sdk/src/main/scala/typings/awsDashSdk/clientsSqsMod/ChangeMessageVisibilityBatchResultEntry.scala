package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeMessageVisibilityBatchResultEntry extends js.Object {
  /**
    * Represents a message whose visibility timeout has been changed successfully.
    */
  var Id: String
}

object ChangeMessageVisibilityBatchResultEntry {
  @scala.inline
  def apply(Id: String): ChangeMessageVisibilityBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[ChangeMessageVisibilityBatchResultEntry]
  }
}

