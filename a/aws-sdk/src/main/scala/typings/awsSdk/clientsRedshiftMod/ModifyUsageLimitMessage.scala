package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyUsageLimitMessage extends StObject {
  
  /**
    * The new limit amount. For more information about this parameter, see UsageLimit. 
    */
  var Amount: js.UndefOr[LongOptional] = js.undefined
  
  /**
    * The new action that Amazon Redshift takes when the limit is reached. For more information about this parameter, see UsageLimit. 
    */
  var BreachAction: js.UndefOr[UsageLimitBreachAction] = js.undefined
  
  /**
    * The identifier of the usage limit to modify.
    */
  var UsageLimitId: String
}
object ModifyUsageLimitMessage {
  
  inline def apply(UsageLimitId: String): ModifyUsageLimitMessage = {
    val __obj = js.Dynamic.literal(UsageLimitId = UsageLimitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyUsageLimitMessage]
  }
  
  extension [Self <: ModifyUsageLimitMessage](x: Self) {
    
    inline def setAmount(value: LongOptional): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
    
    inline def setBreachAction(value: UsageLimitBreachAction): Self = StObject.set(x, "BreachAction", value.asInstanceOf[js.Any])
    
    inline def setBreachActionUndefined: Self = StObject.set(x, "BreachAction", js.undefined)
    
    inline def setUsageLimitId(value: String): Self = StObject.set(x, "UsageLimitId", value.asInstanceOf[js.Any])
  }
}
