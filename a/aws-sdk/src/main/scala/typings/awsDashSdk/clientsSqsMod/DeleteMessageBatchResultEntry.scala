package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMessageBatchResultEntry extends js.Object {
  /**
    * Represents a successfully deleted message.
    */
  var Id: String
}

object DeleteMessageBatchResultEntry {
  @scala.inline
  def apply(Id: String): DeleteMessageBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeleteMessageBatchResultEntry]
  }
}

