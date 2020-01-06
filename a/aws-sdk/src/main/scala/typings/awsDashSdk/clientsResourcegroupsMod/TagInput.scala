package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagInput extends js.Object {
  /**
    * The ARN of the resource to which to add tags.
    */
  var Arn: GroupArn = js.native
  /**
    * The tags to add to the specified resource. A tag is a string-to-string map of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var Tags: typings.awsDashSdk.clientsResourcegroupsMod.Tags = js.native
}

object TagInput {
  @scala.inline
  def apply(Arn: GroupArn, Tags: Tags): TagInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagInput]
  }
}

