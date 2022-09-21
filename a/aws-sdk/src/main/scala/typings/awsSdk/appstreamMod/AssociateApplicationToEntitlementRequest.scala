package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateApplicationToEntitlementRequest extends StObject {
  
  /**
    * The identifier of the application.
    */
  var ApplicationIdentifier: String
  
  /**
    * The name of the entitlement.
    */
  var EntitlementName: Name
  
  /**
    * The name of the stack.
    */
  var StackName: Name
}
object AssociateApplicationToEntitlementRequest {
  
  inline def apply(ApplicationIdentifier: String, EntitlementName: Name, StackName: Name): AssociateApplicationToEntitlementRequest = {
    val __obj = js.Dynamic.literal(ApplicationIdentifier = ApplicationIdentifier.asInstanceOf[js.Any], EntitlementName = EntitlementName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateApplicationToEntitlementRequest]
  }
  
  extension [Self <: AssociateApplicationToEntitlementRequest](x: Self) {
    
    inline def setApplicationIdentifier(value: String): Self = StObject.set(x, "ApplicationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEntitlementName(value: Name): Self = StObject.set(x, "EntitlementName", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: Name): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
