package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePoolRequest extends StObject {
  
  /**
    * The PoolId or PoolArn of the pool to delete. You can use DescribePools to find the values for PoolId and PoolArn .
    */
  var PoolId: PoolIdOrArn
}
object DeletePoolRequest {
  
  inline def apply(PoolId: PoolIdOrArn): DeletePoolRequest = {
    val __obj = js.Dynamic.literal(PoolId = PoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePoolRequest] (val x: Self) extends AnyVal {
    
    inline def setPoolId(value: PoolIdOrArn): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
  }
}
