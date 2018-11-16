package typings
package appDashBuilderDashLibLib.outOptionsMacOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MacConfiguration
  extends appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions {
  /**
       * Paths of any extra binaries that need to be signed.
       */
  val binaries: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
       * The `CFBundleShortVersionString`. Do not use it unless you need to.
       */
  val bundleShortVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The `CFBundleVersion`. Do not use it unless [you need to](https://github.com/electron-userland/electron-builder/issues/565#issuecomment-230678643).
       */
  val bundleVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The application category type, as shown in the Finder via *View -> Arrange by Application Category* when viewing the Applications directory.
       *
       * For example, `"category": "public.app-category.developer-tools"` will set the application category to *Developer Tools*.
       *
       * Valid values are listed in [Apple's documentation](https://developer.apple.com/library/ios/documentation/General/Reference/InfoPlistKeyReference/Articles/LaunchServicesKeys.html#//apple_ref/doc/uid/TP40009250-SW8).
       */
  val category: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** @private */
  val cscInstallerKeyPassword: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** @private */
  val cscInstallerLink: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The electron locales. By default Electron locales used as is.
       */
  val electronLanguages: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
       * The path to entitlements file for signing the app. `build/entitlements.mac.plist` will be used if exists (it is a recommended way to set).
       * MAS entitlements is specified in the [mas](/configuration/mas).
       */
  val entitlements: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The path to child entitlements which inherit the security settings for signing frameworks and bundles of a distribution. `build/entitlements.mac.inherit.plist` will be used if exists (it is a recommended way to set).
       * Otherwise [default](https://github.com/electron-userland/electron-osx-sign/blob/master/default.entitlements.darwin.inherit.plist).
       *
       * This option only applies when signing with `entitlements` provided.
       */
  val entitlementsInherit: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The extra entries for `Info.plist`.
       */
  val extendInfo: js.UndefOr[js.Any] = js.undefined
  /**
       * Extra files to put in archive. Not applicable for `tar.*`.
       */
  val extraDistFiles: js.UndefOr[js.Array[java.lang.String] | java.lang.String | scala.Null] = js.undefined
  /**
       * The bundle identifier to use in the application helper's plist.
       * @default ${appBundleIdentifier}.helper
       */
  val helperBundleId: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The name of certificate to use when signing. Consider using environment variables [CSC_LINK or CSC_NAME](/code-signing) instead of specifying this option.
       * MAS installer identity is specified in the [mas](/configuration/mas).
       */
  val identity: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The minimum version of macOS required for the app to run. Corresponds to `LSMinimumSystemVersion`.
       */
  val minimumSystemVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The path to the provisioning profile to use when signing, absolute or relative to the app root.
       */
  val provisioningProfile: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * Path of [requirements file](https://developer.apple.com/library/mac/documentation/Security/Conceptual/CodeSigningGuide/RequirementLang/RequirementLang.html) used in signing. Not applicable for MAS.
       */
  val requirements: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The target package type: list of `default`, `dmg`, `mas`, `mas-dev`, `pkg`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`. Defaults to `default` (dmg and zip for Squirrel.Mac).
      */
  @JSName("target")
  val target_MacConfiguration: js.UndefOr[
    (js.Array[MacOsTargetName | appDashBuilderDashLibLib.outCoreMod.TargetConfiguration]) | MacOsTargetName | appDashBuilderDashLibLib.outCoreMod.TargetConfiguration | scala.Null
  ] = js.undefined
  /**
       * Whether to sign app for development or for distribution.
       * @default distribution
       */
  val `type`: js.UndefOr[
    appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.distribution | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.development | scala.Null
  ] = js.undefined
}

