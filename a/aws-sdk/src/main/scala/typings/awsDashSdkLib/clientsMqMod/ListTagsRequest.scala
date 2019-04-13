package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsRequest extends js.Object {
  /**
    * the Amazon Resource Name (ARN)
    */
  var ResourceArn: __string
}

object ListTagsRequest {
  @scala.inline
  def apply(ResourceArn: __string): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[ListTagsRequest]
  }
}

