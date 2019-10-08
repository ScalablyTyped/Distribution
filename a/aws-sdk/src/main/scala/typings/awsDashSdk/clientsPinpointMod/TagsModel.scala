package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsModel extends js.Object {
  /**
    * A string-to-string map of key-value pairs that defines the tags for an application, campaign, message template, or segment. Each project, campaign, message template, or segment can have a maximum of 50 tags. Each tag consists of a required tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: MapOf__string
}

object TagsModel {
  @scala.inline
  def apply(tags: MapOf__string): TagsModel = {
    val __obj = js.Dynamic.literal(tags = tags)
  
    __obj.asInstanceOf[TagsModel]
  }
}

