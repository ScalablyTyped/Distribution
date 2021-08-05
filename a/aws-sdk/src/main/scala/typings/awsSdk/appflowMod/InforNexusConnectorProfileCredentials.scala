package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InforNexusConnectorProfileCredentials extends StObject {
  
  /**
    *  The Access Key portion of the credentials. 
    */
  var accessKeyId: AccessKeyId
  
  /**
    *  The encryption keys used to encrypt data. 
    */
  var datakey: Key
  
  /**
    *  The secret key used to sign requests. 
    */
  var secretAccessKey: Key
  
  /**
    *  The identifier for the user. 
    */
  var userId: Username
}
object InforNexusConnectorProfileCredentials {
  
  inline def apply(accessKeyId: AccessKeyId, datakey: Key, secretAccessKey: Key, userId: Username): InforNexusConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], datakey = datakey.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InforNexusConnectorProfileCredentials]
  }
  
  extension [Self <: InforNexusConnectorProfileCredentials](x: Self) {
    
    inline def setAccessKeyId(value: AccessKeyId): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setDatakey(value: Key): Self = StObject.set(x, "datakey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKey(value: Key): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: Username): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
