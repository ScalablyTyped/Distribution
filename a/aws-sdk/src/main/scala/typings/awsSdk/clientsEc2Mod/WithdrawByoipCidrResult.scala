package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithdrawByoipCidrResult extends StObject {
  
  /**
    * Information about the address pool.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.clientsEc2Mod.ByoipCidr] = js.undefined
}
object WithdrawByoipCidrResult {
  
  inline def apply(): WithdrawByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithdrawByoipCidrResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithdrawByoipCidrResult] (val x: Self) extends AnyVal {
    
    inline def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    inline def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
