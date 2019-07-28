package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceTag extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.undefined
  /**
    * The tags.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object ResourceTag {
  @scala.inline
  def apply(resourceArn: ResourceArn = null, tags: TagList = null): ResourceTag = {
    val __obj = js.Dynamic.literal()
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ResourceTag]
  }
}

