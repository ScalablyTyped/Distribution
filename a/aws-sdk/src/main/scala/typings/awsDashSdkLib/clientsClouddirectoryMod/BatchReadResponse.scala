package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchReadResponse extends js.Object {
  /**
    * A list of all the responses for each batch read.
    */
  var Responses: js.UndefOr[BatchReadOperationResponseList] = js.undefined
}

object BatchReadResponse {
  @scala.inline
  def apply(Responses: BatchReadOperationResponseList = null): BatchReadResponse = {
    val __obj = js.Dynamic.literal()
    if (Responses != null) __obj.updateDynamic("Responses")(Responses)
    __obj.asInstanceOf[BatchReadResponse]
  }
}

