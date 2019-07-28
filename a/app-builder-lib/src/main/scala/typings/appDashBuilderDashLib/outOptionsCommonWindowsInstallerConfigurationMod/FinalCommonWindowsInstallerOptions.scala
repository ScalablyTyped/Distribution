package typings.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalCommonWindowsInstallerOptions extends js.Object {
  var isAssisted: Boolean
  var isCreateDesktopShortcut: DesktopShortcutCreationPolicy
  var isCreateStartMenuShortcut: Boolean
  var isPerMachine: Boolean
  var menuCategory: String | Null
  var shortcutName: String
}

object FinalCommonWindowsInstallerOptions {
  @scala.inline
  def apply(
    isAssisted: Boolean,
    isCreateDesktopShortcut: DesktopShortcutCreationPolicy,
    isCreateStartMenuShortcut: Boolean,
    isPerMachine: Boolean,
    shortcutName: String,
    menuCategory: String = null
  ): FinalCommonWindowsInstallerOptions = {
    val __obj = js.Dynamic.literal(isAssisted = isAssisted, isCreateDesktopShortcut = isCreateDesktopShortcut, isCreateStartMenuShortcut = isCreateStartMenuShortcut, isPerMachine = isPerMachine, shortcutName = shortcutName)
    if (menuCategory != null) __obj.updateDynamic("menuCategory")(menuCategory)
    __obj.asInstanceOf[FinalCommonWindowsInstallerOptions]
  }
}

