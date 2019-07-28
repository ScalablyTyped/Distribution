package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePresetRequest extends js.Object {
  /**
    * Optional. A category for the preset you are creating.
    */
  var Category: js.UndefOr[__string] = js.undefined
  /**
    * Optional. A description of the preset you are creating.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The name of the preset you are creating.
    */
  var Name: __string
  /**
    * Settings for preset
    */
  var Settings: PresetSettings
  /**
    * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
}

object CreatePresetRequest {
  @scala.inline
  def apply(
    Name: __string,
    Settings: PresetSettings,
    Category: __string = null,
    Description: __string = null,
    Tags: __mapOf__string = null
  ): CreatePresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name, Settings = Settings)
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreatePresetRequest]
  }
}

