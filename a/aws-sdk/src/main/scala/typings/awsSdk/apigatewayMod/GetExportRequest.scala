package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExportRequest extends StObject {
  
  /**
    * The content-type of the export, for example application/json. Currently application/json and application/yaml are supported for exportType ofoas30 and swagger. This should be specified in the Accept header for direct API requests.
    */
  var accepts: js.UndefOr[String] = js.native
  
  /**
    * [Required] The type of export. Acceptable values are 'oas30' for OpenAPI 3.0.x and 'swagger' for Swagger/OpenAPI 2.0.
    */
  var exportType: String = js.native
  
  /**
    * A key-value map of query string parameters that specify properties of the export, depending on the requested exportType. For exportType oas30 and swagger, any combination of the following parameters are supported: extensions='integrations' or extensions='apigateway' will export the API with x-amazon-apigateway-integration extensions. extensions='authorizers' will export the API with x-amazon-apigateway-authorizer extensions. postman will export the API with Postman extensions, allowing for import to the Postman tool
    */
  var parameters: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  
  /**
    * [Required] The name of the Stage that will be exported.
    */
  var stageName: String = js.native
}
object GetExportRequest {
  
  @scala.inline
  def apply(exportType: String, restApiId: String, stageName: String): GetExportRequest = {
    val __obj = js.Dynamic.literal(exportType = exportType.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportRequest]
  }
  
  @scala.inline
  implicit class GetExportRequestMutableBuilder[Self <: GetExportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepts(value: String): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
    
    @scala.inline
    def setExportType(value: String): Self = StObject.set(x, "exportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: MapOfStringToString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
  }
}
