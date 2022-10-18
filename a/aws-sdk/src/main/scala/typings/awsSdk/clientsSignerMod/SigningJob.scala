package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningJob extends StObject {
  
  /**
    * The date and time that the signing job was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the signing job is revoked.
    */
  var isRevoked: js.UndefOr[bool] = js.undefined
  
  /**
    * The ID of the signing job.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  
  /**
    * The AWS account ID of the job invoker.
    */
  var jobInvoker: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The AWS account ID of the job owner.
    */
  var jobOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The name of a signing platform.
    */
  var platformDisplayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The unique identifier for a signing platform.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  
  /**
    * The name of the signing profile that created a signing job.
    */
  var profileName: js.UndefOr[ProfileName] = js.undefined
  
  /**
    * The version of the signing profile that created a signing job.
    */
  var profileVersion: js.UndefOr[ProfileVersion] = js.undefined
  
  /**
    * The time when the signature of a signing job expires.
    */
  var signatureExpiresAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A SignedObject structure that contains information about a signing job's signed code image.
    */
  var signedObject: js.UndefOr[SignedObject] = js.undefined
  
  /**
    * A SigningMaterial object that contains the Amazon Resource Name (ARN) of the certificate used for the signing job.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
  
  /**
    * A Source that contains information about a signing job's code image source.
    */
  var source: js.UndefOr[Source] = js.undefined
  
  /**
    * The status of the signing job.
    */
  var status: js.UndefOr[SigningStatus] = js.undefined
}
object SigningJob {
  
  inline def apply(): SigningJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningJob]
  }
  
  extension [Self <: SigningJob](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setIsRevoked(value: bool): Self = StObject.set(x, "isRevoked", value.asInstanceOf[js.Any])
    
    inline def setIsRevokedUndefined: Self = StObject.set(x, "isRevoked", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setJobInvoker(value: AccountId): Self = StObject.set(x, "jobInvoker", value.asInstanceOf[js.Any])
    
    inline def setJobInvokerUndefined: Self = StObject.set(x, "jobInvoker", js.undefined)
    
    inline def setJobOwner(value: AccountId): Self = StObject.set(x, "jobOwner", value.asInstanceOf[js.Any])
    
    inline def setJobOwnerUndefined: Self = StObject.set(x, "jobOwner", js.undefined)
    
    inline def setPlatformDisplayName(value: DisplayName): Self = StObject.set(x, "platformDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPlatformDisplayNameUndefined: Self = StObject.set(x, "platformDisplayName", js.undefined)
    
    inline def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
    inline def setPlatformIdUndefined: Self = StObject.set(x, "platformId", js.undefined)
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    inline def setProfileVersion(value: ProfileVersion): Self = StObject.set(x, "profileVersion", value.asInstanceOf[js.Any])
    
    inline def setProfileVersionUndefined: Self = StObject.set(x, "profileVersion", js.undefined)
    
    inline def setSignatureExpiresAt(value: js.Date): Self = StObject.set(x, "signatureExpiresAt", value.asInstanceOf[js.Any])
    
    inline def setSignatureExpiresAtUndefined: Self = StObject.set(x, "signatureExpiresAt", js.undefined)
    
    inline def setSignedObject(value: SignedObject): Self = StObject.set(x, "signedObject", value.asInstanceOf[js.Any])
    
    inline def setSignedObjectUndefined: Self = StObject.set(x, "signedObject", js.undefined)
    
    inline def setSigningMaterial(value: SigningMaterial): Self = StObject.set(x, "signingMaterial", value.asInstanceOf[js.Any])
    
    inline def setSigningMaterialUndefined: Self = StObject.set(x, "signingMaterial", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: SigningStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
