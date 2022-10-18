package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateEncryptionConfigRequest extends StObject {
  
  /**
    * The client request token you are using with the encryption configuration.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cluster that you are associating with encryption configuration.
    */
  var clusterName: String
  
  /**
    * The configuration you are using for encryption.
    */
  var encryptionConfig: EncryptionConfigList
}
object AssociateEncryptionConfigRequest {
  
  inline def apply(clusterName: String, encryptionConfig: EncryptionConfigList): AssociateEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], encryptionConfig = encryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateEncryptionConfigRequest]
  }
  
  extension [Self <: AssociateEncryptionConfigRequest](x: Self) {
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfig(value: EncryptionConfigList): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigVarargs(value: EncryptionConfig*): Self = StObject.set(x, "encryptionConfig", js.Array(value*))
  }
}
