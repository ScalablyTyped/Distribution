package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticKeyProvider extends js.Object {
  /**
    * Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse DNS string. May be omitted to indicate an implicit value of 'identity'.
    */
  var KeyFormat: js.UndefOr[__stringPatternIdentityAZaZ26AZaZ09163] = js.native
  /**
    * Relates to DRM implementation. Either a single positive integer version value or a slash delimited list of version values (1/2/3).
    */
  var KeyFormatVersions: js.UndefOr[__stringPatternDD] = js.native
  /**
    * Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value (StaticKeyValue).
    */
  var StaticKeyValue: js.UndefOr[__stringPatternAZaZ0932] = js.native
  /**
    * Relates to DRM implementation. The location of the license server used for protecting content.
    */
  var Url: js.UndefOr[__string] = js.native
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
    if (KeyFormat != null) __obj.updateDynamic("KeyFormat")(KeyFormat.asInstanceOf[js.Any])
    if (KeyFormatVersions != null) __obj.updateDynamic("KeyFormatVersions")(KeyFormatVersions.asInstanceOf[js.Any])
    if (StaticKeyValue != null) __obj.updateDynamic("StaticKeyValue")(StaticKeyValue.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticKeyProvider]
  }
}

