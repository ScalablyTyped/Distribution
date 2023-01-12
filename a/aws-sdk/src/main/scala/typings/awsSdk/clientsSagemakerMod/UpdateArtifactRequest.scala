package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateArtifactRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the artifact to update.
    */
  var ArtifactArn: typings.awsSdk.clientsSagemakerMod.ArtifactArn
  
  /**
    * The new name for the artifact.
    */
  var ArtifactName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The new list of properties. Overwrites the current property list.
    */
  var Properties: js.UndefOr[LineageEntityParameters] = js.undefined
  
  /**
    * A list of properties to remove.
    */
  var PropertiesToRemove: js.UndefOr[ListLineageEntityParameterKey] = js.undefined
}
object UpdateArtifactRequest {
  
  inline def apply(ArtifactArn: ArtifactArn): UpdateArtifactRequest = {
    val __obj = js.Dynamic.literal(ArtifactArn = ArtifactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateArtifactRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateArtifactRequest] (val x: Self) extends AnyVal {
    
    inline def setArtifactArn(value: ArtifactArn): Self = StObject.set(x, "ArtifactArn", value.asInstanceOf[js.Any])
    
    inline def setArtifactName(value: ExperimentEntityName): Self = StObject.set(x, "ArtifactName", value.asInstanceOf[js.Any])
    
    inline def setArtifactNameUndefined: Self = StObject.set(x, "ArtifactName", js.undefined)
    
    inline def setProperties(value: LineageEntityParameters): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesToRemove(value: ListLineageEntityParameterKey): Self = StObject.set(x, "PropertiesToRemove", value.asInstanceOf[js.Any])
    
    inline def setPropertiesToRemoveUndefined: Self = StObject.set(x, "PropertiesToRemove", js.undefined)
    
    inline def setPropertiesToRemoveVarargs(value: StringParameterValue*): Self = StObject.set(x, "PropertiesToRemove", js.Array(value*))
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
  }
}
