package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAutoTerminationPolicyInput extends StObject {
  
  /**
    * Specifies the ID of the Amazon EMR cluster from which the auto-termination policy will be removed.
    */
  var ClusterId: typings.awsSdk.clientsEmrMod.ClusterId
}
object RemoveAutoTerminationPolicyInput {
  
  inline def apply(ClusterId: ClusterId): RemoveAutoTerminationPolicyInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAutoTerminationPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveAutoTerminationPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
