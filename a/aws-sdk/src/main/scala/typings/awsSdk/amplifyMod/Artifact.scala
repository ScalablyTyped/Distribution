package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Artifact extends StObject {
  
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
  implicit class ArtifactMutableBuilder[Self <: Artifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactFileName(value: ArtifactFileName): Self = StObject.set(x, "artifactFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactId(value: ArtifactId): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
  }
}
