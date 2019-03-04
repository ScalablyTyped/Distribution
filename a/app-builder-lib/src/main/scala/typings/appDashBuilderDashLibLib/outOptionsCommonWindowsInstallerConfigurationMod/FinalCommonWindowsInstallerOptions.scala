package typings
package appDashBuilderDashLibLib.outOptionsCommonWindowsInstallerConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalCommonWindowsInstallerOptions extends js.Object {
  var isAssisted: scala.Boolean
  var isCreateDesktopShortcut: DesktopShortcutCreationPolicy
  var isCreateStartMenuShortcut: scala.Boolean
  var isPerMachine: scala.Boolean
  var menuCategory: java.lang.String | scala.Null
  var shortcutName: java.lang.String
}

object FinalCommonWindowsInstallerOptions {
  @scala.inline
  def apply(
    isAssisted: scala.Boolean,
    isCreateDesktopShortcut: DesktopShortcutCreationPolicy,
    isCreateStartMenuShortcut: scala.Boolean,
    isPerMachine: scala.Boolean,
    shortcutName: java.lang.String,
    menuCategory: java.lang.String = null
  ): FinalCommonWindowsInstallerOptions = {
    val __obj = js.Dynamic.literal(isAssisted = isAssisted, isCreateDesktopShortcut = isCreateDesktopShortcut, isCreateStartMenuShortcut = isCreateStartMenuShortcut, isPerMachine = isPerMachine, shortcutName = shortcutName)
    if (menuCategory != null) __obj.updateDynamic("menuCategory")(menuCategory)
    __obj.asInstanceOf[FinalCommonWindowsInstallerOptions]
  }
}

