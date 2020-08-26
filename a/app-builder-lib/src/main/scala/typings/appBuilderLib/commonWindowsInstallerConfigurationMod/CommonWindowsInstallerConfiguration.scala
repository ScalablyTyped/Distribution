package typings.appBuilderLib.commonWindowsInstallerConfigurationMod

import typings.appBuilderLib.appBuilderLibStrings.always
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonWindowsInstallerConfiguration extends js.Object {
  /**
    * Whether to create desktop shortcut. Set to `always` if to recreate also on reinstall (even if removed by user).
    * @default true
    */
  val createDesktopShortcut: js.UndefOr[Boolean | always] = js.native
  /**
    * Whether to create start menu shortcut.
    * @default true
    */
  val createStartMenuShortcut: js.UndefOr[Boolean] = js.native
  /**
    * Whether to create submenu for start menu shortcut and program files directory. If `true`, company name will be used. Or string value.
    * @default false
    */
  val menuCategory: js.UndefOr[Boolean | String] = js.native
  val oneClick: js.UndefOr[Boolean] = js.native
  /**
    * Whether to install per all users (per-machine).
    * @default false
    */
  val perMachine: js.UndefOr[Boolean] = js.native
  /**
    * Whether to run the installed application after finish. For assisted installer corresponding checkbox will be removed.
    * @default true
    */
  val runAfterFinish: js.UndefOr[Boolean] = js.native
  /**
    * The name that will be used for all shortcuts. Defaults to the application name.
    */
  val shortcutName: js.UndefOr[String | Null] = js.native
}

object CommonWindowsInstallerConfiguration {
  @scala.inline
  def apply(): CommonWindowsInstallerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonWindowsInstallerConfiguration]
  }
  @scala.inline
  implicit class CommonWindowsInstallerConfigurationOps[Self <: CommonWindowsInstallerConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateDesktopShortcut(value: Boolean | always): Self = this.set("createDesktopShortcut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDesktopShortcut: Self = this.set("createDesktopShortcut", js.undefined)
    @scala.inline
    def setCreateStartMenuShortcut(value: Boolean): Self = this.set("createStartMenuShortcut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateStartMenuShortcut: Self = this.set("createStartMenuShortcut", js.undefined)
    @scala.inline
    def setMenuCategory(value: Boolean | String): Self = this.set("menuCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuCategory: Self = this.set("menuCategory", js.undefined)
    @scala.inline
    def setOneClick(value: Boolean): Self = this.set("oneClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneClick: Self = this.set("oneClick", js.undefined)
    @scala.inline
    def setPerMachine(value: Boolean): Self = this.set("perMachine", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerMachine: Self = this.set("perMachine", js.undefined)
    @scala.inline
    def setRunAfterFinish(value: Boolean): Self = this.set("runAfterFinish", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunAfterFinish: Self = this.set("runAfterFinish", js.undefined)
    @scala.inline
    def setShortcutName(value: String): Self = this.set("shortcutName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortcutName: Self = this.set("shortcutName", js.undefined)
    @scala.inline
    def setShortcutNameNull: Self = this.set("shortcutName", null)
  }
  
}

