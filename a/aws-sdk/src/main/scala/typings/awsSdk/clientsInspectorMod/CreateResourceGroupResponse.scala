package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceGroupResponse extends StObject {
  
  /**
    * The ARN that specifies the resource group that is created.
    */
  var resourceGroupArn: Arn
}
object CreateResourceGroupResponse {
  
  inline def apply(resourceGroupArn: Arn): CreateResourceGroupResponse = {
    val __obj = js.Dynamic.literal(resourceGroupArn = resourceGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateResourceGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceGroupArn(value: Arn): Self = StObject.set(x, "resourceGroupArn", value.asInstanceOf[js.Any])
  }
}
