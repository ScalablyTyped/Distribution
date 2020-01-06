package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementTemplate extends js.Object {
  /**
    * The default attributes (key/value pairs) to be applied to all placements using this template.
    */
  var defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap] = js.native
  /**
    * An object specifying the DeviceTemplate for all placements using this (PlacementTemplate) template.
    */
  var deviceTemplates: js.UndefOr[DeviceTemplateMap] = js.native
}

object PlacementTemplate {
  @scala.inline
  def apply(defaultAttributes: DefaultPlacementAttributeMap = null, deviceTemplates: DeviceTemplateMap = null): PlacementTemplate = {
    val __obj = js.Dynamic.literal()
    if (defaultAttributes != null) __obj.updateDynamic("defaultAttributes")(defaultAttributes.asInstanceOf[js.Any])
    if (deviceTemplates != null) __obj.updateDynamic("deviceTemplates")(deviceTemplates.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementTemplate]
  }
}

