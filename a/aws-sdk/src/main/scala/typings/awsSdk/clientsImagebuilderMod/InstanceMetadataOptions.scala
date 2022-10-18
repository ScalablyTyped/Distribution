package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceMetadataOptions extends StObject {
  
  /**
    * Limit the number of hops that an instance metadata request can traverse to reach its destination.
    */
  var httpPutResponseHopLimit: js.UndefOr[HttpPutResponseHopLimit] = js.undefined
  
  /**
    * Indicates whether a signed token header is required for instance metadata retrieval requests. The values affect the response as follows:    required – When you retrieve the IAM role credentials, version 2.0 credentials are returned in all cases.    optional – You can include a signed token header in your request to retrieve instance metadata, or you can leave it out. If you include it, version 2.0 credentials are returned for the IAM role. Otherwise, version 1.0 credentials are returned.   The default setting is optional.
    */
  var httpTokens: js.UndefOr[HttpTokens] = js.undefined
}
object InstanceMetadataOptions {
  
  inline def apply(): InstanceMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMetadataOptions]
  }
  
  extension [Self <: InstanceMetadataOptions](x: Self) {
    
    inline def setHttpPutResponseHopLimit(value: HttpPutResponseHopLimit): Self = StObject.set(x, "httpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    inline def setHttpPutResponseHopLimitUndefined: Self = StObject.set(x, "httpPutResponseHopLimit", js.undefined)
    
    inline def setHttpTokens(value: HttpTokens): Self = StObject.set(x, "httpTokens", value.asInstanceOf[js.Any])
    
    inline def setHttpTokensUndefined: Self = StObject.set(x, "httpTokens", js.undefined)
  }
}
