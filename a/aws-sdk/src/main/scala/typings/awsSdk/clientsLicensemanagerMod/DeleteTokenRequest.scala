package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTokenRequest extends StObject {
  
  /**
    * Token ID.
    */
  var TokenId: String
}
object DeleteTokenRequest {
  
  inline def apply(TokenId: String): DeleteTokenRequest = {
    val __obj = js.Dynamic.literal(TokenId = TokenId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTokenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTokenRequest] (val x: Self) extends AnyVal {
    
    inline def setTokenId(value: String): Self = StObject.set(x, "TokenId", value.asInstanceOf[js.Any])
  }
}
