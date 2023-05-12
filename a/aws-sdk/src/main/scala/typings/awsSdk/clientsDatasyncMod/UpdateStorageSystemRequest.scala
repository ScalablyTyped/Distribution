package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStorageSystemRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads your on-premises storage system.
    */
  var AgentArns: js.UndefOr[DiscoveryAgentArnList] = js.undefined
  
  /**
    * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
  
  /**
    * Specifies the user name and password for accessing your on-premises storage system's management interface.
    */
  var Credentials: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Credentials] = js.undefined
  
  /**
    * Specifies a familiar name for your on-premises storage system.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Name] = js.undefined
  
  /**
    * Specifies the server name and network port required to connect with your on-premises storage system's management interface.
    */
  var ServerConfiguration: js.UndefOr[DiscoveryServerConfiguration] = js.undefined
  
  /**
    * Specifies the ARN of the on-premises storage system that you want reconfigure.
    */
  var StorageSystemArn: typings.awsSdk.clientsDatasyncMod.StorageSystemArn
}
object UpdateStorageSystemRequest {
  
  inline def apply(StorageSystemArn: StorageSystemArn): UpdateStorageSystemRequest = {
    val __obj = js.Dynamic.literal(StorageSystemArn = StorageSystemArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStorageSystemRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStorageSystemRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentArns(value: DiscoveryAgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setCloudWatchLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setServerConfiguration(value: DiscoveryServerConfiguration): Self = StObject.set(x, "ServerConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerConfigurationUndefined: Self = StObject.set(x, "ServerConfiguration", js.undefined)
    
    inline def setStorageSystemArn(value: StorageSystemArn): Self = StObject.set(x, "StorageSystemArn", value.asInstanceOf[js.Any])
  }
}
