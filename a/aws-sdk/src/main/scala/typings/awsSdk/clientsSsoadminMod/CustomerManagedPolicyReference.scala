package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerManagedPolicyReference extends StObject {
  
  /**
    * The name of the IAM policy that you have configured in each account where you want to deploy your permission set.
    */
  var Name: ManagedPolicyName
  
  /**
    * The path to the IAM policy that you have configured in each account where you want to deploy your permission set. The default is /. For more information, see Friendly names and paths in the IAM User Guide.
    */
  var Path: js.UndefOr[ManagedPolicyPath] = js.undefined
}
object CustomerManagedPolicyReference {
  
  inline def apply(Name: ManagedPolicyName): CustomerManagedPolicyReference = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerManagedPolicyReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerManagedPolicyReference] (val x: Self) extends AnyVal {
    
    inline def setName(value: ManagedPolicyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: ManagedPolicyPath): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
