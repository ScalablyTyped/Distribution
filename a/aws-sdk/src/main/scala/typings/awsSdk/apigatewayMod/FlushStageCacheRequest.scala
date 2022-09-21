package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlushStageCacheRequest extends StObject {
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: String
  
  /**
    * The name of the stage to flush its cache.
    */
  var stageName: String
}
object FlushStageCacheRequest {
  
  inline def apply(restApiId: String, stageName: String): FlushStageCacheRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushStageCacheRequest]
  }
  
  extension [Self <: FlushStageCacheRequest](x: Self) {
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
  }
}
