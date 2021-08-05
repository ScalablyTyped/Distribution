package typings.angularCommon

import typings.angularCommon.mod.HashLocationStrategy
import typings.angularCommon.mod.Location
import typings.angularCommon.mod.LocationStrategy
import typings.angularCommon.mod.PathLocationStrategy
import typings.angularCommon.mod.PlatformLocation
import typings.angularCommon.upgradeUpgradeMod.LocationUpgradeConfig
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.ModuleWithProviders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upgradeMod {
  
  @JSImport("@angular/common/upgrade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common/upgrade", "AngularJSUrlCodec")
  @js.native
  class AngularJSUrlCodec ()
    extends typings.angularCommon.upgradeUpgradeMod.AngularJSUrlCodec
  
  @JSImport("@angular/common/upgrade", "LOCATION_UPGRADE_CONFIGURATION")
  @js.native
  val LOCATION_UPGRADE_CONFIGURATION: InjectionToken[LocationUpgradeConfig] = js.native
  
  @JSImport("@angular/common/upgrade", "LocationUpgradeModule")
  @js.native
  class LocationUpgradeModule ()
    extends typings.angularCommon.upgradeUpgradeMod.LocationUpgradeModule
  /* static members */
  object LocationUpgradeModule {
    
    @JSImport("@angular/common/upgrade", "LocationUpgradeModule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def config(): ModuleWithProviders[typings.angularCommon.upgradeUpgradeMod.LocationUpgradeModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[ModuleWithProviders[typings.angularCommon.upgradeUpgradeMod.LocationUpgradeModule]]
    inline def config(config: LocationUpgradeConfig): ModuleWithProviders[typings.angularCommon.upgradeUpgradeMod.LocationUpgradeModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(config.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[typings.angularCommon.upgradeUpgradeMod.LocationUpgradeModule]]
  }
  
  @JSImport("@angular/common/upgrade", "UrlCodec")
  @js.native
  abstract class UrlCodec ()
    extends typings.angularCommon.upgradeUpgradeMod.UrlCodec
  
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
  
  @JSImport("@angular/common/upgrade", "$locationShimProvider")
  @js.native
  class locationShimProvider protected ()
    extends typings.angularCommon.upgradeUpgradeMod.locationShimProvider {
    def this(
      ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: typings.angularCommon.upgradeUpgradeMod.UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
  }
  
  inline def ɵangularPackagesCommonUpgradeUpgradeA(config: LocationUpgradeConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_a")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ɵangularPackagesCommonUpgradeUpgradeA(config: LocationUpgradeConfig, appBaseHref: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_a")(config.asInstanceOf[js.Any], appBaseHref.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ɵangularPackagesCommonUpgradeUpgradeB(config: LocationUpgradeConfig): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_b")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def ɵangularPackagesCommonUpgradeUpgradeC(platformLocation: PlatformLocation, baseHref: String): HashLocationStrategy | PathLocationStrategy = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_c")(platformLocation.asInstanceOf[js.Any], baseHref.asInstanceOf[js.Any])).asInstanceOf[HashLocationStrategy | PathLocationStrategy]
  inline def ɵangularPackagesCommonUpgradeUpgradeC(platformLocation: PlatformLocation, baseHref: String, options: LocationUpgradeConfig): HashLocationStrategy | PathLocationStrategy = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_c")(platformLocation.asInstanceOf[js.Any], baseHref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HashLocationStrategy | PathLocationStrategy]
  
  inline def ɵangularPackagesCommonUpgradeUpgradeD(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    location: Location,
    platformLocation: PlatformLocation,
    urlCodec: typings.angularCommon.upgradeUpgradeMod.UrlCodec,
    locationStrategy: LocationStrategy
  ): typings.angularCommon.upgradeUpgradeMod.locationShim = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_d")(ngUpgrade.asInstanceOf[js.Any], location.asInstanceOf[js.Any], platformLocation.asInstanceOf[js.Any], urlCodec.asInstanceOf[js.Any], locationStrategy.asInstanceOf[js.Any])).asInstanceOf[typings.angularCommon.upgradeUpgradeMod.locationShim]
}
