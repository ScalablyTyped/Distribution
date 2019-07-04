package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the Amazon SWF domain.
    */
  var resourceArn: Arn
  /**
    * The list of tags to remove from the Amazon SWF domain.
    */
  var tagKeys: ResourceTagKeyList
}

object UntagResourceInput {
  @scala.inline
  def apply(resourceArn: Arn, tagKeys: ResourceTagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tagKeys = tagKeys)
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

