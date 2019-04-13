package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceTagsDescriptionMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resouce for which a tag list was requested.
    */
  var ResourceArn: js.UndefOr[ResourceArn] = js.undefined
  /**
    * A list of tag key-value pairs.
    */
  var ResourceTags: js.UndefOr[TagList] = js.undefined
}

object ResourceTagsDescriptionMessage {
  @scala.inline
  def apply(ResourceArn: ResourceArn = null, ResourceTags: TagList = null): ResourceTagsDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    if (ResourceTags != null) __obj.updateDynamic("ResourceTags")(ResourceTags)
    __obj.asInstanceOf[ResourceTagsDescriptionMessage]
  }
}

