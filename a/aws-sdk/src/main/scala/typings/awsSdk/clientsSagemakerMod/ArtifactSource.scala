package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactSource extends StObject {
  
  /**
    * A list of source types.
    */
  var SourceTypes: js.UndefOr[ArtifactSourceTypes] = js.undefined
  
  /**
    * The URI of the source.
    */
  var SourceUri: String2048
}
object ArtifactSource {
  
  inline def apply(SourceUri: String2048): ArtifactSource = {
    val __obj = js.Dynamic.literal(SourceUri = SourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSource]
  }
  
  extension [Self <: ArtifactSource](x: Self) {
    
    inline def setSourceTypes(value: ArtifactSourceTypes): Self = StObject.set(x, "SourceTypes", value.asInstanceOf[js.Any])
    
    inline def setSourceTypesUndefined: Self = StObject.set(x, "SourceTypes", js.undefined)
    
    inline def setSourceTypesVarargs(value: ArtifactSourceType*): Self = StObject.set(x, "SourceTypes", js.Array(value*))
    
    inline def setSourceUri(value: String2048): Self = StObject.set(x, "SourceUri", value.asInstanceOf[js.Any])
  }
}
