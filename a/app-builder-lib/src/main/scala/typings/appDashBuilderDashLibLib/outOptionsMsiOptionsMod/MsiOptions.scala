package typings
package appDashBuilderDashLibLib.outOptionsMsiOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsiOptions
  extends appDashBuilderDashLibLib.outOptionsCommonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
     with appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions {
  /**
    * The [upgrade code](https://msdn.microsoft.com/en-us/library/windows/desktop/aa372375(v=vs.85).aspx). Optional, by default generated using app id.
    */
  val upgradeCode: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * If `warningsAsErrors` is `true` (default): treat warnings as errors. If `warningsAsErrors` is `false`: allow warnings.
    * @default true
    */
  val warningsAsErrors: js.UndefOr[scala.Boolean] = js.undefined
}

object MsiOptions {
  @scala.inline
  def apply(
    artifactName: java.lang.String = null,
    createDesktopShortcut: scala.Boolean | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.always = null,
    createStartMenuShortcut: js.UndefOr[scala.Boolean] = js.undefined,
    menuCategory: scala.Boolean | java.lang.String = null,
    oneClick: js.UndefOr[scala.Boolean] = js.undefined,
    perMachine: js.UndefOr[scala.Boolean] = js.undefined,
    publish: builderDashUtilDashRuntimeLib.outPublishOptionsMod.Publish = null,
    runAfterFinish: js.UndefOr[scala.Boolean] = js.undefined,
    shortcutName: java.lang.String = null,
    upgradeCode: java.lang.String = null,
    warningsAsErrors: js.UndefOr[scala.Boolean] = js.undefined
  ): MsiOptions = {
    val __obj = js.Dynamic.literal()
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (createDesktopShortcut != null) __obj.updateDynamic("createDesktopShortcut")(createDesktopShortcut.asInstanceOf[js.Any])
    if (!js.isUndefined(createStartMenuShortcut)) __obj.updateDynamic("createStartMenuShortcut")(createStartMenuShortcut)
    if (menuCategory != null) __obj.updateDynamic("menuCategory")(menuCategory.asInstanceOf[js.Any])
    if (!js.isUndefined(oneClick)) __obj.updateDynamic("oneClick")(oneClick)
    if (!js.isUndefined(perMachine)) __obj.updateDynamic("perMachine")(perMachine)
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(runAfterFinish)) __obj.updateDynamic("runAfterFinish")(runAfterFinish)
    if (shortcutName != null) __obj.updateDynamic("shortcutName")(shortcutName)
    if (upgradeCode != null) __obj.updateDynamic("upgradeCode")(upgradeCode)
    if (!js.isUndefined(warningsAsErrors)) __obj.updateDynamic("warningsAsErrors")(warningsAsErrors)
    __obj.asInstanceOf[MsiOptions]
  }
}

