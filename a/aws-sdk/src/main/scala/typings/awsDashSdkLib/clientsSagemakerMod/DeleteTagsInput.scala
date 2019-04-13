package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource whose tags you want to delete.
    */
  var ResourceArn: awsDashSdkLib.clientsSagemakerMod.ResourceArn
  /**
    * An array or one or more tag keys to delete.
    */
  var TagKeys: TagKeyList
}

object DeleteTagsInput {
  @scala.inline
  def apply(ResourceArn: ResourceArn, TagKeys: TagKeyList): DeleteTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeys = TagKeys)
  
    __obj.asInstanceOf[DeleteTagsInput]
  }
}

