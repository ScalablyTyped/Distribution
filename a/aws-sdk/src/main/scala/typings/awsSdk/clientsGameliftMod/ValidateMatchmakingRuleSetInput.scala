package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateMatchmakingRuleSetInput extends StObject {
  
  /**
    * A collection of matchmaking rules to validate, formatted as a JSON string.
    */
  var RuleSetBody: typings.awsSdk.clientsGameliftMod.RuleSetBody
}
object ValidateMatchmakingRuleSetInput {
  
  inline def apply(RuleSetBody: RuleSetBody): ValidateMatchmakingRuleSetInput = {
    val __obj = js.Dynamic.literal(RuleSetBody = RuleSetBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateMatchmakingRuleSetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateMatchmakingRuleSetInput] (val x: Self) extends AnyVal {
    
    inline def setRuleSetBody(value: RuleSetBody): Self = StObject.set(x, "RuleSetBody", value.asInstanceOf[js.Any])
  }
}
