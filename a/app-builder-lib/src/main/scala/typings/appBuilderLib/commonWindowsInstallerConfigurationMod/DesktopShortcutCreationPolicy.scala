package typings.appBuilderLib.commonWindowsInstallerConfigurationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DesktopShortcutCreationPolicy extends js.Object
@JSImport("app-builder-lib/out/options/CommonWindowsInstallerConfiguration", "DesktopShortcutCreationPolicy")
@js.native
object DesktopShortcutCreationPolicy extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DesktopShortcutCreationPolicy with Double] = js.native
  
  @js.native
  sealed trait ALWAYS extends DesktopShortcutCreationPolicy
  /* 1 */ @js.native
  object ALWAYS extends TopLevel[ALWAYS with Double]
  
  @js.native
  sealed trait FRESH_INSTALL extends DesktopShortcutCreationPolicy
  /* 0 */ @js.native
  object FRESH_INSTALL extends TopLevel[FRESH_INSTALL with Double]
  
  @js.native
  sealed trait NEVER extends DesktopShortcutCreationPolicy
  /* 2 */ @js.native
  object NEVER extends TopLevel[NEVER with Double]
}
