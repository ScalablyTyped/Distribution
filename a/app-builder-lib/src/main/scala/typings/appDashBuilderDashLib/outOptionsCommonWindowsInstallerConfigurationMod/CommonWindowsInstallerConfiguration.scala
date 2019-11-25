package typings.appDashBuilderDashLib.outOptionsCommonWindowsInstallerConfigurationMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.always
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonWindowsInstallerConfiguration extends js.Object {
  /**
    * Whether to create desktop shortcut. Set to `always` if to recreate also on reinstall (even if removed by user).
    * @default true
    */
  val createDesktopShortcut: js.UndefOr[Boolean | always] = js.undefined
  /**
    * Whether to create start menu shortcut.
    * @default true
    */
  val createStartMenuShortcut: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to create submenu for start menu shortcut and program files directory. If `true`, company name will be used. Or string value.
    * @default false
    */
  val menuCategory: js.UndefOr[Boolean | String] = js.undefined
  val oneClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to install per all users (per-machine).
    * @default false
    */
  val perMachine: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to run the installed application after finish. For assisted installer corresponding checkbox will be removed.
    * @default true
    */
  val runAfterFinish: js.UndefOr[Boolean] = js.undefined
  /**
    * The name that will be used for all shortcuts. Defaults to the application name.
    */
  val shortcutName: js.UndefOr[String | Null] = js.undefined
}

object CommonWindowsInstallerConfiguration {
  @scala.inline
  def apply(
    createDesktopShortcut: Boolean | always = null,
    createStartMenuShortcut: js.UndefOr[Boolean] = js.undefined,
    menuCategory: Boolean | String = null,
    oneClick: js.UndefOr[Boolean] = js.undefined,
    perMachine: js.UndefOr[Boolean] = js.undefined,
    runAfterFinish: js.UndefOr[Boolean] = js.undefined,
    shortcutName: String = null
  ): CommonWindowsInstallerConfiguration = {
    val __obj = js.Dynamic.literal()
    if (createDesktopShortcut != null) __obj.updateDynamic("createDesktopShortcut")(createDesktopShortcut.asInstanceOf[js.Any])
    if (!js.isUndefined(createStartMenuShortcut)) __obj.updateDynamic("createStartMenuShortcut")(createStartMenuShortcut.asInstanceOf[js.Any])
    if (menuCategory != null) __obj.updateDynamic("menuCategory")(menuCategory.asInstanceOf[js.Any])
    if (!js.isUndefined(oneClick)) __obj.updateDynamic("oneClick")(oneClick.asInstanceOf[js.Any])
    if (!js.isUndefined(perMachine)) __obj.updateDynamic("perMachine")(perMachine.asInstanceOf[js.Any])
    if (!js.isUndefined(runAfterFinish)) __obj.updateDynamic("runAfterFinish")(runAfterFinish.asInstanceOf[js.Any])
    if (shortcutName != null) __obj.updateDynamic("shortcutName")(shortcutName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonWindowsInstallerConfiguration]
  }
}

