package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppAssessmentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:partition:resiliencehub:region:account:app-assessment/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var assessmentArn: Arn
  
  /**
    * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters. You should not reuse the same client token for other API requests.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
}
object DeleteAppAssessmentRequest {
  
  inline def apply(assessmentArn: Arn): DeleteAppAssessmentRequest = {
    val __obj = js.Dynamic.literal(assessmentArn = assessmentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppAssessmentRequest]
  }
  
  extension [Self <: DeleteAppAssessmentRequest](x: Self) {
    
    inline def setAssessmentArn(value: Arn): Self = StObject.set(x, "assessmentArn", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
