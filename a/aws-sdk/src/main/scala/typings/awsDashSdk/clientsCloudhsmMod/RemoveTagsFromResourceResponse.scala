package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromResourceResponse extends js.Object {
  /**
    * The status of the operation.
    */
  var Status: String
}

object RemoveTagsFromResourceResponse {
  @scala.inline
  def apply(Status: String): RemoveTagsFromResourceResponse = {
    val __obj = js.Dynamic.literal(Status = Status)
  
    __obj.asInstanceOf[RemoveTagsFromResourceResponse]
  }
}

