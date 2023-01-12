package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportApiRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the only supported version is 1.0.
    */
  var ExportVersion: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether to include API Gateway extensions in the exported API definition. API Gateway extensions are included by default.
    */
  var IncludeExtensions: js.UndefOr[boolean] = js.undefined
  
  /**
    * The output type of the exported definition file. Valid values are JSON and YAML.
    */
  var OutputType: string
  
  /**
    * The version of the API specification to use. OAS30, for OpenAPI 3.0, is the only supported value.
    */
  var Specification: string
  
  /**
    * The name of the API stage to export. If you don't specify this property, a representation of the latest API configuration is exported.
    */
  var StageName: js.UndefOr[string] = js.undefined
}
object ExportApiRequest {
  
  inline def apply(ApiId: string, OutputType: string, Specification: string): ExportApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], OutputType = OutputType.asInstanceOf[js.Any], Specification = Specification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportApiRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportApiRequest] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setExportVersion(value: string): Self = StObject.set(x, "ExportVersion", value.asInstanceOf[js.Any])
    
    inline def setExportVersionUndefined: Self = StObject.set(x, "ExportVersion", js.undefined)
    
    inline def setIncludeExtensions(value: boolean): Self = StObject.set(x, "IncludeExtensions", value.asInstanceOf[js.Any])
    
    inline def setIncludeExtensionsUndefined: Self = StObject.set(x, "IncludeExtensions", js.undefined)
    
    inline def setOutputType(value: string): Self = StObject.set(x, "OutputType", value.asInstanceOf[js.Any])
    
    inline def setSpecification(value: string): Self = StObject.set(x, "Specification", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: string): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameUndefined: Self = StObject.set(x, "StageName", js.undefined)
  }
}
