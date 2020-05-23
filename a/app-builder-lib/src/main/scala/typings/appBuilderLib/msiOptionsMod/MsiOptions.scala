package typings.appBuilderLib.msiOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.always
import typings.appBuilderLib.commonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
import typings.appBuilderLib.coreMod.Publish
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsiOptions
  extends CommonWindowsInstallerConfiguration
     with TargetSpecificOptions {
  /**
    * The [upgrade code](https://msdn.microsoft.com/en-us/library/windows/desktop/aa372375(v=vs.85).aspx). Optional, by default generated using app id.
    */
  val upgradeCode: js.UndefOr[String | Null] = js.undefined
  /**
    * If `warningsAsErrors` is `true` (default): treat warnings as errors. If `warningsAsErrors` is `false`: allow warnings.
    * @default true
    */
  val warningsAsErrors: js.UndefOr[Boolean] = js.undefined
}

object MsiOptions {
  @scala.inline
  def apply(
    artifactName: js.UndefOr[Null | String] = js.undefined,
    createDesktopShortcut: Boolean | always = null,
    createStartMenuShortcut: js.UndefOr[Boolean] = js.undefined,
    menuCategory: Boolean | String = null,
    oneClick: js.UndefOr[Boolean] = js.undefined,
    perMachine: js.UndefOr[Boolean] = js.undefined,
    publish: js.UndefOr[Null | Publish] = js.undefined,
    runAfterFinish: js.UndefOr[Boolean] = js.undefined,
    shortcutName: js.UndefOr[Null | String] = js.undefined,
    upgradeCode: js.UndefOr[Null | String] = js.undefined,
    warningsAsErrors: js.UndefOr[Boolean] = js.undefined
  ): MsiOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (createDesktopShortcut != null) __obj.updateDynamic("createDesktopShortcut")(createDesktopShortcut.asInstanceOf[js.Any])
    if (!js.isUndefined(createStartMenuShortcut)) __obj.updateDynamic("createStartMenuShortcut")(createStartMenuShortcut.get.asInstanceOf[js.Any])
    if (menuCategory != null) __obj.updateDynamic("menuCategory")(menuCategory.asInstanceOf[js.Any])
    if (!js.isUndefined(oneClick)) __obj.updateDynamic("oneClick")(oneClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(perMachine)) __obj.updateDynamic("perMachine")(perMachine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(runAfterFinish)) __obj.updateDynamic("runAfterFinish")(runAfterFinish.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shortcutName)) __obj.updateDynamic("shortcutName")(shortcutName.asInstanceOf[js.Any])
    if (!js.isUndefined(upgradeCode)) __obj.updateDynamic("upgradeCode")(upgradeCode.asInstanceOf[js.Any])
    if (!js.isUndefined(warningsAsErrors)) __obj.updateDynamic("warningsAsErrors")(warningsAsErrors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsiOptions]
  }
}

