package typings.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod

import org.scalablytyped.runtime.TopLevel
import typings.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.ALWAYS
import typings.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.FRESH_INSTALL
import typings.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod.DesktopShortcutCreationPolicy.NEVER
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DesktopShortcutCreationPolicy with Double] = js.native
  /* 1 */ @js.native
  object ALWAYS extends TopLevel[ALWAYS with Double]
  
  /* 0 */ @js.native
  object FRESH_INSTALL extends TopLevel[FRESH_INSTALL with Double]
  
  /* 2 */ @js.native
  object NEVER extends TopLevel[NEVER with Double]
  
}

