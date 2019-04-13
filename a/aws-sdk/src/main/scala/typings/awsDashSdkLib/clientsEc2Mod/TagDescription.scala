package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagDescription extends js.Object {
  /**
    * The tag key.
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The tag value.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object TagDescription {
  @scala.inline
  def apply(
    Key: String = null,
    ResourceId: String = null,
    ResourceType: ResourceType = null,
    Value: String = null
  ): TagDescription = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[TagDescription]
  }
}

