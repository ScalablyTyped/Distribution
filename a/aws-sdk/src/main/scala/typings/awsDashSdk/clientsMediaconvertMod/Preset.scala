package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Preset extends js.Object {
  /**
    * An identifier for this resource that is unique within all of AWS.
    */
  var Arn: js.UndefOr[__string] = js.native
  /**
    * An optional category you create to organize your presets.
    */
  var Category: js.UndefOr[__string] = js.native
  /**
    * The timestamp in epoch seconds for preset creation.
    */
  var CreatedAt: js.UndefOr[__timestampUnix] = js.native
  /**
    * An optional description you create for each preset.
    */
  var Description: js.UndefOr[__string] = js.native
  /**
    * The timestamp in epoch seconds when the preset was last updated.
    */
  var LastUpdated: js.UndefOr[__timestampUnix] = js.native
  /**
    * A name you create for each preset. Each name must be unique within your account.
    */
  var Name: __string = js.native
  /**
    * Settings for preset
    */
  var Settings: PresetSettings = js.native
  /**
    * A preset can be of two types: system or custom. System or built-in preset can't be modified or deleted by the user.
    */
  var Type: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Type] = js.native
}

object Preset {
  @scala.inline
  def apply(
    Name: __string,
    Settings: PresetSettings,
    Arn: __string = null,
    Category: __string = null,
    CreatedAt: __timestampUnix = null,
    Description: __string = null,
    LastUpdated: __timestampUnix = null,
    Type: Type = null
  ): Preset = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preset]
  }
}

