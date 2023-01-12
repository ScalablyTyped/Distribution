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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationPresignedUrlResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthorizedUrl(value: AuthorizedUrl): Self = StObject.set(x, "AuthorizedUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedUrlUndefined: Self = StObject.set(x, "AuthorizedUrl", js.undefined)
  }
}
