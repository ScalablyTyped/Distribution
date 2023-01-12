package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesRequest extends StObject {
  
  /**
    * A valid access token that Amazon Cognito issued to the user whose list of devices you want to view.
    */
  var AccessToken: TokenModelType
  
  /**
    * The limit of the device request.
    */
  var Limit: js.UndefOr[QueryLimitType] = js.undefined
  
  /**
    * The pagination token for the list request.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
}
object ListDevicesRequest {
  
  inline def apply(AccessToken: TokenModelType): ListDevicesRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDevicesRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: QueryLimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setPaginationToken(value: SearchPaginationTokenType): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
  }
}
