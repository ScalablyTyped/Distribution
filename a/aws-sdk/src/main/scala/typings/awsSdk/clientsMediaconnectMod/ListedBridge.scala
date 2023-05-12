package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedBridge extends StObject {
  
  /**
    * The ARN of the bridge.
    */
  var BridgeArn: string
  
  var BridgeState: typings.awsSdk.clientsMediaconnectMod.BridgeState
  
  /**
    * The type of the bridge.
    */
  var BridgeType: string
  
  /**
    * The name of the bridge.
    */
  var Name: string
  
  /**
    * The ARN of the gateway associated with the bridge.
    */
  var PlacementArn: string
}
object ListedBridge {
  
  inline def apply(
    BridgeArn: string,
    BridgeState: BridgeState,
    BridgeType: string,
    Name: string,
    PlacementArn: string
  ): ListedBridge = {
    val __obj = js.Dynamic.literal(BridgeArn = BridgeArn.asInstanceOf[js.Any], BridgeState = BridgeState.asInstanceOf[js.Any], BridgeType = BridgeType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PlacementArn = PlacementArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedBridge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListedBridge] (val x: Self) extends AnyVal {
    
    inline def setBridgeArn(value: string): Self = StObject.set(x, "BridgeArn", value.asInstanceOf[js.Any])
    
    inline def setBridgeState(value: BridgeState): Self = StObject.set(x, "BridgeState", value.asInstanceOf[js.Any])
    
    inline def setBridgeType(value: string): Self = StObject.set(x, "BridgeType", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPlacementArn(value: string): Self = StObject.set(x, "PlacementArn", value.asInstanceOf[js.Any])
  }
}
