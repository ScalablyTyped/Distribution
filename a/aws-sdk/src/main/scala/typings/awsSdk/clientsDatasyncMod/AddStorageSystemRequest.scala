package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddStorageSystemRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from your on-premises storage system's management interface.
    */
  var AgentArns: DiscoveryAgentArnList
  
  /**
    * Specifies a client token to make sure requests with this API operation are idempotent. If you don't specify a client token, DataSync generates one for you automatically.
    */
  var ClientToken: PtolemyUUID
  
  /**
    * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
    */
  var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
  
  /**
    * Specifies the user name and password for accessing your on-premises storage system's management interface.
    */
  var Credentials: typings.awsSdk.clientsDatasyncMod.Credentials
  
  /**
    * Specifies a familiar name for your on-premises storage system.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsDatasyncMod.Name] = js.undefined
  
  /**
    * Specifies the server name and network port required to connect with the management interface of your on-premises storage system.
    */
  var ServerConfiguration: DiscoveryServerConfiguration
  
  /**
    * Specifies the type of on-premises storage system that you want DataSync Discovery to collect information about.  DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems running ONTAP 9.7 or later. 
    */
  var SystemType: DiscoverySystemType
  
  /**
    * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We recommend creating at least a name tag for your on-premises storage system.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
}
object AddStorageSystemRequest {
  
  inline def apply(
    AgentArns: DiscoveryAgentArnList,
    ClientToken: PtolemyUUID,
    Credentials: Credentials,
    ServerConfiguration: DiscoveryServerConfiguration,
    SystemType: DiscoverySystemType
  ): AddStorageSystemRequest = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], Credentials = Credentials.asInstanceOf[js.Any], ServerConfiguration = ServerConfiguration.asInstanceOf[js.Any], SystemType = SystemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddStorageSystemRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddStorageSystemRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentArns(value: DiscoveryAgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setClientToken(value: PtolemyUUID): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArn(value: LogGroupArn): Self = StObject.set(x, "CloudWatchLogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupArnUndefined: Self = StObject.set(x, "CloudWatchLogGroupArn", js.undefined)
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setServerConfiguration(value: DiscoveryServerConfiguration): Self = StObject.set(x, "ServerConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSystemType(value: DiscoverySystemType): Self = StObject.set(x, "SystemType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
