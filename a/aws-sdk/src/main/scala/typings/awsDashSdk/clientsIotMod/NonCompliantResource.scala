package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonCompliantResource extends js.Object {
  /**
    * Other information about the noncompliant resource.
    */
  var additionalInfo: js.UndefOr[StringMap] = js.undefined
  /**
    * Information that identifies the noncompliant resource.
    */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
  /**
    * The type of the noncompliant resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}

object NonCompliantResource {
  @scala.inline
  def apply(
    additionalInfo: StringMap = null,
    resourceIdentifier: ResourceIdentifier = null,
    resourceType: ResourceType = null
  ): NonCompliantResource = {
    val __obj = js.Dynamic.literal()
    if (additionalInfo != null) __obj.updateDynamic("additionalInfo")(additionalInfo)
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonCompliantResource]
  }
}

