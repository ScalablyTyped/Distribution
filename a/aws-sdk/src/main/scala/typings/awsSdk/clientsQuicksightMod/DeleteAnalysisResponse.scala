package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnalysisResponse extends StObject {
  
  /**
    * The ID of the deleted analysis.
    */
  var AnalysisId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the deleted analysis.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The date and time that the analysis is scheduled to be deleted.
    */
  var DeletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DeleteAnalysisResponse {
  
  inline def apply(): DeleteAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAnalysisResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAnalysisResponse] (val x: Self) extends AnyVal {
    
    inline def setAnalysisId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAnalysisIdUndefined: Self = StObject.set(x, "AnalysisId", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDeletionTime(value: js.Date): Self = StObject.set(x, "DeletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "DeletionTime", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
