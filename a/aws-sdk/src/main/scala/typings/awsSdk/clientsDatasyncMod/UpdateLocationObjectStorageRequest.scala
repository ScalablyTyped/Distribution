package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLocationObjectStorageRequest extends StObject {
  
  /**
    * Specifies the access key (for example, a user name) if credentials are required to authenticate with the object storage server.
    */
  var AccessKey: js.UndefOr[ObjectStorageAccessKey] = js.undefined
  
  /**
    * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect with your location.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.undefined
  
  /**
    * Specifies the ARN of the object storage system location that you're updating.
    */
  var LocationArn: typings.awsSdk.clientsDatasyncMod.LocationArn
  
  /**
    * Specifies the secret key (for example, a password) if credentials are required to authenticate with the object storage server.
    */
  var SecretKey: js.UndefOr[ObjectStorageSecretKey] = js.undefined
  
  /**
    * Specifies a certificate to authenticate with an object storage system that uses a private or self-signed certificate authority (CA). You must specify a Base64-encoded .pem file (for example, file:///home/user/.ssh/storage_sys_certificate.pem). The certificate can be up to 32768 bytes (before Base64 encoding). To use this parameter, configure ServerProtocol to HTTPS. Updating the certificate doesn't interfere with tasks that you have in progress.
    */
  var ServerCertificate: js.UndefOr[ObjectStorageCertificate] = js.undefined
  
  /**
    * Specifies the port that your object storage server accepts inbound network traffic on (for example, port 443).
    */
  var ServerPort: js.UndefOr[ObjectStorageServerPort] = js.undefined
  
  /**
    * Specifies the protocol that your object storage server uses to communicate.
    */
  var ServerProtocol: js.UndefOr[ObjectStorageServerProtocol] = js.undefined
  
  /**
    * Specifies the object prefix for your object storage server. If this is a source location, DataSync only copies objects with this prefix. If this is a destination location, DataSync writes all objects with this prefix.
    */
  var Subdirectory: js.UndefOr[S3Subdirectory] = js.undefined
}
object UpdateLocationObjectStorageRequest {
  
  inline def apply(LocationArn: LocationArn): UpdateLocationObjectStorageRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLocationObjectStorageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLocationObjectStorageRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessKey(value: ObjectStorageAccessKey): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "AccessKey", js.undefined)
    
    inline def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setSecretKey(value: ObjectStorageSecretKey): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyUndefined: Self = StObject.set(x, "SecretKey", js.undefined)
    
    inline def setServerCertificate(value: ObjectStorageCertificate): Self = StObject.set(x, "ServerCertificate", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateUndefined: Self = StObject.set(x, "ServerCertificate", js.undefined)
    
    inline def setServerPort(value: ObjectStorageServerPort): Self = StObject.set(x, "ServerPort", value.asInstanceOf[js.Any])
    
    inline def setServerPortUndefined: Self = StObject.set(x, "ServerPort", js.undefined)
    
    inline def setServerProtocol(value: ObjectStorageServerProtocol): Self = StObject.set(x, "ServerProtocol", value.asInstanceOf[js.Any])
    
    inline def setServerProtocolUndefined: Self = StObject.set(x, "ServerProtocol", js.undefined)
    
    inline def setSubdirectory(value: S3Subdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
  }
}
