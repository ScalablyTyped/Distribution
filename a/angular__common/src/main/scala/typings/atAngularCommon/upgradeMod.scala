package typings.atAngularCommon

import typings.atAngularCommon.atAngularCommonMod.HashLocationStrategy
import typings.atAngularCommon.atAngularCommonMod.Location
import typings.atAngularCommon.atAngularCommonMod.LocationStrategy
import typings.atAngularCommon.atAngularCommonMod.PathLocationStrategy
import typings.atAngularCommon.atAngularCommonMod.PlatformLocation
import typings.atAngularCommon.upgradeUpgradeMod.LocationUpgradeConfig
import typings.atAngularCore.atAngularCoreMod.InjectionToken
import typings.atAngularCore.atAngularCoreMod.ModuleWithProviders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/upgrade", JSImport.Namespace)
@js.native
object upgradeMod extends js.Object {
  @js.native
  class $locationShim protected ()
    extends typings.atAngularCommon.upgradeUpgradeMod.$locationShim {
    def this(
      $injector: js.Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: typings.atAngularCommon.upgradeUpgradeMod.UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
  }
  
  @js.native
  class $locationShimProvider protected ()
    extends typings.atAngularCommon.upgradeUpgradeMod.$locationShimProvider {
    def this(
      ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: typings.atAngularCommon.upgradeUpgradeMod.UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
  }
  
  @js.native
  class AngularJSUrlCodec ()
    extends typings.atAngularCommon.upgradeUpgradeMod.AngularJSUrlCodec
  
  @js.native
  class LocationUpgradeModule ()
    extends typings.atAngularCommon.upgradeUpgradeMod.LocationUpgradeModule
  
  @js.native
  abstract class UrlCodec ()
    extends typings.atAngularCommon.upgradeUpgradeMod.UrlCodec
  
  val LOCATION_UPGRADE_CONFIGURATION: InjectionToken[LocationUpgradeConfig] = js.native
  def ɵangular_packages_common_upgrade_upgrade_a(config: LocationUpgradeConfig): String = js.native
  def ɵangular_packages_common_upgrade_upgrade_a(config: LocationUpgradeConfig, appBaseHref: String): String = js.native
  def ɵangular_packages_common_upgrade_upgrade_b(config: LocationUpgradeConfig): js.Any = js.native
  def ɵangular_packages_common_upgrade_upgrade_c(platformLocation: PlatformLocation, baseHref: String): HashLocationStrategy | PathLocationStrategy = js.native
  def ɵangular_packages_common_upgrade_upgrade_c(platformLocation: PlatformLocation, baseHref: String, options: LocationUpgradeConfig): HashLocationStrategy | PathLocationStrategy = js.native
  def ɵangular_packages_common_upgrade_upgrade_d(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    location: Location,
    platformLocation: PlatformLocation,
    urlCodec: typings.atAngularCommon.upgradeUpgradeMod.UrlCodec,
    locationStrategy: LocationStrategy
  ): typings.atAngularCommon.upgradeUpgradeMod.$locationShim = js.native
  /* static members */
  @js.native
  object LocationUpgradeModule extends js.Object {
    def config(): ModuleWithProviders[typings.atAngularCommon.upgradeUpgradeMod.LocationUpgradeModule] = js.native
    def config(config: LocationUpgradeConfig): ModuleWithProviders[typings.atAngularCommon.upgradeUpgradeMod.LocationUpgradeModule] = js.native
  }
  
}

