package typings
package awsDashSdkLib.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceTag extends js.Object {
  /**
    * Specifies the ARN of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  /**
    * A list of tags.
    */
  var TagsList: js.UndefOr[TagsList] = js.undefined
}

object ResourceTag {
  @scala.inline
  def apply(ResourceId: String = null, TagsList: TagsList = null): ResourceTag = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (TagsList != null) __obj.updateDynamic("TagsList")(TagsList)
    __obj.asInstanceOf[ResourceTag]
  }
}

