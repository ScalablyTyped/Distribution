package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationObjectStorageResponse extends StObject {
  
  /**
    * The access key (for example, a user name) required to authenticate with the object storage server.
    */
  var AccessKey: js.UndefOr[ObjectStorageAccessKey] = js.undefined
  
  /**
    * The ARNs of the DataSync agents that can securely connect with your location.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.undefined
  
  /**
    * The time that the location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the object storage system location.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationArn] = js.undefined
  
  /**
    * The URL of the object storage system location.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationUri] = js.undefined
  
  /**
    * The port that your object storage server accepts inbound network traffic on (for example, port 443).
    */
  var ServerPort: js.UndefOr[ObjectStorageServerPort] = js.undefined
  
  /**
    * The protocol that your object storage server uses to communicate.
    */
  var ServerProtocol: js.UndefOr[ObjectStorageServerProtocol] = js.undefined
}
object DescribeLocationObjectStorageResponse {
  
  inline def apply(): DescribeLocationObjectStorageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationObjectStorageResponse]
  }
  
  extension [Self <: DescribeLocationObjectStorageResponse](x: Self) {
    
    inline def setAccessKey(value: ObjectStorageAccessKey): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "AccessKey", js.undefined)
    
    inline def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    inline def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    inline def setServerPort(value: ObjectStorageServerPort): Self = StObject.set(x, "ServerPort", value.asInstanceOf[js.Any])
    
    inline def setServerPortUndefined: Self = StObject.set(x, "ServerPort", js.undefined)
    
    inline def setServerProtocol(value: ObjectStorageServerProtocol): Self = StObject.set(x, "ServerProtocol", value.asInstanceOf[js.Any])
    
    inline def setServerProtocolUndefined: Self = StObject.set(x, "ServerProtocol", js.undefined)
  }
}
