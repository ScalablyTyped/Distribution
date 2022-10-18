package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolver extends StObject {
  
  /**
    * The caching configuration for the resolver.
    */
  var cachingConfig: js.UndefOr[CachingConfig] = js.undefined
  
  /**
    * The resolver data source name.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The resolver field name.
    */
  var fieldName: js.UndefOr[ResourceName] = js.undefined
  
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
    * The request mapping template.
    */
  var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  
  /**
    * The resolver Amazon Resource Name (ARN).
    */
  var resolverArn: js.UndefOr[String] = js.undefined
  
  /**
    * The response mapping template.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  
  /**
    * The SyncConfig for a resolver attached to a versioned data source.
    */
  var syncConfig: js.UndefOr[SyncConfig] = js.undefined
  
  /**
    * The resolver type name.
    */
  var typeName: js.UndefOr[ResourceName] = js.undefined
}
object Resolver {
  
  inline def apply(): Resolver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resolver]
  }
  
  extension [Self <: Resolver](x: Self) {
    
    inline def setCachingConfig(value: CachingConfig): Self = StObject.set(x, "cachingConfig", value.asInstanceOf[js.Any])
    
    inline def setCachingConfigUndefined: Self = StObject.set(x, "cachingConfig", js.undefined)
    
    inline def setDataSourceName(value: ResourceName): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNameUndefined: Self = StObject.set(x, "dataSourceName", js.undefined)
    
    inline def setFieldName(value: ResourceName): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setKind(value: ResolverKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaxBatchSize(value: MaxBatchSize): Self = StObject.set(x, "maxBatchSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchSizeUndefined: Self = StObject.set(x, "maxBatchSize", js.undefined)
    
    inline def setPipelineConfig(value: PipelineConfig): Self = StObject.set(x, "pipelineConfig", value.asInstanceOf[js.Any])
    
    inline def setPipelineConfigUndefined: Self = StObject.set(x, "pipelineConfig", js.undefined)
    
    inline def setRequestMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "requestMappingTemplate", value.asInstanceOf[js.Any])
    
    inline def setRequestMappingTemplateUndefined: Self = StObject.set(x, "requestMappingTemplate", js.undefined)
    
    inline def setResolverArn(value: String): Self = StObject.set(x, "resolverArn", value.asInstanceOf[js.Any])
    
    inline def setResolverArnUndefined: Self = StObject.set(x, "resolverArn", js.undefined)
    
    inline def setResponseMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "responseMappingTemplate", value.asInstanceOf[js.Any])
    
    inline def setResponseMappingTemplateUndefined: Self = StObject.set(x, "responseMappingTemplate", js.undefined)
    
    inline def setSyncConfig(value: SyncConfig): Self = StObject.set(x, "syncConfig", value.asInstanceOf[js.Any])
    
    inline def setSyncConfigUndefined: Self = StObject.set(x, "syncConfig", js.undefined)
    
    inline def setTypeName(value: ResourceName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
