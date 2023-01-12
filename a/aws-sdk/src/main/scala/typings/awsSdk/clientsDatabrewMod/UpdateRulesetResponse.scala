package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRulesetResponse extends StObject {
  
  /**
    * The name of the updated ruleset.
    */
  var Name: RulesetName
}
object UpdateRulesetResponse {
  
  inline def apply(Name: RulesetName): UpdateRulesetResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRulesetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRulesetResponse] (val x: Self) extends AnyVal {
    
    inline def setName(value: RulesetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
