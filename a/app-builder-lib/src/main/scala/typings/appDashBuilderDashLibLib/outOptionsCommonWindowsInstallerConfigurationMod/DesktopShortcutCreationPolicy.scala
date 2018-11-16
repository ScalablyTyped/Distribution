package typings
package appDashBuilderDashLibLib.outOptionsCommonWindowsInstallerConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DesktopShortcutCreationPolicy extends js.Object

@JSImport("app-builder-lib/out/options/CommonWindowsInstallerConfiguration", "DesktopShortcutCreationPolicy")
@js.native
object DesktopShortcutCreationPolicy extends js.Object {
  @js.native
  sealed trait ALWAYS
    extends appDashBuilderDashLibLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy
  
  @js.native
  sealed trait FRESH_INSTALL
    extends appDashBuilderDashLibLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy
  
  @js.native
  sealed trait NEVER
    extends appDashBuilderDashLibLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy
  
  /* 1 */ val ALWAYS: ALWAYS with scala.Double = js.native
  /* 0 */ val FRESH_INSTALL: FRESH_INSTALL with scala.Double = js.native
  /* 2 */ val NEVER: NEVER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    appDashBuilderDashLibLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy with scala.Double
  ] = js.native
}

