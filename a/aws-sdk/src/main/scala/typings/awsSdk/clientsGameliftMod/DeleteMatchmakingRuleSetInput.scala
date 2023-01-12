package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMatchmakingRuleSetInput extends StObject {
  
  /**
    * A unique identifier for the matchmaking rule set to be deleted. (Note: The rule set name is different from the optional "name" field in the rule set body.) You can use either the rule set name or ARN value.
    */
  var Name: MatchmakingRuleSetName
}
object DeleteMatchmakingRuleSetInput {
  
  inline def apply(Name: MatchmakingRuleSetName): DeleteMatchmakingRuleSetInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMatchmakingRuleSetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMatchmakingRuleSetInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: MatchmakingRuleSetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
