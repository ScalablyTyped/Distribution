package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the resource.
    */
  var ResourceArn: __string
  /**
    * The key-value pairs for the resource tags
    */
  var Tags: __mapOf__string
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, Tags: __mapOf__string): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

