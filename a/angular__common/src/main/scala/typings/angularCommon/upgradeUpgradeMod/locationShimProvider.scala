package typings.angularCommon.upgradeUpgradeMod

import typings.angularCommon.mod.Location
import typings.angularCommon.mod.LocationStrategy
import typings.angularCommon.mod.PlatformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/upgrade/upgrade", "$locationShimProvider")
@js.native
class locationShimProvider protected () extends js.Object {
  def this(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    location: Location,
    platformLocation: PlatformLocation,
    urlCodec: UrlCodec,
    locationStrategy: LocationStrategy
  ) = this()
  var location: js.Any = js.native
  var locationStrategy: js.Any = js.native
  var ngUpgrade: js.Any = js.native
  var platformLocation: js.Any = js.native
  var urlCodec: js.Any = js.native
  /**
    * Factory method that returns an instance of the $locationShim
    */
  @JSName("$get")
  def $get(): locationShim = js.native
  /**
    * Stub method used to keep API compatible with AngularJS. This setting is configured through
    * the LocationUpgradeModule's `config` method in your Angular app.
    */
  def hashPrefix(): Unit = js.native
  def hashPrefix(prefix: String): Unit = js.native
  /**
    * Stub method used to keep API compatible with AngularJS. This setting is configured through
    * the LocationUpgradeModule's `config` method in your Angular app.
    */
  def html5Mode(): Unit = js.native
  def html5Mode(mode: js.Any): Unit = js.native
}

