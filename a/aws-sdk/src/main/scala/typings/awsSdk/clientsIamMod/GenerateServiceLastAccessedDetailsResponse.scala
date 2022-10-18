package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateServiceLastAccessedDetailsResponse extends StObject {
  
  /**
    * The JobId that you can use in the GetServiceLastAccessedDetails or GetServiceLastAccessedDetailsWithEntities operations. The JobId returned by GenerateServiceLastAccessedDetail must be used by the same role within a session, or by the same user when used to call GetServiceLastAccessedDetail.
    */
  var JobId: js.UndefOr[jobIDType] = js.undefined
}
object GenerateServiceLastAccessedDetailsResponse {
  
  inline def apply(): GenerateServiceLastAccessedDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateServiceLastAccessedDetailsResponse]
  }
  
  extension [Self <: GenerateServiceLastAccessedDetailsResponse](x: Self) {
    
    inline def setJobId(value: jobIDType): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
