package typings.appBuilderLib.commonWindowsInstallerConfigurationMod

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
    val __obj = js.Dynamic.literal(isAssisted = isAssisted.asInstanceOf[js.Any], isCreateDesktopShortcut = isCreateDesktopShortcut.asInstanceOf[js.Any], isCreateStartMenuShortcut = isCreateStartMenuShortcut.asInstanceOf[js.Any], isPerMachine = isPerMachine.asInstanceOf[js.Any], shortcutName = shortcutName.asInstanceOf[js.Any], menuCategory = menuCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalCommonWindowsInstallerOptions]
  }
}

