package typings.appBuilderLib.updateInfoBuilderMod

import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typings.builderUtilRuntime.updateInfoMod.UpdateInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInfoFileTask extends js.Object {
  val file: String = js.native
  val info: UpdateInfo = js.native
  val packager: PlatformPackager[_] = js.native
  val publishConfiguration: PublishConfiguration = js.native
}

object UpdateInfoFileTask {
  @scala.inline
  def apply(
    file: String,
    info: UpdateInfo,
    packager: PlatformPackager[_],
    publishConfiguration: PublishConfiguration
  ): UpdateInfoFileTask = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], publishConfiguration = publishConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfoFileTask]
  }
  @scala.inline
  implicit class UpdateInfoFileTaskOps[Self <: UpdateInfoFileTask] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: UpdateInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackager(value: PlatformPackager[_]): Self = this.set("packager", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublishConfiguration(value: PublishConfiguration): Self = this.set("publishConfiguration", value.asInstanceOf[js.Any])
  }
  
}

