package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutClusterPolicyResponse extends StObject {
  
  /**
    * 
    The policy version.
    
    */
  var CurrentVersion: js.UndefOr[string] = js.undefined
}
object PutClusterPolicyResponse {
  
  inline def apply(): PutClusterPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutClusterPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutClusterPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
  }
}
