package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedArtifact extends StObject {
  
  /**
    * The identifier of the artifact.
    */
  var identifier: js.UndefOr[String] = js.undefined
  
  /**
    * The location of the artifact.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of artifact.
    */
  var `type`: js.UndefOr[ArtifactsType] = js.undefined
}
object ResolvedArtifact {
  
  inline def apply(): ResolvedArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedArtifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedArtifact] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setType(value: ArtifactsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
