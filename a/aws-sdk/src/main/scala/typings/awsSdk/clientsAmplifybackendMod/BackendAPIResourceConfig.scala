package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendAPIResourceConfig extends StObject {
  
  /**
    * Additional authentication methods used to interact with your data models.
    */
  var AdditionalAuthTypes: js.UndefOr[ListOfBackendAPIAuthType] = js.undefined
  
  /**
    * The API name used to interact with the data model, configured as a part of your Amplify project.
    */
  var ApiName: js.UndefOr[string] = js.undefined
  
  /**
    * The conflict resolution strategy for your data stored in the data models.
    */
  var ConflictResolution: js.UndefOr[BackendAPIConflictResolution] = js.undefined
  
  /**
    * The default authentication type for interacting with the configured data models in your Amplify project.
    */
  var DefaultAuthType: js.UndefOr[BackendAPIAuthType] = js.undefined
  
  /**
    * The service used to provision and interact with the data model.
    */
  var Service: js.UndefOr[string] = js.undefined
  
  /**
    * The definition of the data model in the annotated transform of the GraphQL schema.
    */
  var TransformSchema: js.UndefOr[string] = js.undefined
}
object BackendAPIResourceConfig {
  
  inline def apply(): BackendAPIResourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendAPIResourceConfig]
  }
  
  extension [Self <: BackendAPIResourceConfig](x: Self) {
    
    inline def setAdditionalAuthTypes(value: ListOfBackendAPIAuthType): Self = StObject.set(x, "AdditionalAuthTypes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthTypesUndefined: Self = StObject.set(x, "AdditionalAuthTypes", js.undefined)
    
    inline def setAdditionalAuthTypesVarargs(value: BackendAPIAuthType*): Self = StObject.set(x, "AdditionalAuthTypes", js.Array(value*))
    
    inline def setApiName(value: string): Self = StObject.set(x, "ApiName", value.asInstanceOf[js.Any])
    
    inline def setApiNameUndefined: Self = StObject.set(x, "ApiName", js.undefined)
    
    inline def setConflictResolution(value: BackendAPIConflictResolution): Self = StObject.set(x, "ConflictResolution", value.asInstanceOf[js.Any])
    
    inline def setConflictResolutionUndefined: Self = StObject.set(x, "ConflictResolution", js.undefined)
    
    inline def setDefaultAuthType(value: BackendAPIAuthType): Self = StObject.set(x, "DefaultAuthType", value.asInstanceOf[js.Any])
    
    inline def setDefaultAuthTypeUndefined: Self = StObject.set(x, "DefaultAuthType", js.undefined)
    
    inline def setService(value: string): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
    
    inline def setTransformSchema(value: string): Self = StObject.set(x, "TransformSchema", value.asInstanceOf[js.Any])
    
    inline def setTransformSchemaUndefined: Self = StObject.set(x, "TransformSchema", js.undefined)
  }
}
