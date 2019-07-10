package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagInfoForResource extends js.Object {
  var ResourceARN: js.UndefOr[ResourceArn] = js.undefined
  var TagList: js.UndefOr[TagList] = js.undefined
}

object TagInfoForResource {
  @scala.inline
  def apply(ResourceARN: ResourceArn = null, TagList: TagList = null): TagInfoForResource = {
    val __obj = js.Dynamic.literal()
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    if (TagList != null) __obj.updateDynamic("TagList")(TagList)
    __obj.asInstanceOf[TagInfoForResource]
  }
}

