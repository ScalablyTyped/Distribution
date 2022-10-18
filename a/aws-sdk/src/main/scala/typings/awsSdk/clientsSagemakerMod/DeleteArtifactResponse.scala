package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteArtifactResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the artifact.
    */
  var ArtifactArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ArtifactArn] = js.undefined
}
object DeleteArtifactResponse {
  
  inline def apply(): DeleteArtifactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteArtifactResponse]
  }
  
  extension [Self <: DeleteArtifactResponse](x: Self) {
    
    inline def setArtifactArn(value: ArtifactArn): Self = StObject.set(x, "ArtifactArn", value.asInstanceOf[js.Any])
    
    inline def setArtifactArnUndefined: Self = StObject.set(x, "ArtifactArn", js.undefined)
  }
}
