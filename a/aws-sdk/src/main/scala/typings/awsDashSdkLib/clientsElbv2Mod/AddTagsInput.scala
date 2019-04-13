package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArns: awsDashSdkLib.clientsElbv2Mod.ResourceArns
  /**
    * The tags. Each resource can have a maximum of 10 tags.
    */
  var Tags: TagList
}

object AddTagsInput {
  @scala.inline
  def apply(ResourceArns: ResourceArns, Tags: TagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns, Tags = Tags)
  
    __obj.asInstanceOf[AddTagsInput]
  }
}

