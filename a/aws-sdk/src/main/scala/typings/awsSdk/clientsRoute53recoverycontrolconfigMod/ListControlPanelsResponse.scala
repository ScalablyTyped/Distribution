package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListControlPanelsResponse extends StObject {
  
  /**
    * The result of a successful ListControlPanel request.
    */
  var ControlPanels: js.UndefOr[listOfControlPanel] = js.undefined
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[stringMin1Max8096PatternS] = js.undefined
}
object ListControlPanelsResponse {
  
  inline def apply(): ListControlPanelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListControlPanelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListControlPanelsResponse] (val x: Self) extends AnyVal {
    
    inline def setControlPanels(value: listOfControlPanel): Self = StObject.set(x, "ControlPanels", value.asInstanceOf[js.Any])
    
    inline def setControlPanelsUndefined: Self = StObject.set(x, "ControlPanels", js.undefined)
    
    inline def setControlPanelsVarargs(value: ControlPanel*): Self = StObject.set(x, "ControlPanels", js.Array(value*))
    
    inline def setNextToken(value: stringMin1Max8096PatternS): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
