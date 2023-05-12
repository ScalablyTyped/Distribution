package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessTokenRequest extends StObject {
  
  /**
    * The ID of the personal access token to delete. You can find the IDs of all PATs associated with your Amazon Web Services Builder ID in a space by calling ListAccessTokens.
    */
  var id: AccessTokenId
}
object DeleteAccessTokenRequest {
  
  inline def apply(id: AccessTokenId): DeleteAccessTokenRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessTokenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAccessTokenRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: AccessTokenId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
