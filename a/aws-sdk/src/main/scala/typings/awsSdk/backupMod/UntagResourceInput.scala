package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
    */
  var ResourceArn: ARN = js.native
  /**
    * A list of keys to identify which key-value tags to remove from a resource.
    */
  var TagKeyList: typings.awsSdk.backupMod.TagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceArn: ARN, TagKeyList: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  @scala.inline
  implicit class UntagResourceInputOps[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
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
    def setTagKeyListVarargs(value: String*): Self = this.set("TagKeyList", js.Array(value :_*))
    @scala.inline
    def setTagKeyList(value: TagKeyList): Self = this.set("TagKeyList", value.asInstanceOf[js.Any])
  }
  
}

