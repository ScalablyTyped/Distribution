package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAttackRequest extends StObject {
  
  /**
    * The unique identifier (ID) for the attack.
    */
  var AttackId: typings.awsSdk.clientsShieldMod.AttackId
}
object DescribeAttackRequest {
  
  inline def apply(AttackId: AttackId): DescribeAttackRequest = {
    val __obj = js.Dynamic.literal(AttackId = AttackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAttackRequest]
  }
  
  extension [Self <: DescribeAttackRequest](x: Self) {
    
    inline def setAttackId(value: AttackId): Self = StObject.set(x, "AttackId", value.asInstanceOf[js.Any])
  }
}
