package typings.appBuilderLib.linuxOptionsMod

import typings.appBuilderLib.coreMod.Publish
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppImageOptions
  extends CommonLinuxOptions
     with TargetSpecificOptions {
  /**
    * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). Only plain text is supported.
    */
  val license: js.UndefOr[String | Null] = js.undefined
}

object AppImageOptions {
  @scala.inline
  def apply(
    artifactName: js.UndefOr[Null | String] = js.undefined,
    category: js.UndefOr[Null | String] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    desktop: js.UndefOr[Null | js.Any] = js.undefined,
    executableArgs: js.UndefOr[Null | js.Array[String]] = js.undefined,
    license: js.UndefOr[Null | String] = js.undefined,
    mimeTypes: js.UndefOr[Null | js.Array[String]] = js.undefined,
    publish: js.UndefOr[Null | Publish] = js.undefined,
    synopsis: js.UndefOr[Null | String] = js.undefined
  ): AppImageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (!js.isUndefined(executableArgs)) __obj.updateDynamic("executableArgs")(executableArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(license)) __obj.updateDynamic("license")(license.asInstanceOf[js.Any])
    if (!js.isUndefined(mimeTypes)) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(synopsis)) __obj.updateDynamic("synopsis")(synopsis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppImageOptions]
  }
}

