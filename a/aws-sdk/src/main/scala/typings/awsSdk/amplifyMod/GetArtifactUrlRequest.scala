package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArtifactUrlRequest extends StObject {
  
  /**
    *  The unique ID for an artifact. 
    */
  var artifactId: ArtifactId
}
object GetArtifactUrlRequest {
  
  @scala.inline
  def apply(artifactId: ArtifactId): GetArtifactUrlRequest = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtifactUrlRequest]
  }
  
  @scala.inline
  implicit class GetArtifactUrlRequestMutableBuilder[Self <: GetArtifactUrlRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactId(value: ArtifactId): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
  }
}
