package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/directoryservice", "DirectoryService")
@js.native
object DirectoryServiceNs extends js.Object {
  trait AcceptSharedDirectoryRequest extends js.Object {
    /**
      * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account. 
      */
    var SharedDirectoryId: DirectoryId
  }
  
  trait AcceptSharedDirectoryResult extends js.Object {
    /**
      * The shared directory in the directory consumer account.
      */
    var SharedDirectory: js.UndefOr[SharedDirectory] = js.undefined
  }
  
  trait AddIpRoutesRequest extends js.Object {
    /**
      * Identifier (ID) of the directory to which to add the address block.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * IP address blocks, using CIDR format, of the traffic to route. This is often the IP address block of the DNS server used for your on-premises domain.
      */
    var IpRoutes: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.IpRoutes
    /**
      * If set to true, updates the inbound and outbound rules of the security group that has the description: "AWS created security group for directory ID directory controllers." Following are the new rules:  Inbound:   Type: Custom UDP Rule, Protocol: UDP, Range: 88, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 123, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 138, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 389, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 464, Source: 0.0.0.0/0   Type: Custom UDP Rule, Protocol: UDP, Range: 445, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 88, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 135, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 445, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 464, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 636, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 1024-65535, Source: 0.0.0.0/0   Type: Custom TCP Rule, Protocol: TCP, Range: 3268-33269, Source: 0.0.0.0/0   Type: DNS (UDP), Protocol: UDP, Range: 53, Source: 0.0.0.0/0   Type: DNS (TCP), Protocol: TCP, Range: 53, Source: 0.0.0.0/0   Type: LDAP, Protocol: TCP, Range: 389, Source: 0.0.0.0/0   Type: All ICMP, Protocol: All, Range: N/A, Source: 0.0.0.0/0    Outbound:   Type: All traffic, Protocol: All, Range: All, Destination: 0.0.0.0/0   These security rules impact an internal network interface that is not exposed publicly.
      */
    var UpdateSecurityGroupForDirectoryControllers: js.UndefOr[UpdateSecurityGroupForDirectoryControllers] = js.undefined
  }
  
  trait AddIpRoutesResult extends js.Object
  
  trait AddTagsToResourceRequest extends js.Object {
    /**
      * Identifier (ID) for the directory to which to add the tag.
      */
    var ResourceId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ResourceId
    /**
      * The tags to be assigned to the directory.
      */
    var Tags: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.Tags
  }
  
  trait AddTagsToResourceResult extends js.Object
  
  trait Attribute extends js.Object {
    /**
      * The name of the attribute.
      */
    var Name: js.UndefOr[AttributeName] = js.undefined
    /**
      * The value of the attribute.
      */
    var Value: js.UndefOr[AttributeValue] = js.undefined
  }
  
  trait CancelSchemaExtensionRequest extends js.Object {
    /**
      * The identifier of the directory whose schema extension will be canceled.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The identifier of the schema extension that will be canceled.
      */
    var SchemaExtensionId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.SchemaExtensionId
  }
  
  trait CancelSchemaExtensionResult extends js.Object
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Computer extends js.Object {
    /**
      * An array of Attribute objects containing the LDAP attributes that belong to the computer account.
      */
    var ComputerAttributes: js.UndefOr[Attributes] = js.undefined
    /**
      * The identifier of the computer.
      */
    var ComputerId: js.UndefOr[SID] = js.undefined
    /**
      * The computer name.
      */
    var ComputerName: js.UndefOr[ComputerName] = js.undefined
  }
  
  trait ConditionalForwarder extends js.Object {
    /**
      * The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the DNS server that your conditional forwarder points to.
      */
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined
    /**
      * The fully qualified domain name (FQDN) of the remote domains pointed to by the conditional forwarder.
      */
    var RemoteDomainName: js.UndefOr[RemoteDomainName] = js.undefined
    /**
      * The replication scope of the conditional forwarder. The only allowed value is Domain, which will replicate the conditional forwarder to all of the domain controllers for your AWS directory.
      */
    var ReplicationScope: js.UndefOr[ReplicationScope] = js.undefined
  }
  
  trait ConnectDirectoryRequest extends js.Object {
    /**
      * A DirectoryConnectSettings object that contains additional information for the operation.
      */
    var ConnectSettings: DirectoryConnectSettings
    /**
      * A textual description for the directory.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The fully qualified name of the on-premises directory, such as corp.example.com.
      */
    var Name: DirectoryName
    /**
      * The password for the on-premises user account.
      */
    var Password: ConnectPassword
    /**
      * The NetBIOS name of the on-premises directory, such as CORP.
      */
    var ShortName: js.UndefOr[DirectoryShortName] = js.undefined
    /**
      * The size of the directory.
      */
    var Size: DirectorySize
    /**
      * The tags to be assigned to AD Connector.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait ConnectDirectoryResult extends js.Object {
    /**
      * The identifier of the new directory.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  }
  
  trait CreateAliasRequest extends js.Object {
    /**
      * The requested alias. The alias must be unique amongst all aliases in AWS. This operation throws an EntityAlreadyExistsException error if the alias already exists.
      */
    var Alias: AliasName
    /**
      * The identifier of the directory for which to create the alias.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
  }
  
  trait CreateAliasResult extends js.Object {
    /**
      * The alias for the directory.
      */
    var Alias: js.UndefOr[AliasName] = js.undefined
    /**
      * The identifier of the directory.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  }
  
  trait CreateComputerRequest extends js.Object {
    /**
      * An array of Attribute objects that contain any LDAP attributes to apply to the computer account.
      */
    var ComputerAttributes: js.UndefOr[Attributes] = js.undefined
    /**
      * The name of the computer account.
      */
    var ComputerName: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ComputerName
    /**
      * The identifier of the directory in which to create the computer account.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The fully-qualified distinguished name of the organizational unit to place the computer account in.
      */
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN] = js.undefined
    /**
      * A one-time password that is used to join the computer to the directory. You should generate a random, strong password to use for this parameter.
      */
    var Password: ComputerPassword
  }
  
  trait CreateComputerResult extends js.Object {
    /**
      * A Computer object that represents the computer account.
      */
    var Computer: js.UndefOr[Computer] = js.undefined
  }
  
  trait CreateConditionalForwarderRequest extends js.Object {
    /**
      * The directory ID of the AWS directory for which you are creating the conditional forwarder.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The IP addresses of the remote DNS server associated with RemoteDomainName.
      */
    var DnsIpAddrs: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DnsIpAddrs
    /**
      * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
      */
    var RemoteDomainName: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoteDomainName
  }
  
  trait CreateConditionalForwarderResult extends js.Object
  
  trait CreateDirectoryRequest extends js.Object {
    /**
      * A textual description for the directory.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The fully qualified name for the directory, such as corp.example.com.
      */
    var Name: DirectoryName
    /**
      * The password for the directory administrator. The directory creation process creates a directory administrator account with the user name Administrator and this password.
      */
    var Password: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.Password
    /**
      * The short name of the directory, such as CORP.
      */
    var ShortName: js.UndefOr[DirectoryShortName] = js.undefined
    /**
      * The size of the directory.
      */
    var Size: DirectorySize
    /**
      * The tags to be assigned to the Simple AD directory.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * A DirectoryVpcSettings object that contains additional information for the operation.
      */
    var VpcSettings: js.UndefOr[DirectoryVpcSettings] = js.undefined
  }
  
  trait CreateDirectoryResult extends js.Object {
    /**
      * The identifier of the directory that was created.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  }
  
  trait CreateLogSubscriptionRequest extends js.Object {
    /**
      * Identifier (ID) of the directory to which you want to subscribe and receive real-time logs to your specified CloudWatch log group.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
      */
    var LogGroupName: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.LogGroupName
  }
  
  trait CreateLogSubscriptionResult extends js.Object
  
  trait CreateMicrosoftADRequest extends js.Object {
    /**
      * A textual description for the directory. This label will appear on the AWS console Directory Details page after the directory is created.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * AWS Managed Microsoft AD is available in two editions: Standard and Enterprise. Enterprise is the default.
      */
    var Edition: js.UndefOr[DirectoryEdition] = js.undefined
    /**
      * The fully qualified domain name for the directory, such as corp.example.com. This name will resolve inside your VPC only. It does not need to be publicly resolvable.
      */
    var Name: DirectoryName
    /**
      * The password for the default administrative user named Admin.
      */
    var Password: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.Password
    /**
      * The NetBIOS name for your domain. A short identifier for your domain, such as CORP. If you don't specify a NetBIOS name, it will default to the first part of your directory DNS. For example, CORP for the directory DNS corp.example.com. 
      */
    var ShortName: js.UndefOr[DirectoryShortName] = js.undefined
    /**
      * The tags to be assigned to the AWS Managed Microsoft AD directory.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * Contains VPC information for the CreateDirectory or CreateMicrosoftAD operation.
      */
    var VpcSettings: DirectoryVpcSettings
  }
  
  trait CreateMicrosoftADResult extends js.Object {
    /**
      * The identifier of the directory that was created.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  }
  
  trait CreateSnapshotRequest extends js.Object {
    /**
      * The identifier of the directory of which to take a snapshot.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The descriptive name to apply to the snapshot.
      */
    var Name: js.UndefOr[SnapshotName] = js.undefined
  }
  
  trait CreateSnapshotResult extends js.Object {
    /**
      * The identifier of the snapshot that was created.
      */
    var SnapshotId: js.UndefOr[SnapshotId] = js.undefined
  }
  
  trait CreateTrustRequest extends js.Object {
    /**
      * The IP addresses of the remote DNS server associated with RemoteDomainName.
      */
    var ConditionalForwarderIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined
    /**
      * The Directory ID of the AWS Managed Microsoft AD directory for which to establish the trust relationship.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
      */
    var RemoteDomainName: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoteDomainName
    /**
      * Optional parameter to enable selective authentication for the trust.
      */
    var SelectiveAuth: js.UndefOr[SelectiveAuth] = js.undefined
    /**
      * The direction of the trust relationship.
      */
    var TrustDirection: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.TrustDirection
    /**
      * The trust password. The must be the same password that was used when creating the trust relationship on the external domain.
      */
    var TrustPassword: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.TrustPassword
    /**
      * The trust relationship type. Forest is the default.
      */
    var TrustType: js.UndefOr[TrustType] = js.undefined
  }
  
  trait CreateTrustResult extends js.Object {
    /**
      * A unique identifier for the trust relationship that was created.
      */
    var TrustId: js.UndefOr[TrustId] = js.undefined
  }
  
  trait DeleteConditionalForwarderRequest extends js.Object {
    /**
      * The directory ID for which you are deleting the conditional forwarder.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The fully qualified domain name (FQDN) of the remote domain with which you are deleting the conditional forwarder.
      */
    var RemoteDomainName: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoteDomainName
  }
  
  trait DeleteConditionalForwarderResult extends js.Object
  
  trait DeleteDirectoryRequest extends js.Object {
    /**
      * The identifier of the directory to delete.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
  }
  
  trait DeleteDirectoryResult extends js.Object {
    /**
      * The directory identifier.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  }
  
  trait DeleteLogSubscriptionRequest extends js.Object {
    /**
      * Identifier (ID) of the directory whose log subscription you want to delete.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
  }
  
  trait DeleteLogSubscriptionResult extends js.Object
  
  trait DeleteSnapshotRequest extends js.Object {
    /**
      * The identifier of the directory snapshot to be deleted.
      */
    var SnapshotId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.SnapshotId
  }
  
  trait DeleteSnapshotResult extends js.Object {
    /**
      * The identifier of the directory snapshot that was deleted.
      */
    var SnapshotId: js.UndefOr[SnapshotId] = js.undefined
  }
  
  trait DeleteTrustRequest extends js.Object {
    /**
      * Delete a conditional forwarder as part of a DeleteTrustRequest.
      */
    var DeleteAssociatedConditionalForwarder: js.UndefOr[DeleteAssociatedConditionalForwarder] = js.undefined
    /**
      * The Trust ID of the trust relationship to be deleted.
      */
    var TrustId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.TrustId
  }
  
  trait DeleteTrustResult extends js.Object {
    /**
      * The Trust ID of the trust relationship that was deleted.
      */
    var TrustId: js.UndefOr[TrustId] = js.undefined
  }
  
  trait DeregisterEventTopicRequest extends js.Object {
    /**
      * The Directory ID to remove as a publisher. This directory will no longer send messages to the specified SNS topic.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The name of the SNS topic from which to remove the directory as a publisher.
      */
    var TopicName: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.TopicName
  }
  
  trait DeregisterEventTopicResult extends js.Object
  
  trait DescribeConditionalForwardersRequest extends js.Object {
    /**
      * The directory ID for which to get the list of associated conditional forwarders.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional forwarders. If this member is null, all conditional forwarders are returned.
      */
    var RemoteDomainNames: js.UndefOr[RemoteDomainNames] = js.undefined
  }
  
  trait DescribeConditionalForwardersResult extends js.Object {
    /**
      * The list of conditional forwarders that have been created.
      */
    var ConditionalForwarders: js.UndefOr[ConditionalForwarders] = js.undefined
  }
  
  trait DescribeDirectoriesRequest extends js.Object {
    /**
      * A list of identifiers of the directories for which to obtain the information. If this member is null, all directories that belong to the current account are returned. An empty list results in an InvalidParameterException being thrown.
      */
    var DirectoryIds: js.UndefOr[DirectoryIds] = js.undefined
    /**
      * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the limitations of the operation.
      */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
      * The DescribeDirectoriesResult.NextToken value from a previous call to DescribeDirectories. Pass null if this is the first call.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeDirectoriesResult extends js.Object {
    /**
      * The list of DirectoryDescription objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
      */
    var DirectoryDescriptions: js.UndefOr[DirectoryDescriptions] = js.undefined
    /**
      * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDirectories to retrieve the next set of items.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeDomainControllersRequest extends js.Object {
    /**
      * Identifier of the directory for which to retrieve the domain controller information.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * A list of identifiers for the domain controllers whose information will be provided.
      */
    var DomainControllerIds: js.UndefOr[DomainControllerIds] = js.undefined
    /**
      * The maximum number of items to return.
      */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
      * The DescribeDomainControllers.NextToken value from a previous call to DescribeDomainControllers. Pass null if this is the first call. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeDomainControllersResult extends js.Object {
    /**
      * List of the DomainController objects that were retrieved.
      */
    var DomainControllers: js.UndefOr[DomainControllers] = js.undefined
    /**
      * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDomainControllers retrieve the next set of items.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeEventTopicsRequest extends js.Object {
    /**
      * The Directory ID for which to get the list of associated SNS topics. If this member is null, associations for all Directory IDs are returned.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * A list of SNS topic names for which to obtain the information. If this member is null, all associations for the specified Directory ID are returned. An empty list results in an InvalidParameterException being thrown.
      */
    var TopicNames: js.UndefOr[TopicNames] = js.undefined
  }
  
  trait DescribeEventTopicsResult extends js.Object {
    /**
      * A list of SNS topic names that receive status messages from the specified Directory ID.
      */
    var EventTopics: js.UndefOr[EventTopics] = js.undefined
  }
  
  trait DescribeSharedDirectoriesRequest extends js.Object {
    /**
      * The number of shared directories to return in the response object.
      */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
      * The DescribeSharedDirectoriesResult.NextToken value from a previous call to DescribeSharedDirectories. Pass null if this is the first call. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Returns the identifier of the directory in the directory owner account. 
      */
    var OwnerDirectoryId: DirectoryId
    /**
      * A list of identifiers of all shared directories in your account. 
      */
    var SharedDirectoryIds: js.UndefOr[DirectoryIds] = js.undefined
  }
  
  trait DescribeSharedDirectoriesResult extends js.Object {
    /**
      * If not null, token that indicates that more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeSharedDirectories to retrieve the next set of items.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of all shared directories in your account.
      */
    var SharedDirectories: js.UndefOr[SharedDirectories] = js.undefined
  }
  
  trait DescribeSnapshotsRequest extends js.Object {
    /**
      * The identifier of the directory for which to retrieve snapshot information.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The maximum number of objects to return.
      */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
      * The DescribeSnapshotsResult.NextToken value from a previous call to DescribeSnapshots. Pass null if this is the first call.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all snapshots are returned using the Limit and NextToken members.
      */
    var SnapshotIds: js.UndefOr[SnapshotIds] = js.undefined
  }
  
  trait DescribeSnapshotsResult extends js.Object {
    /**
      * If not null, more results are available. Pass this value in the NextToken member of a subsequent call to DescribeSnapshots.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The list of Snapshot objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
      */
    var Snapshots: js.UndefOr[Snapshots] = js.undefined
  }
  
  trait DescribeTrustsRequest extends js.Object {
    /**
      * The Directory ID of the AWS directory that is a part of the requested trust relationship.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The maximum number of objects to return.
      */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
      * The DescribeTrustsResult.NextToken value from a previous call to DescribeTrusts. Pass null if this is the first call.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of identifiers of the trust relationships for which to obtain the information. If this member is null, all trust relationships that belong to the current account are returned. An empty list results in an InvalidParameterException being thrown.
      */
    var TrustIds: js.UndefOr[TrustIds] = js.undefined
  }
  
  trait DescribeTrustsResult extends js.Object {
    /**
      * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeTrusts to retrieve the next set of items.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The list of Trust objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
      */
    var Trusts: js.UndefOr[Trusts] = js.undefined
  }
  
  trait DirectoryConnectSettings extends js.Object {
    /**
      * A list of one or more IP addresses of DNS servers or domain controllers in the on-premises directory.
      */
    var CustomerDnsIps: DnsIpAddrs
    /**
      * The user name of an account in the on-premises directory that is used to connect to the directory. This account must have the following permissions:   Read users and groups   Create computer objects   Join computers to the domain  
      */
    var CustomerUserName: UserName
    /**
      * A list of subnet identifiers in the VPC in which the AD Connector is created.
      */
    var SubnetIds: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.SubnetIds
    /**
      * The identifier of the VPC in which the AD Connector is created.
      */
    var VpcId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.VpcId
  }
  
  trait DirectoryConnectSettingsDescription extends js.Object {
    /**
      * A list of the Availability Zones that the directory is in.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
      * The IP addresses of the AD Connector servers.
      */
    var ConnectIps: js.UndefOr[IpAddrs] = js.undefined
    /**
      * The user name of the service account in the on-premises directory.
      */
    var CustomerUserName: js.UndefOr[UserName] = js.undefined
    /**
      * The security group identifier for the AD Connector directory.
      */
    var SecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined
    /**
      * A list of subnet identifiers in the VPC that the AD connector is in.
      */
    var SubnetIds: js.UndefOr[SubnetIds] = js.undefined
    /**
      * The identifier of the VPC that the AD Connector is in.
      */
    var VpcId: js.UndefOr[VpcId] = js.undefined
  }
  
  trait DirectoryDescription extends js.Object {
    /**
      * The access URL for the directory, such as http://&lt;alias&gt;.awsapps.com. If no alias has been created for the directory, &lt;alias&gt; is the directory identifier, such as d-XXXXXXXXXX.
      */
    var AccessUrl: js.UndefOr[AccessUrl] = js.undefined
    /**
      * The alias for the directory. If no alias has been created for the directory, the alias is the directory identifier, such as d-XXXXXXXXXX.
      */
    var Alias: js.UndefOr[AliasName] = js.undefined
    /**
      * A DirectoryConnectSettingsDescription object that contains additional information about an AD Connector directory. This member is only present if the directory is an AD Connector directory.
      */
    var ConnectSettings: js.UndefOr[DirectoryConnectSettingsDescription] = js.undefined
    /**
      * The textual description for the directory.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The desired number of domain controllers in the directory if the directory is Microsoft AD.
      */
    var DesiredNumberOfDomainControllers: js.UndefOr[DesiredNumberOfDomainControllers] = js.undefined
    /**
      * The directory identifier.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these are the IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory, these are the IP addresses of the DNS servers or domain controllers in the on-premises directory to which the AD Connector is connected.
      */
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined
    /**
      * The edition associated with this directory.
      */
    var Edition: js.UndefOr[DirectoryEdition] = js.undefined
    /**
      * Specifies when the directory was created.
      */
    var LaunchTime: js.UndefOr[LaunchTime] = js.undefined
    /**
      * The fully qualified name of the directory.
      */
    var Name: js.UndefOr[DirectoryName] = js.undefined
    /**
      * Describes the AWS Managed Microsoft AD directory in the directory owner account.
      */
    var OwnerDirectoryDescription: js.UndefOr[OwnerDirectoryDescription] = js.undefined
    /**
      * A RadiusSettings object that contains information about the RADIUS server configured for this directory.
      */
    var RadiusSettings: js.UndefOr[RadiusSettings] = js.undefined
    /**
      * The status of the RADIUS MFA server connection.
      */
    var RadiusStatus: js.UndefOr[RadiusStatus] = js.undefined
    /**
      * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a shared directory request (HANDSHAKE).
      */
    var ShareMethod: js.UndefOr[ShareMethod] = js.undefined
    /**
      * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
      */
    var ShareNotes: js.UndefOr[Notes] = js.undefined
    /**
      * Current directory status of the shared AWS Managed Microsoft AD directory.
      */
    var ShareStatus: js.UndefOr[ShareStatus] = js.undefined
    /**
      * The short name of the directory.
      */
    var ShortName: js.UndefOr[DirectoryShortName] = js.undefined
    /**
      * The directory size.
      */
    var Size: js.UndefOr[DirectorySize] = js.undefined
    /**
      * Indicates if single sign-on is enabled for the directory. For more information, see EnableSso and DisableSso.
      */
    var SsoEnabled: js.UndefOr[SsoEnabled] = js.undefined
    /**
      * The current stage of the directory.
      */
    var Stage: js.UndefOr[DirectoryStage] = js.undefined
    /**
      * The date and time that the stage was last updated.
      */
    var StageLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined
    /**
      * Additional information about the directory stage.
      */
    var StageReason: js.UndefOr[StageReason] = js.undefined
    /**
      * The directory size.
      */
    var Type: js.UndefOr[DirectoryType] = js.undefined
    /**
      * A DirectoryVpcSettingsDescription object that contains additional information about a directory. This member is only present if the directory is a Simple AD or Managed AD directory.
      */
    var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.undefined
  }
  
  trait DirectoryLimits extends js.Object {
    /**
      * The current number of cloud directories in the region.
      */
    var CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined
    /**
      * The maximum number of cloud directories allowed in the region.
      */
    var CloudOnlyDirectoriesLimit: js.UndefOr[Limit] = js.undefined
    /**
      * Indicates if the cloud directory limit has been reached.
      */
    var CloudOnlyDirectoriesLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined
    /**
      * The current number of AWS Managed Microsoft AD directories in the region.
      */
    var CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit] = js.undefined
    /**
      * The maximum number of AWS Managed Microsoft AD directories allowed in the region.
      */
    var CloudOnlyMicrosoftADLimit: js.UndefOr[Limit] = js.undefined
    /**
      * Indicates if the AWS Managed Microsoft AD directory limit has been reached.
      */
    var CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined
    /**
      * The current number of connected directories in the region.
      */
    var ConnectedDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined
    /**
      * The maximum number of connected directories allowed in the region.
      */
    var ConnectedDirectoriesLimit: js.UndefOr[Limit] = js.undefined
    /**
      * Indicates if the connected directory limit has been reached.
      */
    var ConnectedDirectoriesLimitReached: js.UndefOr[ConnectedDirectoriesLimitReached] = js.undefined
  }
  
  trait DirectoryVpcSettings extends js.Object {
    /**
      * The identifiers of the subnets for the directory servers. The two subnets must be in different Availability Zones. AWS Directory Service creates a directory server and a DNS server in each of these subnets.
      */
    var SubnetIds: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.SubnetIds
    /**
      * The identifier of the VPC in which to create the directory.
      */
    var VpcId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.VpcId
  }
  
  trait DirectoryVpcSettingsDescription extends js.Object {
    /**
      * The list of Availability Zones that the directory is in.
      */
    var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    /**
      * The domain controller security group identifier for the directory.
      */
    var SecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined
    /**
      * The identifiers of the subnets for the directory servers.
      */
    var SubnetIds: js.UndefOr[SubnetIds] = js.undefined
    /**
      * The identifier of the VPC that the directory is in.
      */
    var VpcId: js.UndefOr[VpcId] = js.undefined
  }
  
  trait DisableRadiusRequest extends js.Object {
    /**
      * The identifier of the directory for which to disable MFA.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
  }
  
  trait DisableRadiusResult extends js.Object
  
  trait DisableSsoRequest extends js.Object {
    /**
      * The identifier of the directory for which to disable single-sign on.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The password of an alternate account to use to disable single-sign on. This is only used for AD Connector directories. For more information, see the UserName parameter.
      */
    var Password: js.UndefOr[ConnectPassword] = js.undefined
    /**
      * The username of an alternate account to use to disable single-sign on. This is only used for AD Connector directories. This account must have privileges to remove a service principal name. If the AD Connector service account does not have privileges to remove a service principal name, you can specify an alternate account with the UserName and Password parameters. These credentials are only used to disable single sign-on and are not stored by the service. The AD Connector service account is not changed.
      */
    var UserName: js.UndefOr[UserName] = js.undefined
  }
  
  trait DisableSsoResult extends js.Object
  
  trait DomainController extends js.Object {
    /**
      * The Availability Zone where the domain controller is located.
      */
    var AvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
    /**
      * Identifier of the directory where the domain controller resides.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The IP address of the domain controller.
      */
    var DnsIpAddr: js.UndefOr[IpAddr] = js.undefined
    /**
      * Identifies a specific domain controller in the directory.
      */
    var DomainControllerId: js.UndefOr[DomainControllerId] = js.undefined
    /**
      * Specifies when the domain controller was created.
      */
    var LaunchTime: js.UndefOr[LaunchTime] = js.undefined
    /**
      * The status of the domain controller.
      */
    var Status: js.UndefOr[DomainControllerStatus] = js.undefined
    /**
      * The date and time that the status was last updated.
      */
    var StatusLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined
    /**
      * A description of the domain controller state.
      */
    var StatusReason: js.UndefOr[DomainControllerStatusReason] = js.undefined
    /**
      * Identifier of the subnet in the VPC that contains the domain controller.
      */
    var SubnetId: js.UndefOr[SubnetId] = js.undefined
    /**
      * The identifier of the VPC that contains the domain controller.
      */
    var VpcId: js.UndefOr[VpcId] = js.undefined
  }
  
  trait EnableRadiusRequest extends js.Object {
    /**
      * The identifier of the directory for which to enable MFA.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * A RadiusSettings object that contains information about the RADIUS server.
      */
    var RadiusSettings: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RadiusSettings
  }
  
  trait EnableRadiusResult extends js.Object
  
  trait EnableSsoRequest extends js.Object {
    /**
      * The identifier of the directory for which to enable single-sign on.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The password of an alternate account to use to enable single-sign on. This is only used for AD Connector directories. For more information, see the UserName parameter.
      */
    var Password: js.UndefOr[ConnectPassword] = js.undefined
    /**
      * The username of an alternate account to use to enable single-sign on. This is only used for AD Connector directories. This account must have privileges to add a service principal name. If the AD Connector service account does not have privileges to add a service principal name, you can specify an alternate account with the UserName and Password parameters. These credentials are only used to enable single sign-on and are not stored by the service. The AD Connector service account is not changed.
      */
    var UserName: js.UndefOr[UserName] = js.undefined
  }
  
  trait EnableSsoResult extends js.Object
  
  trait EventTopic extends js.Object {
    /**
      * The date and time of when you associated your directory with the SNS topic.
      */
    var CreatedDateTime: js.UndefOr[CreatedDateTime] = js.undefined
    /**
      * The Directory ID of an AWS Directory Service directory that will publish status messages to an SNS topic.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The topic registration status.
      */
    var Status: js.UndefOr[TopicStatus] = js.undefined
    /**
      * The SNS topic ARN (Amazon Resource Name).
      */
    var TopicArn: js.UndefOr[TopicArn] = js.undefined
    /**
      * The name of an AWS SNS topic the receives status messages from the directory.
      */
    var TopicName: js.UndefOr[TopicName] = js.undefined
  }
  
  trait GetDirectoryLimitsRequest extends js.Object
  
  trait GetDirectoryLimitsResult extends js.Object {
    /**
      * A DirectoryLimits object that contains the directory limits for the current region.
      */
    var DirectoryLimits: js.UndefOr[DirectoryLimits] = js.undefined
  }
  
  trait GetSnapshotLimitsRequest extends js.Object {
    /**
      * Contains the identifier of the directory to obtain the limits for.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
  }
  
  trait GetSnapshotLimitsResult extends js.Object {
    /**
      * A SnapshotLimits object that contains the manual snapshot limits for the specified directory.
      */
    var SnapshotLimits: js.UndefOr[SnapshotLimits] = js.undefined
  }
  
  trait IpRoute extends js.Object {
    /**
      * IP address block using CIDR format, for example 10.0.0.0/24. This is often the address block of the DNS server used for your on-premises domain. For a single IP address use a CIDR address block with /32. For example 10.0.0.0/32.
      */
    var CidrIp: js.UndefOr[CidrIp] = js.undefined
    /**
      * Description of the address block.
      */
    var Description: js.UndefOr[Description] = js.undefined
  }
  
  trait IpRouteInfo extends js.Object {
    /**
      * The date and time the address block was added to the directory.
      */
    var AddedDateTime: js.UndefOr[AddedDateTime] = js.undefined
    /**
      * IP address block in the IpRoute.
      */
    var CidrIp: js.UndefOr[CidrIp] = js.undefined
    /**
      * Description of the IpRouteInfo.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * Identifier (ID) of the directory associated with the IP addresses.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The status of the IP address block.
      */
    var IpRouteStatusMsg: js.UndefOr[IpRouteStatusMsg] = js.undefined
    /**
      * The reason for the IpRouteStatusMsg.
      */
    var IpRouteStatusReason: js.UndefOr[IpRouteStatusReason] = js.undefined
  }
  
  trait ListIpRoutesRequest extends js.Object {
    /**
      * Identifier (ID) of the directory for which you want to retrieve the IP addresses.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * Maximum number of items to return. If this value is zero, the maximum number of items is specified by the limitations of the operation.
      */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
      * The ListIpRoutes.NextToken value from a previous call to ListIpRoutes. Pass null if this is the first call.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListIpRoutesResult extends js.Object {
    /**
      * A list of IpRoutes.
      */
    var IpRoutesInfo: js.UndefOr[IpRoutesInfo] = js.undefined
    /**
      * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListIpRoutes to retrieve the next set of items.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListLogSubscriptionsRequest extends js.Object {
    /**
      * If a DirectoryID is provided, lists only the log subscription associated with that directory. If no DirectoryId is provided, lists all log subscriptions associated with your AWS account. If there are no log subscriptions for the AWS account or the directory, an empty list will be returned.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The maximum number of items returned.
      */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
      * The token for the next set of items to return.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListLogSubscriptionsResult extends js.Object {
    /**
      * A list of active LogSubscription objects for calling the AWS account.
      */
    var LogSubscriptions: js.UndefOr[LogSubscriptions] = js.undefined
    /**
      * The token for the next set of items to return.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListSchemaExtensionsRequest extends js.Object {
    /**
      * The identifier of the directory from which to retrieve the schema extension information.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The maximum number of items to return.
      */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
      * The ListSchemaExtensions.NextToken value from a previous call to ListSchemaExtensions. Pass null if this is the first call.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListSchemaExtensionsResult extends js.Object {
    /**
      * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListSchemaExtensions to retrieve the next set of items.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Information about the schema extensions applied to the directory.
      */
    var SchemaExtensionsInfo: js.UndefOr[SchemaExtensionsInfo] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * Reserved for future use.
      */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
      * Reserved for future use.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Identifier (ID) of the directory for which you want to retrieve tags.
      */
    var ResourceId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ResourceId
  }
  
  trait ListTagsForResourceResult extends js.Object {
    /**
      * Reserved for future use.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * List of tags returned by the ListTagsForResource operation.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait LogSubscription extends js.Object {
    /**
      * Identifier (ID) of the directory that you want to associate with the log subscription.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The name of the log group.
      */
    var LogGroupName: js.UndefOr[LogGroupName] = js.undefined
    /**
      * The date and time that the log subscription was created.
      */
    var SubscriptionCreatedDateTime: js.UndefOr[SubscriptionCreatedDateTime] = js.undefined
  }
  
  trait OwnerDirectoryDescription extends js.Object {
    /**
      * Identifier of the directory owner account.
      */
    var AccountId: js.UndefOr[CustomerId] = js.undefined
    /**
      * Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * IP address of the directory’s domain controllers.
      */
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined
    /**
      * A RadiusSettings object that contains information about the RADIUS server.
      */
    var RadiusSettings: js.UndefOr[RadiusSettings] = js.undefined
    /**
      * Information about the status of the RADIUS server.
      */
    var RadiusStatus: js.UndefOr[RadiusStatus] = js.undefined
    /**
      * Information about the VPC settings for the directory.
      */
    var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.undefined
  }
  
  trait RadiusSettings extends js.Object {
    /**
      * The protocol specified for your RADIUS endpoints.
      */
    var AuthenticationProtocol: js.UndefOr[RadiusAuthenticationProtocol] = js.undefined
    /**
      * Not currently used.
      */
    var DisplayLabel: js.UndefOr[RadiusDisplayLabel] = js.undefined
    /**
      * The port that your RADIUS server is using for communications. Your on-premises network must allow inbound traffic over this port from the AWS Directory Service servers.
      */
    var RadiusPort: js.UndefOr[PortNumber] = js.undefined
    /**
      * The maximum number of times that communication with the RADIUS server is attempted.
      */
    var RadiusRetries: js.UndefOr[RadiusRetries] = js.undefined
    /**
      * An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of your RADIUS server load balancer.
      */
    var RadiusServers: js.UndefOr[Servers] = js.undefined
    /**
      * The amount of time, in seconds, to wait for the RADIUS server to respond.
      */
    var RadiusTimeout: js.UndefOr[RadiusTimeout] = js.undefined
    /**
      * Required for enabling RADIUS on the directory.
      */
    var SharedSecret: js.UndefOr[RadiusSharedSecret] = js.undefined
    /**
      * Not currently used.
      */
    var UseSameUsername: js.UndefOr[UseSameUsername] = js.undefined
  }
  
  trait RegisterEventTopicRequest extends js.Object {
    /**
      * The Directory ID that will publish status messages to the SNS topic.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The SNS topic name to which the directory will publish status messages. This SNS topic must be in the same region as the specified Directory ID.
      */
    var TopicName: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.TopicName
  }
  
  trait RegisterEventTopicResult extends js.Object
  
  trait RejectSharedDirectoryRequest extends js.Object {
    /**
      * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account.
      */
    var SharedDirectoryId: DirectoryId
  }
  
  trait RejectSharedDirectoryResult extends js.Object {
    /**
      * Identifier of the shared directory in the directory consumer account.
      */
    var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  }
  
  trait RemoveIpRoutesRequest extends js.Object {
    /**
      * IP address blocks that you want to remove.
      */
    var CidrIps: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CidrIps
    /**
      * Identifier (ID) of the directory from which you want to remove the IP addresses.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
  }
  
  trait RemoveIpRoutesResult extends js.Object
  
  trait RemoveTagsFromResourceRequest extends js.Object {
    /**
      * Identifier (ID) of the directory from which to remove the tag.
      */
    var ResourceId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ResourceId
    /**
      * The tag key (name) of the tag to be removed.
      */
    var TagKeys: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.TagKeys
  }
  
  trait RemoveTagsFromResourceResult extends js.Object
  
  trait ResetUserPasswordRequest extends js.Object {
    /**
      * Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The new password that will be reset.
      */
    var NewPassword: UserPassword
    /**
      * The user name of the user whose password will be reset.
      */
    var UserName: CustomerUserName
  }
  
  trait ResetUserPasswordResult extends js.Object
  
  trait RestoreFromSnapshotRequest extends js.Object {
    /**
      * The identifier of the snapshot to restore from.
      */
    var SnapshotId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.SnapshotId
  }
  
  trait RestoreFromSnapshotResult extends js.Object
  
  trait SchemaExtensionInfo extends js.Object {
    /**
      * A description of the schema extension.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The identifier of the directory to which the schema extension is applied.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The date and time that the schema extension was completed.
      */
    var EndDateTime: js.UndefOr[EndDateTime] = js.undefined
    /**
      * The identifier of the schema extension.
      */
    var SchemaExtensionId: js.UndefOr[SchemaExtensionId] = js.undefined
    /**
      * The current status of the schema extension.
      */
    var SchemaExtensionStatus: js.UndefOr[SchemaExtensionStatus] = js.undefined
    /**
      * The reason for the SchemaExtensionStatus.
      */
    var SchemaExtensionStatusReason: js.UndefOr[SchemaExtensionStatusReason] = js.undefined
    /**
      * The date and time that the schema extension started being applied to the directory.
      */
    var StartDateTime: js.UndefOr[StartDateTime] = js.undefined
  }
  
  trait ShareDirectoryRequest extends js.Object {
    /**
      * Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a directory sharing request (HANDSHAKE).
      */
    var ShareMethod: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ShareMethod
    /**
      * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
      */
    var ShareNotes: js.UndefOr[Notes] = js.undefined
    /**
      * Identifier for the directory consumer account with whom the directory is to be shared.
      */
    var ShareTarget: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.ShareTarget
  }
  
  trait ShareDirectoryResult extends js.Object {
    /**
      * Identifier of the directory that is stored in the directory consumer account that is shared from the specified directory (DirectoryId).
      */
    var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  }
  
  trait ShareTarget extends js.Object {
    /**
      * Identifier of the directory consumer account.
      */
    var Id: TargetId
    /**
      * Type of identifier to be used in the Id field.
      */
    var Type: TargetType
  }
  
  trait SharedDirectory extends js.Object {
    /**
      * The date and time that the shared directory was created.
      */
    var CreatedDateTime: js.UndefOr[CreatedDateTime] = js.undefined
    /**
      * The date and time that the shared directory was last updated.
      */
    var LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined
    /**
      * Identifier of the directory owner account, which contains the directory that has been shared to the consumer account.
      */
    var OwnerAccountId: js.UndefOr[CustomerId] = js.undefined
    /**
      * Identifier of the directory in the directory owner account. 
      */
    var OwnerDirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a shared directory request (HANDSHAKE).
      */
    var ShareMethod: js.UndefOr[ShareMethod] = js.undefined
    /**
      * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
      */
    var ShareNotes: js.UndefOr[Notes] = js.undefined
    /**
      * Current directory status of the shared AWS Managed Microsoft AD directory.
      */
    var ShareStatus: js.UndefOr[ShareStatus] = js.undefined
    /**
      * Identifier of the directory consumer account that has access to the shared directory (OwnerDirectoryId) in the directory owner account.
      */
    var SharedAccountId: js.UndefOr[CustomerId] = js.undefined
    /**
      * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account.
      */
    var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  }
  
  trait Snapshot extends js.Object {
    /**
      * The directory identifier.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The descriptive name of the snapshot.
      */
    var Name: js.UndefOr[SnapshotName] = js.undefined
    /**
      * The snapshot identifier.
      */
    var SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    /**
      * The date and time that the snapshot was taken.
      */
    var StartTime: js.UndefOr[StartTime] = js.undefined
    /**
      * The snapshot status.
      */
    var Status: js.UndefOr[SnapshotStatus] = js.undefined
    /**
      * The snapshot type.
      */
    var Type: js.UndefOr[SnapshotType] = js.undefined
  }
  
  trait SnapshotLimits extends js.Object {
    /**
      * The current number of manual snapshots of the directory.
      */
    var ManualSnapshotsCurrentCount: js.UndefOr[Limit] = js.undefined
    /**
      * The maximum number of manual snapshots allowed.
      */
    var ManualSnapshotsLimit: js.UndefOr[Limit] = js.undefined
    /**
      * Indicates if the manual snapshot limit has been reached.
      */
    var ManualSnapshotsLimitReached: js.UndefOr[ManualSnapshotsLimitReached] = js.undefined
  }
  
  trait StartSchemaExtensionRequest extends js.Object {
    /**
      * If true, creates a snapshot of the directory before applying the schema extension.
      */
    var CreateSnapshotBeforeSchemaExtension: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.CreateSnapshotBeforeSchemaExtension
    /**
      * A description of the schema extension.
      */
    var Description: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.Description
    /**
      * The identifier of the directory for which the schema extension will be applied to.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The LDIF file represented as a string. To construct the LdifContent string, precede each line as it would be formatted in an ldif file with \n. See the example request below for more details. The file size can be no larger than 1MB.
      */
    var LdifContent: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.LdifContent
  }
  
  trait StartSchemaExtensionResult extends js.Object {
    /**
      * The identifier of the schema extension that will be applied.
      */
    var SchemaExtensionId: js.UndefOr[SchemaExtensionId] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * Required name of the tag. The string value can be Unicode characters and cannot be prefixed with "aws:". The string can contain only the set of Unicode letters, digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
      */
    var Key: TagKey
    /**
      * The optional value of the tag. The string value can be Unicode characters. The string can contain only the set of Unicode letters, digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
      */
    var Value: TagValue
  }
  
  trait Trust extends js.Object {
    /**
      * The date and time that the trust relationship was created.
      */
    var CreatedDateTime: js.UndefOr[CreatedDateTime] = js.undefined
    /**
      * The Directory ID of the AWS directory involved in the trust relationship.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The date and time that the trust relationship was last updated.
      */
    var LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined
    /**
      * The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
      */
    var RemoteDomainName: js.UndefOr[RemoteDomainName] = js.undefined
    /**
      * Current state of selective authentication for the trust.
      */
    var SelectiveAuth: js.UndefOr[SelectiveAuth] = js.undefined
    /**
      * The date and time that the TrustState was last updated.
      */
    var StateLastUpdatedDateTime: js.UndefOr[StateLastUpdatedDateTime] = js.undefined
    /**
      * The trust relationship direction.
      */
    var TrustDirection: js.UndefOr[TrustDirection] = js.undefined
    /**
      * The unique ID of the trust relationship.
      */
    var TrustId: js.UndefOr[TrustId] = js.undefined
    /**
      * The trust relationship state.
      */
    var TrustState: js.UndefOr[TrustState] = js.undefined
    /**
      * The reason for the TrustState.
      */
    var TrustStateReason: js.UndefOr[TrustStateReason] = js.undefined
    /**
      * The trust relationship type. Forest is the default.
      */
    var TrustType: js.UndefOr[TrustType] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Accepts a directory sharing request that was sent from the directory owner account.
      */
    def acceptSharedDirectory(): awsDashSdkLib.libRequestMod.Request[AcceptSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptSharedDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptSharedDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Accepts a directory sharing request that was sent from the directory owner account.
      */
    def acceptSharedDirectory(params: AcceptSharedDirectoryRequest): awsDashSdkLib.libRequestMod.Request[AcceptSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptSharedDirectory(
      params: AcceptSharedDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptSharedDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. AddIpRoutes adds this address block. You can also use AddIpRoutes to facilitate routing traffic that uses public IP ranges from your Microsoft AD on AWS to a peer VPC.  Before you call AddIpRoutes, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the AddIpRoutes operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
      */
    def addIpRoutes(): awsDashSdkLib.libRequestMod.Request[AddIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addIpRoutes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddIpRoutesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * If the DNS server for your on-premises domain uses a publicly addressable IP address, you must add a CIDR address block to correctly route traffic to and from your Microsoft AD on Amazon Web Services. AddIpRoutes adds this address block. You can also use AddIpRoutes to facilitate routing traffic that uses public IP ranges from your Microsoft AD on AWS to a peer VPC.  Before you call AddIpRoutes, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the AddIpRoutes operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
      */
    def addIpRoutes(params: AddIpRoutesRequest): awsDashSdkLib.libRequestMod.Request[AddIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addIpRoutes(
      params: AddIpRoutesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddIpRoutesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique to each resource.
      */
    def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddTagsToResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or overwrites one or more tags for the specified directory. Each directory can have a maximum of 50 tags. Each tag consists of a key and optional value. Tag keys must be unique to each resource.
      */
    def addTagsToResource(params: AddTagsToResourceRequest): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      params: AddTagsToResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddTagsToResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled during any of the following states; Initializing, CreatingSnapshot, and UpdatingSchema.
      */
    def cancelSchemaExtension(): awsDashSdkLib.libRequestMod.Request[CancelSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelSchemaExtension(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelSchemaExtensionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels an in-progress schema extension to a Microsoft AD directory. Once a schema extension has started replicating to all domain controllers, the task can no longer be canceled. A schema extension can be canceled during any of the following states; Initializing, CreatingSnapshot, and UpdatingSchema.
      */
    def cancelSchemaExtension(params: CancelSchemaExtensionRequest): awsDashSdkLib.libRequestMod.Request[CancelSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelSchemaExtension(
      params: CancelSchemaExtensionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelSchemaExtensionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AD Connector to connect to an on-premises directory. Before you call ConnectDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the ConnectDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
      */
    def connectDirectory(): awsDashSdkLib.libRequestMod.Request[ConnectDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def connectDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConnectDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConnectDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AD Connector to connect to an on-premises directory. Before you call ConnectDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the ConnectDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
      */
    def connectDirectory(params: ConnectDirectoryRequest): awsDashSdkLib.libRequestMod.Request[ConnectDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def connectDirectory(
      params: ConnectDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConnectDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConnectDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the access URL for the directory, such as http://&lt;alias&gt;.awsapps.com.  After an alias has been created, it cannot be deleted or reused, so this operation should only be used when absolutely necessary. 
      */
    def createAlias(): awsDashSdkLib.libRequestMod.Request[CreateAliasResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAliasResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAliasResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an alias for a directory and assigns the alias to the directory. The alias is used to construct the access URL for the directory, such as http://&lt;alias&gt;.awsapps.com.  After an alias has been created, it cannot be deleted or reused, so this operation should only be used when absolutely necessary. 
      */
    def createAlias(params: CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[CreateAliasResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAlias(
      params: CreateAliasRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAliasResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAliasResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a computer account in the specified directory, and joins the computer to the directory.
      */
    def createComputer(): awsDashSdkLib.libRequestMod.Request[CreateComputerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createComputer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateComputerResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateComputerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a computer account in the specified directory, and joins the computer to the directory.
      */
    def createComputer(params: CreateComputerRequest): awsDashSdkLib.libRequestMod.Request[CreateComputerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createComputer(
      params: CreateComputerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateComputerResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateComputerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
      */
    def createConditionalForwarder(): awsDashSdkLib.libRequestMod.Request[CreateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConditionalForwarder(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConditionalForwarderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a conditional forwarder associated with your AWS directory. Conditional forwarders are required in order to set up a trust relationship with another domain. The conditional forwarder points to the trusted domain.
      */
    def createConditionalForwarder(params: CreateConditionalForwarderRequest): awsDashSdkLib.libRequestMod.Request[CreateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConditionalForwarder(
      params: CreateConditionalForwarderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConditionalForwarderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Simple AD directory. Before you call CreateDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
      */
    def createDirectory(): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Simple AD directory. Before you call CreateDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
      */
    def createDirectory(params: CreateDirectoryRequest): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDirectory(
      params: CreateDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a subscription to forward real time Directory Service domain controller security logs to the specified CloudWatch log group in your AWS account.
      */
    def createLogSubscription(): awsDashSdkLib.libRequestMod.Request[CreateLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLogSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLogSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a subscription to forward real time Directory Service domain controller security logs to the specified CloudWatch log group in your AWS account.
      */
    def createLogSubscription(params: CreateLogSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[CreateLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createLogSubscription(
      params: CreateLogSubscriptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLogSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS Managed Microsoft AD directory. Before you call CreateMicrosoftAD, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateMicrosoftAD operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
      */
    def createMicrosoftAD(): awsDashSdkLib.libRequestMod.Request[CreateMicrosoftADResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMicrosoftAD(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMicrosoftADResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMicrosoftADResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an AWS Managed Microsoft AD directory. Before you call CreateMicrosoftAD, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the CreateMicrosoftAD operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
      */
    def createMicrosoftAD(params: CreateMicrosoftADRequest): awsDashSdkLib.libRequestMod.Request[CreateMicrosoftADResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMicrosoftAD(
      params: CreateMicrosoftADRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMicrosoftADResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMicrosoftADResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.  You cannot take snapshots of AD Connector directories. 
      */
    def createSnapshot(): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS cloud.  You cannot take snapshots of AD Connector directories. 
      */
    def createSnapshot(params: CreateSnapshotRequest): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSnapshot(
      params: CreateSnapshotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. You can create either a forest trust or an external trust.
      */
    def createTrust(): awsDashSdkLib.libRequestMod.Request[CreateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTrust(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTrustResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials. This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain. You can create either a forest trust or an external trust.
      */
    def createTrust(params: CreateTrustRequest): awsDashSdkLib.libRequestMod.Request[CreateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTrust(
      params: CreateTrustRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTrustResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a conditional forwarder that has been set up for your AWS directory.
      */
    def deleteConditionalForwarder(): awsDashSdkLib.libRequestMod.Request[DeleteConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConditionalForwarder(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConditionalForwarderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a conditional forwarder that has been set up for your AWS directory.
      */
    def deleteConditionalForwarder(params: DeleteConditionalForwarderRequest): awsDashSdkLib.libRequestMod.Request[DeleteConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConditionalForwarder(
      params: DeleteConditionalForwarderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConditionalForwarderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an AWS Directory Service directory. Before you call DeleteDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the DeleteDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
      */
    def deleteDirectory(): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an AWS Directory Service directory. Before you call DeleteDirectory, ensure that all of the required permissions have been explicitly granted through a policy. For details about what permissions are required to run the DeleteDirectory operation, see AWS Directory Service API Permissions: Actions, Resources, and Conditions Reference.
      */
    def deleteDirectory(params: DeleteDirectoryRequest): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDirectory(
      params: DeleteDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified log subscription.
      */
    def deleteLogSubscription(): awsDashSdkLib.libRequestMod.Request[DeleteLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLogSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLogSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified log subscription.
      */
    def deleteLogSubscription(params: DeleteLogSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[DeleteLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteLogSubscription(
      params: DeleteLogSubscriptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLogSubscriptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLogSubscriptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a directory snapshot.
      */
    def deleteSnapshot(): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a directory snapshot.
      */
    def deleteSnapshot(params: DeleteSnapshotRequest): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSnapshot(
      params: DeleteSnapshotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.
      */
    def deleteTrust(): awsDashSdkLib.libRequestMod.Request[DeleteTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTrust(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTrustResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing trust relationship between your AWS Managed Microsoft AD directory and an external domain.
      */
    def deleteTrust(params: DeleteTrustRequest): awsDashSdkLib.libRequestMod.Request[DeleteTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTrust(
      params: DeleteTrustRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTrustResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified directory as a publisher to the specified SNS topic.
      */
    def deregisterEventTopic(): awsDashSdkLib.libRequestMod.Request[DeregisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterEventTopic(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterEventTopicResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified directory as a publisher to the specified SNS topic.
      */
    def deregisterEventTopic(params: DeregisterEventTopicRequest): awsDashSdkLib.libRequestMod.Request[DeregisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterEventTopic(
      params: DeregisterEventTopicRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterEventTopicResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains information about the conditional forwarders for this account. If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for the specified directory ID.
      */
    def describeConditionalForwarders(): awsDashSdkLib.libRequestMod.Request[DescribeConditionalForwardersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConditionalForwarders(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConditionalForwardersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConditionalForwardersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains information about the conditional forwarders for this account. If no input parameters are provided for RemoteDomainNames, this request describes all conditional forwarders for the specified directory ID.
      */
    def describeConditionalForwarders(params: DescribeConditionalForwardersRequest): awsDashSdkLib.libRequestMod.Request[DescribeConditionalForwardersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConditionalForwarders(
      params: DescribeConditionalForwardersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConditionalForwardersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConditionalForwardersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains information about the directories that belong to this account. You can retrieve information about specific directories by passing the directory identifiers in the DirectoryIds parameter. Otherwise, all directories that belong to the current account are returned. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeDirectoriesResult.NextToken member contains a token that you pass in the next call to DescribeDirectories to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
      */
    def describeDirectories(): awsDashSdkLib.libRequestMod.Request[DescribeDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDirectories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDirectoriesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains information about the directories that belong to this account. You can retrieve information about specific directories by passing the directory identifiers in the DirectoryIds parameter. Otherwise, all directories that belong to the current account are returned. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeDirectoriesResult.NextToken member contains a token that you pass in the next call to DescribeDirectories to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
      */
    def describeDirectories(params: DescribeDirectoriesRequest): awsDashSdkLib.libRequestMod.Request[DescribeDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDirectories(
      params: DescribeDirectoriesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDirectoriesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides information about any domain controllers in your directory.
      */
    def describeDomainControllers(): awsDashSdkLib.libRequestMod.Request[DescribeDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDomainControllers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDomainControllersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides information about any domain controllers in your directory.
      */
    def describeDomainControllers(params: DescribeDomainControllersRequest): awsDashSdkLib.libRequestMod.Request[DescribeDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDomainControllers(
      params: DescribeDomainControllersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDomainControllersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains information about which SNS topics receive status messages from the specified directory. If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the associations in the account.
      */
    def describeEventTopics(): awsDashSdkLib.libRequestMod.Request[DescribeEventTopicsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventTopics(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventTopicsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventTopicsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains information about which SNS topics receive status messages from the specified directory. If no input parameters are provided, such as DirectoryId or TopicName, this request describes all of the associations in the account.
      */
    def describeEventTopics(params: DescribeEventTopicsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventTopicsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventTopics(
      params: DescribeEventTopicsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventTopicsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventTopicsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the shared directories in your account. 
      */
    def describeSharedDirectories(): awsDashSdkLib.libRequestMod.Request[DescribeSharedDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSharedDirectories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSharedDirectoriesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSharedDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the shared directories in your account. 
      */
    def describeSharedDirectories(params: DescribeSharedDirectoriesRequest): awsDashSdkLib.libRequestMod.Request[DescribeSharedDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSharedDirectories(
      params: DescribeSharedDirectoriesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSharedDirectoriesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSharedDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains information about the directory snapshots that belong to this account. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeSnapshots.NextToken member contains a token that you pass in the next call to DescribeSnapshots to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
      */
    def describeSnapshots(): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSnapshots(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSnapshotsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains information about the directory snapshots that belong to this account. This operation supports pagination with the use of the NextToken request and response parameters. If more results are available, the DescribeSnapshots.NextToken member contains a token that you pass in the next call to DescribeSnapshots to retrieve the next set of items. You can also specify a maximum number of return results with the Limit parameter.
      */
    def describeSnapshots(params: DescribeSnapshotsRequest): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSnapshots(
      params: DescribeSnapshotsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSnapshotsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSnapshotsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains information about the trust relationships for this account. If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust relationships belonging to the account.
      */
    def describeTrusts(): awsDashSdkLib.libRequestMod.Request[DescribeTrustsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTrusts(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrustsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTrustsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains information about the trust relationships for this account. If no input parameters are provided, such as DirectoryId or TrustIds, this request describes all the trust relationships belonging to the account.
      */
    def describeTrusts(params: DescribeTrustsRequest): awsDashSdkLib.libRequestMod.Request[DescribeTrustsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTrusts(
      params: DescribeTrustsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrustsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTrustsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
      */
    def disableRadius(): awsDashSdkLib.libRequestMod.Request[DisableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableRadius(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableRadiusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
      */
    def disableRadius(params: DisableRadiusRequest): awsDashSdkLib.libRequestMod.Request[DisableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableRadius(
      params: DisableRadiusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableRadiusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables single-sign on for a directory.
      */
    def disableSso(): awsDashSdkLib.libRequestMod.Request[DisableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableSso(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableSsoResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables single-sign on for a directory.
      */
    def disableSso(params: DisableSsoRequest): awsDashSdkLib.libRequestMod.Request[DisableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableSso(
      params: DisableSsoRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableSsoResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
      */
    def enableRadius(): awsDashSdkLib.libRequestMod.Request[EnableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableRadius(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableRadiusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables multi-factor authentication (MFA) with the Remote Authentication Dial In User Service (RADIUS) server for an AD Connector or Microsoft AD directory.
      */
    def enableRadius(params: EnableRadiusRequest): awsDashSdkLib.libRequestMod.Request[EnableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableRadius(
      params: EnableRadiusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableRadiusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables single sign-on for a directory.
      */
    def enableSso(): awsDashSdkLib.libRequestMod.Request[EnableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableSso(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EnableSsoResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EnableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables single sign-on for a directory.
      */
    def enableSso(params: EnableSsoRequest): awsDashSdkLib.libRequestMod.Request[EnableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableSso(
      params: EnableSsoRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EnableSsoResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EnableSsoResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains directory limit information for the current region.
      */
    def getDirectoryLimits(): awsDashSdkLib.libRequestMod.Request[GetDirectoryLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDirectoryLimits(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDirectoryLimitsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDirectoryLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains directory limit information for the current region.
      */
    def getDirectoryLimits(params: GetDirectoryLimitsRequest): awsDashSdkLib.libRequestMod.Request[GetDirectoryLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDirectoryLimits(
      params: GetDirectoryLimitsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDirectoryLimitsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDirectoryLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains the manual snapshot limits for a directory.
      */
    def getSnapshotLimits(): awsDashSdkLib.libRequestMod.Request[GetSnapshotLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSnapshotLimits(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSnapshotLimitsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSnapshotLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Obtains the manual snapshot limits for a directory.
      */
    def getSnapshotLimits(params: GetSnapshotLimitsRequest): awsDashSdkLib.libRequestMod.Request[GetSnapshotLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSnapshotLimits(
      params: GetSnapshotLimitsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSnapshotLimitsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSnapshotLimitsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the address blocks that you have added to a directory.
      */
    def listIpRoutes(): awsDashSdkLib.libRequestMod.Request[ListIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIpRoutes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIpRoutesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the address blocks that you have added to a directory.
      */
    def listIpRoutes(params: ListIpRoutesRequest): awsDashSdkLib.libRequestMod.Request[ListIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listIpRoutes(
      params: ListIpRoutesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIpRoutesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the active log subscriptions for the AWS account.
      */
    def listLogSubscriptions(): awsDashSdkLib.libRequestMod.Request[ListLogSubscriptionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listLogSubscriptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLogSubscriptionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLogSubscriptionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the active log subscriptions for the AWS account.
      */
    def listLogSubscriptions(params: ListLogSubscriptionsRequest): awsDashSdkLib.libRequestMod.Request[ListLogSubscriptionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listLogSubscriptions(
      params: ListLogSubscriptionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLogSubscriptionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLogSubscriptionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all schema extensions applied to a Microsoft AD Directory.
      */
    def listSchemaExtensions(): awsDashSdkLib.libRequestMod.Request[ListSchemaExtensionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSchemaExtensions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSchemaExtensionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSchemaExtensionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all schema extensions applied to a Microsoft AD Directory.
      */
    def listSchemaExtensions(params: ListSchemaExtensionsRequest): awsDashSdkLib.libRequestMod.Request[ListSchemaExtensionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSchemaExtensions(
      params: ListSchemaExtensionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSchemaExtensionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSchemaExtensionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all tags on a directory.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all tags on a directory.
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a notification when the directory returns to an Active status.
      */
    def registerEventTopic(): awsDashSdkLib.libRequestMod.Request[RegisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerEventTopic(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterEventTopicResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a directory with an SNS topic. This establishes the directory as a publisher to the specified SNS topic. You can then receive email or text (SMS) messages when the status of your directory changes. You get notified if your directory goes from an Active status to an Impaired or Inoperable status. You also receive a notification when the directory returns to an Active status.
      */
    def registerEventTopic(params: RegisterEventTopicRequest): awsDashSdkLib.libRequestMod.Request[RegisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerEventTopic(
      params: RegisterEventTopicRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterEventTopicResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterEventTopicResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Rejects a directory sharing request that was sent from the directory owner account.
      */
    def rejectSharedDirectory(): awsDashSdkLib.libRequestMod.Request[RejectSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rejectSharedDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RejectSharedDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RejectSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Rejects a directory sharing request that was sent from the directory owner account.
      */
    def rejectSharedDirectory(params: RejectSharedDirectoryRequest): awsDashSdkLib.libRequestMod.Request[RejectSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rejectSharedDirectory(
      params: RejectSharedDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RejectSharedDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RejectSharedDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes IP address blocks from a directory.
      */
    def removeIpRoutes(): awsDashSdkLib.libRequestMod.Request[RemoveIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeIpRoutes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveIpRoutesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes IP address blocks from a directory.
      */
    def removeIpRoutes(params: RemoveIpRoutesRequest): awsDashSdkLib.libRequestMod.Request[RemoveIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeIpRoutes(
      params: RemoveIpRoutesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveIpRoutesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveIpRoutesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes tags from a directory.
      */
    def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsFromResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes tags from a directory.
      */
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      params: RemoveTagsFromResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsFromResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.
      */
    def resetUserPassword(): awsDashSdkLib.libRequestMod.Request[ResetUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetUserPassword(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetUserPasswordResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resets the password for any user in your AWS Managed Microsoft AD or Simple AD directory.
      */
    def resetUserPassword(params: ResetUserPasswordRequest): awsDashSdkLib.libRequestMod.Request[ResetUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resetUserPassword(
      params: ResetUserPasswordRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResetUserPasswordResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResetUserPasswordResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores a directory using an existing directory snapshot. When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are overwritten. This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore operation by calling the DescribeDirectories operation with the directory identifier. When the DirectoryDescription.Stage value changes to Active, the restore operation is complete.
      */
    def restoreFromSnapshot(): awsDashSdkLib.libRequestMod.Request[RestoreFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreFromSnapshot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreFromSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores a directory using an existing directory snapshot. When you restore a directory from a snapshot, any changes made to the directory after the snapshot date are overwritten. This action returns as soon as the restore operation is initiated. You can monitor the progress of the restore operation by calling the DescribeDirectories operation with the directory identifier. When the DirectoryDescription.Stage value changes to Active, the restore operation is complete.
      */
    def restoreFromSnapshot(params: RestoreFromSnapshotRequest): awsDashSdkLib.libRequestMod.Request[RestoreFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreFromSnapshot(
      params: RestoreFromSnapshotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreFromSnapshotResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreFromSnapshotResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Shares a specified directory (DirectoryId) in your AWS account (directory owner) with another AWS account (directory consumer). With this operation you can use your directory from any AWS account and from any Amazon VPC within an AWS Region. When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the directory consumer account. This shared directory contains the metadata to provide access to the directory within the directory owner account. The shared directory is visible in all VPCs in the directory consumer account. The ShareMethod parameter determines whether the specified directory can be shared between AWS accounts inside the same AWS organization (ORGANIZATIONS). It also determines whether you can share the directory with any other AWS account either inside or outside of the organization (HANDSHAKE). The ShareNotes parameter is only used when HANDSHAKE is called, which sends a directory sharing request to the directory consumer. 
      */
    def shareDirectory(): awsDashSdkLib.libRequestMod.Request[ShareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def shareDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ShareDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ShareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Shares a specified directory (DirectoryId) in your AWS account (directory owner) with another AWS account (directory consumer). With this operation you can use your directory from any AWS account and from any Amazon VPC within an AWS Region. When you share your AWS Managed Microsoft AD directory, AWS Directory Service creates a shared directory in the directory consumer account. This shared directory contains the metadata to provide access to the directory within the directory owner account. The shared directory is visible in all VPCs in the directory consumer account. The ShareMethod parameter determines whether the specified directory can be shared between AWS accounts inside the same AWS organization (ORGANIZATIONS). It also determines whether you can share the directory with any other AWS account either inside or outside of the organization (HANDSHAKE). The ShareNotes parameter is only used when HANDSHAKE is called, which sends a directory sharing request to the directory consumer. 
      */
    def shareDirectory(params: ShareDirectoryRequest): awsDashSdkLib.libRequestMod.Request[ShareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def shareDirectory(
      params: ShareDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ShareDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ShareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Applies a schema extension to a Microsoft AD directory.
      */
    def startSchemaExtension(): awsDashSdkLib.libRequestMod.Request[StartSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startSchemaExtension(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartSchemaExtensionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Applies a schema extension to a Microsoft AD directory.
      */
    def startSchemaExtension(params: StartSchemaExtensionRequest): awsDashSdkLib.libRequestMod.Request[StartSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startSchemaExtension(
      params: StartSchemaExtensionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartSchemaExtensionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartSchemaExtensionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops the directory sharing between the directory owner and consumer accounts. 
      */
    def unshareDirectory(): awsDashSdkLib.libRequestMod.Request[UnshareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unshareDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UnshareDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UnshareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops the directory sharing between the directory owner and consumer accounts. 
      */
    def unshareDirectory(params: UnshareDirectoryRequest): awsDashSdkLib.libRequestMod.Request[UnshareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def unshareDirectory(
      params: UnshareDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UnshareDirectoryResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UnshareDirectoryResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a conditional forwarder that has been set up for your AWS directory.
      */
    def updateConditionalForwarder(): awsDashSdkLib.libRequestMod.Request[UpdateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConditionalForwarder(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConditionalForwarderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a conditional forwarder that has been set up for your AWS directory.
      */
    def updateConditionalForwarder(params: UpdateConditionalForwarderRequest): awsDashSdkLib.libRequestMod.Request[UpdateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConditionalForwarder(
      params: UpdateConditionalForwarderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConditionalForwarderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConditionalForwarderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or removes domain controllers to or from the directory. Based on the difference between current value and new value (provided through this API call), domain controllers will be added or removed. It may take up to 45 minutes for any new domain controllers to become fully active once the requested number of domain controllers is updated. During this time, you cannot make another update request.
      */
    def updateNumberOfDomainControllers(): awsDashSdkLib.libRequestMod.Request[UpdateNumberOfDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateNumberOfDomainControllers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateNumberOfDomainControllersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateNumberOfDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or removes domain controllers to or from the directory. Based on the difference between current value and new value (provided through this API call), domain controllers will be added or removed. It may take up to 45 minutes for any new domain controllers to become fully active once the requested number of domain controllers is updated. During this time, you cannot make another update request.
      */
    def updateNumberOfDomainControllers(params: UpdateNumberOfDomainControllersRequest): awsDashSdkLib.libRequestMod.Request[UpdateNumberOfDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateNumberOfDomainControllers(
      params: UpdateNumberOfDomainControllersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateNumberOfDomainControllersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateNumberOfDomainControllersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or Microsoft AD directory.
      */
    def updateRadius(): awsDashSdkLib.libRequestMod.Request[UpdateRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRadius(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRadiusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the Remote Authentication Dial In User Service (RADIUS) server information for an AD Connector or Microsoft AD directory.
      */
    def updateRadius(params: UpdateRadiusRequest): awsDashSdkLib.libRequestMod.Request[UpdateRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRadius(
      params: UpdateRadiusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRadiusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRadiusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active Directory.
      */
    def updateTrust(): awsDashSdkLib.libRequestMod.Request[UpdateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTrust(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTrustResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the trust that has been set up between your AWS Managed Microsoft AD directory and an on-premises Active Directory.
      */
    def updateTrust(params: UpdateTrustRequest): awsDashSdkLib.libRequestMod.Request[UpdateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTrust(
      params: UpdateTrustRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTrustResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships. This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.
      */
    def verifyTrust(): awsDashSdkLib.libRequestMod.Request[VerifyTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def verifyTrust(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ VerifyTrustResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[VerifyTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * AWS Directory Service for Microsoft Active Directory allows you to configure and verify trust relationships. This action verifies a trust relationship between your AWS Managed Microsoft AD directory and an external domain.
      */
    def verifyTrust(params: VerifyTrustRequest): awsDashSdkLib.libRequestMod.Request[VerifyTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def verifyTrust(
      params: VerifyTrustRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ VerifyTrustResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[VerifyTrustResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UnshareDirectoryRequest extends js.Object {
    /**
      * The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * Identifier for the directory consumer account with whom the directory has to be unshared.
      */
    var UnshareTarget: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.UnshareTarget
  }
  
  trait UnshareDirectoryResult extends js.Object {
    /**
      * Identifier of the directory stored in the directory consumer account that is to be unshared from the specified directory (DirectoryId).
      */
    var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  }
  
  trait UnshareTarget extends js.Object {
    /**
      * Identifier of the directory consumer account.
      */
    var Id: TargetId
    /**
      * Type of identifier to be used in the Id field.
      */
    var Type: TargetType
  }
  
  trait UpdateConditionalForwarderRequest extends js.Object {
    /**
      * The directory ID of the AWS directory for which to update the conditional forwarder.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * The updated IP addresses of the remote DNS server associated with the conditional forwarder.
      */
    var DnsIpAddrs: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DnsIpAddrs
    /**
      * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
      */
    var RemoteDomainName: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RemoteDomainName
  }
  
  trait UpdateConditionalForwarderResult extends js.Object
  
  trait UpdateNumberOfDomainControllersRequest extends js.Object {
    /**
      * The number of domain controllers desired in the directory.
      */
    var DesiredNumber: DesiredNumberOfDomainControllers
    /**
      * Identifier of the directory to which the domain controllers will be added or removed.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
  }
  
  trait UpdateNumberOfDomainControllersResult extends js.Object
  
  trait UpdateRadiusRequest extends js.Object {
    /**
      * The identifier of the directory for which to update the RADIUS server information.
      */
    var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.DirectoryId
    /**
      * A RadiusSettings object that contains information about the RADIUS server.
      */
    var RadiusSettings: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.RadiusSettings
  }
  
  trait UpdateRadiusResult extends js.Object
  
  trait UpdateTrustRequest extends js.Object {
    /**
      * Updates selective authentication for the trust.
      */
    var SelectiveAuth: js.UndefOr[SelectiveAuth] = js.undefined
    /**
      * Identifier of the trust relationship.
      */
    var TrustId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.TrustId
  }
  
  trait UpdateTrustResult extends js.Object {
    var RequestId: js.UndefOr[RequestId] = js.undefined
    /**
      * Identifier of the trust relationship.
      */
    var TrustId: js.UndefOr[TrustId] = js.undefined
  }
  
  trait VerifyTrustRequest extends js.Object {
    /**
      * The unique Trust ID of the trust relationship to verify.
      */
    var TrustId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryServiceNs.TrustId
  }
  
  trait VerifyTrustResult extends js.Object {
    /**
      * The unique Trust ID of the trust relationship that was verified.
      */
    var TrustId: js.UndefOr[TrustId] = js.undefined
  }
  
  trait _DirectoryEdition extends js.Object
  
  trait _DirectorySize extends js.Object
  
  trait _DirectoryStage extends js.Object
  
  trait _DirectoryType extends js.Object
  
  trait _DomainControllerStatus extends js.Object
  
  trait _IpRouteStatusMsg extends js.Object
  
  trait _RadiusAuthenticationProtocol extends js.Object
  
  trait _RadiusStatus extends js.Object
  
  trait _SchemaExtensionStatus extends js.Object
  
  trait _SelectiveAuth extends js.Object
  
  trait _ShareMethod extends js.Object
  
  trait _ShareStatus extends js.Object
  
  trait _SnapshotStatus extends js.Object
  
  trait _SnapshotType extends js.Object
  
  trait _TopicStatus extends js.Object
  
  trait _TrustDirection extends js.Object
  
  trait _TrustState extends js.Object
  
  trait _TrustType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AccessUrl = java.lang.String
  type AddedDateTime = stdLib.Date
  type AliasName = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = js.Array[Attribute]
  type AvailabilityZone = java.lang.String
  type AvailabilityZones = js.Array[AvailabilityZone]
  type CidrIp = java.lang.String
  type CidrIps = js.Array[CidrIp]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudOnlyDirectoriesLimitReached = scala.Boolean
  type ComputerName = java.lang.String
  type ComputerPassword = java.lang.String
  type ConditionalForwarders = js.Array[ConditionalForwarder]
  type ConnectPassword = java.lang.String
  type ConnectedDirectoriesLimitReached = scala.Boolean
  type CreateSnapshotBeforeSchemaExtension = scala.Boolean
  type CreatedDateTime = stdLib.Date
  type CustomerId = java.lang.String
  type CustomerUserName = java.lang.String
  type DeleteAssociatedConditionalForwarder = scala.Boolean
  type Description = java.lang.String
  type DesiredNumberOfDomainControllers = scala.Double
  type DirectoryDescriptions = js.Array[DirectoryDescription]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enterprise
    - awsDashSdkLib.awsDashSdkLibStrings.Standard
    - java.lang.String
  */
  type DirectoryEdition = _DirectoryEdition | java.lang.String
  type DirectoryId = java.lang.String
  type DirectoryIds = js.Array[DirectoryId]
  type DirectoryName = java.lang.String
  type DirectoryShortName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Small
    - awsDashSdkLib.awsDashSdkLibStrings.Large
    - java.lang.String
  */
  type DirectorySize = _DirectorySize | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Requested
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Created
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.Inoperable
    - awsDashSdkLib.awsDashSdkLibStrings.Impaired
    - awsDashSdkLib.awsDashSdkLibStrings.Restoring
    - awsDashSdkLib.awsDashSdkLibStrings.RestoreFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type DirectoryStage = _DirectoryStage | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SimpleAD
    - awsDashSdkLib.awsDashSdkLibStrings.ADConnector
    - awsDashSdkLib.awsDashSdkLibStrings.MicrosoftAD
    - awsDashSdkLib.awsDashSdkLibStrings.SharedMicrosoftAD
    - java.lang.String
  */
  type DirectoryType = _DirectoryType | java.lang.String
  type DnsIpAddrs = js.Array[IpAddr]
  type DomainControllerId = java.lang.String
  type DomainControllerIds = js.Array[DomainControllerId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.Impaired
    - awsDashSdkLib.awsDashSdkLibStrings.Restoring
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type DomainControllerStatus = _DomainControllerStatus | java.lang.String
  type DomainControllerStatusReason = java.lang.String
  type DomainControllers = js.Array[DomainController]
  type EndDateTime = stdLib.Date
  type EventTopics = js.Array[EventTopic]
  type IpAddr = java.lang.String
  type IpAddrs = js.Array[IpAddr]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Adding
    - awsDashSdkLib.awsDashSdkLibStrings.Added
    - awsDashSdkLib.awsDashSdkLibStrings.Removing
    - awsDashSdkLib.awsDashSdkLibStrings.Removed
    - awsDashSdkLib.awsDashSdkLibStrings.AddFailed
    - awsDashSdkLib.awsDashSdkLibStrings.RemoveFailed
    - java.lang.String
  */
  type IpRouteStatusMsg = _IpRouteStatusMsg | java.lang.String
  type IpRouteStatusReason = java.lang.String
  type IpRoutes = js.Array[IpRoute]
  type IpRoutesInfo = js.Array[IpRouteInfo]
  type LastUpdatedDateTime = stdLib.Date
  type LaunchTime = stdLib.Date
  type LdifContent = java.lang.String
  type Limit = scala.Double
  type LogGroupName = java.lang.String
  type LogSubscriptions = js.Array[LogSubscription]
  type ManualSnapshotsLimitReached = scala.Boolean
  type NextToken = java.lang.String
  type Notes = java.lang.String
  type OrganizationalUnitDN = java.lang.String
  type Password = java.lang.String
  type PortNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PAP
    - awsDashSdkLib.awsDashSdkLibStrings.CHAP
    - awsDashSdkLib.awsDashSdkLibStrings.`MS-CHAPv1`
    - awsDashSdkLib.awsDashSdkLibStrings.`MS-CHAPv2`
    - java.lang.String
  */
  type RadiusAuthenticationProtocol = _RadiusAuthenticationProtocol | java.lang.String
  type RadiusDisplayLabel = java.lang.String
  type RadiusRetries = scala.Double
  type RadiusSharedSecret = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type RadiusStatus = _RadiusStatus | java.lang.String
  type RadiusTimeout = scala.Double
  type RemoteDomainName = java.lang.String
  type RemoteDomainNames = js.Array[RemoteDomainName]
  type ReplicationScope = awsDashSdkLib.awsDashSdkLibStrings.Domain | java.lang.String
  type RequestId = java.lang.String
  type ResourceId = java.lang.String
  type SID = java.lang.String
  type SchemaExtensionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Initializing
    - awsDashSdkLib.awsDashSdkLibStrings.CreatingSnapshot
    - awsDashSdkLib.awsDashSdkLibStrings.UpdatingSchema
    - awsDashSdkLib.awsDashSdkLibStrings.Replicating
    - awsDashSdkLib.awsDashSdkLibStrings.CancelInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.RollbackInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - java.lang.String
  */
  type SchemaExtensionStatus = _SchemaExtensionStatus | java.lang.String
  type SchemaExtensionStatusReason = java.lang.String
  type SchemaExtensionsInfo = js.Array[SchemaExtensionInfo]
  type SecurityGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type SelectiveAuth = _SelectiveAuth | java.lang.String
  type Server = java.lang.String
  type Servers = js.Array[Server]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ORGANIZATIONS
    - awsDashSdkLib.awsDashSdkLibStrings.HANDSHAKE
    - java.lang.String
  */
  type ShareMethod = _ShareMethod | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Shared
    - awsDashSdkLib.awsDashSdkLibStrings.PendingAcceptance
    - awsDashSdkLib.awsDashSdkLibStrings.Rejected
    - awsDashSdkLib.awsDashSdkLibStrings.Rejecting
    - awsDashSdkLib.awsDashSdkLibStrings.RejectFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Sharing
    - awsDashSdkLib.awsDashSdkLibStrings.ShareFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - java.lang.String
  */
  type ShareStatus = _ShareStatus | java.lang.String
  type SharedDirectories = js.Array[SharedDirectory]
  type SnapshotId = java.lang.String
  type SnapshotIds = js.Array[SnapshotId]
  type SnapshotName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type SnapshotStatus = _SnapshotStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Auto
    - awsDashSdkLib.awsDashSdkLibStrings.Manual
    - java.lang.String
  */
  type SnapshotType = _SnapshotType | java.lang.String
  type Snapshots = js.Array[Snapshot]
  type SsoEnabled = scala.Boolean
  type StageReason = java.lang.String
  type StartDateTime = stdLib.Date
  type StartTime = stdLib.Date
  type StateLastUpdatedDateTime = stdLib.Date
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type SubscriptionCreatedDateTime = stdLib.Date
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TargetId = java.lang.String
  type TargetType = awsDashSdkLib.awsDashSdkLibStrings.ACCOUNT | java.lang.String
  type TopicArn = java.lang.String
  type TopicName = java.lang.String
  type TopicNames = js.Array[TopicName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Registered
    - awsDashSdkLib.awsDashSdkLibStrings.`Topic not found`
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - java.lang.String
  */
  type TopicStatus = _TopicStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`One-Way: Outgoing`
    - awsDashSdkLib.awsDashSdkLibStrings.`One-Way: Incoming`
    - awsDashSdkLib.awsDashSdkLibStrings.`Two-Way`
    - java.lang.String
  */
  type TrustDirection = _TrustDirection | java.lang.String
  type TrustId = java.lang.String
  type TrustIds = js.Array[TrustId]
  type TrustPassword = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Created
    - awsDashSdkLib.awsDashSdkLibStrings.Verifying
    - awsDashSdkLib.awsDashSdkLibStrings.VerifyFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Verified
    - awsDashSdkLib.awsDashSdkLibStrings.Updating
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Updated
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type TrustState = _TrustState | java.lang.String
  type TrustStateReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Forest
    - awsDashSdkLib.awsDashSdkLibStrings.External
    - java.lang.String
  */
  type TrustType = _TrustType | java.lang.String
  type Trusts = js.Array[Trust]
  type UpdateSecurityGroupForDirectoryControllers = scala.Boolean
  type UseSameUsername = scala.Boolean
  type UserName = java.lang.String
  type UserPassword = java.lang.String
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-04-16`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

