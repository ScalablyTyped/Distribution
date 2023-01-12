package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAction extends StObject {
  
  /**
    * The unique identifier of the member to remove.
    */
  var MemberId: ResourceIdString
}
object RemoveAction {
  
  inline def apply(MemberId: ResourceIdString): RemoveAction = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveAction] (val x: Self) extends AnyVal {
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
  }
}
