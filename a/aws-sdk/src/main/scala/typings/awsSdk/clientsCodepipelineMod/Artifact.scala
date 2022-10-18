package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifact extends StObject {
  
  /**
    * The location of an artifact.
    */
  var location: js.UndefOr[ArtifactLocation] = js.undefined
  
  /**
    * The artifact's name.
    */
  var name: js.UndefOr[ArtifactName] = js.undefined
  
  /**
    * The artifact's revision ID. Depending on the type of object, this could be a commit ID (GitHub) or a revision ID (Amazon S3).
    */
  var revision: js.UndefOr[Revision] = js.undefined
}
object Artifact {
  
  inline def apply(): Artifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact]
  }
  
  extension [Self <: Artifact](x: Self) {
    
    inline def setLocation(value: ArtifactLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: ArtifactName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRevision(value: Revision): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
