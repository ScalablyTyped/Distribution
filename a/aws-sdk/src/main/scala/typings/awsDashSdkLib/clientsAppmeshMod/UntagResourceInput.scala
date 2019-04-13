package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to delete tags from.
    */
  var resourceArn: Arn
  /**
    * The keys of the tags to be removed.
    */
  var tagKeys: TagKeyList
}

object UntagResourceInput {
  @scala.inline
  def apply(resourceArn: Arn, tagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tagKeys = tagKeys)
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

