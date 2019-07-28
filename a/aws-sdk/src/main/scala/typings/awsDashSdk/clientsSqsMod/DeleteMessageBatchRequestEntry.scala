package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMessageBatchRequestEntry extends js.Object {
  /**
    * An identifier for this particular receipt handle. This is used to communicate the result.  The Ids of a batch request need to be unique within a request 
    */
  var Id: String
  /**
    * A receipt handle.
    */
  var ReceiptHandle: String
}

object DeleteMessageBatchRequestEntry {
  @scala.inline
  def apply(Id: String, ReceiptHandle: String): DeleteMessageBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id, ReceiptHandle = ReceiptHandle)
  
    __obj.asInstanceOf[DeleteMessageBatchRequestEntry]
  }
}

