package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePresignedDomainUrlResponse extends StObject {
  
  /**
    * The presigned URL.
    */
  var AuthorizedUrl: js.UndefOr[PresignedDomainUrl] = js.undefined
}
object CreatePresignedDomainUrlResponse {
  
  inline def apply(): CreatePresignedDomainUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePresignedDomainUrlResponse]
  }
  
  extension [Self <: CreatePresignedDomainUrlResponse](x: Self) {
    
    inline def setAuthorizedUrl(value: PresignedDomainUrl): Self = StObject.set(x, "AuthorizedUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedUrlUndefined: Self = StObject.set(x, "AuthorizedUrl", js.undefined)
  }
}
