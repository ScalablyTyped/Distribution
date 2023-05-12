package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStorageSystemResponse extends StObject {
  
  /**
    * The ARN of the DataSync agent that connects to and reads from your on-premises storage system.
    */
  var AgentArns: js.UndefOr[DiscoveryAgentArnList] = js.undefined
  
  /**
    * The ARN of the Amazon CloudWatch log group that's used to monitor and log discovery job events.
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
  
  /**
    * Indicates whether your DataSync agent can connect to your on-premises storage system.
    */
  var ConnectivityStatus: js.UndefOr[StorageSystemConnectivityStatus] = js.undefined
  
  /**
    * The time when you added the on-premises storage system to DataSync Discovery.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Describes the connectivity error that the DataSync agent is encountering with your on-premises storage system.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsDatasyncMod.ErrorMessage] = js.undefined
  
  /**
    * The name that you gave your on-premises storage system when adding it to DataSync Discovery.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Name] = js.undefined
  
  /**
    * The ARN of the secret that stores your on-premises storage system's credentials. DataSync Discovery stores these credentials in Secrets Manager.
    */
  var SecretsManagerArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.SecretsManagerArn] = js.undefined
  
  /**
    * The server name and network port required to connect with your on-premises storage system's management interface.
    */
  var ServerConfiguration: js.UndefOr[DiscoveryServerConfiguration] = js.undefined
  
  /**
    * The ARN of the on-premises storage system that the discovery job looked at.
    */
  var StorageSystemArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.StorageSystemArn] = js.undefined
  
  /**
    * The type of on-premises storage system.  DataSync Discovery currently only supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems running ONTAP 9.7 or later.  
    */
  var SystemType: js.UndefOr[DiscoverySystemType] = js.undefined
}
object DescribeStorageSystemResponse {
  
  inline def apply(): DescribeStorageSystemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStorageSystemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStorageSystemResponse] (val x: Self) extends AnyVal {
    
    inline def setAgentArns(value: DiscoveryAgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setCloudWatchLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    inline def setConnectivityStatus(value: StorageSystemConnectivityStatus): Self = StObject.set(x, "ConnectivityStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectivityStatusUndefined: Self = StObject.set(x, "ConnectivityStatus", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSecretsManagerArn(value: SecretsManagerArn): Self = StObject.set(x, "SecretsManagerArn", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerArnUndefined: Self = StObject.set(x, "SecretsManagerArn", js.undefined)
    
    inline def setServerConfiguration(value: DiscoveryServerConfiguration): Self = StObject.set(x, "ServerConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerConfigurationUndefined: Self = StObject.set(x, "ServerConfiguration", js.undefined)
    
    inline def setStorageSystemArn(value: StorageSystemArn): Self = StObject.set(x, "StorageSystemArn", value.asInstanceOf[js.Any])
    
    inline def setStorageSystemArnUndefined: Self = StObject.set(x, "StorageSystemArn", js.undefined)
    
    inline def setSystemType(value: DiscoverySystemType): Self = StObject.set(x, "SystemType", value.asInstanceOf[js.Any])
    
    inline def setSystemTypeUndefined: Self = StObject.set(x, "SystemType", js.undefined)
  }
}
