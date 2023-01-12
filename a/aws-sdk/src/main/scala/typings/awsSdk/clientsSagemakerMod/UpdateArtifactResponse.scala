package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateArtifactResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the artifact.
    */
  var ArtifactArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ArtifactArn] = js.undefined
}
object UpdateArtifactResponse {
  
  inline def apply(): UpdateArtifactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateArtifactResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateArtifactResponse] (val x: Self) extends AnyVal {
    
    inline def setArtifactArn(value: ArtifactArn): Self = StObject.set(x, "ArtifactArn", value.asInstanceOf[js.Any])
    
    inline def setArtifactArnUndefined: Self = StObject.set(x, "ArtifactArn", js.undefined)
  }
}
