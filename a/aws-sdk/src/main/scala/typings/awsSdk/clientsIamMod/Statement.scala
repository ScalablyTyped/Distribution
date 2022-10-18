package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statement extends StObject {
  
  /**
    * The row and column of the end of a Statement in an IAM policy.
    */
  var EndPosition: js.UndefOr[Position] = js.undefined
  
  /**
    * The identifier of the policy that was provided as an input.
    */
  var SourcePolicyId: js.UndefOr[PolicyIdentifierType] = js.undefined
  
  /**
    * The type of the policy.
    */
  var SourcePolicyType: js.UndefOr[PolicySourceType] = js.undefined
  
  /**
    * The row and column of the beginning of the Statement in an IAM policy.
    */
  var StartPosition: js.UndefOr[Position] = js.undefined
}
object Statement {
  
  inline def apply(): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statement]
  }
  
  extension [Self <: Statement](x: Self) {
    
    inline def setEndPosition(value: Position): Self = StObject.set(x, "EndPosition", value.asInstanceOf[js.Any])
    
    inline def setEndPositionUndefined: Self = StObject.set(x, "EndPosition", js.undefined)
    
    inline def setSourcePolicyId(value: PolicyIdentifierType): Self = StObject.set(x, "SourcePolicyId", value.asInstanceOf[js.Any])
    
    inline def setSourcePolicyIdUndefined: Self = StObject.set(x, "SourcePolicyId", js.undefined)
    
    inline def setSourcePolicyType(value: PolicySourceType): Self = StObject.set(x, "SourcePolicyType", value.asInstanceOf[js.Any])
    
    inline def setSourcePolicyTypeUndefined: Self = StObject.set(x, "SourcePolicyType", js.undefined)
    
    inline def setStartPosition(value: Position): Self = StObject.set(x, "StartPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "StartPosition", js.undefined)
  }
}
