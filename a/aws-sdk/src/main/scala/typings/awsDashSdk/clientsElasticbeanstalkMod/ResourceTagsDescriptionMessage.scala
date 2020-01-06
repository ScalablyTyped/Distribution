package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTagsDescriptionMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resouce for which a tag list was requested.
    */
  var ResourceArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ResourceArn] = js.native
  /**
    * A list of tag key-value pairs.
    */
  var ResourceTags: js.UndefOr[TagList] = js.native
}

object ResourceTagsDescriptionMessage {
  @scala.inline
  def apply(ResourceArn: ResourceArn = null, ResourceTags: TagList = null): ResourceTagsDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (ResourceTags != null) __obj.updateDynamic("ResourceTags")(ResourceTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTagsDescriptionMessage]
  }
}

