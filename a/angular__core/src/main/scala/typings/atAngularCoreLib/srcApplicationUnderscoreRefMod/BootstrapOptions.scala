package typings
package atAngularCoreLib.srcApplicationUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BootstrapOptions extends js.Object {
  /**
       * Optionally specify which `NgZone` should be used.
       *
       * - Provide your own `NgZone` instance.
       * - `zone.js` - Use default `NgZone` which requires `Zone.js`.
       * - `noop` - Use `NoopNgZone` which does nothing.
       */
  var ngZone: js.UndefOr[
    atAngularCoreLib.srcZoneNgUnderscoreZoneMod.NgZone | atAngularCoreLib.atAngularCoreLibStrings.zoneDOTjs | atAngularCoreLib.atAngularCoreLibStrings.noop
  ] = js.undefined
}

