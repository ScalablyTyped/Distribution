package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoutingControlsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the control panel.
    */
  var ControlPanelArn: string
  
  /**
    * The number of objects that you want to return with this call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRoute53recoverycontrolconfigMod.MaxResults] = js.undefined
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListRoutingControlsRequest {
  
  inline def apply(ControlPanelArn: string): ListRoutingControlsRequest = {
    val __obj = js.Dynamic.literal(ControlPanelArn = ControlPanelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRoutingControlsRequest]
  }
  
  extension [Self <: ListRoutingControlsRequest](x: Self) {
    
    inline def setControlPanelArn(value: string): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
