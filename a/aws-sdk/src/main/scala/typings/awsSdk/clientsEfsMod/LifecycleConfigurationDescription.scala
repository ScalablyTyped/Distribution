package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleConfigurationDescription extends StObject {
  
  /**
    * An array of lifecycle management policies. EFS supports a maximum of one policy per file system.
    */
  var LifecyclePolicies: js.UndefOr[typings.awsSdk.clientsEfsMod.LifecyclePolicies] = js.undefined
}
object LifecycleConfigurationDescription {
  
  inline def apply(): LifecycleConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleConfigurationDescription]
  }
  
  extension [Self <: LifecycleConfigurationDescription](x: Self) {
    
    inline def setLifecyclePolicies(value: LifecyclePolicies): Self = StObject.set(x, "LifecyclePolicies", value.asInstanceOf[js.Any])
    
    inline def setLifecyclePoliciesUndefined: Self = StObject.set(x, "LifecyclePolicies", js.undefined)
    
    inline def setLifecyclePoliciesVarargs(value: LifecyclePolicy*): Self = StObject.set(x, "LifecyclePolicies", js.Array(value*))
  }
}
