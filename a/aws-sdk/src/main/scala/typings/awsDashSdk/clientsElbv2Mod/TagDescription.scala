package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.ResourceArn] = js.undefined
  /**
    * Information about the tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object TagDescription {
  @scala.inline
  def apply(ResourceArn: ResourceArn = null, Tags: TagList = null): TagDescription = {
    val __obj = js.Dynamic.literal()
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[TagDescription]
  }
}

