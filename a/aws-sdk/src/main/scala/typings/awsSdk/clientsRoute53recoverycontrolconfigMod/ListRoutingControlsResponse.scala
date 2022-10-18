package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoutingControlsResponse extends StObject {
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[stringMin1Max8096PatternS] = js.undefined
  
  /**
    * An array of routing controls.
    */
  var RoutingControls: js.UndefOr[listOfRoutingControl] = js.undefined
}
object ListRoutingControlsResponse {
  
  inline def apply(): ListRoutingControlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoutingControlsResponse]
  }
  
  extension [Self <: ListRoutingControlsResponse](x: Self) {
    
    inline def setNextToken(value: stringMin1Max8096PatternS): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRoutingControls(value: listOfRoutingControl): Self = StObject.set(x, "RoutingControls", value.asInstanceOf[js.Any])
    
    inline def setRoutingControlsUndefined: Self = StObject.set(x, "RoutingControls", js.undefined)
    
    inline def setRoutingControlsVarargs(value: RoutingControl*): Self = StObject.set(x, "RoutingControls", js.Array(value*))
  }
}
