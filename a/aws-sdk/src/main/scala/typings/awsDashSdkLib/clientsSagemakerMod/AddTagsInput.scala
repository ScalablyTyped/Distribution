package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to tag.
    */
  var ResourceArn: awsDashSdkLib.clientsSagemakerMod.ResourceArn
  /**
    * An array of Tag objects. Each tag is a key-value pair. Only the key parameter is required. If you don't specify a value, Amazon SageMaker sets the value to an empty string. 
    */
  var Tags: TagList
}

object AddTagsInput {
  @scala.inline
  def apply(ResourceArn: ResourceArn, Tags: TagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[AddTagsInput]
  }
}

