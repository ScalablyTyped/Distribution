package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsWorksCM
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_OpsWorksCM: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
    *  Describes your OpsWorks-CM account attributes.   This operation is synchronous. 
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
    *  Describes your OpsWorks-CM account attributes.   This operation is synchronous. 
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

