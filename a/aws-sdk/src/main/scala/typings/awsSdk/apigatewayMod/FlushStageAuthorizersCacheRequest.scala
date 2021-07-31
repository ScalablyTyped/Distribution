package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlushStageAuthorizersCacheRequest extends StObject {
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * The name of the stage to flush.
    */
  var stageName: String
}
object FlushStageAuthorizersCacheRequest {
  
  @scala.inline
  def apply(restApiId: String, stageName: String): FlushStageAuthorizersCacheRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushStageAuthorizersCacheRequest]
  }
  
  @scala.inline
  implicit class FlushStageAuthorizersCacheRequestMutableBuilder[Self <: FlushStageAuthorizersCacheRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
  }
}
