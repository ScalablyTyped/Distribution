package typings
package awsDashSdkLib.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeMessageVisibilityBatchRequestEntry extends js.Object {
  /**
    * An identifier for this particular receipt handle used to communicate the result.  The Ids of a batch request need to be unique within a request 
    */
  var Id: String
  /**
    * A receipt handle.
    */
  var ReceiptHandle: String
  /**
    * The new value (in seconds) for the message's visibility timeout.
    */
  var VisibilityTimeout: js.UndefOr[Integer] = js.undefined
}

object ChangeMessageVisibilityBatchRequestEntry {
  @scala.inline
  def apply(Id: String, ReceiptHandle: String, VisibilityTimeout: js.UndefOr[Integer] = js.undefined): ChangeMessageVisibilityBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id, ReceiptHandle = ReceiptHandle)
    if (!js.isUndefined(VisibilityTimeout)) __obj.updateDynamic("VisibilityTimeout")(VisibilityTimeout)
    __obj.asInstanceOf[ChangeMessageVisibilityBatchRequestEntry]
  }
}

