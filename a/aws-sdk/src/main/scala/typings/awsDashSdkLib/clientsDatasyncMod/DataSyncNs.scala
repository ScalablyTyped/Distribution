package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/datasync", "DataSync")
@js.native
object DataSyncNs extends js.Object {
  
  trait AgentListEntry extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the agent.
         */
    var AgentArn: js.UndefOr[AgentArn] = js.undefined
    /**
         * The name of the agent.
         */
    var Name: js.UndefOr[TagValue] = js.undefined
    /**
         * The status of the agent.
         */
    var Status: js.UndefOr[AgentStatus] = js.undefined
  }
  
  
  trait CancelTaskExecutionRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the task execution to cancel.
         */
    var TaskExecutionArn: TaskExecutionArn
  }
  
  
  trait CancelTaskExecutionResponse extends js.Object
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateAgentRequest extends js.Object {
    /**
         * Your agent activation key. You can get the activation key either by sending an HTTP GET request with redirects that enable you to get the agent IP address (port 80). Alternatively, you can get it from the AWS DataSync console.  The redirect URL returned in the response provides you the activation key for your agent in the query string parameter activationKey. It might also include other activation-related parameters; however, these are merely defaults. The arguments you pass to this API call determine the actual configuration of your agent. For more information, see Activating a Sync Agent in the AWS DataSync User Guide. 
         */
    var ActivationKey: ActivationKey
    /**
         * The name you configured for your agent. This value is a text reference that is used to identify the agent in the console.
         */
    var AgentName: js.UndefOr[TagValue] = js.undefined
    /**
         * The key-value pair that represents the tag you want to associate with the agent. The value can be an empty string. This value helps you manage, filter, and search for your agents.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @.  
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateAgentResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the agent. Use the ListAgents operation to return a list of agents for your account and AWS Region.
         */
    var AgentArn: js.UndefOr[AgentArn] = js.undefined
  }
  
  
  trait CreateLocationEfsRequest extends js.Object {
    /**
         * The subnet and security group that the Amazon EFS file system uses.
         */
    var Ec2Config: Ec2Config
    /**
         * The Amazon Resource Name (ARN) for the Amazon EFS file system.
         */
    var EfsFilesystemArn: EfsFilesystemArn
    /**
         * A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from the EFS source location or write data to the EFS destination. By default, AWS DataSync uses the root directory.
         */
    var Subdirectory: Subdirectory
    /**
         * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for your location.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateLocationEfsResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
         */
    var LocationArn: js.UndefOr[LocationArn] = js.undefined
  }
  
  
  trait CreateLocationNfsRequest extends js.Object {
    /**
         * Contains a list of Amazon Resource Names (ARNs) of agents that are used to connect to an NFS server.
         */
    var OnPremConfig: OnPremConfig
    /**
         * The name of the NFS server. This value is the IP address or Domain Name Service (DNS) name of the NFS server. An agent that is installed on-premises uses this host name to mount the NFS server in a network.   This name must either be DNS-compliant or must be an IP version 4 (IPv4) address. 
         */
    var ServerHostname: ServerHostname
    /**
         * The subdirectory in the NFS file system that is used to read data from the NFS source location or write data to the NFS destination. The NFS path should be a path that's exported by the NFS server, or a subdirectory of that path. The path should be such that it can be mounted by other NFS clients in your network.  To see all the paths exported by your NFS server. run "showmount -e nfs-server-name" from an NFS client that has access to your server. You can specify any directory that appears in the results, and any subdirectory of that directory. Ensure that the NFS export is accessible without Kerberos authentication.  To transfer all the data in the folder you specified, DataSync needs to have permissions to read all the data. To ensure this, either configure the NFS export with no_root_squash, or ensure that the permissions for all of the files that you want sync allow read access for all users. Doing either enables the agent to read the files. For the agent to access directories, you must additionally enable all execute access. For information about NFS export configuration, see 18.7. The /etc/exports Configuration File in the Centos documentation. 
         */
    var Subdirectory: Subdirectory
    /**
         * The key-value pair that represents the tag that you want to add to the location. The value can be an empty string. We recommend using tags to name your resources.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateLocationNfsResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the source NFS file system location that is created.
         */
    var LocationArn: js.UndefOr[LocationArn] = js.undefined
  }
  
  
  trait CreateLocationS3Request extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
         */
    var S3BucketArn: S3BucketArn
    var S3Config: S3Config
    /**
         * A subdirectory in the Amazon S3 bucket. This subdirectory in Amazon S3 is used to read data from the S3 source location or write data to the S3 destination.
         */
    var Subdirectory: Subdirectory
    /**
         * The key-value pair that represents the tag that you want to add to the location. The value can be an empty string. We recommend using tags to name your resources.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateLocationS3Response extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the source Amazon S3 bucket location that is created.
         */
    var LocationArn: js.UndefOr[LocationArn] = js.undefined
  }
  
  
  trait CreateTaskRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events in the task. For more information on these groups, see Working with Log Groups and Log Streams in the Amazon CloudWatch User Guide.   For more information about how to useCloudWatchLogs with DataSync, see Monitoring Your Task.
         */
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of an AWS storage resource's location. 
         */
    var DestinationLocationArn: LocationArn
    /**
         * The name of a task. This value is a text reference that is used to identify the task in the console. 
         */
    var Name: js.UndefOr[TagValue] = js.undefined
    /**
         * The set of configuration options that control the behavior of a single execution of the task that occurs when you call StartTaskExecution. You can configure these options to preserve metadata such as user ID (UID) and group ID (GID), file permissions, data integrity verification, and so on. For each individual task execution, you can override these options by specifying the OverrideOptions before starting a the task execution. For more information, see the operation. 
         */
    var Options: js.UndefOr[Options] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the source location for the task.
         */
    var SourceLocationArn: LocationArn
    /**
         * The key-value pair that represents the tag that you want to add to the resource. The value can be an empty string. 
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateTaskResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the task.
         */
    var TaskArn: js.UndefOr[TaskArn] = js.undefined
  }
  
  
  trait DeleteAgentRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the agent to delete. Use the ListAgents operation to return a list of agents for your account and AWS Region.
         */
    var AgentArn: AgentArn
  }
  
  
  trait DeleteAgentResponse extends js.Object
  
  
  trait DeleteLocationRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the location to delete.
         */
    var LocationArn: LocationArn
  }
  
  
  trait DeleteLocationResponse extends js.Object
  
  
  trait DeleteTaskRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the task to delete.
         */
    var TaskArn: TaskArn
  }
  
  
  trait DeleteTaskResponse extends js.Object
  
  
  trait DescribeAgentRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the agent to describe.
         */
    var AgentArn: AgentArn
  }
  
  
  trait DescribeAgentResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the agent.
         */
    var AgentArn: js.UndefOr[AgentArn] = js.undefined
    /**
         * The time that the agent was activated (that is, created in your account).
         */
    var CreationTime: js.UndefOr[Time] = js.undefined
    /**
         * The time that the agent was last connected.
         */
    var LastConnectionTime: js.UndefOr[Time] = js.undefined
    /**
         * The name of the agent.
         */
    var Name: js.UndefOr[TagValue] = js.undefined
    /**
         * The status of the agent. If the status is ONLINE, then the agent is configured properly and is available to use. The Running status is the normal running status for an agent. If the status is OFFLINE, the agent's VM is turned off or the agent is in an unhealthy state. When the issue that caused the unhealthy state is resolved, the agent returns to ONLINE status.
         */
    var Status: js.UndefOr[AgentStatus] = js.undefined
  }
  
  
  trait DescribeLocationEfsRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the EFS location to describe.
         */
    var LocationArn: LocationArn
  }
  
  
  trait DescribeLocationEfsResponse extends js.Object {
    /**
         * The time that the EFS location was created.
         */
    var CreationTime: js.UndefOr[Time] = js.undefined
    var Ec2Config: js.UndefOr[Ec2Config] = js.undefined
    /**
         * The Amazon resource Name (ARN) of the EFS location that was described.
         */
    var LocationArn: js.UndefOr[LocationArn] = js.undefined
    /**
         * The URL of the EFS location that was described.
         */
    var LocationUri: js.UndefOr[LocationUri] = js.undefined
  }
  
  
  trait DescribeLocationNfsRequest extends js.Object {
    /**
         * The Amazon resource Name (ARN) of the NFS location to describe.
         */
    var LocationArn: LocationArn
  }
  
  
  trait DescribeLocationNfsResponse extends js.Object {
    /**
         * The time that the NFS location was created.
         */
    var CreationTime: js.UndefOr[Time] = js.undefined
    /**
         * The Amazon resource Name (ARN) of the NFS location that was described.
         */
    var LocationArn: js.UndefOr[LocationArn] = js.undefined
    /**
         * The URL of the source NFS location that was described.
         */
    var LocationUri: js.UndefOr[LocationUri] = js.undefined
    var OnPremConfig: js.UndefOr[OnPremConfig] = js.undefined
  }
  
  
  trait DescribeLocationS3Request extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the Amazon S3 bucket location to describe.
         */
    var LocationArn: LocationArn
  }
  
  
  trait DescribeLocationS3Response extends js.Object {
    /**
         * The time that the Amazon S3 bucket location was created.
         */
    var CreationTime: js.UndefOr[Time] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the Amazon S3 bucket location.
         */
    var LocationArn: js.UndefOr[LocationArn] = js.undefined
    /**
         * The URL of the Amazon S3 location that was described.
         */
    var LocationUri: js.UndefOr[LocationUri] = js.undefined
    var S3Config: js.UndefOr[S3Config] = js.undefined
  }
  
  
  trait DescribeTaskExecutionRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the task that is being executed.
         */
    var TaskExecutionArn: TaskExecutionArn
  }
  
  
  trait DescribeTaskExecutionResponse extends js.Object {
    /**
         * The physical number of bytes transferred over the network.
         */
    var BytesTransferred: js.UndefOr[long] = js.undefined
    /**
         * The number of logical bytes written to the destination AWS storage resource.
         */
    var BytesWritten: js.UndefOr[long] = js.undefined
    /**
         * The estimated physical number of bytes that is to be transferred over the network.
         */
    var EstimatedBytesToTransfer: js.UndefOr[long] = js.undefined
    /**
         * The expected number of files that is to be transferred over the network. This value is calculated during the PREPARING phase, before the TRANSFERRING phase. This value is the expected number of files to be transferred. It's calculated based on comparing the content of the source and destination locations and finding the delta that needs to be transferred. 
         */
    var EstimatedFilesToTransfer: js.UndefOr[long] = js.undefined
    /**
         * The actual number of files that was transferred over the network. This value is calculated and updated on an ongoing basis during the TRANSFERRING phase. It's updated periodically when each file is read from the source and sent over the network.  If failures occur during a transfer, this value can be less than EstimatedFilesToTransfer. This value can also be greater than EstimatedFilesTransferred in some cases. This element is implementation-specific for some location types, so don't use it as an indicator for a correct file number or to monitor your task execution.
         */
    var FilesTransferred: js.UndefOr[long] = js.undefined
    var Options: js.UndefOr[Options] = js.undefined
    /**
         * The result of the task execution.
         */
    var Result: js.UndefOr[TaskExecutionResultDetail] = js.undefined
    /**
         * The time that the task execution was started.
         */
    var StartTime: js.UndefOr[Time] = js.undefined
    /**
         * The status of the task. For detailed information about sync statuses, see Understanding Sync Task Statuses.
         */
    var Status: js.UndefOr[TaskExecutionStatus] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the task execution that was described. TaskExecutionArn is hierarchical and includes TaskArn for the task that was executed.  For example, a TaskExecution value with the ARN arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2/execution/exec-08ef1e88ec491019b executed the task with the ARN arn:aws:sync:us-east-1:209870788375:task/task-0208075f79cedf4a2. 
         */
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
  }
  
  
  trait DescribeTaskRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the task to describe.
         */
    var TaskArn: TaskArn
  }
  
  
  trait DescribeTaskResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that was used to monitor and log events in the task. For more information on these groups, see Working with Log Groups and Log Streams in the Amazon CloudWatch User Guide. 
         */
    var CloudWatchLogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
    /**
         * The time that the task was created.
         */
    var CreationTime: js.UndefOr[Time] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the task execution that is syncing files.
         */
    var CurrentTaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the AWS storage resource's location.
         */
    var DestinationLocationArn: js.UndefOr[LocationArn] = js.undefined
    /**
         * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
         */
    var ErrorCode: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Detailed description of an error that was encountered during the task execution. You can use this information to help troubleshoot issues. 
         */
    var ErrorDetail: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The name of the task that was described.
         */
    var Name: js.UndefOr[TagValue] = js.undefined
    /**
         * The set of configuration options that control the behavior of a single execution of the task that occurs when you call StartTaskExecution. You can configure these options to preserve metadata such as user ID (UID) and group (GID), file permissions, data integrity verification, and so on. For each individual task execution, you can override these options by specifying the overriding OverrideOptions value to operation. 
         */
    var Options: js.UndefOr[Options] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the source file system's location.
         */
    var SourceLocationArn: js.UndefOr[LocationArn] = js.undefined
    /**
         * The status of the task that was described. For detailed information about sync statuses, see Understanding Sync Task Statuses.
         */
    var Status: js.UndefOr[TaskStatus] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the task that was described.
         */
    var TaskArn: js.UndefOr[TaskArn] = js.undefined
  }
  
  
  trait Ec2Config extends js.Object {
    /**
         * The Amazon Resource Names (ARNs) of the security groups that are configured for the Amazon EC2 resource.
         */
    var SecurityGroupArns: Ec2SecurityGroupArnList
    /**
         * The ARN of the subnet that the Amazon EC2 resource belongs in. 
         */
    var SubnetArn: Ec2SubnetArn
  }
  
  
  trait ListAgentsRequest extends js.Object {
    /**
         * The maximum number of agents to list.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An opaque string that indicates the position at which to begin the next list of agents.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListAgentsResponse extends js.Object {
    /**
         * A list of agents in your account.
         */
    var Agents: js.UndefOr[AgentList] = js.undefined
    /**
         * An opaque string that indicates the position at which to begin returning the next list of agents.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListLocationsRequest extends js.Object {
    /**
         * The maximum number of locations to return.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An opaque string that indicates the position at which to begin the next list of locations.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListLocationsResponse extends js.Object {
    /**
         * An array that contains a list of locations.
         */
    var Locations: js.UndefOr[LocationList] = js.undefined
    /**
         * An opaque string that indicates the position at which to begin returning the next list of locations.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
         * The maximum number of locations to return.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An opaque string that indicates the position at which to begin the next list of locations.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the resource whose tags to list.
         */
    var ResourceArn: TaggableResourceArn
  }
  
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
         * An opaque string that indicates the position at which to begin returning the next list of resource tags.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Array of resource tags.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait ListTaskExecutionsRequest extends js.Object {
    /**
         * The maximum number of executed tasks to list.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An opaque string that indicates the position at which to begin the next list of the executed tasks.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the task whose tasks you want to list.
         */
    var TaskArn: js.UndefOr[TaskArn] = js.undefined
  }
  
  
  trait ListTaskExecutionsResponse extends js.Object {
    /**
         * An opaque string that indicates the position at which to begin returning the next list of executed tasks.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of executed tasks.
         */
    var TaskExecutions: js.UndefOr[TaskExecutionList] = js.undefined
  }
  
  
  trait ListTasksRequest extends js.Object {
    /**
         * The maximum number of tasks to return.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An opaque string that indicates the position at which to begin the next list of tasks.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListTasksResponse extends js.Object {
    /**
         * An opaque string that indicates the position at which to begin returning the next list of tasks.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of all the tasks that are returned.
         */
    var Tasks: js.UndefOr[TaskList] = js.undefined
  }
  
  
  trait LocationListEntry extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the location. For Network File System (NFS) or Amazon EFS, the location is the export path. For Amazon S3, the location is the prefix path that you want to mount and use as the root of the location.
         */
    var LocationArn: js.UndefOr[LocationArn] = js.undefined
    /**
         * Represents a list of URLs of a location. LocationUri returns an array that contains a list of locations when the ListLocations operation is called. Format: TYPE://GLOBAL_ID/SUBDIR. TYPE designates the type of location. Valid values: NFS | EFS | S3. GLOBAL_ID is the globally unique identifier of the resource that backs the location. An example for EFS is us-east-2.fs-abcd1234. An example for Amazon S3 is the bucket name, such as myBucket. An example for NFS is a valid IPv4 address or a host name compliant with Domain Name Service (DNS). SUBDIR is a valid file system path, delimited by forward slashes as is the *nix convention. For NFS and Amazon EFS, it's the export path to mount the location. For Amazon S3, it's the prefix path that you mount to and treat as the root of the location. 
         */
    var LocationUri: js.UndefOr[LocationUri] = js.undefined
  }
  
  
  trait OnPremConfig extends js.Object {
    /**
         * ARNs)of the agents to use for an NFS location.
         */
    var AgentArns: AgentArnList
  }
  
  
  trait Options extends js.Object {
    /**
         * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to). If you set Atime to BEST_EFFORT, DataSync attempts to preserve the original Atime attribute on all source files (that is, the version before the PREPARING phase). However, Atime's behavior is not fully standard across platforms, so AWS DataSync can only do this on a best-effort basis.  Default value: BEST_EFFORT. BEST_EFFORT: Attempt to preserve the per-file Atime value (recommended). NONE: Ignore Atime.  If Atime is set to BEST_EFFORT, Mtime must be set to PRESERVE.  If Atime is set to NONE, Mtime must also be NONE.  
         */
    var Atime: js.UndefOr[Atime] = js.undefined
    /**
         * A value that limits the bandwidth used by AWS DataSync. For example, if you want AWS DataSync to use a maximum of 1 MB, set this value to 1048576 (=1024*1024).
         */
    var BytesPerSecond: js.UndefOr[BytesPerSecond] = js.undefined
    /**
         * The group ID (GID) of the file's owners.  Default value: INT_VALUE. This preserves the integer value of the ID. INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended). NONE: Ignore UID and GID. 
         */
    var Gid: js.UndefOr[Gid] = js.undefined
    /**
         * A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.  Default value: PRESERVE.  PRESERVE: Preserve original Mtime (recommended)  NONE: Ignore Mtime.   If Mtime is set to PRESERVE, Atime must be set to BEST_EFFORT. If Mtime is set to NONE, Atime must also be set to NONE.  
         */
    var Mtime: js.UndefOr[Mtime] = js.undefined
    /**
         * A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.  Default value: PRESERVE. PRESERVE: Preserve POSIX-style permissions (recommended). NONE: Ignore permissions.   AWS DataSync can preserve extant permissions of a source location. 
         */
    var PosixPermissions: js.UndefOr[PosixPermissions] = js.undefined
    /**
         * A value that specifies whether files in the destination that don't exist in the source file system should be preserved.  Default value: PRESERVE. PRESERVE: Ignore such destination files (recommended).  REMOVE: Delete destination files that aren’t present in the source.
         */
    var PreserveDeletedFiles: js.UndefOr[PreserveDeletedFiles] = js.undefined
    /**
         * A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.  AWS DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an end-of-file (EOF) marker.  Default value: NONE. NONE: Ignore special devices (recommended).  PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon EFS. 
         */
    var PreserveDevices: js.UndefOr[PreserveDevices] = js.undefined
    /**
         * The user ID (UID) of the file's owner.  Default value: INT_VALUE. This preserves the integer value of the ID. INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended). NONE: Ignore UID and GID. 
         */
    var Uid: js.UndefOr[Uid] = js.undefined
    /**
         * A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.  Default value: POINT_IN_TIME_CONSISTENT. POINT_IN_TIME_CONSISTENT: Perform verification (recommended).  NONE: Skip verification.
         */
    var VerifyMode: js.UndefOr[VerifyMode] = js.undefined
  }
  
  
  trait S3Config extends js.Object {
    /**
         * The Amazon S3 bucket to access. This bucket is used as a parameter in the CreateLocationS3 operation. 
         */
    var BucketAccessRoleArn: IamRoleArn
  }
  
  
  trait StartTaskExecutionRequest extends js.Object {
    var OverrideOptions: js.UndefOr[Options] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the task to start.
         */
    var TaskArn: TaskArn
  }
  
  
  trait StartTaskExecutionResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the specific task execution that was started.
         */
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
  }
  
  
  trait TagListEntry extends js.Object {
    /**
         * The key for an AWS resource tag.
         */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
         * The value for an AWS resource tag.
         */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  
  trait TagResourceRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource to apply the tag to.
         */
    var ResourceArn: TaggableResourceArn
    /**
         * The tags to apply.
         */
    var Tags: TagList
  }
  
  
  trait TagResourceResponse extends js.Object
  
  
  trait TaskExecutionListEntry extends js.Object {
    /**
         * The status of a task execution.
         */
    var Status: js.UndefOr[TaskExecutionStatus] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the task that was executed.
         */
    var TaskExecutionArn: js.UndefOr[TaskExecutionArn] = js.undefined
  }
  
  
  trait TaskExecutionResultDetail extends js.Object {
    /**
         * Errors that AWS DataSync encountered during execution of the task. You can use this error code to help troubleshoot issues.
         */
    var ErrorCode: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Detailed description of an error that was encountered during the task execution. You can use this information to help troubleshoot issues. 
         */
    var ErrorDetail: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The total time in milliseconds that AWS DataSync spent in the PREPARING phase. 
         */
    var PrepareDuration: js.UndefOr[Duration] = js.undefined
    /**
         * The status of the PREPARING phase.
         */
    var PrepareStatus: js.UndefOr[PhaseStatus] = js.undefined
    /**
         * The total time in milliseconds that AWS DataSync spent in the TRANSFERRING phase.
         */
    var TransferDuration: js.UndefOr[Duration] = js.undefined
    /**
         * The status of the TRANSFERRING Phase.
         */
    var TransferStatus: js.UndefOr[PhaseStatus] = js.undefined
    /**
         * The total time in milliseconds that AWS DataSync spent in the VERIFYING phase.
         */
    var VerifyDuration: js.UndefOr[Duration] = js.undefined
    /**
         * The status of the VERIFYING Phase.
         */
    var VerifyStatus: js.UndefOr[PhaseStatus] = js.undefined
  }
  
  
  trait TaskListEntry extends js.Object {
    /**
         * The name of the task.
         */
    var Name: js.UndefOr[TagValue] = js.undefined
    /**
         * The status of the task.
         */
    var Status: js.UndefOr[TaskStatus] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the task.
         */
    var TaskArn: js.UndefOr[TaskArn] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Cancels execution of a task.  When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that are transferred to the destination might be incomplete or inconsistent with the source files. However, if you start a new task execution on the same task and you allow the task execution to complete, file content on the destination is complete and consistent. This applies to other unexpected failures that interrupt a task execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task execution. 
       */
    def cancelTaskExecution(): awsDashSdkLib.libRequestMod.Request[CancelTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels execution of a task.  When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that are transferred to the destination might be incomplete or inconsistent with the source files. However, if you start a new task execution on the same task and you allow the task execution to complete, file content on the destination is complete and consistent. This applies to other unexpected failures that interrupt a task execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task execution. 
       */
    def cancelTaskExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelTaskExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels execution of a task.  When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that are transferred to the destination might be incomplete or inconsistent with the source files. However, if you start a new task execution on the same task and you allow the task execution to complete, file content on the destination is complete and consistent. This applies to other unexpected failures that interrupt a task execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task execution. 
       */
    def cancelTaskExecution(params: CancelTaskExecutionRequest): awsDashSdkLib.libRequestMod.Request[CancelTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Cancels execution of a task.  When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that are transferred to the destination might be incomplete or inconsistent with the source files. However, if you start a new task execution on the same task and you allow the task execution to complete, file content on the destination is complete and consistent. This applies to other unexpected failures that interrupt a task execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task execution. 
       */
    def cancelTaskExecution(
      params: CancelTaskExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelTaskExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent with your account. In the activation process, you specify information such as the AWS Region that you want to activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this AWS Region.  You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents must be AVAILABLE for the task to run. For more information, see Activating a Sync Agent in the AWS DataSync User Guide.  Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption to your tasks. 
       */
    def createAgent(): awsDashSdkLib.libRequestMod.Request[CreateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent with your account. In the activation process, you specify information such as the AWS Region that you want to activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this AWS Region.  You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents must be AVAILABLE for the task to run. For more information, see Activating a Sync Agent in the AWS DataSync User Guide.  Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption to your tasks. 
       */
    def createAgent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAgentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent with your account. In the activation process, you specify information such as the AWS Region that you want to activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this AWS Region.  You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents must be AVAILABLE for the task to run. For more information, see Activating a Sync Agent in the AWS DataSync User Guide.  Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption to your tasks. 
       */
    def createAgent(params: CreateAgentRequest): awsDashSdkLib.libRequestMod.Request[CreateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent with your account. In the activation process, you specify information such as the AWS Region that you want to activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this AWS Region.  You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents must be AVAILABLE for the task to run. For more information, see Activating a Sync Agent in the AWS DataSync User Guide.  Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption to your tasks. 
       */
    def createAgent(
      params: CreateAgentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAgentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for an Amazon EFS file system.
       */
    def createLocationEfs(): awsDashSdkLib.libRequestMod.Request[CreateLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for an Amazon EFS file system.
       */
    def createLocationEfs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLocationEfsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for an Amazon EFS file system.
       */
    def createLocationEfs(params: CreateLocationEfsRequest): awsDashSdkLib.libRequestMod.Request[CreateLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for an Amazon EFS file system.
       */
    def createLocationEfs(
      params: CreateLocationEfsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLocationEfsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for a Network File System (NFS) file system.
       */
    def createLocationNfs(): awsDashSdkLib.libRequestMod.Request[CreateLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for a Network File System (NFS) file system.
       */
    def createLocationNfs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLocationNfsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for a Network File System (NFS) file system.
       */
    def createLocationNfs(params: CreateLocationNfsRequest): awsDashSdkLib.libRequestMod.Request[CreateLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for a Network File System (NFS) file system.
       */
    def createLocationNfs(
      params: CreateLocationNfsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLocationNfsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for an Amazon S3 bucket. For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role that has the required permissions. You can set up the required permissions by creating an IAM policy that grants the required permissions and attaching the policy to the role. An example of such a policy is shown in the examples section. For more information, see Configuring Amazon S3 Location Settings in the AWS DataSync User Guide.
       */
    def createLocationS3(): awsDashSdkLib.libRequestMod.Request[CreateLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for an Amazon S3 bucket. For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role that has the required permissions. You can set up the required permissions by creating an IAM policy that grants the required permissions and attaching the policy to the role. An example of such a policy is shown in the examples section. For more information, see Configuring Amazon S3 Location Settings in the AWS DataSync User Guide.
       */
    def createLocationS3(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLocationS3Response, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for an Amazon S3 bucket. For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role that has the required permissions. You can set up the required permissions by creating an IAM policy that grants the required permissions and attaching the policy to the role. An example of such a policy is shown in the examples section. For more information, see Configuring Amazon S3 Location Settings in the AWS DataSync User Guide.
       */
    def createLocationS3(params: CreateLocationS3Request): awsDashSdkLib.libRequestMod.Request[CreateLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an endpoint for an Amazon S3 bucket. For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role that has the required permissions. You can set up the required permissions by creating an IAM policy that grants the required permissions and attaching the policy to the role. An example of such a policy is shown in the examples section. For more information, see Configuring Amazon S3 Location Settings in the AWS DataSync User Guide.
       */
    def createLocationS3(
      params: CreateLocationS3Request,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateLocationS3Response, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a task. A task is a set of two locations (source and destination) and a set of default OverrideOptions that you use to control the behavior of a task. If you don't specify default values for Options when you create a task, AWS DataSync populates them with safe service defaults. When you initially create a task, it enters the INITIALIZING status and then the CREATING status. In CREATING status, AWS DataSync attempts to mount the source Network File System (NFS) location. The task transitions to the AVAILABLE status without waiting for the destination location to mount. Instead, AWS DataSync mounts a destination before every task execution and then unmounts it after every task execution.  If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your agent might be having trouble mounting the source NFS file system. Check the task's ErrorCode and ErrorDetail. Mount issues are often caused by either a misconfigured firewall or a mistyped NFS server host name.
       */
    def createTask(): awsDashSdkLib.libRequestMod.Request[CreateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a task. A task is a set of two locations (source and destination) and a set of default OverrideOptions that you use to control the behavior of a task. If you don't specify default values for Options when you create a task, AWS DataSync populates them with safe service defaults. When you initially create a task, it enters the INITIALIZING status and then the CREATING status. In CREATING status, AWS DataSync attempts to mount the source Network File System (NFS) location. The task transitions to the AVAILABLE status without waiting for the destination location to mount. Instead, AWS DataSync mounts a destination before every task execution and then unmounts it after every task execution.  If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your agent might be having trouble mounting the source NFS file system. Check the task's ErrorCode and ErrorDetail. Mount issues are often caused by either a misconfigured firewall or a mistyped NFS server host name.
       */
    def createTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a task. A task is a set of two locations (source and destination) and a set of default OverrideOptions that you use to control the behavior of a task. If you don't specify default values for Options when you create a task, AWS DataSync populates them with safe service defaults. When you initially create a task, it enters the INITIALIZING status and then the CREATING status. In CREATING status, AWS DataSync attempts to mount the source Network File System (NFS) location. The task transitions to the AVAILABLE status without waiting for the destination location to mount. Instead, AWS DataSync mounts a destination before every task execution and then unmounts it after every task execution.  If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your agent might be having trouble mounting the source NFS file system. Check the task's ErrorCode and ErrorDetail. Mount issues are often caused by either a misconfigured firewall or a mistyped NFS server host name.
       */
    def createTask(params: CreateTaskRequest): awsDashSdkLib.libRequestMod.Request[CreateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a task. A task is a set of two locations (source and destination) and a set of default OverrideOptions that you use to control the behavior of a task. If you don't specify default values for Options when you create a task, AWS DataSync populates them with safe service defaults. When you initially create a task, it enters the INITIALIZING status and then the CREATING status. In CREATING status, AWS DataSync attempts to mount the source Network File System (NFS) location. The task transitions to the AVAILABLE status without waiting for the destination location to mount. Instead, AWS DataSync mounts a destination before every task execution and then unmounts it after every task execution.  If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your agent might be having trouble mounting the source NFS file system. Check the task's ErrorCode and ErrorDetail. Mount issues are often caused by either a misconfigured firewall or a mistyped NFS server host name.
       */
    def createTask(
      params: CreateTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent virtual machine (VM) from your on-premises environment.  After you delete an agent, you can't reactivate it and you longer pay software charges for it. 
       */
    def deleteAgent(): awsDashSdkLib.libRequestMod.Request[DeleteAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent virtual machine (VM) from your on-premises environment.  After you delete an agent, you can't reactivate it and you longer pay software charges for it. 
       */
    def deleteAgent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAgentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent virtual machine (VM) from your on-premises environment.  After you delete an agent, you can't reactivate it and you longer pay software charges for it. 
       */
    def deleteAgent(params: DeleteAgentRequest): awsDashSdkLib.libRequestMod.Request[DeleteAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent virtual machine (VM) from your on-premises environment.  After you delete an agent, you can't reactivate it and you longer pay software charges for it. 
       */
    def deleteAgent(
      params: DeleteAgentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAgentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the configuration of a location used by AWS DataSync. 
       */
    def deleteLocation(): awsDashSdkLib.libRequestMod.Request[DeleteLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the configuration of a location used by AWS DataSync. 
       */
    def deleteLocation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLocationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the configuration of a location used by AWS DataSync. 
       */
    def deleteLocation(params: DeleteLocationRequest): awsDashSdkLib.libRequestMod.Request[DeleteLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the configuration of a location used by AWS DataSync. 
       */
    def deleteLocation(
      params: DeleteLocationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLocationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLocationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a task.
       */
    def deleteTask(): awsDashSdkLib.libRequestMod.Request[DeleteTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a task.
       */
    def deleteTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a task.
       */
    def deleteTask(params: DeleteTaskRequest): awsDashSdkLib.libRequestMod.Request[DeleteTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a task.
       */
    def deleteTask(
      params: DeleteTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your request. 
       */
    def describeAgent(): awsDashSdkLib.libRequestMod.Request[DescribeAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your request. 
       */
    def describeAgent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAgentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your request. 
       */
    def describeAgent(params: DescribeAgentRequest): awsDashSdkLib.libRequestMod.Request[DescribeAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your request. 
       */
    def describeAgent(
      params: DescribeAgentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAgentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as the path information about an Amazon EFS location.
       */
    def describeLocationEfs(): awsDashSdkLib.libRequestMod.Request[DescribeLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as the path information about an Amazon EFS location.
       */
    def describeLocationEfs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLocationEfsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as the path information about an Amazon EFS location.
       */
    def describeLocationEfs(params: DescribeLocationEfsRequest): awsDashSdkLib.libRequestMod.Request[DescribeLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as the path information about an Amazon EFS location.
       */
    def describeLocationEfs(
      params: DescribeLocationEfsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLocationEfsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLocationEfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as the path information, about a NFS location.
       */
    def describeLocationNfs(): awsDashSdkLib.libRequestMod.Request[DescribeLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as the path information, about a NFS location.
       */
    def describeLocationNfs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLocationNfsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as the path information, about a NFS location.
       */
    def describeLocationNfs(params: DescribeLocationNfsRequest): awsDashSdkLib.libRequestMod.Request[DescribeLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as the path information, about a NFS location.
       */
    def describeLocationNfs(
      params: DescribeLocationNfsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLocationNfsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLocationNfsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
       */
    def describeLocationS3(): awsDashSdkLib.libRequestMod.Request[DescribeLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
       */
    def describeLocationS3(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLocationS3Response, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
       */
    def describeLocationS3(params: DescribeLocationS3Request): awsDashSdkLib.libRequestMod.Request[DescribeLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
       */
    def describeLocationS3(
      params: DescribeLocationS3Request,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeLocationS3Response, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeLocationS3Response, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata about a task.
       */
    def describeTask(): awsDashSdkLib.libRequestMod.Request[DescribeTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata about a task.
       */
    def describeTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata about a task.
       */
    def describeTask(params: DescribeTaskRequest): awsDashSdkLib.libRequestMod.Request[DescribeTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns metadata about a task.
       */
    def describeTask(
      params: DescribeTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns detailed metadata about a task that is being executed.
       */
    def describeTaskExecution(): awsDashSdkLib.libRequestMod.Request[DescribeTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns detailed metadata about a task that is being executed.
       */
    def describeTaskExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTaskExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns detailed metadata about a task that is being executed.
       */
    def describeTaskExecution(params: DescribeTaskExecutionRequest): awsDashSdkLib.libRequestMod.Request[DescribeTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns detailed metadata about a task that is being executed.
       */
    def describeTaskExecution(
      params: DescribeTaskExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTaskExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is ordered by agent Amazon Resource Name (ARN). By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you to optionally reduce the number of agents returned in a response. If you have more agents than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a marker that you can specify in your next request to fetch the next page of agents.
       */
    def listAgents(): awsDashSdkLib.libRequestMod.Request[ListAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is ordered by agent Amazon Resource Name (ARN). By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you to optionally reduce the number of agents returned in a response. If you have more agents than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a marker that you can specify in your next request to fetch the next page of agents.
       */
    def listAgents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAgentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is ordered by agent Amazon Resource Name (ARN). By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you to optionally reduce the number of agents returned in a response. If you have more agents than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a marker that you can specify in your next request to fetch the next page of agents.
       */
    def listAgents(params: ListAgentsRequest): awsDashSdkLib.libRequestMod.Request[ListAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is ordered by agent Amazon Resource Name (ARN). By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you to optionally reduce the number of agents returned in a response. If you have more agents than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a marker that you can specify in your next request to fetch the next page of agents.
       */
    def listAgents(
      params: ListAgentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAgentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAgentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a lists of source and destination locations. If you have more locations than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a token that you can specify in your next request to fetch the next page of locations.
       */
    def listLocations(): awsDashSdkLib.libRequestMod.Request[ListLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a lists of source and destination locations. If you have more locations than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a token that you can specify in your next request to fetch the next page of locations.
       */
    def listLocations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLocationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a lists of source and destination locations. If you have more locations than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a token that you can specify in your next request to fetch the next page of locations.
       */
    def listLocations(params: ListLocationsRequest): awsDashSdkLib.libRequestMod.Request[ListLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a lists of source and destination locations. If you have more locations than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a token that you can specify in your next request to fetch the next page of locations.
       */
    def listLocations(
      params: ListLocationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLocationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLocationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all the tags associated with a specified resources. 
       */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all the tags associated with a specified resources. 
       */
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all the tags associated with a specified resources. 
       */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all the tags associated with a specified resources. 
       */
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of executed tasks.
       */
    def listTaskExecutions(): awsDashSdkLib.libRequestMod.Request[ListTaskExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of executed tasks.
       */
    def listTaskExecutions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTaskExecutionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTaskExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of executed tasks.
       */
    def listTaskExecutions(params: ListTaskExecutionsRequest): awsDashSdkLib.libRequestMod.Request[ListTaskExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of executed tasks.
       */
    def listTaskExecutions(
      params: ListTaskExecutionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTaskExecutionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTaskExecutionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all the tasks.
       */
    def listTasks(): awsDashSdkLib.libRequestMod.Request[ListTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all the tasks.
       */
    def listTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all the tasks.
       */
    def listTasks(params: ListTasksRequest): awsDashSdkLib.libRequestMod.Request[ListTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all the tasks.
       */
    def listTasks(
      params: ListTasksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a specific invocation of a task. A TaskExecution value represents an individual run of a task. Each task can have at most one TaskExecution at a time.  TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING | VERIFYING | SUCCESS/FAILURE.  For detailed information, see Task Execution in Components and Terminology in the AWS DataSync User Guide.
       */
    def startTaskExecution(): awsDashSdkLib.libRequestMod.Request[StartTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a specific invocation of a task. A TaskExecution value represents an individual run of a task. Each task can have at most one TaskExecution at a time.  TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING | VERIFYING | SUCCESS/FAILURE.  For detailed information, see Task Execution in Components and Terminology in the AWS DataSync User Guide.
       */
    def startTaskExecution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartTaskExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a specific invocation of a task. A TaskExecution value represents an individual run of a task. Each task can have at most one TaskExecution at a time.  TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING | VERIFYING | SUCCESS/FAILURE.  For detailed information, see Task Execution in Components and Terminology in the AWS DataSync User Guide.
       */
    def startTaskExecution(params: StartTaskExecutionRequest): awsDashSdkLib.libRequestMod.Request[StartTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts a specific invocation of a task. A TaskExecution value represents an individual run of a task. Each task can have at most one TaskExecution at a time.  TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING | VERIFYING | SUCCESS/FAILURE.  For detailed information, see Task Execution in Components and Terminology in the AWS DataSync User Guide.
       */
    def startTaskExecution(
      params: StartTaskExecutionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartTaskExecutionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartTaskExecutionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Applies a key-value pair to an AWS resource.
       */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Applies a key-value pair to an AWS resource.
       */
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Applies a key-value pair to an AWS resource.
       */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Applies a key-value pair to an AWS resource.
       */
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a tag from an AWS resource.
       */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a tag from an AWS resource.
       */
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a tag from an AWS resource.
       */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a tag from an AWS resource.
       */
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the name of an agent.
       */
    def updateAgent(): awsDashSdkLib.libRequestMod.Request[UpdateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the name of an agent.
       */
    def updateAgent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAgentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the name of an agent.
       */
    def updateAgent(params: UpdateAgentRequest): awsDashSdkLib.libRequestMod.Request[UpdateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the name of an agent.
       */
    def updateAgent(
      params: UpdateAgentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAgentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAgentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the metadata associated with a task.
       */
    def updateTask(): awsDashSdkLib.libRequestMod.Request[UpdateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the metadata associated with a task.
       */
    def updateTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the metadata associated with a task.
       */
    def updateTask(params: UpdateTaskRequest): awsDashSdkLib.libRequestMod.Request[UpdateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the metadata associated with a task.
       */
    def updateTask(
      params: UpdateTaskRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UntagResourceRequest extends js.Object {
    /**
         * The keys in the key-value pair in the tag to remove.
         */
    var Keys: TagKeyList
    /**
         * The Amazon Resource Name (ARN) of the resource to remove the tag from.
         */
    var ResourceArn: TaggableResourceArn
  }
  
  
  trait UntagResourceResponse extends js.Object
  
  
  trait UpdateAgentRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the agent to update.
         */
    var AgentArn: AgentArn
    /**
         * The name that you want to use to configure the agent.
         */
    var Name: js.UndefOr[TagValue] = js.undefined
  }
  
  
  trait UpdateAgentResponse extends js.Object
  
  
  trait UpdateTaskRequest extends js.Object {
    /**
         * The name of the task to update.
         */
    var Name: js.UndefOr[TagValue] = js.undefined
    var Options: js.UndefOr[Options] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the resource name of the task to update.
         */
    var TaskArn: TaskArn
  }
  
  
  trait UpdateTaskResponse extends js.Object
  
  val TypesNs: this.type = js.native
  type ActivationKey = java.lang.String
  type AgentArn = java.lang.String
  type AgentArnList = js.Array[AgentArn]
  type AgentList = js.Array[AgentListEntry]
  type AgentStatus = awsDashSdkLib.awsDashSdkLibStrings.ONLINE | awsDashSdkLib.awsDashSdkLibStrings.OFFLINE | java.lang.String
  type Atime = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.BEST_EFFORT | java.lang.String
  type BytesPerSecond = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Duration = scala.Double
  type Ec2SecurityGroupArn = java.lang.String
  type Ec2SecurityGroupArnList = js.Array[Ec2SecurityGroupArn]
  type Ec2SubnetArn = java.lang.String
  type EfsFilesystemArn = java.lang.String
  type Gid = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.INT_VALUE | awsDashSdkLib.awsDashSdkLibStrings.NAME | awsDashSdkLib.awsDashSdkLibStrings.BOTH | java.lang.String
  type IamRoleArn = java.lang.String
  type LocationArn = java.lang.String
  type LocationList = js.Array[LocationListEntry]
  type LocationUri = java.lang.String
  type LogGroupArn = java.lang.String
  type MaxResults = scala.Double
  type Mtime = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.PRESERVE | java.lang.String
  type NextToken = java.lang.String
  type PhaseStatus = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.SUCCESS | awsDashSdkLib.awsDashSdkLibStrings.ERROR | java.lang.String
  type PosixPermissions = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.BEST_EFFORT | awsDashSdkLib.awsDashSdkLibStrings.PRESERVE | java.lang.String
  type PreserveDeletedFiles = awsDashSdkLib.awsDashSdkLibStrings.PRESERVE | awsDashSdkLib.awsDashSdkLibStrings.REMOVE | java.lang.String
  type PreserveDevices = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.PRESERVE | java.lang.String
  type S3BucketArn = java.lang.String
  type ServerHostname = java.lang.String
  type Subdirectory = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[TagListEntry]
  type TagValue = java.lang.String
  type TaggableResourceArn = java.lang.String
  type TaskArn = java.lang.String
  type TaskExecutionArn = java.lang.String
  type TaskExecutionList = js.Array[TaskExecutionListEntry]
  type TaskExecutionStatus = awsDashSdkLib.awsDashSdkLibStrings.LAUNCHING | awsDashSdkLib.awsDashSdkLibStrings.PREPARING | awsDashSdkLib.awsDashSdkLibStrings.TRANSFERRING | awsDashSdkLib.awsDashSdkLibStrings.VERIFYING | awsDashSdkLib.awsDashSdkLibStrings.SUCCESS | awsDashSdkLib.awsDashSdkLibStrings.ERROR | java.lang.String
  type TaskList = js.Array[TaskListEntry]
  type TaskStatus = awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.UNAVAILABLE | java.lang.String
  type Time = stdLib.Date
  type Uid = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.INT_VALUE | awsDashSdkLib.awsDashSdkLibStrings.NAME | awsDashSdkLib.awsDashSdkLibStrings.BOTH | java.lang.String
  type VerifyMode = awsDashSdkLib.awsDashSdkLibStrings.POINT_IN_TIME_CONSISTENT | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-11-09` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
  type long = scala.Double
}

