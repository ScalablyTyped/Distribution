package typings.angularCommon.upgradeMod

import typings.angularCommon.mod.Location
import typings.angularCommon.mod.LocationStrategy
import typings.angularCommon.mod.PlatformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/upgrade", "$locationShim")
@js.native
class locationShim protected ()
  extends typings.angularCommon.upgradeUpgradeMod.locationShim {
  def this(
    $injector: js.Any,
    location: Location,
    platformLocation: PlatformLocation,
    urlCodec: typings.angularCommon.upgradeUpgradeMod.UrlCodec,
    locationStrategy: LocationStrategy
  ) = this()
}

