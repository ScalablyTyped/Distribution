package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeArtifactResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the artifact.
    */
  var ArtifactArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ArtifactArn] = js.undefined
  
  /**
    * The name of the artifact.
    */
  var ArtifactName: js.UndefOr[ExperimentEntityNameOrArn] = js.undefined
  
  /**
    * The type of the artifact.
    */
  var ArtifactType: js.UndefOr[String256] = js.undefined
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * When the artifact was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * When the artifact was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the lineage group.
    */
  var LineageGroupArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LineageGroupArn] = js.undefined
  
  var MetadataProperties: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MetadataProperties] = js.undefined
  
  /**
    * A list of the artifact's properties.
    */
  var Properties: js.UndefOr[LineageEntityParameters] = js.undefined
  
  /**
    * The source of the artifact.
    */
  var Source: js.UndefOr[ArtifactSource] = js.undefined
}
object DescribeArtifactResponse {
  
  inline def apply(): DescribeArtifactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeArtifactResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeArtifactResponse] (val x: Self) extends AnyVal {
    
    inline def setArtifactArn(value: ArtifactArn): Self = StObject.set(x, "ArtifactArn", value.asInstanceOf[js.Any])
    
    inline def setArtifactArnUndefined: Self = StObject.set(x, "ArtifactArn", js.undefined)
    
    inline def setArtifactName(value: ExperimentEntityNameOrArn): Self = StObject.set(x, "ArtifactName", value.asInstanceOf[js.Any])
    
    inline def setArtifactNameUndefined: Self = StObject.set(x, "ArtifactName", js.undefined)
    
    inline def setArtifactType(value: String256): Self = StObject.set(x, "ArtifactType", value.asInstanceOf[js.Any])
    
    inline def setArtifactTypeUndefined: Self = StObject.set(x, "ArtifactType", js.undefined)
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLineageGroupArn(value: LineageGroupArn): Self = StObject.set(x, "LineageGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLineageGroupArnUndefined: Self = StObject.set(x, "LineageGroupArn", js.undefined)
    
    inline def setMetadataProperties(value: MetadataProperties): Self = StObject.set(x, "MetadataProperties", value.asInstanceOf[js.Any])
    
    inline def setMetadataPropertiesUndefined: Self = StObject.set(x, "MetadataProperties", js.undefined)
    
    inline def setProperties(value: LineageEntityParameters): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setSource(value: ArtifactSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
