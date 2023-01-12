package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionConfiguration extends StObject {
  
  /**
    * The name of the DataSource.
    */
  var dataSourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The Function description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Function object.
    */
  var functionArn: js.UndefOr[String] = js.undefined
  
  /**
    * A unique ID representing the Function object.
    */
  var functionId: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the request mapping template. Currently, only the 2018-05-29 version of the template is supported.
    */
  var functionVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum batching size for a resolver.
    */
  var maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined
  
  /**
    * The name of the Function object.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  
  /**
    * The Function response mapping template.
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  
  var syncConfig: js.UndefOr[SyncConfig] = js.undefined
}
object FunctionConfiguration {
  
  inline def apply(): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataSourceName(value: ResourceName): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNameUndefined: Self = StObject.set(x, "dataSourceName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFunctionArn(value: String): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionArnUndefined: Self = StObject.set(x, "functionArn", js.undefined)
    
    inline def setFunctionId(value: String): Self = StObject.set(x, "functionId", value.asInstanceOf[js.Any])
    
    inline def setFunctionIdUndefined: Self = StObject.set(x, "functionId", js.undefined)
    
    inline def setFunctionVersion(value: String): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
    
    inline def setFunctionVersionUndefined: Self = StObject.set(x, "functionVersion", js.undefined)
    
    inline def setMaxBatchSize(value: MaxBatchSize): Self = StObject.set(x, "maxBatchSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchSizeUndefined: Self = StObject.set(x, "maxBatchSize", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "requestMappingTemplate", value.asInstanceOf[js.Any])
    
    inline def setRequestMappingTemplateUndefined: Self = StObject.set(x, "requestMappingTemplate", js.undefined)
    
    inline def setResponseMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "responseMappingTemplate", value.asInstanceOf[js.Any])
    
    inline def setResponseMappingTemplateUndefined: Self = StObject.set(x, "responseMappingTemplate", js.undefined)
    
    inline def setSyncConfig(value: SyncConfig): Self = StObject.set(x, "syncConfig", value.asInstanceOf[js.Any])
    
    inline def setSyncConfigUndefined: Self = StObject.set(x, "syncConfig", js.undefined)
  }
}
