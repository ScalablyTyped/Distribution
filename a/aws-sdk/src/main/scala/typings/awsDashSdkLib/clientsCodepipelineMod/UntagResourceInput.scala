package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceInput extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the resource to remove tags from.
    */
  var resourceArn: ResourceArn
  /**
    * The list of keys for the tags to be removed from the resource.
    */
  var tagKeys: TagKeyList
}

object UntagResourceInput {
  @scala.inline
  def apply(resourceArn: ResourceArn, tagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tagKeys = tagKeys)
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

