package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDedicatedIpPoolRequest extends StObject {
  
  /**
    * The name of the dedicated IP pool that you want to delete.
    */
  var PoolName: typings.awsSdk.clientsPinpointemailMod.PoolName
}
object DeleteDedicatedIpPoolRequest {
  
  inline def apply(PoolName: PoolName): DeleteDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDedicatedIpPoolRequest]
  }
  
  extension [Self <: DeleteDedicatedIpPoolRequest](x: Self) {
    
    inline def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
  }
}
