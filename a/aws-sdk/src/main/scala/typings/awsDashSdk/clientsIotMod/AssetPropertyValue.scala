package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetPropertyValue extends js.Object {
  /**
    * Optional. A string that describes the quality of the value. Accepts substitution templates. Must be GOOD, BAD, or UNCERTAIN.
    */
  var quality: js.UndefOr[AssetPropertyQuality] = js.native
  /**
    * The asset property value timestamp.
    */
  var timestamp: AssetPropertyTimestamp = js.native
  /**
    * The value of the asset property.
    */
  var value: AssetPropertyVariant = js.native
}

object AssetPropertyValue {
  @scala.inline
  def apply(
    timestamp: AssetPropertyTimestamp,
    value: AssetPropertyVariant,
    quality: AssetPropertyQuality = null
  ): AssetPropertyValue = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyValue]
  }
}

