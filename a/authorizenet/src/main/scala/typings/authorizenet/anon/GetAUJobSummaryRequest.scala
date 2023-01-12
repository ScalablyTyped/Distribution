package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAUJobSummaryRequest extends StObject {
  
  var getAUJobSummaryRequest: typings.authorizenet.mod.APIContracts.GetAUJobSummaryRequest
}
object GetAUJobSummaryRequest {
  
  inline def apply(getAUJobSummaryRequest: typings.authorizenet.mod.APIContracts.GetAUJobSummaryRequest): GetAUJobSummaryRequest = {
    val __obj = js.Dynamic.literal(getAUJobSummaryRequest = getAUJobSummaryRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAUJobSummaryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAUJobSummaryRequest] (val x: Self) extends AnyVal {
    
    inline def setGetAUJobSummaryRequest(value: typings.authorizenet.mod.APIContracts.GetAUJobSummaryRequest): Self = StObject.set(x, "getAUJobSummaryRequest", value.asInstanceOf[js.Any])
  }
}
