package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSigningProfileResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the signing profile.
    */
  var arn: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * A list of overrides applied by the target signing profile for signing operations.
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined
  
  /**
    * A human-readable name for the signing platform associated with the signing profile.
    */
  var platformDisplayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The ID of the platform that is used by the target signing profile.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  
  /**
    * The name of the target signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.undefined
  
  /**
    * The current version of the signing profile.
    */
  var profileVersion: js.UndefOr[ProfileVersion] = js.undefined
  
  /**
    * The signing profile ARN, including the profile version.
    */
  var profileVersionArn: js.UndefOr[Arn] = js.undefined
  
  var revocationRecord: js.UndefOr[SigningProfileRevocationRecord] = js.undefined
  
  var signatureValidityPeriod: js.UndefOr[SignatureValidityPeriod] = js.undefined
  
  /**
    * The ARN of the certificate that the target profile uses for signing operations.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
  
  /**
    * A map of key-value pairs for signing operations that is attached to the target signing profile.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.undefined
  
  /**
    * The status of the target signing profile.
    */
  var status: js.UndefOr[SigningProfileStatus] = js.undefined
  
  /**
    * Reason for the status of the target signing profile.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * A list of tags associated with the signing profile.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object GetSigningProfileResponse {
  
  inline def apply(): GetSigningProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSigningProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSigningProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: java.lang.String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setOverrides(value: SigningPlatformOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPlatformDisplayName(value: DisplayName): Self = StObject.set(x, "platformDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPlatformDisplayNameUndefined: Self = StObject.set(x, "platformDisplayName", js.undefined)
    
    inline def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
    inline def setPlatformIdUndefined: Self = StObject.set(x, "platformId", js.undefined)
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    inline def setProfileVersion(value: ProfileVersion): Self = StObject.set(x, "profileVersion", value.asInstanceOf[js.Any])
    
    inline def setProfileVersionArn(value: Arn): Self = StObject.set(x, "profileVersionArn", value.asInstanceOf[js.Any])
    
    inline def setProfileVersionArnUndefined: Self = StObject.set(x, "profileVersionArn", js.undefined)
    
    inline def setProfileVersionUndefined: Self = StObject.set(x, "profileVersion", js.undefined)
    
    inline def setRevocationRecord(value: SigningProfileRevocationRecord): Self = StObject.set(x, "revocationRecord", value.asInstanceOf[js.Any])
    
    inline def setRevocationRecordUndefined: Self = StObject.set(x, "revocationRecord", js.undefined)
    
    inline def setSignatureValidityPeriod(value: SignatureValidityPeriod): Self = StObject.set(x, "signatureValidityPeriod", value.asInstanceOf[js.Any])
    
    inline def setSignatureValidityPeriodUndefined: Self = StObject.set(x, "signatureValidityPeriod", js.undefined)
    
    inline def setSigningMaterial(value: SigningMaterial): Self = StObject.set(x, "signingMaterial", value.asInstanceOf[js.Any])
    
    inline def setSigningMaterialUndefined: Self = StObject.set(x, "signingMaterial", js.undefined)
    
    inline def setSigningParameters(value: SigningParameters): Self = StObject.set(x, "signingParameters", value.asInstanceOf[js.Any])
    
    inline def setSigningParametersUndefined: Self = StObject.set(x, "signingParameters", js.undefined)
    
    inline def setStatus(value: SigningProfileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
