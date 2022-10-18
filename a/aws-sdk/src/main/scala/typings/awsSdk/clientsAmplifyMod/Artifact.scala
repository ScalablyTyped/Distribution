package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifact extends StObject {
  
  /**
    *  The file name for the artifact. 
    */
  var artifactFileName: ArtifactFileName
  
  /**
    *  The unique ID for the artifact. 
    */
  var artifactId: ArtifactId
}
object Artifact {
  
  inline def apply(artifactFileName: ArtifactFileName, artifactId: ArtifactId): Artifact = {
    val __obj = js.Dynamic.literal(artifactFileName = artifactFileName.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
  
  extension [Self <: Artifact](x: Self) {
    
    inline def setArtifactFileName(value: ArtifactFileName): Self = StObject.set(x, "artifactFileName", value.asInstanceOf[js.Any])
    
    inline def setArtifactId(value: ArtifactId): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
  }
}
