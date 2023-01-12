package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationObjectStorageRequest extends StObject {
  
  /**
    * Specifies the access key (for example, a user name) if credentials are required to authenticate with the object storage server.
    */
  var AccessKey: js.UndefOr[ObjectStorageAccessKey] = js.undefined
  
  /**
    * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect with your location.
    */
  var AgentArns: AgentArnList
  
  /**
    * Specifies the name of the object storage bucket involved in the transfer.
    */
  var BucketName: ObjectStorageBucketName
  
  /**
    * Specifies the secret key (for example, a password) if credentials are required to authenticate with the object storage server.
    */
  var SecretKey: js.UndefOr[ObjectStorageSecretKey] = js.undefined
  
  /**
    * Specifies a certificate to authenticate with an object storage system that uses a private or self-signed certificate authority (CA). You must specify a Base64-encoded .pem file (for example, file:///home/user/.ssh/storage_sys_certificate.pem). The certificate can be up to 32768 bytes (before Base64 encoding). To use this parameter, configure ServerProtocol to HTTPS.
    */
  var ServerCertificate: js.UndefOr[ObjectStorageCertificate] = js.undefined
  
  /**
    * Specifies the domain name or IP address of the object storage server. A DataSync agent uses this hostname to mount the object storage server in a network.
    */
  var ServerHostname: typings.awsSdk.clientsDatasyncMod.ServerHostname
  
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
  
  /**
    * Specifies the key-value pair that represents a tag that you want to add to the resource. Tags can help you manage, filter, and search for your resources. We recommend creating a name tag for your location.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
}
object CreateLocationObjectStorageRequest {
  
  inline def apply(AgentArns: AgentArnList, BucketName: ObjectStorageBucketName, ServerHostname: ServerHostname): CreateLocationObjectStorageRequest = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns.asInstanceOf[js.Any], BucketName = BucketName.asInstanceOf[js.Any], ServerHostname = ServerHostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationObjectStorageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocationObjectStorageRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessKey(value: ObjectStorageAccessKey): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "AccessKey", js.undefined)
    
    inline def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setBucketName(value: ObjectStorageBucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setSecretKey(value: ObjectStorageSecretKey): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyUndefined: Self = StObject.set(x, "SecretKey", js.undefined)
    
    inline def setServerCertificate(value: ObjectStorageCertificate): Self = StObject.set(x, "ServerCertificate", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateUndefined: Self = StObject.set(x, "ServerCertificate", js.undefined)
    
    inline def setServerHostname(value: ServerHostname): Self = StObject.set(x, "ServerHostname", value.asInstanceOf[js.Any])
    
    inline def setServerPort(value: ObjectStorageServerPort): Self = StObject.set(x, "ServerPort", value.asInstanceOf[js.Any])
    
    inline def setServerPortUndefined: Self = StObject.set(x, "ServerPort", js.undefined)
    
    inline def setServerProtocol(value: ObjectStorageServerProtocol): Self = StObject.set(x, "ServerProtocol", value.asInstanceOf[js.Any])
    
    inline def setServerProtocolUndefined: Self = StObject.set(x, "ServerProtocol", js.undefined)
    
    inline def setSubdirectory(value: S3Subdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
