package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application that you want to retrieve tag information for.
    */
  var ResourceARN: AmazonResourceName = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

