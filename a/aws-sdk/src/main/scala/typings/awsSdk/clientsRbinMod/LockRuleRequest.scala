package typings.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockRuleRequest extends StObject {
  
  /**
    * The unique ID of the retention rule.
    */
  var Identifier: RuleIdentifier
  
  /**
    * Information about the retention rule lock configuration.
    */
  var LockConfiguration: typings.awsSdk.clientsRbinMod.LockConfiguration
}
object LockRuleRequest {
  
  inline def apply(Identifier: RuleIdentifier, LockConfiguration: LockConfiguration): LockRuleRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], LockConfiguration = LockConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LockRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: RuleIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setLockConfiguration(value: LockConfiguration): Self = StObject.set(x, "LockConfiguration", value.asInstanceOf[js.Any])
  }
}
