package typings.appBuilderLib.configurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataDirectories extends js.Object {
  /**
    * The application directory (containing the application package.json), defaults to `app`, `www` or working directory.
    */
  val app: js.UndefOr[String | Null] = js.native
  /**
    * The path to build resources.
    *
    * Please note — build resources is not packed into the app. If you need to use some files, e.g. as tray icon, please include required files explicitly: `"files": ["**\/ *", "build/icon.*"]`
    * @default build
    */
  val buildResources: js.UndefOr[String | Null] = js.native
  /**
    * The output directory. [File macros](/file-patterns#file-macros) are supported.
    * @default dist
    */
  val output: js.UndefOr[String | Null] = js.native
}

object MetadataDirectories {
  @scala.inline
  def apply(): MetadataDirectories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataDirectories]
  }
  @scala.inline
  implicit class MetadataDirectoriesOps[Self <: MetadataDirectories] (val x: Self) extends AnyVal {
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setAppNull: Self = this.set("app", null)
    @scala.inline
    def setBuildResources(value: String): Self = this.set("buildResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildResources: Self = this.set("buildResources", js.undefined)
    @scala.inline
    def setBuildResourcesNull: Self = this.set("buildResources", null)
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setOutputNull: Self = this.set("output", null)
  }
  
}

