package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePresignedDomainUrlRequest extends StObject {
  
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.clientsSagemakerMod.DomainId
  
  /**
    * The number of seconds until the pre-signed URL expires. This value defaults to 300.
    */
  var ExpiresInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExpiresInSeconds] = js.undefined
  
  /**
    * The session expiration duration in seconds. This value defaults to 43200.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SessionExpirationDurationInSeconds] = js.undefined
  
  /**
    * The name of the UserProfile to sign-in as.
    */
  var UserProfileName: typings.awsSdk.clientsSagemakerMod.UserProfileName
}
object CreatePresignedDomainUrlRequest {
  
  inline def apply(DomainId: DomainId, UserProfileName: UserProfileName): CreatePresignedDomainUrlRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedDomainUrlRequest]
  }
  
  extension [Self <: CreatePresignedDomainUrlRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setExpiresInSeconds(value: ExpiresInSeconds): Self = StObject.set(x, "ExpiresInSeconds", value.asInstanceOf[js.Any])
    
    inline def setExpiresInSecondsUndefined: Self = StObject.set(x, "ExpiresInSeconds", js.undefined)
    
    inline def setSessionExpirationDurationInSeconds(value: SessionExpirationDurationInSeconds): Self = StObject.set(x, "SessionExpirationDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setSessionExpirationDurationInSecondsUndefined: Self = StObject.set(x, "SessionExpirationDurationInSeconds", js.undefined)
    
    inline def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
  }
}
