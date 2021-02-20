package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFunctionRequest extends StObject {
  
  /**
    * The GraphQL API ID.
    */
  var apiId: String = js.native
  
  /**
    * The Function DataSource name.
    */
  var dataSourceName: ResourceName = js.native
  
  /**
    * The Function description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The function ID.
    */
  var functionId: ResourceName = js.native
  
  /**
    * The version of the request mapping template. Currently the supported value is 2018-05-29. 
    */
  var functionVersion: String = js.native
  
  /**
    * The Function name.
    */
  var name: ResourceName = js.native
  
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.native
  
  /**
    * The Function request mapping template. 
    */
  var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.native
}
object UpdateFunctionRequest {
  
  @scala.inline
  def apply(
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
  implicit class UpdateFunctionRequestMutableBuilder[Self <: UpdateFunctionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceName(value: ResourceName): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFunctionId(value: ResourceName): Self = StObject.set(x, "functionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionVersion(value: String): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "requestMappingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMappingTemplateUndefined: Self = StObject.set(x, "requestMappingTemplate", js.undefined)
    
    @scala.inline
    def setResponseMappingTemplate(value: MappingTemplate): Self = StObject.set(x, "responseMappingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseMappingTemplateUndefined: Self = StObject.set(x, "responseMappingTemplate", js.undefined)
  }
}
