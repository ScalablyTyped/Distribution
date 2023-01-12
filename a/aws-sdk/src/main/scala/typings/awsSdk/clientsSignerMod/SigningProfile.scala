package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningProfile extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the signing profile.
    */
  var arn: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The name of the signing platform.
    */
  var platformDisplayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The ID of a platform that is available for use by a signing profile.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  
  /**
    * The name of the signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.undefined
  
  /**
    * The version of a signing profile.
    */
  var profileVersion: js.UndefOr[ProfileVersion] = js.undefined
  
  /**
    * The ARN of a signing profile, including the profile version.
    */
  var profileVersionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The validity period for a signing job created using this signing profile.
    */
  var signatureValidityPeriod: js.UndefOr[SignatureValidityPeriod] = js.undefined
  
  /**
    * The ACM certificate that is available for use by a signing profile.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
  
  /**
    * The parameters that are available for use by a code signing user.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.undefined
  
  /**
    * The status of a code signing profile.
    */
  var status: js.UndefOr[SigningProfileStatus] = js.undefined
  
  /**
    * A list of tags associated with the signing profile.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object SigningProfile {
  
  inline def apply(): SigningProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SigningProfile] (val x: Self) extends AnyVal {
    
    inline def setArn(value: java.lang.String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
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
    
    inline def setSignatureValidityPeriod(value: SignatureValidityPeriod): Self = StObject.set(x, "signatureValidityPeriod", value.asInstanceOf[js.Any])
    
    inline def setSignatureValidityPeriodUndefined: Self = StObject.set(x, "signatureValidityPeriod", js.undefined)
    
    inline def setSigningMaterial(value: SigningMaterial): Self = StObject.set(x, "signingMaterial", value.asInstanceOf[js.Any])
    
    inline def setSigningMaterialUndefined: Self = StObject.set(x, "signingMaterial", js.undefined)
    
    inline def setSigningParameters(value: SigningParameters): Self = StObject.set(x, "signingParameters", value.asInstanceOf[js.Any])
    
    inline def setSigningParametersUndefined: Self = StObject.set(x, "signingParameters", js.undefined)
    
    inline def setStatus(value: SigningProfileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
