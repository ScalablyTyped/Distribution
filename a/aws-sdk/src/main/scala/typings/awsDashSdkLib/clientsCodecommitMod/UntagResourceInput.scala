package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to which you want to remove tags.
    */
  var resourceArn: ResourceArn
  /**
    * The tag key for each tag that you want to remove from the resource.
    */
  var tagKeys: TagKeysList
}

object UntagResourceInput {
  @scala.inline
  def apply(resourceArn: ResourceArn, tagKeys: TagKeysList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tagKeys = tagKeys)
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

