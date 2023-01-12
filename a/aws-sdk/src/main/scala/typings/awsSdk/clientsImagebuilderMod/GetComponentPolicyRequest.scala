package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component whose policy you want to retrieve.
    */
  var componentArn: ComponentBuildVersionArn
}
object GetComponentPolicyRequest {
  
  inline def apply(componentArn: ComponentBuildVersionArn): GetComponentPolicyRequest = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetComponentPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setComponentArn(value: ComponentBuildVersionArn): Self = StObject.set(x, "componentArn", value.asInstanceOf[js.Any])
  }
}
