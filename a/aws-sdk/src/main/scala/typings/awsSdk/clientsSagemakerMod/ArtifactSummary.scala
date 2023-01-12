package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the artifact.
    */
  var ArtifactArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ArtifactArn] = js.undefined
  
  /**
    * The name of the artifact.
    */
  var ArtifactName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The type of the artifact.
    */
  var ArtifactType: js.UndefOr[String256] = js.undefined
  
  /**
    * When the artifact was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When the artifact was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The source of the artifact.
    */
  var Source: js.UndefOr[ArtifactSource] = js.undefined
}
object ArtifactSummary {
  
  inline def apply(): ArtifactSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactSummary] (val x: Self) extends AnyVal {
    
    inline def setArtifactArn(value: ArtifactArn): Self = StObject.set(x, "ArtifactArn", value.asInstanceOf[js.Any])
    
    inline def setArtifactArnUndefined: Self = StObject.set(x, "ArtifactArn", js.undefined)
    
    inline def setArtifactName(value: ExperimentEntityName): Self = StObject.set(x, "ArtifactName", value.asInstanceOf[js.Any])
    
    inline def setArtifactNameUndefined: Self = StObject.set(x, "ArtifactName", js.undefined)
    
    inline def setArtifactType(value: String256): Self = StObject.set(x, "ArtifactType", value.asInstanceOf[js.Any])
    
    inline def setArtifactTypeUndefined: Self = StObject.set(x, "ArtifactType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSource(value: ArtifactSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
