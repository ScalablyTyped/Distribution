package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToResourceResponse extends js.Object {
  /**
    * The status of the operation.
    */
  var Status: String = js.native
}

object AddTagsToResourceResponse {
  @scala.inline
  def apply(Status: String): AddTagsToResourceResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddTagsToResourceResponse]
  }
}

