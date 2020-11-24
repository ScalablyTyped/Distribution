package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetArtifactUrlResult extends js.Object {
  
  /**
    *  The unique ID for an artifact. 
    */
  var artifactId: ArtifactId = js.native
  
  /**
    *  The presigned URL for the artifact. 
    */
  var artifactUrl: ArtifactUrl = js.native
}
object GetArtifactUrlResult {
  
  @scala.inline
  def apply(artifactId: ArtifactId, artifactUrl: ArtifactUrl): GetArtifactUrlResult = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any], artifactUrl = artifactUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtifactUrlResult]
  }
  
  @scala.inline
  implicit class GetArtifactUrlResultOps[Self <: GetArtifactUrlResult] (val x: Self) extends AnyVal {
    
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
    def setArtifactId(value: ArtifactId): Self = this.set("artifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactUrl(value: ArtifactUrl): Self = this.set("artifactUrl", value.asInstanceOf[js.Any])
  }
}
