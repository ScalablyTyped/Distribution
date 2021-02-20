package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetArtifactUrlResult extends StObject {
  
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
  implicit class GetArtifactUrlResultMutableBuilder[Self <: GetArtifactUrlResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactId(value: ArtifactId): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactUrl(value: ArtifactUrl): Self = StObject.set(x, "artifactUrl", value.asInstanceOf[js.Any])
  }
}
