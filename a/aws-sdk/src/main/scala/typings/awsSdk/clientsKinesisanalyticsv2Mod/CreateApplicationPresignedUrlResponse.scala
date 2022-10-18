package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationPresignedUrlResponse extends StObject {
  
  /**
    * The URL of the extension.
    */
  var AuthorizedUrl: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.AuthorizedUrl] = js.undefined
}
object CreateApplicationPresignedUrlResponse {
  
  inline def apply(): CreateApplicationPresignedUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationPresignedUrlResponse]
  }
  
  extension [Self <: CreateApplicationPresignedUrlResponse](x: Self) {
    
    inline def setAuthorizedUrl(value: AuthorizedUrl): Self = StObject.set(x, "AuthorizedUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedUrlUndefined: Self = StObject.set(x, "AuthorizedUrl", js.undefined)
  }
}
