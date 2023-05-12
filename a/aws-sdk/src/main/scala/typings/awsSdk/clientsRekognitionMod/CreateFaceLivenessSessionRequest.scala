package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFaceLivenessSessionRequest extends StObject {
  
  /**
    * Idempotent token is used to recognize the Face Liveness request. If the same token is used with multiple CreateFaceLivenessSession requests, the same session is returned. This token is employed to avoid unintentionally creating the same session multiple times.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ClientRequestToken] = js.undefined
  
  /**
    *  The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt audit images and reference images.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.KmsKeyId] = js.undefined
  
  /**
    * A session settings object. It contains settings for the operation to be performed. For Face Liveness, it accepts OutputConfig and AuditImagesLimit.
    */
  var Settings: js.UndefOr[CreateFaceLivenessSessionRequestSettings] = js.undefined
}
object CreateFaceLivenessSessionRequest {
  
  inline def apply(): CreateFaceLivenessSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFaceLivenessSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFaceLivenessSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setSettings(value: CreateFaceLivenessSessionRequestSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
  }
}
