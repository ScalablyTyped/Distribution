package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountTakeoverActionsType extends StObject {
  
  /**
    * Action to take for a high risk.
    */
  var HighAction: js.UndefOr[AccountTakeoverActionType] = js.undefined
  
  /**
    * Action to take for a low risk.
    */
  var LowAction: js.UndefOr[AccountTakeoverActionType] = js.undefined
  
  /**
    * Action to take for a medium risk.
    */
  var MediumAction: js.UndefOr[AccountTakeoverActionType] = js.undefined
}
object AccountTakeoverActionsType {
  
  inline def apply(): AccountTakeoverActionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTakeoverActionsType]
  }
  
  extension [Self <: AccountTakeoverActionsType](x: Self) {
    
    inline def setHighAction(value: AccountTakeoverActionType): Self = StObject.set(x, "HighAction", value.asInstanceOf[js.Any])
    
    inline def setHighActionUndefined: Self = StObject.set(x, "HighAction", js.undefined)
    
    inline def setLowAction(value: AccountTakeoverActionType): Self = StObject.set(x, "LowAction", value.asInstanceOf[js.Any])
    
    inline def setLowActionUndefined: Self = StObject.set(x, "LowAction", js.undefined)
    
    inline def setMediumAction(value: AccountTakeoverActionType): Self = StObject.set(x, "MediumAction", value.asInstanceOf[js.Any])
    
    inline def setMediumActionUndefined: Self = StObject.set(x, "MediumAction", js.undefined)
  }
}
