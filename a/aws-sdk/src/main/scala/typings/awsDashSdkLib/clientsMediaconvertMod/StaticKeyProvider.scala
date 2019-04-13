package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticKeyProvider extends js.Object {
  /**
    * Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse DNS string. May be omitted to indicate an implicit value of 'identity'.
    */
  var KeyFormat: js.UndefOr[__stringPatternIdentityAZaZ26AZaZ09163] = js.undefined
  /**
    * Relates to DRM implementation. Either a single positive integer version value or a slash delimited list of version values (1/2/3).
    */
  var KeyFormatVersions: js.UndefOr[__stringPatternDD] = js.undefined
  /**
    * Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value (StaticKeyValue).
    */
  var StaticKeyValue: js.UndefOr[__stringPatternAZaZ0932] = js.undefined
  /**
    * Relates to DRM implementation. The location of the license server used for protecting content.
    */
  var Url: js.UndefOr[__string] = js.undefined
}

object StaticKeyProvider {
  @scala.inline
  def apply(
    KeyFormat: __stringPatternIdentityAZaZ26AZaZ09163 = null,
    KeyFormatVersions: __stringPatternDD = null,
    StaticKeyValue: __stringPatternAZaZ0932 = null,
    Url: __string = null
  ): StaticKeyProvider = {
    val __obj = js.Dynamic.literal()
    if (KeyFormat != null) __obj.updateDynamic("KeyFormat")(KeyFormat)
    if (KeyFormatVersions != null) __obj.updateDynamic("KeyFormatVersions")(KeyFormatVersions)
    if (StaticKeyValue != null) __obj.updateDynamic("StaticKeyValue")(StaticKeyValue)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[StaticKeyProvider]
  }
}

