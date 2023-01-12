package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteArtifactRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the artifact to delete.
    */
  var ArtifactArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ArtifactArn] = js.undefined
  
  /**
    * The URI of the source.
    */
  var Source: js.UndefOr[ArtifactSource] = js.undefined
}
object DeleteArtifactRequest {
  
  inline def apply(): DeleteArtifactRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteArtifactRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteArtifactRequest] (val x: Self) extends AnyVal {
    
    inline def setArtifactArn(value: ArtifactArn): Self = StObject.set(x, "ArtifactArn", value.asInstanceOf[js.Any])
    
    inline def setArtifactArnUndefined: Self = StObject.set(x, "ArtifactArn", js.undefined)
    
    inline def setSource(value: ArtifactSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
