package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArtifactUrlResult extends StObject {
  
  /**
    *  The unique ID for an artifact. 
    */
  var artifactId: ArtifactId
  
  /**
    *  The presigned URL for the artifact. 
    */
  var artifactUrl: ArtifactUrl
}
object GetArtifactUrlResult {
  
  inline def apply(artifactId: ArtifactId, artifactUrl: ArtifactUrl): GetArtifactUrlResult = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any], artifactUrl = artifactUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtifactUrlResult]
  }
  
  extension [Self <: GetArtifactUrlResult](x: Self) {
    
    inline def setArtifactId(value: ArtifactId): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
    
    inline def setArtifactUrl(value: ArtifactUrl): Self = StObject.set(x, "artifactUrl", value.asInstanceOf[js.Any])
  }
}
