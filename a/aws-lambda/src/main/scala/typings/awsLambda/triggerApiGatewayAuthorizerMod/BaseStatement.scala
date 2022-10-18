package typings.awsLambda.triggerApiGatewayAuthorizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseStatement extends StObject {
  
  var Condition: js.UndefOr[ConditionBlock] = js.undefined
  
  var Effect: String
  
  var Sid: js.UndefOr[String] = js.undefined
}
object BaseStatement {
  
  inline def apply(Effect: String): BaseStatement = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseStatement]
  }
  
  extension [Self <: BaseStatement](x: Self) {
    
    inline def setCondition(value: ConditionBlock): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setEffect(value: String): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "Sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "Sid", js.undefined)
  }
}
