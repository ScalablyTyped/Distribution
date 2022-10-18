package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLocationObjectStorageRequest extends StObject {
  
  /**
    * Optional. The access key is used if credentials are required to access the self-managed object storage server. If your object storage requires a user name and password to authenticate, use AccessKey and SecretKey to provide the user name and password, respectively.
    */
  var AccessKey: js.UndefOr[ObjectStorageAccessKey] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the self-managed object storage server location to be updated.
    */
  var LocationArn: typings.awsSdk.clientsDatasyncMod.LocationArn
  
  /**
    * Optional. The secret key is used if credentials are required to access the self-managed object storage server. If your object storage requires a user name and password to authenticate, use AccessKey and SecretKey to provide the user name and password, respectively.
    */
  var SecretKey: js.UndefOr[ObjectStorageSecretKey] = js.undefined
  
  /**
    * The port that your self-managed object storage server accepts inbound network traffic on. The server port is set by default to TCP 80 (HTTP) or TCP 443 (HTTPS). You can specify a custom port if your self-managed object storage server requires one.
    */
  var ServerPort: js.UndefOr[ObjectStorageServerPort] = js.undefined
  
  /**
    * The protocol that the object storage server uses to communicate. Valid values are HTTP or HTTPS.
    */
  var ServerProtocol: js.UndefOr[ObjectStorageServerProtocol] = js.undefined
  
  /**
    * The subdirectory in the self-managed object storage server that is used to read data from.
    */
  var Subdirectory: js.UndefOr[S3Subdirectory] = js.undefined
}
object UpdateLocationObjectStorageRequest {
  
  inline def apply(LocationArn: LocationArn): UpdateLocationObjectStorageRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLocationObjectStorageRequest]
  }
  
  extension [Self <: UpdateLocationObjectStorageRequest](x: Self) {
    
    inline def setAccessKey(value: ObjectStorageAccessKey): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "AccessKey", js.undefined)
    
    inline def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setSecretKey(value: ObjectStorageSecretKey): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyUndefined: Self = StObject.set(x, "SecretKey", js.undefined)
    
    inline def setServerPort(value: ObjectStorageServerPort): Self = StObject.set(x, "ServerPort", value.asInstanceOf[js.Any])
    
    inline def setServerPortUndefined: Self = StObject.set(x, "ServerPort", js.undefined)
    
    inline def setServerProtocol(value: ObjectStorageServerProtocol): Self = StObject.set(x, "ServerProtocol", value.asInstanceOf[js.Any])
    
    inline def setServerProtocolUndefined: Self = StObject.set(x, "ServerProtocol", js.undefined)
    
    inline def setSubdirectory(value: S3Subdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
  }
}
