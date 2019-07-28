package typings.appDashBuilderDashLib.outConfigurationMod

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
  def apply(app: String = null, buildResources: String = null, output: String = null): MetadataDirectories = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app)
    if (buildResources != null) __obj.updateDynamic("buildResources")(buildResources)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[MetadataDirectories]
  }
}

