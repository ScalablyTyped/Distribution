package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecretVersionStageRequest extends StObject {
  
  /**
    * The ID of the version to add the staging label to. To remove a label from a version, then do not specify this parameter. If the staging label is already attached to a different version of the secret, then you must also specify the RemoveFromVersionId parameter. 
    */
  var MoveToVersionId: js.UndefOr[SecretVersionIdType] = js.undefined
  
  /**
    * The ID of the version that the staging label is to be removed from. If the staging label you are trying to attach to one version is already attached to a different version, then you must include this parameter and specify the version that the label is to be removed from. If the label is attached and you either do not specify this parameter, or the version ID does not match, then the operation fails.
    */
  var RemoveFromVersionId: js.UndefOr[SecretVersionIdType] = js.undefined
  
  /**
    * The ARN or the name of the secret with the version and staging labelsto modify. For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See Finding a secret from a partial ARN.
    */
  var SecretId: SecretIdType
  
  /**
    * The staging label to add to this version.
    */
  var VersionStage: SecretVersionStageType
}
object UpdateSecretVersionStageRequest {
  
  inline def apply(SecretId: SecretIdType, VersionStage: SecretVersionStageType): UpdateSecretVersionStageRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId.asInstanceOf[js.Any], VersionStage = VersionStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecretVersionStageRequest]
  }
  
  extension [Self <: UpdateSecretVersionStageRequest](x: Self) {
    
    inline def setMoveToVersionId(value: SecretVersionIdType): Self = StObject.set(x, "MoveToVersionId", value.asInstanceOf[js.Any])
    
    inline def setMoveToVersionIdUndefined: Self = StObject.set(x, "MoveToVersionId", js.undefined)
    
    inline def setRemoveFromVersionId(value: SecretVersionIdType): Self = StObject.set(x, "RemoveFromVersionId", value.asInstanceOf[js.Any])
    
    inline def setRemoveFromVersionIdUndefined: Self = StObject.set(x, "RemoveFromVersionId", js.undefined)
    
    inline def setSecretId(value: SecretIdType): Self = StObject.set(x, "SecretId", value.asInstanceOf[js.Any])
    
    inline def setVersionStage(value: SecretVersionStageType): Self = StObject.set(x, "VersionStage", value.asInstanceOf[js.Any])
  }
}
