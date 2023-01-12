package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceInformation extends StObject {
  
  /**
    * The activation ID created by Amazon Web Services Systems Manager when the server or virtual machine (VM) was registered.
    */
  var ActivationId: js.UndefOr[typings.awsSdk.clientsSsmMod.ActivationId] = js.undefined
  
  /**
    * The version of SSM Agent running on your Linux managed node. 
    */
  var AgentVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * Information about the association.
    */
  var AssociationOverview: js.UndefOr[InstanceAggregatedAssociationOverview] = js.undefined
  
  /**
    * The status of the association.
    */
  var AssociationStatus: js.UndefOr[StatusName] = js.undefined
  
  /**
    * The fully qualified host name of the managed node.
    */
  var ComputerName: js.UndefOr[typings.awsSdk.clientsSsmMod.ComputerName] = js.undefined
  
  /**
    * The IP address of the managed node.
    */
  var IPAddress: js.UndefOr[typings.awsSdk.clientsSsmMod.IPAddress] = js.undefined
  
  /**
    * The Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed node. This call doesn't return the IAM role for Amazon Elastic Compute Cloud (Amazon EC2) instances. To retrieve the IAM role for an EC2 instance, use the Amazon EC2 DescribeInstances operation. For information, see DescribeInstances in the Amazon EC2 API Reference or describe-instances in the Amazon Web Services CLI Command Reference.
    */
  var IamRole: js.UndefOr[typings.awsSdk.clientsSsmMod.IamRole] = js.undefined
  
  /**
    * The managed node ID. 
    */
  var InstanceId: js.UndefOr[typings.awsSdk.clientsSsmMod.InstanceId] = js.undefined
  
  /**
    * Indicates whether the latest version of SSM Agent is running on your Linux managed node. This field doesn't indicate whether or not the latest version is installed on Windows managed nodes, because some older versions of Windows Server use the EC2Config service to process Systems Manager requests.
    */
  var IsLatestVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date the association was last run.
    */
  var LastAssociationExecutionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the agent last pinged the Systems Manager service. 
    */
  var LastPingDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last date the association was successfully run.
    */
  var LastSuccessfulAssociationExecutionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name assigned to an on-premises server, edge device, or virtual machine (VM) when it is activated as a Systems Manager managed node. The name is specified as the DefaultInstanceName property using the CreateActivation command. It is applied to the managed node by specifying the Activation Code and Activation ID when you install SSM Agent on the node, as explained in Install SSM Agent for a hybrid environment (Linux) and Install SSM Agent for a hybrid environment (Windows). To retrieve the Name tag of an EC2 instance, use the Amazon EC2 DescribeInstances operation. For information, see DescribeInstances in the Amazon EC2 API Reference or describe-instances in the Amazon Web Services CLI Command Reference.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Connection status of SSM Agent.   The status Inactive has been deprecated and is no longer in use. 
    */
  var PingStatus: js.UndefOr[typings.awsSdk.clientsSsmMod.PingStatus] = js.undefined
  
  /**
    * The name of the operating system platform running on your managed node. 
    */
  var PlatformName: js.UndefOr[String] = js.undefined
  
  /**
    * The operating system platform type. 
    */
  var PlatformType: js.UndefOr[typings.awsSdk.clientsSsmMod.PlatformType] = js.undefined
  
  /**
    * The version of the OS platform running on your managed node. 
    */
  var PlatformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The date the server or VM was registered with Amazon Web Services as a managed node.
    */
  var RegistrationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of instance. Instances are either EC2 instances or managed instances. 
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsSsmMod.ResourceType] = js.undefined
  
  /**
    * The ID of the source resource. For IoT Greengrass devices, SourceId is the Thing name. 
    */
  var SourceId: js.UndefOr[typings.awsSdk.clientsSsmMod.SourceId] = js.undefined
  
  /**
    * The type of the source resource. For IoT Greengrass devices, SourceType is AWS::IoT::Thing. 
    */
  var SourceType: js.UndefOr[typings.awsSdk.clientsSsmMod.SourceType] = js.undefined
}
object InstanceInformation {
  
  inline def apply(): InstanceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceInformation] (val x: Self) extends AnyVal {
    
    inline def setActivationId(value: ActivationId): Self = StObject.set(x, "ActivationId", value.asInstanceOf[js.Any])
    
    inline def setActivationIdUndefined: Self = StObject.set(x, "ActivationId", js.undefined)
    
    inline def setAgentVersion(value: Version): Self = StObject.set(x, "AgentVersion", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionUndefined: Self = StObject.set(x, "AgentVersion", js.undefined)
    
    inline def setAssociationOverview(value: InstanceAggregatedAssociationOverview): Self = StObject.set(x, "AssociationOverview", value.asInstanceOf[js.Any])
    
    inline def setAssociationOverviewUndefined: Self = StObject.set(x, "AssociationOverview", js.undefined)
    
    inline def setAssociationStatus(value: StatusName): Self = StObject.set(x, "AssociationStatus", value.asInstanceOf[js.Any])
    
    inline def setAssociationStatusUndefined: Self = StObject.set(x, "AssociationStatus", js.undefined)
    
    inline def setComputerName(value: ComputerName): Self = StObject.set(x, "ComputerName", value.asInstanceOf[js.Any])
    
    inline def setComputerNameUndefined: Self = StObject.set(x, "ComputerName", js.undefined)
    
    inline def setIPAddress(value: IPAddress): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    inline def setIPAddressUndefined: Self = StObject.set(x, "IPAddress", js.undefined)
    
    inline def setIamRole(value: IamRole): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    inline def setIamRoleUndefined: Self = StObject.set(x, "IamRole", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setIsLatestVersion(value: Boolean): Self = StObject.set(x, "IsLatestVersion", value.asInstanceOf[js.Any])
    
    inline def setIsLatestVersionUndefined: Self = StObject.set(x, "IsLatestVersion", js.undefined)
    
    inline def setLastAssociationExecutionDate(value: js.Date): Self = StObject.set(x, "LastAssociationExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setLastAssociationExecutionDateUndefined: Self = StObject.set(x, "LastAssociationExecutionDate", js.undefined)
    
    inline def setLastPingDateTime(value: js.Date): Self = StObject.set(x, "LastPingDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastPingDateTimeUndefined: Self = StObject.set(x, "LastPingDateTime", js.undefined)
    
    inline def setLastSuccessfulAssociationExecutionDate(value: js.Date): Self = StObject.set(x, "LastSuccessfulAssociationExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulAssociationExecutionDateUndefined: Self = StObject.set(x, "LastSuccessfulAssociationExecutionDate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPingStatus(value: PingStatus): Self = StObject.set(x, "PingStatus", value.asInstanceOf[js.Any])
    
    inline def setPingStatusUndefined: Self = StObject.set(x, "PingStatus", js.undefined)
    
    inline def setPlatformName(value: String): Self = StObject.set(x, "PlatformName", value.asInstanceOf[js.Any])
    
    inline def setPlatformNameUndefined: Self = StObject.set(x, "PlatformName", js.undefined)
    
    inline def setPlatformType(value: PlatformType): Self = StObject.set(x, "PlatformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "PlatformType", js.undefined)
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
    
    inline def setRegistrationDate(value: js.Date): Self = StObject.set(x, "RegistrationDate", value.asInstanceOf[js.Any])
    
    inline def setRegistrationDateUndefined: Self = StObject.set(x, "RegistrationDate", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSourceId(value: SourceId): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
