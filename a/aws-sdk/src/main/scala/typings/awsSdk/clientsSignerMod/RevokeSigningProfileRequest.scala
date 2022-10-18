package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeSigningProfileRequest extends StObject {
  
  /**
    * A timestamp for when revocation of a Signing Profile should become effective. Signatures generated using the signing profile after this timestamp are not trusted.
    */
  var effectiveTime: js.Date
  
  /**
    * The name of the signing profile to be revoked.
    */
  var profileName: ProfileName
  
  /**
    * The version of the signing profile to be revoked.
    */
  var profileVersion: ProfileVersion
  
  /**
    * The reason for revoking a signing profile.
    */
  var reason: RevocationReasonString
}
object RevokeSigningProfileRequest {
  
  inline def apply(
    effectiveTime: js.Date,
    profileName: ProfileName,
    profileVersion: ProfileVersion,
    reason: RevocationReasonString
  ): RevokeSigningProfileRequest = {
    val __obj = js.Dynamic.literal(effectiveTime = effectiveTime.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any], profileVersion = profileVersion.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSigningProfileRequest]
  }
  
  extension [Self <: RevokeSigningProfileRequest](x: Self) {
    
    inline def setEffectiveTime(value: js.Date): Self = StObject.set(x, "effectiveTime", value.asInstanceOf[js.Any])
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileVersion(value: ProfileVersion): Self = StObject.set(x, "profileVersion", value.asInstanceOf[js.Any])
    
    inline def setReason(value: RevocationReasonString): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
