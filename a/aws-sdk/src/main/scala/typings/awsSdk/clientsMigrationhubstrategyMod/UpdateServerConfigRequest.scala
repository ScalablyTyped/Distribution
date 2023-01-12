package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServerConfigRequest extends StObject {
  
  /**
    *  The ID of the server. 
    */
  var serverId: ServerId
  
  /**
    *  The preferred strategy options for the application component. See the response from GetServerStrategies.
    */
  var strategyOption: js.UndefOr[StrategyOption] = js.undefined
}
object UpdateServerConfigRequest {
  
  inline def apply(serverId: ServerId): UpdateServerConfigRequest = {
    val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServerConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    inline def setStrategyOption(value: StrategyOption): Self = StObject.set(x, "strategyOption", value.asInstanceOf[js.Any])
    
    inline def setStrategyOptionUndefined: Self = StObject.set(x, "strategyOption", js.undefined)
  }
}
