package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateMatchmakingRuleSetOutput extends StObject {
  
  /**
    * A response indicating whether the rule set is valid.
    */
  var Valid: js.UndefOr[BooleanModel] = js.undefined
}
object ValidateMatchmakingRuleSetOutput {
  
  inline def apply(): ValidateMatchmakingRuleSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateMatchmakingRuleSetOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateMatchmakingRuleSetOutput] (val x: Self) extends AnyVal {
    
    inline def setValid(value: BooleanModel): Self = StObject.set(x, "Valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "Valid", js.undefined)
  }
}
