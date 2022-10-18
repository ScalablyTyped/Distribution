package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRulesetRequest extends StObject {
  
  /**
    * The name of the ruleset to be deleted.
    */
  var Name: RulesetName
}
object DeleteRulesetRequest {
  
  inline def apply(Name: RulesetName): DeleteRulesetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRulesetRequest]
  }
  
  extension [Self <: DeleteRulesetRequest](x: Self) {
    
    inline def setName(value: RulesetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
