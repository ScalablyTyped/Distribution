package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportApiRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
  /**
    * The version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the only supported version is 1.0.
    */
  var ExportVersion: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether to include API Gateway extensions in the exported API definition. API Gateway extensions are included by default.
    */
  var IncludeExtensions: js.UndefOr[boolean] = js.native
  
  /**
    * The output type of the exported definition file. Valid values are JSON and YAML.
    */
  var OutputType: string = js.native
  
  /**
    * The version of the API specification to use. OAS30, for OpenAPI 3.0, is the only supported value.
    */
  var Specification: string = js.native
  
  /**
    * The name of the API stage to export. If you don't specify this property, a representation of the latest API configuration is exported.
    */
  var StageName: js.UndefOr[string] = js.native
}
object ExportApiRequest {
  
  @scala.inline
  def apply(ApiId: string, OutputType: string, Specification: string): ExportApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], OutputType = OutputType.asInstanceOf[js.Any], Specification = Specification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportApiRequest]
  }
  
  @scala.inline
  implicit class ExportApiRequestMutableBuilder[Self <: ExportApiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportVersion(value: string): Self = StObject.set(x, "ExportVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportVersionUndefined: Self = StObject.set(x, "ExportVersion", js.undefined)
    
    @scala.inline
    def setIncludeExtensions(value: boolean): Self = StObject.set(x, "IncludeExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeExtensionsUndefined: Self = StObject.set(x, "IncludeExtensions", js.undefined)
    
    @scala.inline
    def setOutputType(value: string): Self = StObject.set(x, "OutputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecification(value: string): Self = StObject.set(x, "Specification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: string): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "StageName", js.undefined)
  }
}
