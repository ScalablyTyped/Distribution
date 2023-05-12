package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterPolicyResponse extends StObject {
  
  /**
    * 
    The version of cluster policy.
    
    */
  var CurrentVersion: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The cluster policy.
    
    */
  var Policy: js.UndefOr[string] = js.undefined
}
object GetClusterPolicyResponse {
  
  inline def apply(): GetClusterPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClusterPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClusterPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    inline def setPolicy(value: string): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
