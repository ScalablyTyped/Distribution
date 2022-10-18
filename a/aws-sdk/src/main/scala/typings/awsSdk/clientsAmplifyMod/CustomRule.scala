package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRule extends StObject {
  
  /**
    *  The condition for a URL rewrite or redirect rule, such as a country code. 
    */
  var condition: js.UndefOr[Condition] = js.undefined
  
  /**
    *  The source pattern for a URL rewrite or redirect rule. 
    */
  var source: Source
  
  /**
    *  The status code for a URL rewrite or redirect rule.   200  Represents a 200 rewrite rule.  301  Represents a 301 (moved pemanently) redirect rule. This and all future requests should be directed to the target URL.   302  Represents a 302 temporary redirect rule.  404  Represents a 404 redirect rule.  404-200  Represents a 404 rewrite rule.  
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    *  The target pattern for a URL rewrite or redirect rule. 
    */
  var target: Target
}
object CustomRule {
  
  inline def apply(source: Source, target: Target): CustomRule = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRule]
  }
  
  extension [Self <: CustomRule](x: Self) {
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
