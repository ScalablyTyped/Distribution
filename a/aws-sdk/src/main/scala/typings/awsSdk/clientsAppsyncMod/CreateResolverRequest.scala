package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResolverRequest extends StObject {
  
  /**
    * The ID for the GraphQL API for which the resolver is being created.
    */
  var apiId: String
  
  /**
    * The caching configuration for the resolver.
    */
  var cachingConfig: js.UndefOr[CachingConfig] = js.undefined
  
  /**
    * The resolver code that contains the request and response functions. When code is used, the runtime is required. The runtime value must be APPSYNC_JS.
    */
  var code: js.UndefOr[Code] = js.undefined
  
  /**
    * The name of the data source for which the resolver is being created.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of the field to attach the resolver to.
    */
  var fieldName: ResourceName
  
  /**
    * The resolver type.    UNIT: A UNIT resolver type. A UNIT resolver is the default resolver type. You can use a UNIT resolver to run a GraphQL query against a single data source.    PIPELINE: A PIPELINE resolver type. You can use a PIPELINE resolver to invoke a series of Function objects in a serial manner. You can use a pipeline resolver to run a GraphQL query against multiple data sources.  
    */
  var kind: js.UndefOr[ResolverKind] = js.undefined
  
  /**
    * The maximum batching size for a resolver.
    */
  var maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined
  
  /**
    * The PipelineConfig.
    */
  var pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined
  
  /**
    * The mapping template to use for requests. A resolver uses a request mapping template to convert a GraphQL expression into a format that a data source can understand. Mapping templates are written in Apache Velocity Template Language (VTL). VTL request mapping templates are optional when using an Lambda data source. For all other data sources, VTL request and response mapping templates are required.
    */
  var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  
  /**
    * The mapping template to use for responses from the data source.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  
  var runtime: js.UndefOr[AppSyncRuntime] = js.undefined
  
  /**
    * The SyncConfig for a resolver attached to a versioned data source.
    */
  var syncConfig: js.UndefOr[SyncConfig] = js.undefined
  
  /**
    * The name of the Type.
    */
  var typeName: ResourceName
}
object CreateResolverRequest {
  
  inline def apply(apiId: String, fieldName: ResourceName, typeName: ResourceName): CreateResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResolverRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateResolverRequest] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setCachingConfig(value: CachingConfig): Self = StObject.set(x, "cachingConfig", value.asInstanceOf[js.Any])
    
    inline def setCachingConfigUndefined: Self = StObject.set(x, "cachingConfig", js.undefined)
    
    inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDataSourceName(value: ResourceName): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNameUndefined: Self = StObject.set(x, "dataSourceName", js.undefined)
    
    inline def setFieldName(value: ResourceName): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ResolverKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaxBatchSize(value: MaxBatchSize): Self = StObject.set(x, "maxBatchSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchSizeUndefined: Self = StObject.set(x, "maxBatchSize", js.undefined)
    
    inline def setPipelineConfig(value: PipelineConfig): Self = StObject.set(x, "pipelineConfig", value.asInstanceOf[js.Any])
    
    inline def setPipelineConfigUndefined: Self = StObject.set(x, "pipelineConfig", js.undefined)
    
    inline def setRequestMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "requestMappingTemplate", value.asInstanceOf[js.Any])
    
    inline def setRequestMappingTemplateUndefined: Self = StObject.set(x, "requestMappingTemplate", js.undefined)
    
    inline def setResponseMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "responseMappingTemplate", value.asInstanceOf[js.Any])
    
    inline def setResponseMappingTemplateUndefined: Self = StObject.set(x, "responseMappingTemplate", js.undefined)
    
    inline def setRuntime(value: AppSyncRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSyncConfig(value: SyncConfig): Self = StObject.set(x, "syncConfig", value.asInstanceOf[js.Any])
    
    inline def setSyncConfigUndefined: Self = StObject.set(x, "syncConfig", js.undefined)
    
    inline def setTypeName(value: ResourceName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
