package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLifecyclePolicyOutput extends StObject {
  
  /**
    * The object lifecycle policy that is assigned to the container.
    */
  var LifecyclePolicy: typings.awsSdk.clientsMediastoreMod.LifecyclePolicy
}
object GetLifecyclePolicyOutput {
  
  inline def apply(LifecyclePolicy: LifecyclePolicy): GetLifecyclePolicyOutput = {
    val __obj = js.Dynamic.literal(LifecyclePolicy = LifecyclePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLifecyclePolicyOutput]
  }
  
  extension [Self <: GetLifecyclePolicyOutput](x: Self) {
    
    inline def setLifecyclePolicy(value: LifecyclePolicy): Self = StObject.set(x, "LifecyclePolicy", value.asInstanceOf[js.Any])
  }
}
