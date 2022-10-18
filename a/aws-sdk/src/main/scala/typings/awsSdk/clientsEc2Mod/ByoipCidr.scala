package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByoipCidr extends StObject {
  
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the address range.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the address pool.
    */
  var State: js.UndefOr[ByoipCidrState] = js.undefined
  
  /**
    * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object ByoipCidr {
  
  inline def apply(): ByoipCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByoipCidr]
  }
  
  extension [Self <: ByoipCidr](x: Self) {
    
    inline def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setState(value: ByoipCidrState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
