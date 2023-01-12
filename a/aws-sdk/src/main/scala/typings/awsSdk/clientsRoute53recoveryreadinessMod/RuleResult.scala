package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleResult extends StObject {
  
  /**
    * The time the resource was last checked for readiness, in ISO-8601 format, UTC.
    */
  var LastCheckedTimestamp: js.Date
  
  /**
    * Details about the resource's readiness.
    */
  var Messages: listOfMessage
  
  /**
    * The readiness at rule level.
    */
  var Readiness: typings.awsSdk.clientsRoute53recoveryreadinessMod.Readiness
  
  /**
    * The identifier of the rule.
    */
  var RuleId: string
}
object RuleResult {
  
  inline def apply(LastCheckedTimestamp: js.Date, Messages: listOfMessage, Readiness: Readiness, RuleId: string): RuleResult = {
    val __obj = js.Dynamic.literal(LastCheckedTimestamp = LastCheckedTimestamp.asInstanceOf[js.Any], Messages = Messages.asInstanceOf[js.Any], Readiness = Readiness.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleResult] (val x: Self) extends AnyVal {
    
    inline def setLastCheckedTimestamp(value: js.Date): Self = StObject.set(x, "LastCheckedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: listOfMessage): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "Messages", js.Array(value*))
    
    inline def setReadiness(value: Readiness): Self = StObject.set(x, "Readiness", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: string): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
