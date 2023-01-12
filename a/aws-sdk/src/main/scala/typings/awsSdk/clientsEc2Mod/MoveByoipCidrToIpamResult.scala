package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveByoipCidrToIpamResult extends StObject {
  
  /**
    * The BYOIP CIDR.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.clientsEc2Mod.ByoipCidr] = js.undefined
}
object MoveByoipCidrToIpamResult {
  
  inline def apply(): MoveByoipCidrToIpamResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveByoipCidrToIpamResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveByoipCidrToIpamResult] (val x: Self) extends AnyVal {
    
    inline def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    inline def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
