package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceInput extends js.Object {
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
    */
  var ResourceArn: ARN = js.native
  /**
    * Key-value pairs that are used to help organize your resources. You can assign your own metadata to the resources you create. 
    */
  var Tags: typings.awsSdk.backupMod.Tags = js.native
}

object TagResourceInput {
  @scala.inline
  def apply(ResourceArn: ARN, Tags: Tags): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  @scala.inline
  implicit class TagResourceInputOps[Self <: TagResourceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceArn(value: ARN): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

