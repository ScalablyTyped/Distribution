package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePublicIpv4PoolResult extends StObject {
  
  /**
    * The ID of the public IPv4 pool.
    */
  var PoolId: js.UndefOr[Ipv4PoolEc2Id] = js.undefined
}
object CreatePublicIpv4PoolResult {
  
  inline def apply(): CreatePublicIpv4PoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePublicIpv4PoolResult]
  }
  
  extension [Self <: CreatePublicIpv4PoolResult](x: Self) {
    
    inline def setPoolId(value: Ipv4PoolEc2Id): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
  }
}
