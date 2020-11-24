package typings.appBuilderLib.packagerApiMod

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typings.electronPublish.mod.UploadTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactCreated extends UploadTask {
  
  val isWriteUpdateInfo: js.UndefOr[Boolean] = js.native
  
  val packager: PlatformPackager[_] = js.native
  
  val publishConfig: js.UndefOr[PublishConfiguration | Null] = js.native
  
  val target: Target | Null = js.native
  
  var updateInfo: js.UndefOr[js.Any] = js.native
}
object ArtifactCreated {
  
  @scala.inline
  def apply(file: String, packager: PlatformPackager[_]): ArtifactCreated = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactCreated]
  }
  
  @scala.inline
  implicit class ArtifactCreatedOps[Self <: ArtifactCreated] (val x: Self) extends AnyVal {
    
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
    def setPackager(value: PlatformPackager[_]): Self = this.set("packager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWriteUpdateInfo(value: Boolean): Self = this.set("isWriteUpdateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWriteUpdateInfo: Self = this.set("isWriteUpdateInfo", js.undefined)
    
    @scala.inline
    def setPublishConfig(value: PublishConfiguration): Self = this.set("publishConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishConfig: Self = this.set("publishConfig", js.undefined)
    
    @scala.inline
    def setPublishConfigNull: Self = this.set("publishConfig", null)
    
    @scala.inline
    def setTarget(value: Target): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setUpdateInfo(value: js.Any): Self = this.set("updateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateInfo: Self = this.set("updateInfo", js.undefined)
  }
}
