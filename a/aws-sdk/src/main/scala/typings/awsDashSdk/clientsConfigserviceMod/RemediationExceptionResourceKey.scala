package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemediationExceptionResourceKey extends js.Object {
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var ResourceId: js.UndefOr[StringWithCharLimit1024] = js.undefined
  /**
    * The type of a resource.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}

object RemediationExceptionResourceKey {
  @scala.inline
  def apply(ResourceId: StringWithCharLimit1024 = null, ResourceType: StringWithCharLimit256 = null): RemediationExceptionResourceKey = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[RemediationExceptionResourceKey]
  }
}

