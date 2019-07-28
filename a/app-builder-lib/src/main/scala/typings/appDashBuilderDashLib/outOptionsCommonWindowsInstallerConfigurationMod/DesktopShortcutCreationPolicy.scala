package typings.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DesktopShortcutCreationPolicy extends js.Object

@JSImport("app-builder-lib/out/options/CommonWindowsInstallerConfiguration", "DesktopShortcutCreationPolicy")
@js.native
object DesktopShortcutCreationPolicy extends js.Object {
  @js.native
  sealed trait ALWAYS extends DesktopShortcutCreationPolicy
  
  @js.native
  sealed trait FRESH_INSTALL extends DesktopShortcutCreationPolicy
  
  @js.native
  sealed trait NEVER extends DesktopShortcutCreationPolicy
  
  /* 1 */ val ALWAYS: typings.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.ALWAYS with Double = js.native
  /* 0 */ val FRESH_INSTALL: typings.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.FRESH_INSTALL with Double = js.native
  /* 2 */ val NEVER: typings.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.NEVER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DesktopShortcutCreationPolicy with Double] = js.native
}

