package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchResultErrorEntry extends js.Object {
  /**
    * An error code representing why the action failed on this entry.
    */
  var Code: String
  /**
    * The Id of an entry in a batch request.
    */
  var Id: String
  /**
    * A message explaining why the action failed on this entry.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the error happened due to the producer.
    */
  var SenderFault: Boolean
}

object BatchResultErrorEntry {
  @scala.inline
  def apply(Code: String, Id: String, SenderFault: Boolean, Message: String = null): BatchResultErrorEntry = {
    val __obj = js.Dynamic.literal(Code = Code, Id = Id, SenderFault = SenderFault)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[BatchResultErrorEntry]
  }
}

