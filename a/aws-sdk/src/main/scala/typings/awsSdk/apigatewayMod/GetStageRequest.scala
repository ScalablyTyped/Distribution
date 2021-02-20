package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStageRequest extends StObject {
  
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  
  /**
    * [Required] The name of the Stage resource to get information about.
    */
  var stageName: String = js.native
}
object GetStageRequest {
  
  @scala.inline
  def apply(restApiId: String, stageName: String): GetStageRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStageRequest]
  }
  
  @scala.inline
  implicit class GetStageRequestMutableBuilder[Self <: GetStageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
  }
}
