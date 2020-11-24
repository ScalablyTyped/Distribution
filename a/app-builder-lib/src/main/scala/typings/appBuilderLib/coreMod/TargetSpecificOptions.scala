package typings.appBuilderLib.coreMod

import typings.appBuilderLib.snapStorePublisherMod.SnapStoreOptions
import typings.builderUtilRuntime.publishOptionsMod.AllPublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetSpecificOptions extends js.Object {
  
  /**
    The [artifact file name template](/configuration/configuration#artifact-file-name-template).
    */
  val artifactName: js.UndefOr[String | Null] = js.native
  
  var publish: js.UndefOr[Publish] = js.native
}
object TargetSpecificOptions {
  
  @scala.inline
  def apply(): TargetSpecificOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSpecificOptions]
  }
  
  @scala.inline
  implicit class TargetSpecificOptionsOps[Self <: TargetSpecificOptions] (val x: Self) extends AnyVal {
    
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
    def setArtifactName(value: String): Self = this.set("artifactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactName: Self = this.set("artifactName", js.undefined)
    
    @scala.inline
    def setArtifactNameNull: Self = this.set("artifactName", null)
    
    @scala.inline
    def setPublishVarargs(value: (AllPublishOptions | SnapStoreOptions)*): Self = this.set("publish", js.Array(value :_*))
    
    @scala.inline
    def setPublish(value: Publish): Self = this.set("publish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublish: Self = this.set("publish", js.undefined)
    
    @scala.inline
    def setPublishNull: Self = this.set("publish", null)
  }
}
