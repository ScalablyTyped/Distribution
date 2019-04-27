package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    * The ARN of the topic for which to list tags.
    */
  var ResourceArn: AmazonResourceName
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceArn: AmazonResourceName): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

