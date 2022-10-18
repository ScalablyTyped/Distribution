package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutProjectPolicyResponse extends StObject {
  
  /**
    * The ID of the project policy.
    */
  var PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId] = js.undefined
}
object PutProjectPolicyResponse {
  
  inline def apply(): PutProjectPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutProjectPolicyResponse]
  }
  
  extension [Self <: PutProjectPolicyResponse](x: Self) {
    
    inline def setPolicyRevisionId(value: ProjectPolicyRevisionId): Self = StObject.set(x, "PolicyRevisionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionIdUndefined: Self = StObject.set(x, "PolicyRevisionId", js.undefined)
  }
}
