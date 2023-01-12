package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardConfigurationRequest extends StObject {
  
  /**
    * The number of shards in the cluster
    */
  var ShardCount: js.UndefOr[Integer] = js.undefined
}
object ShardConfigurationRequest {
  
  inline def apply(): ShardConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShardConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShardConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setShardCount(value: Integer): Self = StObject.set(x, "ShardCount", value.asInstanceOf[js.Any])
    
    inline def setShardCountUndefined: Self = StObject.set(x, "ShardCount", js.undefined)
  }
}
