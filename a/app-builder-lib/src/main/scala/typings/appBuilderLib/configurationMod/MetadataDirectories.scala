package typings.appBuilderLib.configurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataDirectories extends js.Object {
  /**
    * The application directory (containing the application package.json), defaults to `app`, `www` or working directory.
    */
  val app: js.UndefOr[String | Null] = js.undefined
  /**
    * The path to build resources.
    *
    * Please note — build resources is not packed into the app. If you need to use some files, e.g. as tray icon, please include required files explicitly: `"files": ["**\/ *", "build/icon.*"]`
    * @default build
    */
  val buildResources: js.UndefOr[String | Null] = js.undefined
  /**
    * The output directory. [File macros](/file-patterns#file-macros) are supported.
    * @default dist
    */
  val output: js.UndefOr[String | Null] = js.undefined
}

object MetadataDirectories {
  @scala.inline
  def apply(
    app: js.UndefOr[Null | String] = js.undefined,
    buildResources: js.UndefOr[Null | String] = js.undefined,
    output: js.UndefOr[Null | String] = js.undefined
  ): MetadataDirectories = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(app)) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (!js.isUndefined(buildResources)) __obj.updateDynamic("buildResources")(buildResources.asInstanceOf[js.Any])
    if (!js.isUndefined(output)) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataDirectories]
  }
}

