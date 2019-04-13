package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamProcessorsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of stream processors. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * List of stream processors that you have created.
    */
  var StreamProcessors: js.UndefOr[StreamProcessorList] = js.undefined
}

object ListStreamProcessorsResponse {
  @scala.inline
  def apply(NextToken: PaginationToken = null, StreamProcessors: StreamProcessorList = null): ListStreamProcessorsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StreamProcessors != null) __obj.updateDynamic("StreamProcessors")(StreamProcessors)
    __obj.asInstanceOf[ListStreamProcessorsResponse]
  }
}

