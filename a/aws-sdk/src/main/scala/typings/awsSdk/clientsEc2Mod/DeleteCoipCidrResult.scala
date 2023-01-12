package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoipCidrResult extends StObject {
  
  /**
    *  Information about a range of customer-owned IP addresses. 
    */
  var CoipCidr: js.UndefOr[typings.awsSdk.clientsEc2Mod.CoipCidr] = js.undefined
}
object DeleteCoipCidrResult {
  
  inline def apply(): DeleteCoipCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCoipCidrResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCoipCidrResult] (val x: Self) extends AnyVal {
    
    inline def setCoipCidr(value: CoipCidr): Self = StObject.set(x, "CoipCidr", value.asInstanceOf[js.Any])
    
    inline def setCoipCidrUndefined: Self = StObject.set(x, "CoipCidr", js.undefined)
  }
}
