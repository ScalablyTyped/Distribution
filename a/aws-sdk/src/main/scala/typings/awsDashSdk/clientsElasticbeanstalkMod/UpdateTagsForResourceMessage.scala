package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTagsForResourceMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resouce to be updated. Must be the ARN of an Elastic Beanstalk environment.
    */
  var ResourceArn: typings.awsDashSdk.clientsElasticbeanstalkMod.ResourceArn
  /**
    * A list of tags to add or update. If a key of an existing tag is added, the tag's value is updated.
    */
  var TagsToAdd: js.UndefOr[TagList] = js.undefined
  /**
    * A list of tag keys to remove. If a tag key doesn't exist, it is silently ignored.
    */
  var TagsToRemove: js.UndefOr[TagKeyList] = js.undefined
}

object UpdateTagsForResourceMessage {
  @scala.inline
  def apply(ResourceArn: ResourceArn, TagsToAdd: TagList = null, TagsToRemove: TagKeyList = null): UpdateTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (TagsToAdd != null) __obj.updateDynamic("TagsToAdd")(TagsToAdd)
    if (TagsToRemove != null) __obj.updateDynamic("TagsToRemove")(TagsToRemove)
    __obj.asInstanceOf[UpdateTagsForResourceMessage]
  }
}

