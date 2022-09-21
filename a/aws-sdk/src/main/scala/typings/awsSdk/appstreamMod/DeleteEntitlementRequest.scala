package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEntitlementRequest extends StObject {
  
  /**
    * The name of the entitlement.
    */
  var Name: typings.awsSdk.appstreamMod.Name
  
  /**
    * The name of the stack with which the entitlement is associated.
    */
  var StackName: Name
}
object DeleteEntitlementRequest {
  
  inline def apply(Name: Name, StackName: Name): DeleteEntitlementRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEntitlementRequest]
  }
  
  extension [Self <: DeleteEntitlementRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: Name): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
