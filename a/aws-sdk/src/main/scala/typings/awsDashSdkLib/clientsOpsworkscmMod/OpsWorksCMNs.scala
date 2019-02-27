package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/opsworkscm", "OpsWorksCM")
@js.native
object OpsWorksCMNs extends js.Object {
  trait AccountAttribute extends js.Object {
    /**
      *  The maximum allowed value. 
      */
    var Maximum: js.UndefOr[Integer] = js.undefined
    /**
      *  The attribute name. The following are supported attribute names.     ServerLimit: The number of current servers/maximum number of servers allowed. By default, you can have a maximum of 10 servers.     ManualBackupLimit: The number of current manual backups/maximum number of backups allowed. By default, you can have a maximum of 50 manual backups saved.   
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      *  The current usage, such as the current number of servers that are associated with the account. 
      */
    var Used: js.UndefOr[Integer] = js.undefined
  }
  
  trait AssociateNodeRequest extends js.Object {
    /**
      * Engine attributes used for associating the node.   Attributes accepted in a AssociateNode request for Chef     CHEF_ORGANIZATION: The Chef organization with which the node is associated. By default only one organization named default can exist.     CHEF_NODE_PUBLIC_KEY: A PEM-formatted public key. This key is required for the chef-client agent to access the Chef API.     Attributes accepted in a AssociateNode request for Puppet     PUPPET_NODE_CSR: A PEM-formatted certificate-signing request (CSR) that is created by the node.   
      */
    var EngineAttributes: EngineAttributes
    /**
      * The name of the node. 
      */
    var NodeName: NodeName
    /**
      * The name of the server with which to associate the node. 
      */
    var ServerName: ServerName
  }
  
  trait AssociateNodeResponse extends js.Object {
    /**
      * Contains a token which can be passed to the DescribeNodeAssociationStatus API call to get the status of the association request. 
      */
    var NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken] = js.undefined
  }
  
  trait Backup extends js.Object {
    /**
      * The ARN of the backup. 
      */
    var BackupArn: js.UndefOr[String] = js.undefined
    /**
      *  The generated ID of the backup. Example: myServerName-yyyyMMddHHmmssSSS 
      */
    var BackupId: js.UndefOr[BackupId] = js.undefined
    /**
      *  The backup type. Valid values are automated or manual. 
      */
    var BackupType: js.UndefOr[BackupType] = js.undefined
    /**
      *  The time stamp when the backup was created in the database. Example: 2016-07-29T13:38:47.520Z 
      */
    var CreatedAt: js.UndefOr[Timestamp] = js.undefined
    /**
      *  A user-provided description for a manual backup. This field is empty for automated backups. 
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      *  The engine type that is obtained from the server when the backup is created. 
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      *  The engine model that is obtained from the server when the backup is created. 
      */
    var EngineModel: js.UndefOr[String] = js.undefined
    /**
      *  The engine version that is obtained from the server when the backup is created. 
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      *  The EC2 instance profile ARN that is obtained from the server when the backup is created. Because this value is stored, you are not required to provide the InstanceProfileArn again if you restore a backup. 
      */
    var InstanceProfileArn: js.UndefOr[String] = js.undefined
    /**
      *  The instance type that is obtained from the server when the backup is created. 
      */
    var InstanceType: js.UndefOr[String] = js.undefined
    /**
      *  The key pair that is obtained from the server when the backup is created. 
      */
    var KeyPair: js.UndefOr[String] = js.undefined
    /**
      *  The preferred backup period that is obtained from the server when the backup is created. 
      */
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
    /**
      *  The preferred maintenance period that is obtained from the server when the backup is created. 
      */
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
    /**
      *  This field is deprecated and is no longer used. 
      */
    var S3DataSize: js.UndefOr[Integer] = js.undefined
    /**
      *  This field is deprecated and is no longer used. 
      */
    var S3DataUrl: js.UndefOr[String] = js.undefined
    /**
      *  The Amazon S3 URL of the backup's log file. 
      */
    var S3LogUrl: js.UndefOr[String] = js.undefined
    /**
      *  The security group IDs that are obtained from the server when the backup is created. 
      */
    var SecurityGroupIds: js.UndefOr[Strings] = js.undefined
    /**
      *  The name of the server from which the backup was made. 
      */
    var ServerName: js.UndefOr[ServerName] = js.undefined
    /**
      *  The service role ARN that is obtained from the server when the backup is created. 
      */
    var ServiceRoleArn: js.UndefOr[String] = js.undefined
    /**
      * The status of a backup while in progress. 
      */
    var Status: js.UndefOr[BackupStatus] = js.undefined
    /**
      *  An informational message about backup status. 
      */
    var StatusDescription: js.UndefOr[String] = js.undefined
    /**
      *  The subnet IDs that are obtained from the server when the backup is created. 
      */
    var SubnetIds: js.UndefOr[Strings] = js.undefined
    /**
      *  The version of AWS OpsWorks CM-specific tools that is obtained from the server when the backup is created. 
      */
    var ToolsVersion: js.UndefOr[String] = js.undefined
    /**
      *  The IAM user ARN of the requester for manual backups. This field is empty for automated backups. 
      */
    var UserArn: js.UndefOr[String] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateBackupRequest extends js.Object {
    /**
      *  A user-defined description of the backup. 
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The name of the server that you want to back up. 
      */
    var ServerName: ServerName
  }
  
  trait CreateBackupResponse extends js.Object {
    /**
      * Backup created by request.
      */
    var Backup: js.UndefOr[Backup] = js.undefined
  }
  
  trait CreateServerRequest extends js.Object {
    /**
      *  Associate a public IP address with a server that you are launching. Valid values are true or false. The default value is true. 
      */
    var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined
    /**
      *  If you specify this field, AWS OpsWorks CM creates the server by using the backup represented by BackupId. 
      */
    var BackupId: js.UndefOr[BackupId] = js.undefined
    /**
      *  The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks CM deletes the oldest backups if this number is exceeded. The default value is 1. 
      */
    var BackupRetentionCount: js.UndefOr[BackupRetentionCountDefinition] = js.undefined
    /**
      *  Enable or disable scheduled backups. Valid values are true or false. The default value is true. 
      */
    var DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined
    /**
      *  The configuration management engine to use. Valid values include Chef and Puppet. 
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * Optional engine attributes on a specified server.   Attributes accepted in a Chef createServer request:     CHEF_PIVOTAL_KEY: A base64-encoded RSA public key. The corresponding private key is required to access the Chef API. When no CHEF_PIVOTAL_KEY is set, a private key is generated and returned in the response.     CHEF_DELIVERY_ADMIN_PASSWORD: The password for the administrative user in the Chef Automate GUI. The password length is a minimum of eight characters, and a maximum of 32. The password can contain letters, numbers, and special characters (!/@#$%^&amp;+=_). The password must contain at least one lower case letter, one upper case letter, one number, and one special character. When no CHEF_DELIVERY_ADMIN_PASSWORD is set, one is generated and returned in the response.    Attributes accepted in a Puppet createServer request:     PUPPET_ADMIN_PASSWORD: To work with the Puppet Enterprise console, a password must use ASCII characters.    PUPPET_R10K_REMOTE: The r10k remote is the URL of your control repository (for example, ssh://git@your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port 8170.    PUPPET_R10K_PRIVATE_KEY: If you are using a private Git repository, add PUPPET_R10K_PRIVATE_KEY to specify an SSH URL and a PEM-encoded private SSH key.  
      */
    var EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined
    /**
      *  The engine model of the server. Valid values in this release include Monolithic for Puppet and Single for Chef. 
      */
    var EngineModel: js.UndefOr[String] = js.undefined
    /**
      *  The major release version of the engine that you want to use. For a Chef server, the valid value for EngineVersion is currently 12. For a Puppet server, the valid value is 2017. 
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      *  The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console typically creates the instance profile for you, if you are using API commands instead, run the service-role-creation.yaml AWS CloudFormation template, located at https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template creates a CloudFormation stack that includes the instance profile you need. 
      */
    var InstanceProfileArn: InstanceProfileArn
    /**
      *  The Amazon EC2 instance type to use. For example, m4.large. Recommended instance types include t2.medium and greater, m4.*, or c4.xlarge and greater. 
      */
    var InstanceType: String
    /**
      *  The Amazon EC2 key pair to set for the instance. This parameter is optional; if desired, you may specify this parameter to connect to your instances by using SSH. 
      */
    var KeyPair: js.UndefOr[KeyPair] = js.undefined
    /**
      *  The start time for a one-hour period during which AWS OpsWorks CM backs up application-level data on your server if automated backups are enabled. Valid values must be specified in one of the following formats:     HH:MM for daily backups    DDD:HH:MM for weekly backups   The specified time is in coordinated universal time (UTC). The default value is a random, daily start time.  Example: 08:00, which represents a daily start time of 08:00 UTC.  Example: Mon:08:00, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
      */
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
    /**
      *  The start time for a one-hour period each week during which AWS OpsWorks CM performs maintenance on the instance. Valid values must be specified in the following format: DDD:HH:MM. The specified time is in coordinated universal time (UTC). The default value is a random one-hour period on Tuesday, Wednesday, or Friday. See TimeWindowDefinition for more information.   Example: Mon:08:00, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.) 
      */
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
    /**
      *  A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified security groups must be within the VPC that is specified by SubnetIds.   If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses TCP ports 22 and 443, open to 0.0.0.0/0 (everyone). 
      */
    var SecurityGroupIds: js.UndefOr[Strings] = js.undefined
    /**
      *  The name of the server. The server name must be unique within your AWS account, within each region. Server names must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 40 characters. 
      */
    var ServerName: ServerName
    /**
      *  The service role that the AWS OpsWorks CM service backend uses to work with your account. Although the AWS OpsWorks management console typically creates the service role for you, if you are using the AWS CLI or API commands, run the service-role-creation.yaml AWS CloudFormation template, located at https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template creates a CloudFormation stack that includes the service role and instance profile that you need. 
      */
    var ServiceRoleArn: ServiceRoleArn
    /**
      *  The IDs of subnets in which to launch the server EC2 instance.   Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have "Auto Assign Public IP" enabled.   EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have "Auto Assign Public IP" enabled.  For more information about supported Amazon EC2 platforms, see Supported Platforms.
      */
    var SubnetIds: js.UndefOr[Strings] = js.undefined
  }
  
  trait CreateServerResponse extends js.Object {
    /**
      * The server that is created by the request. 
      */
    var Server: js.UndefOr[Server] = js.undefined
  }
  
  trait DeleteBackupRequest extends js.Object {
    /**
      * The ID of the backup to delete. Run the DescribeBackups command to get a list of backup IDs. Backup IDs are in the format ServerName-yyyyMMddHHmmssSSS. 
      */
    var BackupId: BackupId
  }
  
  trait DeleteBackupResponse extends js.Object
  
  trait DeleteServerRequest extends js.Object {
    /**
      * The ID of the server to delete.
      */
    var ServerName: ServerName
  }
  
  trait DeleteServerResponse extends js.Object
  
  trait DescribeAccountAttributesRequest extends js.Object
  
  trait DescribeAccountAttributesResponse extends js.Object {
    /**
      *  The attributes that are currently set for the account. 
      */
    var Attributes: js.UndefOr[AccountAttributes] = js.undefined
  }
  
  trait DescribeBackupsRequest extends js.Object {
    /**
      * Describes a single backup. 
      */
    var BackupId: js.UndefOr[BackupId] = js.undefined
    /**
      * This is not currently implemented for DescribeBackups requests.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * This is not currently implemented for DescribeBackups requests.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Returns backups for the server with the specified ServerName. 
      */
    var ServerName: js.UndefOr[ServerName] = js.undefined
  }
  
  trait DescribeBackupsResponse extends js.Object {
    /**
      * Contains the response to a DescribeBackups request. 
      */
    var Backups: js.UndefOr[Backups] = js.undefined
    /**
      * This is not currently implemented for DescribeBackups requests.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeEventsRequest extends js.Object {
    /**
      * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results. 
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * NextToken is a string that is returned in some command responses. It indicates that not all entries have been returned, and that you must run at least one more request to get remaining items. To get remaining results, call DescribeEvents again, and assign the token from the previous results as the value of the nextToken parameter. If there are no more results, the response object's nextToken parameter value is null. Setting a nextToken value that was not returned in your previous results causes an InvalidNextTokenException to occur. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name of the server for which you want to view events.
      */
    var ServerName: ServerName
  }
  
  trait DescribeEventsResponse extends js.Object {
    /**
      * NextToken is a string that is returned in some command responses. It indicates that not all entries have been returned, and that you must run at least one more request to get remaining items. To get remaining results, call DescribeEvents again, and assign the token from the previous results as the value of the nextToken parameter. If there are no more results, the response object's nextToken parameter value is null. Setting a nextToken value that was not returned in your previous results causes an InvalidNextTokenException to occur. 
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Contains the response to a DescribeEvents request. 
      */
    var ServerEvents: js.UndefOr[ServerEvents] = js.undefined
  }
  
  trait DescribeNodeAssociationStatusRequest extends js.Object {
    /**
      * The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. 
      */
    var NodeAssociationStatusToken: NodeAssociationStatusToken
    /**
      * The name of the server from which to disassociate the node. 
      */
    var ServerName: ServerName
  }
  
  trait DescribeNodeAssociationStatusResponse extends js.Object {
    /**
      * Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). 
      */
    var EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined
    /**
      * The status of the association or disassociation request.   Possible values:     SUCCESS: The association or disassociation succeeded.     FAILED: The association or disassociation failed.     IN_PROGRESS: The association or disassociation is still in progress.   
      */
    var NodeAssociationStatus: js.UndefOr[NodeAssociationStatus] = js.undefined
  }
  
  trait DescribeServersRequest extends js.Object {
    /**
      * This is not currently implemented for DescribeServers requests. 
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * This is not currently implemented for DescribeServers requests. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Describes the server with the specified ServerName.
      */
    var ServerName: js.UndefOr[ServerName] = js.undefined
  }
  
  trait DescribeServersResponse extends js.Object {
    /**
      * This is not currently implemented for DescribeServers requests. 
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Contains the response to a DescribeServers request.  For Puppet Server: DescribeServersResponse$Servers$EngineAttributes contains PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port number 8140. The CA certificate is also used to sign node certificates.
      */
    var Servers: js.UndefOr[Servers] = js.undefined
  }
  
  trait DisassociateNodeRequest extends js.Object {
    /**
      * Engine attributes that are used for disassociating the node. No attributes are required for Puppet.   Attributes required in a DisassociateNode request for Chef     CHEF_ORGANIZATION: The Chef organization with which the node was associated. By default only one organization named default can exist.   
      */
    var EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined
    /**
      * The name of the client node. 
      */
    var NodeName: NodeName
    /**
      * The name of the server from which to disassociate the node. 
      */
    var ServerName: ServerName
  }
  
  trait DisassociateNodeResponse extends js.Object {
    /**
      * Contains a token which can be passed to the DescribeNodeAssociationStatus API call to get the status of the disassociation request. 
      */
    var NodeAssociationStatusToken: js.UndefOr[NodeAssociationStatusToken] = js.undefined
  }
  
  trait EngineAttribute extends js.Object {
    /**
      * The name of the engine attribute. 
      */
    var Name: js.UndefOr[EngineAttributeName] = js.undefined
    /**
      * The value of the engine attribute. 
      */
    var Value: js.UndefOr[EngineAttributeValue] = js.undefined
  }
  
  trait ExportServerEngineAttributeRequest extends js.Object {
    /**
      * The name of the export attribute. Currently, the supported export attribute is Userdata. This exports a user data script that includes parameters and values provided in the InputAttributes list.
      */
    var ExportAttributeName: String
    /**
      * The list of engine attributes. The list type is EngineAttribute. An EngineAttribute list item is a pair that includes an attribute name and its value. For the Userdata ExportAttributeName, the following are supported engine attribute names.    RunList In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this parameter is ignored.    OrganizationName In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the organization default. In Puppet, this parameter is ignored.    NodeEnvironment In Chef, a node environment (for example, development, staging, or one-box). In Puppet, this parameter is ignored.    NodeClientVersion In Chef, the version of the Chef engine (three numbers separated by dots, such as 13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In Puppet, this parameter is ignored.  
      */
    var InputAttributes: js.UndefOr[EngineAttributes] = js.undefined
    /**
      * The name of the server from which you are exporting the attribute.
      */
    var ServerName: ServerName
  }
  
  trait ExportServerEngineAttributeResponse extends js.Object {
    /**
      * The requested engine attribute pair with attribute name and value.
      */
    var EngineAttribute: js.UndefOr[EngineAttribute] = js.undefined
    /**
      * The server name used in the request.
      */
    var ServerName: js.UndefOr[ServerName] = js.undefined
  }
  
  trait RestoreServerRequest extends js.Object {
    /**
      *  The ID of the backup that you want to use to restore a server. 
      */
    var BackupId: BackupId
    /**
      *  The type of the instance to create. Valid values must be specified in the following format: ^([cm][34]|t2).* For example, m4.large. Valid values are t2.medium, m4.large, and m4.2xlarge. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. 
      */
    var InstanceType: js.UndefOr[String] = js.undefined
    /**
      *  The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. 
      */
    var KeyPair: js.UndefOr[KeyPair] = js.undefined
    /**
      *  The name of the server that you want to restore. 
      */
    var ServerName: ServerName
  }
  
  trait RestoreServerResponse extends js.Object
  
  trait Server extends js.Object {
    /**
      * Associate a public IP address with a server that you are launching. 
      */
    var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined
    /**
      * The number of automated backups to keep. 
      */
    var BackupRetentionCount: js.UndefOr[Integer] = js.undefined
    /**
      * The ARN of the CloudFormation stack that was used to create the server. 
      */
    var CloudFormationStackArn: js.UndefOr[String] = js.undefined
    /**
      * Time stamp of server creation. Example 2016-07-29T13:38:47.520Z 
      */
    var CreatedAt: js.UndefOr[Timestamp] = js.undefined
    /**
      * Disables automated backups. The number of stored backups is dependent on the value of PreferredBackupCount. 
      */
    var DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined
    /**
      *  A DNS name that can be used to access the engine. Example: myserver-asdfghjkl.us-east-1.opsworks.io 
      */
    var Endpoint: js.UndefOr[String] = js.undefined
    /**
      * The engine type of the server. Valid values in this release include Chef and Puppet. 
      */
    var Engine: js.UndefOr[String] = js.undefined
    /**
      * The response of a createServer() request returns the master credential to access the server in EngineAttributes. These credentials are not stored by AWS OpsWorks CM; they are returned only as part of the result of createServer().   Attributes returned in a createServer response for Chef     CHEF_PIVOTAL_KEY: A base64-encoded RSA private key that is generated by AWS OpsWorks for Chef Automate. This private key is required to access the Chef API.    CHEF_STARTER_KIT: A base64-encoded ZIP file. The ZIP file contains a Chef starter kit, which includes a README, a configuration file, and the required RSA private key. Save this file, unzip it, and then change to the directory where you've unzipped the file contents. From this directory, you can run Knife commands.    Attributes returned in a createServer response for Puppet     PUPPET_STARTER_KIT: A base64-encoded ZIP file. The ZIP file contains a Puppet starter kit, including a README and a required private key. Save this file, unzip it, and then change to the directory where you've unzipped the file contents.    PUPPET_ADMIN_PASSWORD: An administrator password that you can use to sign in to the Puppet Enterprise console after the server is online.  
      */
    var EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined
    /**
      * The engine model of the server. Valid values in this release include Monolithic for Puppet and Single for Chef. 
      */
    var EngineModel: js.UndefOr[String] = js.undefined
    /**
      * The engine version of the server. For a Chef server, the valid value for EngineVersion is currently 12. For a Puppet server, the valid value is 2017. 
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The instance profile ARN of the server. 
      */
    var InstanceProfileArn: js.UndefOr[String] = js.undefined
    /**
      *  The instance type for the server, as specified in the CloudFormation stack. This might not be the same instance type that is shown in the EC2 console. 
      */
    var InstanceType: js.UndefOr[String] = js.undefined
    /**
      * The key pair associated with the server. 
      */
    var KeyPair: js.UndefOr[String] = js.undefined
    /**
      * The status of the most recent server maintenance run. Shows SUCCESS or FAILED. 
      */
    var MaintenanceStatus: js.UndefOr[MaintenanceStatus] = js.undefined
    /**
      * The preferred backup period specified for the server. 
      */
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
    /**
      * The preferred maintenance period specified for the server. 
      */
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
    /**
      *  The security group IDs for the server, as specified in the CloudFormation stack. These might not be the same security groups that are shown in the EC2 console. 
      */
    var SecurityGroupIds: js.UndefOr[Strings] = js.undefined
    /**
      * The ARN of the server. 
      */
    var ServerArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the server. 
      */
    var ServerName: js.UndefOr[String] = js.undefined
    /**
      * The service role ARN used to create the server. 
      */
    var ServiceRoleArn: js.UndefOr[String] = js.undefined
    /**
      *  The server's status. This field displays the states of actions in progress, such as creating, running, or backing up the server, as well as the server's health state. 
      */
    var Status: js.UndefOr[ServerStatus] = js.undefined
    /**
      *  Depending on the server status, this field has either a human-readable message (such as a create or backup error), or an escaped block of JSON (used for health check results). 
      */
    var StatusReason: js.UndefOr[String] = js.undefined
    /**
      *  The subnet IDs specified in a CreateServer request. 
      */
    var SubnetIds: js.UndefOr[Strings] = js.undefined
  }
  
  trait ServerEvent extends js.Object {
    /**
      * The time when the event occurred. 
      */
    var CreatedAt: js.UndefOr[Timestamp] = js.undefined
    /**
      * The Amazon S3 URL of the event's log file.
      */
    var LogUrl: js.UndefOr[String] = js.undefined
    /**
      * A human-readable informational or status message.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      * The name of the server on or for which the event occurred. 
      */
    var ServerName: js.UndefOr[String] = js.undefined
  }
  
  trait StartMaintenanceRequest extends js.Object {
    /**
      * Engine attributes that are specific to the server on which you want to run maintenance. 
      */
    var EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined
    /**
      * The name of the server on which to run maintenance. 
      */
    var ServerName: ServerName
  }
  
  trait StartMaintenanceResponse extends js.Object {
    /**
      * Contains the response to a StartMaintenance request. 
      */
    var Server: js.UndefOr[Server] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      *  Associates a new node with the server. For more information about how to disassociate a node, see DisassociateNode.  On a Chef server: This command is an alternative to knife bootstrap.  Example (Chef): aws opsworks-cm associate-node --server-name MyServer --node-name MyManagedNode --engine-attributes "Name=CHEF_ORGANIZATION,Value=default" "Name=CHEF_NODE_PUBLIC_KEY,Value=public-key-pem"   On a Puppet server, this command is an alternative to the puppet cert sign command that signs a Puppet node CSR.   Example (Chef): aws opsworks-cm associate-node --server-name MyServer --node-name MyManagedNode --engine-attributes "Name=PUPPET_NODE_CSR,Value=csr-pem"   A node can can only be associated with servers that are in a HEALTHY state. Otherwise, an InvalidStateException is thrown. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. The AssociateNode API call can be integrated into Auto Scaling configurations, AWS Cloudformation templates, or the user data of a server's instance. 
      */
    def associateNode(): awsDashSdkLib.libRequestMod.Request[AssociateNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateNode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateNodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Associates a new node with the server. For more information about how to disassociate a node, see DisassociateNode.  On a Chef server: This command is an alternative to knife bootstrap.  Example (Chef): aws opsworks-cm associate-node --server-name MyServer --node-name MyManagedNode --engine-attributes "Name=CHEF_ORGANIZATION,Value=default" "Name=CHEF_NODE_PUBLIC_KEY,Value=public-key-pem"   On a Puppet server, this command is an alternative to the puppet cert sign command that signs a Puppet node CSR.   Example (Chef): aws opsworks-cm associate-node --server-name MyServer --node-name MyManagedNode --engine-attributes "Name=PUPPET_NODE_CSR,Value=csr-pem"   A node can can only be associated with servers that are in a HEALTHY state. Otherwise, an InvalidStateException is thrown. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. The AssociateNode API call can be integrated into Auto Scaling configurations, AWS Cloudformation templates, or the user data of a server's instance. 
      */
    def associateNode(params: AssociateNodeRequest): awsDashSdkLib.libRequestMod.Request[AssociateNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateNode(
      params: AssociateNodeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateNodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates an application-level backup of a server. While the server is in the BACKING_UP state, the server cannot be changed, and no additional backup can be created.   Backups can be created for servers in RUNNING, HEALTHY, and UNHEALTHY states. By default, you can create a maximum of 50 manual backups.   This operation is asynchronous.   A LimitExceededException is thrown when the maximum number of manual backups is reached. An InvalidStateException is thrown when the server is not in any of the following states: RUNNING, HEALTHY, or UNHEALTHY. A ResourceNotFoundException is thrown when the server is not found. A ValidationException is thrown when parameters of the request are not valid. 
      */
    def createBackup(): awsDashSdkLib.libRequestMod.Request[CreateBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates an application-level backup of a server. While the server is in the BACKING_UP state, the server cannot be changed, and no additional backup can be created.   Backups can be created for servers in RUNNING, HEALTHY, and UNHEALTHY states. By default, you can create a maximum of 50 manual backups.   This operation is asynchronous.   A LimitExceededException is thrown when the maximum number of manual backups is reached. An InvalidStateException is thrown when the server is not in any of the following states: RUNNING, HEALTHY, or UNHEALTHY. A ResourceNotFoundException is thrown when the server is not found. A ValidationException is thrown when parameters of the request are not valid. 
      */
    def createBackup(params: CreateBackupRequest): awsDashSdkLib.libRequestMod.Request[CreateBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBackup(
      params: CreateBackupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBackupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates and immedately starts a new server. The server is ready to use when it is in the HEALTHY state. By default, you can create a maximum of 10 servers.   This operation is asynchronous.   A LimitExceededException is thrown when you have created the maximum number of servers (10). A ResourceAlreadyExistsException is thrown when a server with the same name already exists in the account. A ResourceNotFoundException is thrown when you specify a backup ID that is not valid or is for a backup that does not exist. A ValidationException is thrown when parameters of the request are not valid.   If you do not specify a security group by adding the SecurityGroupIds parameter, AWS OpsWorks creates a new security group.   Chef Automate: The default security group opens the Chef server to the world on TCP port 443. If a KeyName is present, AWS OpsWorks enables SSH access. SSH is also open to the world on TCP port 22.   Puppet Enterprise: The default security group opens TCP ports 22, 443, 4433, 8140, 8142, 8143, and 8170. If a KeyName is present, AWS OpsWorks enables SSH access. SSH is also open to the world on TCP port 22.  By default, your server is accessible from any IP address. We recommend that you update your security group rules to allow access from known IP addresses and address ranges only. To edit security group rules, open Security Groups in the navigation pane of the EC2 management console. 
      */
    def createServer(): awsDashSdkLib.libRequestMod.Request[CreateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createServer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates and immedately starts a new server. The server is ready to use when it is in the HEALTHY state. By default, you can create a maximum of 10 servers.   This operation is asynchronous.   A LimitExceededException is thrown when you have created the maximum number of servers (10). A ResourceAlreadyExistsException is thrown when a server with the same name already exists in the account. A ResourceNotFoundException is thrown when you specify a backup ID that is not valid or is for a backup that does not exist. A ValidationException is thrown when parameters of the request are not valid.   If you do not specify a security group by adding the SecurityGroupIds parameter, AWS OpsWorks creates a new security group.   Chef Automate: The default security group opens the Chef server to the world on TCP port 443. If a KeyName is present, AWS OpsWorks enables SSH access. SSH is also open to the world on TCP port 22.   Puppet Enterprise: The default security group opens TCP ports 22, 443, 4433, 8140, 8142, 8143, and 8170. If a KeyName is present, AWS OpsWorks enables SSH access. SSH is also open to the world on TCP port 22.  By default, your server is accessible from any IP address. We recommend that you update your security group rules to allow access from known IP addresses and address ranges only. To edit security group rules, open Security Groups in the navigation pane of the EC2 management console. 
      */
    def createServer(params: CreateServerRequest): awsDashSdkLib.libRequestMod.Request[CreateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createServer(
      params: CreateServerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes a backup. You can delete both manual and automated backups. This operation is asynchronous.   An InvalidStateException is thrown when a backup deletion is already in progress. A ResourceNotFoundException is thrown when the backup does not exist. A ValidationException is thrown when parameters of the request are not valid. 
      */
    def deleteBackup(): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBackupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes a backup. You can delete both manual and automated backups. This operation is asynchronous.   An InvalidStateException is thrown when a backup deletion is already in progress. A ResourceNotFoundException is thrown when the backup does not exist. A ValidationException is thrown when parameters of the request are not valid. 
      */
    def deleteBackup(params: DeleteBackupRequest): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBackup(
      params: DeleteBackupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBackupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBackupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes the server and the underlying AWS CloudFormation stacks (including the server's EC2 instance). When you run this command, the server state is updated to DELETING. After the server is deleted, it is no longer returned by DescribeServer requests. If the AWS CloudFormation stack cannot be deleted, the server cannot be deleted.   This operation is asynchronous.   An InvalidStateException is thrown when a server deletion is already in progress. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid.   
      */
    def deleteServer(): awsDashSdkLib.libRequestMod.Request[DeleteServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteServer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes the server and the underlying AWS CloudFormation stacks (including the server's EC2 instance). When you run this command, the server state is updated to DELETING. After the server is deleted, it is no longer returned by DescribeServer requests. If the AWS CloudFormation stack cannot be deleted, the server cannot be deleted.   This operation is asynchronous.   An InvalidStateException is thrown when a server deletion is already in progress. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid.   
      */
    def deleteServer(params: DeleteServerRequest): awsDashSdkLib.libRequestMod.Request[DeleteServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteServer(
      params: DeleteServerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Describes your account attributes, and creates requests to increase limits before they are reached or exceeded.   This operation is synchronous. 
      */
    def describeAccountAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Describes your account attributes, and creates requests to increase limits before they are reached or exceeded.   This operation is synchronous. 
      */
    def describeAccountAttributes(params: DescribeAccountAttributesRequest): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountAttributes(
      params: DescribeAccountAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Describes backups. The results are ordered by time, with newest backups first. If you do not specify a BackupId or ServerName, the command returns all backups.   This operation is synchronous.   A ResourceNotFoundException is thrown when the backup does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def describeBackups(): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBackups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBackupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Describes backups. The results are ordered by time, with newest backups first. If you do not specify a BackupId or ServerName, the command returns all backups.   This operation is synchronous.   A ResourceNotFoundException is thrown when the backup does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def describeBackups(params: DescribeBackupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBackups(
      params: DescribeBackupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBackupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBackupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Describes events for a specified server. Results are ordered by time, with newest events first.   This operation is synchronous.   A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def describeEvents(): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Describes events for a specified server. Results are ordered by time, with newest events first.   This operation is synchronous.   A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def describeEvents(params: DescribeEventsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      params: DescribeEventsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns the current status of an existing association or disassociation request.   A ResourceNotFoundException is thrown when no recent association or disassociation request with the specified token is found, or when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def describeNodeAssociationStatus(): awsDashSdkLib.libRequestMod.Request[DescribeNodeAssociationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeNodeAssociationStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeNodeAssociationStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeNodeAssociationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns the current status of an existing association or disassociation request.   A ResourceNotFoundException is thrown when no recent association or disassociation request with the specified token is found, or when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def describeNodeAssociationStatus(params: DescribeNodeAssociationStatusRequest): awsDashSdkLib.libRequestMod.Request[DescribeNodeAssociationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeNodeAssociationStatus(
      params: DescribeNodeAssociationStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeNodeAssociationStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeNodeAssociationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Lists all configuration management servers that are identified with your account. Only the stored results from Amazon DynamoDB are returned. AWS OpsWorks CM does not query other services.   This operation is synchronous.   A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def describeServers(): awsDashSdkLib.libRequestMod.Request[DescribeServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeServers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeServersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Lists all configuration management servers that are identified with your account. Only the stored results from Amazon DynamoDB are returned. AWS OpsWorks CM does not query other services.   This operation is synchronous.   A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def describeServers(params: DescribeServersRequest): awsDashSdkLib.libRequestMod.Request[DescribeServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeServers(
      params: DescribeServersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeServersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Disassociates a node from an AWS OpsWorks CM server, and removes the node from the server's managed nodes. After a node is disassociated, the node key pair is no longer valid for accessing the configuration manager's API. For more information about how to associate a node, see AssociateNode.  A node can can only be disassociated from a server that is in a HEALTHY state. Otherwise, an InvalidStateException is thrown. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def disassociateNode(): awsDashSdkLib.libRequestMod.Request[DisassociateNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateNode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateNodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Disassociates a node from an AWS OpsWorks CM server, and removes the node from the server's managed nodes. After a node is disassociated, the node key pair is no longer valid for accessing the configuration manager's API. For more information about how to associate a node, see AssociateNode.  A node can can only be disassociated from a server that is in a HEALTHY state. Otherwise, an InvalidStateException is thrown. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def disassociateNode(params: DisassociateNodeRequest): awsDashSdkLib.libRequestMod.Request[DisassociateNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateNode(
      params: DisassociateNodeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateNodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateNodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Exports a specified server engine attribute as a base64-encoded string. For example, you can export user data that you can use in EC2 to associate nodes with a server.   This operation is synchronous.   A ValidationException is raised when parameters of the request are not valid. A ResourceNotFoundException is thrown when the server does not exist. An InvalidStateException is thrown when the server is in any of the following states: CREATING, TERMINATED, FAILED or DELETING. 
      */
    def exportServerEngineAttribute(): awsDashSdkLib.libRequestMod.Request[ExportServerEngineAttributeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def exportServerEngineAttribute(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExportServerEngineAttributeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExportServerEngineAttributeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Exports a specified server engine attribute as a base64-encoded string. For example, you can export user data that you can use in EC2 to associate nodes with a server.   This operation is synchronous.   A ValidationException is raised when parameters of the request are not valid. A ResourceNotFoundException is thrown when the server does not exist. An InvalidStateException is thrown when the server is in any of the following states: CREATING, TERMINATED, FAILED or DELETING. 
      */
    def exportServerEngineAttribute(params: ExportServerEngineAttributeRequest): awsDashSdkLib.libRequestMod.Request[ExportServerEngineAttributeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def exportServerEngineAttribute(
      params: ExportServerEngineAttributeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExportServerEngineAttributeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExportServerEngineAttributeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Restores a backup to a server that is in a CONNECTION_LOST, HEALTHY, RUNNING, UNHEALTHY, or TERMINATED state. When you run RestoreServer, the server's EC2 instance is deleted, and a new EC2 instance is configured. RestoreServer maintains the existing server endpoint, so configuration management of the server's client devices (nodes) should continue to work.   This operation is asynchronous.   An InvalidStateException is thrown when the server is not in a valid state. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def restoreServer(): awsDashSdkLib.libRequestMod.Request[RestoreServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreServer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Restores a backup to a server that is in a CONNECTION_LOST, HEALTHY, RUNNING, UNHEALTHY, or TERMINATED state. When you run RestoreServer, the server's EC2 instance is deleted, and a new EC2 instance is configured. RestoreServer maintains the existing server endpoint, so configuration management of the server's client devices (nodes) should continue to work.   This operation is asynchronous.   An InvalidStateException is thrown when the server is not in a valid state. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def restoreServer(params: RestoreServerRequest): awsDashSdkLib.libRequestMod.Request[RestoreServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreServer(
      params: RestoreServerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Manually starts server maintenance. This command can be useful if an earlier maintenance attempt failed, and the underlying cause of maintenance failure has been resolved. The server is in an UNDER_MAINTENANCE state while maintenance is in progress.   Maintenance can only be started on servers in HEALTHY and UNHEALTHY states. Otherwise, an InvalidStateException is thrown. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def startMaintenance(): awsDashSdkLib.libRequestMod.Request[StartMaintenanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startMaintenance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartMaintenanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartMaintenanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Manually starts server maintenance. This command can be useful if an earlier maintenance attempt failed, and the underlying cause of maintenance failure has been resolved. The server is in an UNDER_MAINTENANCE state while maintenance is in progress.   Maintenance can only be started on servers in HEALTHY and UNHEALTHY states. Otherwise, an InvalidStateException is thrown. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def startMaintenance(params: StartMaintenanceRequest): awsDashSdkLib.libRequestMod.Request[StartMaintenanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startMaintenance(
      params: StartMaintenanceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartMaintenanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartMaintenanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Updates settings for a server.   This operation is synchronous. 
      */
    def updateServer(): awsDashSdkLib.libRequestMod.Request[UpdateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateServer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Updates settings for a server.   This operation is synchronous. 
      */
    def updateServer(params: UpdateServerRequest): awsDashSdkLib.libRequestMod.Request[UpdateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateServer(
      params: UpdateServerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateServerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Updates engine-specific attributes on a specified server. The server enters the MODIFYING state when this operation is in progress. Only one update can occur at a time. You can use this command to reset a Chef server's public key (CHEF_PIVOTAL_KEY) or a Puppet server's admin password (PUPPET_ADMIN_PASSWORD).   This operation is asynchronous.   This operation can only be called for servers in HEALTHY or UNHEALTHY states. Otherwise, an InvalidStateException is raised. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def updateServerEngineAttributes(): awsDashSdkLib.libRequestMod.Request[UpdateServerEngineAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateServerEngineAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateServerEngineAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateServerEngineAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Updates engine-specific attributes on a specified server. The server enters the MODIFYING state when this operation is in progress. Only one update can occur at a time. You can use this command to reset a Chef server's public key (CHEF_PIVOTAL_KEY) or a Puppet server's admin password (PUPPET_ADMIN_PASSWORD).   This operation is asynchronous.   This operation can only be called for servers in HEALTHY or UNHEALTHY states. Otherwise, an InvalidStateException is raised. A ResourceNotFoundException is thrown when the server does not exist. A ValidationException is raised when parameters of the request are not valid. 
      */
    def updateServerEngineAttributes(params: UpdateServerEngineAttributesRequest): awsDashSdkLib.libRequestMod.Request[UpdateServerEngineAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateServerEngineAttributes(
      params: UpdateServerEngineAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateServerEngineAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateServerEngineAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the nodeAssociated state by periodically calling the underlying OpsWorksCM.describeNodeAssociationStatusoperation every 15 seconds (at most 15 times). Wait until node is associated or disassociated.
      */
    @JSName("waitFor")
    def waitFor_nodeAssociated(state: awsDashSdkLib.awsDashSdkLibStrings.nodeAssociated): awsDashSdkLib.libRequestMod.Request[DescribeNodeAssociationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_nodeAssociated(
      state: awsDashSdkLib.awsDashSdkLibStrings.nodeAssociated,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeNodeAssociationStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeNodeAssociationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the nodeAssociated state by periodically calling the underlying OpsWorksCM.describeNodeAssociationStatusoperation every 15 seconds (at most 15 times). Wait until node is associated or disassociated.
      */
    @JSName("waitFor")
    def waitFor_nodeAssociated(
      state: awsDashSdkLib.awsDashSdkLibStrings.nodeAssociated,
      params: DescribeNodeAssociationStatusRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeNodeAssociationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_nodeAssociated(
      state: awsDashSdkLib.awsDashSdkLibStrings.nodeAssociated,
      params: DescribeNodeAssociationStatusRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeNodeAssociationStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeNodeAssociationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateServerEngineAttributesRequest extends js.Object {
    /**
      * The name of the engine attribute to update. 
      */
    var AttributeName: AttributeName
    /**
      * The value to set for the attribute. 
      */
    var AttributeValue: js.UndefOr[AttributeValue] = js.undefined
    /**
      * The name of the server to update. 
      */
    var ServerName: ServerName
  }
  
  trait UpdateServerEngineAttributesResponse extends js.Object {
    /**
      * Contains the response to an UpdateServerEngineAttributes request. 
      */
    var Server: js.UndefOr[Server] = js.undefined
  }
  
  trait UpdateServerRequest extends js.Object {
    /**
      * Sets the number of automated backups that you want to keep. 
      */
    var BackupRetentionCount: js.UndefOr[Integer] = js.undefined
    /**
      * Setting DisableAutomatedBackup to true disables automated or scheduled backups. Automated backups are enabled by default. 
      */
    var DisableAutomatedBackup: js.UndefOr[Boolean] = js.undefined
    var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
    var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.undefined
    /**
      * The name of the server to update. 
      */
    var ServerName: ServerName
  }
  
  trait UpdateServerResponse extends js.Object {
    /**
      * Contains the response to a UpdateServer request. 
      */
    var Server: js.UndefOr[Server] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AccountAttributes = js.Array[AccountAttribute]
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type BackupId = java.lang.String
  type BackupRetentionCountDefinition = scala.Double
  type BackupStatus = awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.OK | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.DELETING | java.lang.String
  type BackupType = awsDashSdkLib.awsDashSdkLibStrings.AUTOMATED | awsDashSdkLib.awsDashSdkLibStrings.MANUAL | java.lang.String
  type Backups = js.Array[Backup]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EngineAttributeName = java.lang.String
  type EngineAttributeValue = java.lang.String
  type EngineAttributes = js.Array[EngineAttribute]
  type InstanceProfileArn = java.lang.String
  type Integer = scala.Double
  type KeyPair = java.lang.String
  type MaintenanceStatus = awsDashSdkLib.awsDashSdkLibStrings.SUCCESS | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type NodeAssociationStatus = awsDashSdkLib.awsDashSdkLibStrings.SUCCESS | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | java.lang.String
  type NodeAssociationStatusToken = java.lang.String
  type NodeName = java.lang.String
  type ServerEvents = js.Array[ServerEvent]
  type ServerName = java.lang.String
  type ServerStatus = awsDashSdkLib.awsDashSdkLibStrings.BACKING_UP | awsDashSdkLib.awsDashSdkLibStrings.CONNECTION_LOST | awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.MODIFYING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.HEALTHY | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.RESTORING | awsDashSdkLib.awsDashSdkLibStrings.SETUP | awsDashSdkLib.awsDashSdkLibStrings.UNDER_MAINTENANCE | awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY | awsDashSdkLib.awsDashSdkLibStrings.TERMINATED | java.lang.String
  type Servers = js.Array[Server]
  type ServiceRoleArn = java.lang.String
  type String = java.lang.String
  type Strings = js.Array[String]
  type TimeWindowDefinition = java.lang.String
  type Timestamp = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-11-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

