package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRuleState extends StObject {
  
  /**
    *  The name of the Contributor Insights rule that contains data for the specified Amazon Web Services resource. 
    */
  var RuleName: InsightRuleName
  
  /**
    *  Indicates whether the rule is enabled or disabled. 
    */
  var State: InsightRuleState
}
object ManagedRuleState {
  
  inline def apply(RuleName: InsightRuleName, State: InsightRuleState): ManagedRuleState = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedRuleState]
  }
  
  extension [Self <: ManagedRuleState](x: Self) {
    
    inline def setRuleName(value: InsightRuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setState(value: InsightRuleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
