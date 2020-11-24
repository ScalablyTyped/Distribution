package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Artifact extends js.Object {
  
  /**
    *  The file name for the artifact. 
    */
  var artifactFileName: ArtifactFileName = js.native
  
  /**
    *  The unique ID for the artifact. 
    */
  var artifactId: ArtifactId = js.native
}
object Artifact {
  
  @scala.inline
  def apply(artifactFileName: ArtifactFileName, artifactId: ArtifactId): Artifact = {
    val __obj = js.Dynamic.literal(artifactFileName = artifactFileName.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
  
  @scala.inline
  implicit class ArtifactOps[Self <: Artifact] (val x: Self) extends AnyVal {
    
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
    def setArtifactFileName(value: ArtifactFileName): Self = this.set("artifactFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactId(value: ArtifactId): Self = this.set("artifactId", value.asInstanceOf[js.Any])
  }
}
