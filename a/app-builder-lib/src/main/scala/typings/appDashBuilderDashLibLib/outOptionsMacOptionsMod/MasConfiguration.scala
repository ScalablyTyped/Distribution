package typings
package appDashBuilderDashLibLib.outOptionsMacOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasConfiguration extends MacConfiguration

object MasConfiguration {
  @scala.inline
  def apply(
    binaries: js.Array[java.lang.String] = null,
    bundleShortVersion: java.lang.String = null,
    bundleVersion: java.lang.String = null,
    category: java.lang.String = null,
    cscInstallerKeyPassword: java.lang.String = null,
    cscInstallerLink: java.lang.String = null,
    darkModeSupport: js.UndefOr[scala.Boolean] = js.undefined,
    electronLanguages: js.Array[java.lang.String] | java.lang.String = null,
    entitlements: java.lang.String = null,
    entitlementsInherit: java.lang.String = null,
    extendInfo: js.Any = null,
    extraDistFiles: js.Array[java.lang.String] | java.lang.String = null,
    helperBundleId: java.lang.String = null,
    icon: java.lang.String = null,
    identity: java.lang.String = null,
    minimumSystemVersion: java.lang.String = null,
    provisioningProfile: java.lang.String = null,
    requirements: java.lang.String = null,
    target: (js.Array[
      MacOsTargetName | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TargetConfiguration */ _)
    ]) | MacOsTargetName | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TargetConfiguration */ js.Any) = null,
    `type`: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.distribution | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.development = null
  ): MasConfiguration = {
    val __obj = js.Dynamic.literal()
    if (binaries != null) __obj.updateDynamic("binaries")(binaries)
    if (bundleShortVersion != null) __obj.updateDynamic("bundleShortVersion")(bundleShortVersion)
    if (bundleVersion != null) __obj.updateDynamic("bundleVersion")(bundleVersion)
    if (category != null) __obj.updateDynamic("category")(category)
    if (cscInstallerKeyPassword != null) __obj.updateDynamic("cscInstallerKeyPassword")(cscInstallerKeyPassword)
    if (cscInstallerLink != null) __obj.updateDynamic("cscInstallerLink")(cscInstallerLink)
    if (!js.isUndefined(darkModeSupport)) __obj.updateDynamic("darkModeSupport")(darkModeSupport)
    if (electronLanguages != null) __obj.updateDynamic("electronLanguages")(electronLanguages.asInstanceOf[js.Any])
    if (entitlements != null) __obj.updateDynamic("entitlements")(entitlements)
    if (entitlementsInherit != null) __obj.updateDynamic("entitlementsInherit")(entitlementsInherit)
    if (extendInfo != null) __obj.updateDynamic("extendInfo")(extendInfo)
    if (extraDistFiles != null) __obj.updateDynamic("extraDistFiles")(extraDistFiles.asInstanceOf[js.Any])
    if (helperBundleId != null) __obj.updateDynamic("helperBundleId")(helperBundleId)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (minimumSystemVersion != null) __obj.updateDynamic("minimumSystemVersion")(minimumSystemVersion)
    if (provisioningProfile != null) __obj.updateDynamic("provisioningProfile")(provisioningProfile)
    if (requirements != null) __obj.updateDynamic("requirements")(requirements)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasConfiguration]
  }
}

