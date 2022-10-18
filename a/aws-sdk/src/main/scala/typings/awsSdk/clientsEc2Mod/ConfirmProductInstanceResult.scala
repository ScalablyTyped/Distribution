package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmProductInstanceResult extends StObject {
  
  /**
    * The Amazon Web Services account ID of the instance owner. This is only present if the product code is attached to the instance.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The return value of the request. Returns true if the specified product code is owned by the requester and associated with the specified instance.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object ConfirmProductInstanceResult {
  
  inline def apply(): ConfirmProductInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmProductInstanceResult]
  }
  
  extension [Self <: ConfirmProductInstanceResult](x: Self) {
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
