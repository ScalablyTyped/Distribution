package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: String
  /**
    * One or more tags.
    */
  var tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceShareArn: String, tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

