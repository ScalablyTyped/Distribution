package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSdkRequest extends StObject {
  
  /**
    * A string-to-string key-value map of query parameters sdkType-dependent properties of the SDK. For sdkType of objectivec or swift, a parameter named classPrefix is required. For sdkType of android, parameters named groupId, artifactId, artifactVersion, and invokerPackage are required. For sdkType of java, parameters named serviceName and javaPackageName are required. 
    */
  var parameters: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * [Required] The language for the generated SDK. Currently java, javascript, android, objectivec (for iOS), swift (for iOS), and ruby are supported.
    */
  var sdkType: String
  
  /**
    * [Required] The name of the Stage that the SDK will use.
    */
  var stageName: String
}
object GetSdkRequest {
  
  @scala.inline
  def apply(restApiId: String, sdkType: String, stageName: String): GetSdkRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], sdkType = sdkType.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSdkRequest]
  }
  
  @scala.inline
  implicit class GetSdkRequestMutableBuilder[Self <: GetSdkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MapOfStringToString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkType(value: String): Self = StObject.set(x, "sdkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
  }
}
