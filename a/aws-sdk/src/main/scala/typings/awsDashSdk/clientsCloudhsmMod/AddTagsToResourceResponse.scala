package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsToResourceResponse extends js.Object {
  /**
    * The status of the operation.
    */
  var Status: String
}

object AddTagsToResourceResponse {
  @scala.inline
  def apply(Status: String): AddTagsToResourceResponse = {
    val __obj = js.Dynamic.literal(Status = Status)
  
    __obj.asInstanceOf[AddTagsToResourceResponse]
  }
}

