package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataProperties extends StObject {
  
  /**
    * The commit ID.
    */
  var CommitId: js.UndefOr[MetadataPropertyValue] = js.undefined
  
  /**
    * The entity this entity was generated by.
    */
  var GeneratedBy: js.UndefOr[MetadataPropertyValue] = js.undefined
  
  /**
    * The project ID.
    */
  var ProjectId: js.UndefOr[MetadataPropertyValue] = js.undefined
  
  /**
    * The repository.
    */
  var Repository: js.UndefOr[MetadataPropertyValue] = js.undefined
}
object MetadataProperties {
  
  inline def apply(): MetadataProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataProperties] (val x: Self) extends AnyVal {
    
    inline def setCommitId(value: MetadataPropertyValue): Self = StObject.set(x, "CommitId", value.asInstanceOf[js.Any])
    
    inline def setCommitIdUndefined: Self = StObject.set(x, "CommitId", js.undefined)
    
    inline def setGeneratedBy(value: MetadataPropertyValue): Self = StObject.set(x, "GeneratedBy", value.asInstanceOf[js.Any])
    
    inline def setGeneratedByUndefined: Self = StObject.set(x, "GeneratedBy", js.undefined)
    
    inline def setProjectId(value: MetadataPropertyValue): Self = StObject.set(x, "ProjectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "ProjectId", js.undefined)
    
    inline def setRepository(value: MetadataPropertyValue): Self = StObject.set(x, "Repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "Repository", js.undefined)
  }
}
