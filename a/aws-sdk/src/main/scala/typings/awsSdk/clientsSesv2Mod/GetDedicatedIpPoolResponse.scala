package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDedicatedIpPoolResponse extends StObject {
  
  /**
    * An object that contains information about a dedicated IP pool.
    */
  var DedicatedIpPool: js.UndefOr[typings.awsSdk.clientsSesv2Mod.DedicatedIpPool] = js.undefined
}
object GetDedicatedIpPoolResponse {
  
  inline def apply(): GetDedicatedIpPoolResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDedicatedIpPoolResponse]
  }
  
  extension [Self <: GetDedicatedIpPoolResponse](x: Self) {
    
    inline def setDedicatedIpPool(value: DedicatedIpPool): Self = StObject.set(x, "DedicatedIpPool", value.asInstanceOf[js.Any])
    
    inline def setDedicatedIpPoolUndefined: Self = StObject.set(x, "DedicatedIpPool", js.undefined)
  }
}
