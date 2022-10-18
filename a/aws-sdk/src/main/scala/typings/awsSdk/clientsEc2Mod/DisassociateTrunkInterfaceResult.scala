package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTrunkInterfaceResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object DisassociateTrunkInterfaceResult {
  
  inline def apply(): DisassociateTrunkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateTrunkInterfaceResult]
  }
  
  extension [Self <: DisassociateTrunkInterfaceResult](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
