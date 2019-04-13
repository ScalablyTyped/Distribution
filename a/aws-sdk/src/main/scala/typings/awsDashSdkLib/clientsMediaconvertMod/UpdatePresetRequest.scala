package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePresetRequest extends js.Object {
  /**
    * The new category for the preset, if you are changing it.
    */
  var Category: js.UndefOr[__string] = js.undefined
  /**
    * The new description for the preset, if you are changing it.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The name of the preset you are modifying.
    */
  var Name: __string
  /**
    * Settings for preset
    */
  var Settings: js.UndefOr[PresetSettings] = js.undefined
}

object UpdatePresetRequest {
  @scala.inline
  def apply(
    Name: __string,
    Category: __string = null,
    Description: __string = null,
    Settings: PresetSettings = null
  ): UpdatePresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Settings != null) __obj.updateDynamic("Settings")(Settings)
    __obj.asInstanceOf[UpdatePresetRequest]
  }
}

