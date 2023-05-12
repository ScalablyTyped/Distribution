package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossChannelBehavior extends StObject {
  
  /**
    * Specifies the other channels that can be routed to an agent handling their current channel.
    */
  var BehaviorType: typings.awsSdk.clientsConnectMod.BehaviorType
}
object CrossChannelBehavior {
  
  inline def apply(BehaviorType: BehaviorType): CrossChannelBehavior = {
    val __obj = js.Dynamic.literal(BehaviorType = BehaviorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossChannelBehavior]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossChannelBehavior] (val x: Self) extends AnyVal {
    
    inline def setBehaviorType(value: BehaviorType): Self = StObject.set(x, "BehaviorType", value.asInstanceOf[js.Any])
  }
}
