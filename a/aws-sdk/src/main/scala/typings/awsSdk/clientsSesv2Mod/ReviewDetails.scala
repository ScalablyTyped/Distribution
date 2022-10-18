package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewDetails extends StObject {
  
  /**
    * The associated support center case ID (if any).
    */
  var CaseId: js.UndefOr[typings.awsSdk.clientsSesv2Mod.CaseId] = js.undefined
  
  /**
    * The status of the latest review of your account. The status can be one of the following:    PENDING – We have received your appeal and are in the process of reviewing it.    GRANTED – Your appeal has been reviewed and your production access has been granted.    DENIED – Your appeal has been reviewed and your production access has been denied.    FAILED – An internal error occurred and we didn't receive your appeal. You can submit your appeal again.  
    */
  var Status: js.UndefOr[ReviewStatus] = js.undefined
}
object ReviewDetails {
  
  inline def apply(): ReviewDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewDetails]
  }
  
  extension [Self <: ReviewDetails](x: Self) {
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "CaseId", value.asInstanceOf[js.Any])
    
    inline def setCaseIdUndefined: Self = StObject.set(x, "CaseId", js.undefined)
    
    inline def setStatus(value: ReviewStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
