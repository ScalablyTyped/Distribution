package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFunctionRequest extends StObject {
  
  /**
    * The GraphQL API ID.
    */
  var apiId: String = js.native
  
  /**
    * The Function ID.
    */
  var functionId: ResourceName = js.native
}
object GetFunctionRequest {
  
  @scala.inline
  def apply(apiId: String, functionId: ResourceName): GetFunctionRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], functionId = functionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionRequest]
  }
  
  @scala.inline
  implicit class GetFunctionRequestMutableBuilder[Self <: GetFunctionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionId(value: ResourceName): Self = StObject.set(x, "functionId", value.asInstanceOf[js.Any])
  }
}
