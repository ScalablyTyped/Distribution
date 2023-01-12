package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveManagedScalingPolicyInput extends StObject {
  
  /**
    *  Specifies the ID of the cluster from which the managed scaling policy will be removed. 
    */
  var ClusterId: typings.awsSdk.clientsEmrMod.ClusterId
}
object RemoveManagedScalingPolicyInput {
  
  inline def apply(ClusterId: ClusterId): RemoveManagedScalingPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveManagedScalingPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveManagedScalingPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
