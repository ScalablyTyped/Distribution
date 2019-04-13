package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementTemplate extends js.Object {
  /**
    * The default attributes (key/value pairs) to be applied to all placements using this template.
    */
  var defaultAttributes: js.UndefOr[DefaultPlacementAttributeMap] = js.undefined
  /**
    * An object specifying the DeviceTemplate for all placements using this (PlacementTemplate) template.
    */
  var deviceTemplates: js.UndefOr[DeviceTemplateMap] = js.undefined
}

object PlacementTemplate {
  @scala.inline
  def apply(defaultAttributes: DefaultPlacementAttributeMap = null, deviceTemplates: DeviceTemplateMap = null): PlacementTemplate = {
    val __obj = js.Dynamic.literal()
    if (defaultAttributes != null) __obj.updateDynamic("defaultAttributes")(defaultAttributes)
    if (deviceTemplates != null) __obj.updateDynamic("deviceTemplates")(deviceTemplates)
    __obj.asInstanceOf[PlacementTemplate]
  }
}

