package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePublicIpv4PoolResult extends StObject {
  
  /**
    * Information about the result of deleting the public IPv4 pool.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.undefined
}
object DeletePublicIpv4PoolResult {
  
  inline def apply(): DeletePublicIpv4PoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePublicIpv4PoolResult]
  }
  
  extension [Self <: DeletePublicIpv4PoolResult](x: Self) {
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "ReturnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "ReturnValue", js.undefined)
  }
}
