package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRecordsInput extends js.Object {
  /**
    * The records associated with the request.
    */
  var Records: PutRecordsRequestEntryList
  /**
    * The stream name associated with the request.
    */
  var StreamName: awsDashSdkLib.clientsKinesisMod.StreamName
}

object PutRecordsInput {
  @scala.inline
  def apply(Records: PutRecordsRequestEntryList, StreamName: StreamName): PutRecordsInput = {
    val __obj = js.Dynamic.literal(Records = Records, StreamName = StreamName)
  
    __obj.asInstanceOf[PutRecordsInput]
  }
}

