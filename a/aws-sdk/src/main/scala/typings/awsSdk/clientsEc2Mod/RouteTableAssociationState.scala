package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteTableAssociationState extends StObject {
  
  /**
    * The state of the association.
    */
  var State: js.UndefOr[RouteTableAssociationStateCode] = js.undefined
  
  /**
    * The status message, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object RouteTableAssociationState {
  
  inline def apply(): RouteTableAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTableAssociationState]
  }
  
  extension [Self <: RouteTableAssociationState](x: Self) {
    
    inline def setState(value: RouteTableAssociationStateCode): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
