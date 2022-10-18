package typings.awsSdk.clientsAmplifyMod

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
  
  inline def apply(artifactId: ArtifactId): GetArtifactUrlRequest = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArtifactUrlRequest]
  }
  
  extension [Self <: GetArtifactUrlRequest](x: Self) {
    
    inline def setArtifactId(value: ArtifactId): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
  }
}
