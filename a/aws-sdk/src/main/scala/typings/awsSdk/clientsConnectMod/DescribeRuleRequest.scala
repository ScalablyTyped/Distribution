package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRuleRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * A unique identifier for the rule.
    */
  var RuleId: typings.awsSdk.clientsConnectMod.RuleId
}
object DescribeRuleRequest {
  
  inline def apply(InstanceId: InstanceId, RuleId: RuleId): DescribeRuleRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: RuleId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
