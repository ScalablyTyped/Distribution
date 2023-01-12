package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateArtifactRequest extends StObject {
  
  /**
    * The name of the artifact. Must be unique to your account in an Amazon Web Services Region.
    */
  var ArtifactName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The artifact type.
    */
  var ArtifactType: String256
  
  var MetadataProperties: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MetadataProperties] = js.undefined
  
  /**
    * A list of properties to add to the artifact.
    */
  var Properties: js.UndefOr[LineageEntityParameters] = js.undefined
  
  /**
    * The ID, ID type, and URI of the source.
    */
  var Source: ArtifactSource
  
  /**
    * A list of tags to apply to the artifact.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateArtifactRequest {
  
  inline def apply(ArtifactType: String256, Source: ArtifactSource): CreateArtifactRequest = {
    val __obj = js.Dynamic.literal(ArtifactType = ArtifactType.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateArtifactRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateArtifactRequest] (val x: Self) extends AnyVal {
    
    inline def setArtifactName(value: ExperimentEntityName): Self = StObject.set(x, "ArtifactName", value.asInstanceOf[js.Any])
    
    inline def setArtifactNameUndefined: Self = StObject.set(x, "ArtifactName", js.undefined)
    
    inline def setArtifactType(value: String256): Self = StObject.set(x, "ArtifactType", value.asInstanceOf[js.Any])
    
    inline def setMetadataProperties(value: MetadataProperties): Self = StObject.set(x, "MetadataProperties", value.asInstanceOf[js.Any])
    
    inline def setMetadataPropertiesUndefined: Self = StObject.set(x, "MetadataProperties", js.undefined)
    
    inline def setProperties(value: LineageEntityParameters): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setSource(value: ArtifactSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
