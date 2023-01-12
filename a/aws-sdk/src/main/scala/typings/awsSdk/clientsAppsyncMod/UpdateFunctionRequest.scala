package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFunctionRequest extends StObject {
  
  /**
    * The GraphQL API ID.
    */
  var apiId: String
  
  /**
    * The Function DataSource name.
    */
  var dataSourceName: ResourceName
  
  /**
    * The Function description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The function ID.
    */
  var functionId: ResourceName
  
  /**
    * The version of the request mapping template. Currently, the supported value is 2018-05-29.
    */
  var functionVersion: String
  
  /**
    * The maximum batching size for a resolver.
    */
  var maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined
  
  /**
    * The Function name.
    */
  var name: ResourceName
  
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  
  /**
    * The Function request mapping template.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  
  var syncConfig: js.UndefOr[SyncConfig] = js.undefined
}
object UpdateFunctionRequest {
  
  inline def apply(
    apiId: String,
    dataSourceName: ResourceName,
    functionId: ResourceName,
    functionVersion: String,
    name: ResourceName
  ): UpdateFunctionRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], dataSourceName = dataSourceName.asInstanceOf[js.Any], functionId = functionId.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFunctionRequest] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceName(value: ResourceName): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFunctionId(value: ResourceName): Self = StObject.set(x, "functionId", value.asInstanceOf[js.Any])
    
    inline def setFunctionVersion(value: String): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchSize(value: MaxBatchSize): Self = StObject.set(x, "maxBatchSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchSizeUndefined: Self = StObject.set(x, "maxBatchSize", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequestMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "requestMappingTemplate", value.asInstanceOf[js.Any])
    
    inline def setRequestMappingTemplateUndefined: Self = StObject.set(x, "requestMappingTemplate", js.undefined)
    
    inline def setResponseMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "responseMappingTemplate", value.asInstanceOf[js.Any])
    
    inline def setResponseMappingTemplateUndefined: Self = StObject.set(x, "responseMappingTemplate", js.undefined)
    
    inline def setSyncConfig(value: SyncConfig): Self = StObject.set(x, "syncConfig", value.asInstanceOf[js.Any])
    
    inline def setSyncConfigUndefined: Self = StObject.set(x, "syncConfig", js.undefined)
  }
}
