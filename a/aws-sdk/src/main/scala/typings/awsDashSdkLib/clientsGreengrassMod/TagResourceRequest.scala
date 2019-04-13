package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: __string
  /**
    * A map of the key-value pairs for the resource tag.
    */
  var tags: __mapOf__string
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, tags: __mapOf__string): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

