package typings.awsDashSdk.clientsCodestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule from which to remove the tags.
    */
  var Arn: NotificationRuleArn = js.native
  /**
    * The key names of the tags to remove.
    */
  var TagKeys: typings.awsDashSdk.clientsCodestarnotificationsMod.TagKeys = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(Arn: NotificationRuleArn, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

