package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDedicatedIpPoolRequest extends StObject {
  
  /**
    * The name of the dedicated IP pool to retrieve.
    */
  var PoolName: typings.awsSdk.clientsSesv2Mod.PoolName
}
object GetDedicatedIpPoolRequest {
  
  inline def apply(PoolName: PoolName): GetDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDedicatedIpPoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDedicatedIpPoolRequest] (val x: Self) extends AnyVal {
    
    inline def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
  }
}
