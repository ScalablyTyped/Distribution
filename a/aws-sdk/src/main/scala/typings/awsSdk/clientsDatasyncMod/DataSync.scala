package typings.awsSdk.clientsDatasyncMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSync extends Service {
  
  /**
    * Creates an Amazon Web Services resource for an on-premises storage system that you want DataSync Discovery to collect information about.
    */
  def addStorageSystem(): Request[AddStorageSystemResponse, AWSError] = js.native
  def addStorageSystem(callback: js.Function2[/* err */ AWSError, /* data */ AddStorageSystemResponse, Unit]): Request[AddStorageSystemResponse, AWSError] = js.native
  /**
    * Creates an Amazon Web Services resource for an on-premises storage system that you want DataSync Discovery to collect information about.
    */
  def addStorageSystem(params: AddStorageSystemRequest): Request[AddStorageSystemResponse, AWSError] = js.native
  def addStorageSystem(
    params: AddStorageSystemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddStorageSystemResponse, Unit]
  ): Request[AddStorageSystemResponse, AWSError] = js.native
  
  /**
    * Stops an DataSync task execution that's in progress. The transfer of some files are abruptly interrupted. File contents that're transferred to the destination might be incomplete or inconsistent with the source files. However, if you start a new task execution using the same task and allow it to finish, file content on the destination will be complete and consistent. This applies to other unexpected failures that interrupt a task execution. In all of these cases, DataSync successfully completes the transfer when you start the next task execution.
    */
  def cancelTaskExecution(): Request[CancelTaskExecutionResponse, AWSError] = js.native
  def cancelTaskExecution(callback: js.Function2[/* err */ AWSError, /* data */ CancelTaskExecutionResponse, Unit]): Request[CancelTaskExecutionResponse, AWSError] = js.native
  /**
    * Stops an DataSync task execution that's in progress. The transfer of some files are abruptly interrupted. File contents that're transferred to the destination might be incomplete or inconsistent with the source files. However, if you start a new task execution using the same task and allow it to finish, file content on the destination will be complete and consistent. This applies to other unexpected failures that interrupt a task execution. In all of these cases, DataSync successfully completes the transfer when you start the next task execution.
    */
  def cancelTaskExecution(params: CancelTaskExecutionRequest): Request[CancelTaskExecutionResponse, AWSError] = js.native
  def cancelTaskExecution(
    params: CancelTaskExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelTaskExecutionResponse, Unit]
  ): Request[CancelTaskExecutionResponse, AWSError] = js.native
  
  @JSName("config")
  var config_DataSync: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Activates an DataSync agent that you have deployed in your storage environment. The activation process associates your agent with your account. In the activation process, you specify information such as the Amazon Web Services Region that you want to activate the agent in. You activate the agent in the Amazon Web Services Region where your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this Amazon Web Services Region. You can activate the agent in a VPC (virtual private cloud) or provide the agent access to a VPC endpoint so you can run tasks without going over the public internet. You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents must be AVAILABLE for the task to run.  Agents are automatically updated by Amazon Web Services on a regular basis, using a mechanism that ensures minimal interruption to your tasks.
    */
  def createAgent(): Request[CreateAgentResponse, AWSError] = js.native
  def createAgent(callback: js.Function2[/* err */ AWSError, /* data */ CreateAgentResponse, Unit]): Request[CreateAgentResponse, AWSError] = js.native
  /**
    * Activates an DataSync agent that you have deployed in your storage environment. The activation process associates your agent with your account. In the activation process, you specify information such as the Amazon Web Services Region that you want to activate the agent in. You activate the agent in the Amazon Web Services Region where your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this Amazon Web Services Region. You can activate the agent in a VPC (virtual private cloud) or provide the agent access to a VPC endpoint so you can run tasks without going over the public internet. You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents must be AVAILABLE for the task to run.  Agents are automatically updated by Amazon Web Services on a regular basis, using a mechanism that ensures minimal interruption to your tasks.
    */
  def createAgent(params: CreateAgentRequest): Request[CreateAgentResponse, AWSError] = js.native
  def createAgent(
    params: CreateAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAgentResponse, Unit]
  ): Request[CreateAgentResponse, AWSError] = js.native
  
  /**
    * Creates an endpoint for an Amazon EFS file system that DataSync can access for a transfer. For more information, see Creating a location for Amazon EFS.
    */
  def createLocationEfs(): Request[CreateLocationEfsResponse, AWSError] = js.native
  def createLocationEfs(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationEfsResponse, Unit]): Request[CreateLocationEfsResponse, AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon EFS file system that DataSync can access for a transfer. For more information, see Creating a location for Amazon EFS.
    */
  def createLocationEfs(params: CreateLocationEfsRequest): Request[CreateLocationEfsResponse, AWSError] = js.native
  def createLocationEfs(
    params: CreateLocationEfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationEfsResponse, Unit]
  ): Request[CreateLocationEfsResponse, AWSError] = js.native
  
  /**
    * Creates an endpoint for an Amazon FSx for Lustre file system.
    */
  def createLocationFsxLustre(): Request[CreateLocationFsxLustreResponse, AWSError] = js.native
  def createLocationFsxLustre(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationFsxLustreResponse, Unit]): Request[CreateLocationFsxLustreResponse, AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon FSx for Lustre file system.
    */
  def createLocationFsxLustre(params: CreateLocationFsxLustreRequest): Request[CreateLocationFsxLustreResponse, AWSError] = js.native
  def createLocationFsxLustre(
    params: CreateLocationFsxLustreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationFsxLustreResponse, Unit]
  ): Request[CreateLocationFsxLustreResponse, AWSError] = js.native
  
  /**
    * Creates an endpoint for an Amazon FSx for NetApp ONTAP file system that DataSync can access for a transfer. For more information, see Creating a location for FSx for ONTAP.
    */
  def createLocationFsxOntap(): Request[CreateLocationFsxOntapResponse, AWSError] = js.native
  def createLocationFsxOntap(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationFsxOntapResponse, Unit]): Request[CreateLocationFsxOntapResponse, AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon FSx for NetApp ONTAP file system that DataSync can access for a transfer. For more information, see Creating a location for FSx for ONTAP.
    */
  def createLocationFsxOntap(params: CreateLocationFsxOntapRequest): Request[CreateLocationFsxOntapResponse, AWSError] = js.native
  def createLocationFsxOntap(
    params: CreateLocationFsxOntapRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationFsxOntapResponse, Unit]
  ): Request[CreateLocationFsxOntapResponse, AWSError] = js.native
  
  /**
    * Creates an endpoint for an Amazon FSx for OpenZFS file system that DataSync can access for a transfer. For more information, see Creating a location for FSx for OpenZFS.  Request parameters related to SMB aren't supported with the CreateLocationFsxOpenZfs operation. 
    */
  def createLocationFsxOpenZfs(): Request[CreateLocationFsxOpenZfsResponse, AWSError] = js.native
  def createLocationFsxOpenZfs(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationFsxOpenZfsResponse, Unit]): Request[CreateLocationFsxOpenZfsResponse, AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon FSx for OpenZFS file system that DataSync can access for a transfer. For more information, see Creating a location for FSx for OpenZFS.  Request parameters related to SMB aren't supported with the CreateLocationFsxOpenZfs operation. 
    */
  def createLocationFsxOpenZfs(params: CreateLocationFsxOpenZfsRequest): Request[CreateLocationFsxOpenZfsResponse, AWSError] = js.native
  def createLocationFsxOpenZfs(
    params: CreateLocationFsxOpenZfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationFsxOpenZfsResponse, Unit]
  ): Request[CreateLocationFsxOpenZfsResponse, AWSError] = js.native
  
  /**
    * Creates an endpoint for an Amazon FSx for Windows File Server file system.
    */
  def createLocationFsxWindows(): Request[CreateLocationFsxWindowsResponse, AWSError] = js.native
  def createLocationFsxWindows(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationFsxWindowsResponse, Unit]): Request[CreateLocationFsxWindowsResponse, AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon FSx for Windows File Server file system.
    */
  def createLocationFsxWindows(params: CreateLocationFsxWindowsRequest): Request[CreateLocationFsxWindowsResponse, AWSError] = js.native
  def createLocationFsxWindows(
    params: CreateLocationFsxWindowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationFsxWindowsResponse, Unit]
  ): Request[CreateLocationFsxWindowsResponse, AWSError] = js.native
  
  /**
    * Creates an endpoint for a Hadoop Distributed File System (HDFS). 
    */
  def createLocationHdfs(): Request[CreateLocationHdfsResponse, AWSError] = js.native
  def createLocationHdfs(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationHdfsResponse, Unit]): Request[CreateLocationHdfsResponse, AWSError] = js.native
  /**
    * Creates an endpoint for a Hadoop Distributed File System (HDFS). 
    */
  def createLocationHdfs(params: CreateLocationHdfsRequest): Request[CreateLocationHdfsResponse, AWSError] = js.native
  def createLocationHdfs(
    params: CreateLocationHdfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationHdfsResponse, Unit]
  ): Request[CreateLocationHdfsResponse, AWSError] = js.native
  
  /**
    * Defines a file system on a Network File System (NFS) server that can be read from or written to.
    */
  def createLocationNfs(): Request[CreateLocationNfsResponse, AWSError] = js.native
  def createLocationNfs(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationNfsResponse, Unit]): Request[CreateLocationNfsResponse, AWSError] = js.native
  /**
    * Defines a file system on a Network File System (NFS) server that can be read from or written to.
    */
  def createLocationNfs(params: CreateLocationNfsRequest): Request[CreateLocationNfsResponse, AWSError] = js.native
  def createLocationNfs(
    params: CreateLocationNfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationNfsResponse, Unit]
  ): Request[CreateLocationNfsResponse, AWSError] = js.native
  
  /**
    * Creates an endpoint for an object storage system that DataSync can access for a transfer. For more information, see Creating a location for object storage.
    */
  def createLocationObjectStorage(): Request[CreateLocationObjectStorageResponse, AWSError] = js.native
  def createLocationObjectStorage(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationObjectStorageResponse, Unit]): Request[CreateLocationObjectStorageResponse, AWSError] = js.native
  /**
    * Creates an endpoint for an object storage system that DataSync can access for a transfer. For more information, see Creating a location for object storage.
    */
  def createLocationObjectStorage(params: CreateLocationObjectStorageRequest): Request[CreateLocationObjectStorageResponse, AWSError] = js.native
  def createLocationObjectStorage(
    params: CreateLocationObjectStorageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationObjectStorageResponse, Unit]
  ): Request[CreateLocationObjectStorageResponse, AWSError] = js.native
  
  /**
    * A location is an endpoint for an Amazon S3 bucket. DataSync can use the location as a source or destination for copying data.  Before you create your location, make sure that you read the following sections:    Storage class considerations with Amazon S3 locations     Evaluating S3 request costs when using DataSync      For more information, see Creating an Amazon S3 location.
    */
  def createLocationS3(): Request[CreateLocationS3Response, AWSError] = js.native
  def createLocationS3(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationS3Response, Unit]): Request[CreateLocationS3Response, AWSError] = js.native
  /**
    * A location is an endpoint for an Amazon S3 bucket. DataSync can use the location as a source or destination for copying data.  Before you create your location, make sure that you read the following sections:    Storage class considerations with Amazon S3 locations     Evaluating S3 request costs when using DataSync      For more information, see Creating an Amazon S3 location.
    */
  def createLocationS3(params: CreateLocationS3Request): Request[CreateLocationS3Response, AWSError] = js.native
  def createLocationS3(
    params: CreateLocationS3Request,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationS3Response, Unit]
  ): Request[CreateLocationS3Response, AWSError] = js.native
  
  /**
    * Creates an endpoint for a Server Message Block (SMB) file server that DataSync can access for a transfer. For more information, see Creating an SMB location.
    */
  def createLocationSmb(): Request[CreateLocationSmbResponse, AWSError] = js.native
  def createLocationSmb(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationSmbResponse, Unit]): Request[CreateLocationSmbResponse, AWSError] = js.native
  /**
    * Creates an endpoint for a Server Message Block (SMB) file server that DataSync can access for a transfer. For more information, see Creating an SMB location.
    */
  def createLocationSmb(params: CreateLocationSmbRequest): Request[CreateLocationSmbResponse, AWSError] = js.native
  def createLocationSmb(
    params: CreateLocationSmbRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationSmbResponse, Unit]
  ): Request[CreateLocationSmbResponse, AWSError] = js.native
  
  /**
    * Configures a task, which defines where and how DataSync transfers your data. A task includes a source location, a destination location, and the preferences for how and when you want to transfer your data (such as bandwidth limits, scheduling, among other options).  If you're planning to transfer data to or from an Amazon S3 location, review how DataSync can affect your S3 request charges and the DataSync pricing page before you begin. 
    */
  def createTask(): Request[CreateTaskResponse, AWSError] = js.native
  def createTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateTaskResponse, Unit]): Request[CreateTaskResponse, AWSError] = js.native
  /**
    * Configures a task, which defines where and how DataSync transfers your data. A task includes a source location, a destination location, and the preferences for how and when you want to transfer your data (such as bandwidth limits, scheduling, among other options).  If you're planning to transfer data to or from an Amazon S3 location, review how DataSync can affect your S3 request charges and the DataSync pricing page before you begin. 
    */
  def createTask(params: CreateTaskRequest): Request[CreateTaskResponse, AWSError] = js.native
  def createTask(
    params: CreateTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTaskResponse, Unit]
  ): Request[CreateTaskResponse, AWSError] = js.native
  
  /**
    * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your request. The operation disassociates the agent from your Amazon Web Services account. However, it doesn't delete the agent virtual machine (VM) from your on-premises environment.
    */
  def deleteAgent(): Request[DeleteAgentResponse, AWSError] = js.native
  def deleteAgent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAgentResponse, Unit]): Request[DeleteAgentResponse, AWSError] = js.native
  /**
    * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your request. The operation disassociates the agent from your Amazon Web Services account. However, it doesn't delete the agent virtual machine (VM) from your on-premises environment.
    */
  def deleteAgent(params: DeleteAgentRequest): Request[DeleteAgentResponse, AWSError] = js.native
  def deleteAgent(
    params: DeleteAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAgentResponse, Unit]
  ): Request[DeleteAgentResponse, AWSError] = js.native
  
  /**
    * Deletes the configuration of a location used by DataSync. 
    */
  def deleteLocation(): Request[DeleteLocationResponse, AWSError] = js.native
  def deleteLocation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLocationResponse, Unit]): Request[DeleteLocationResponse, AWSError] = js.native
  /**
    * Deletes the configuration of a location used by DataSync. 
    */
  def deleteLocation(params: DeleteLocationRequest): Request[DeleteLocationResponse, AWSError] = js.native
  def deleteLocation(
    params: DeleteLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLocationResponse, Unit]
  ): Request[DeleteLocationResponse, AWSError] = js.native
  
  /**
    * Deletes an DataSync task.
    */
  def deleteTask(): Request[DeleteTaskResponse, AWSError] = js.native
  def deleteTask(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTaskResponse, Unit]): Request[DeleteTaskResponse, AWSError] = js.native
  /**
    * Deletes an DataSync task.
    */
  def deleteTask(params: DeleteTaskRequest): Request[DeleteTaskResponse, AWSError] = js.native
  def deleteTask(
    params: DeleteTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTaskResponse, Unit]
  ): Request[DeleteTaskResponse, AWSError] = js.native
  
  /**
    * Returns metadata about an DataSync agent, such as its name, endpoint type, and status.
    */
  def describeAgent(): Request[DescribeAgentResponse, AWSError] = js.native
  def describeAgent(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentResponse, Unit]): Request[DescribeAgentResponse, AWSError] = js.native
  /**
    * Returns metadata about an DataSync agent, such as its name, endpoint type, and status.
    */
  def describeAgent(params: DescribeAgentRequest): Request[DescribeAgentResponse, AWSError] = js.native
  def describeAgent(
    params: DescribeAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentResponse, Unit]
  ): Request[DescribeAgentResponse, AWSError] = js.native
  
  /**
    * Returns information about a DataSync discovery job.
    */
  def describeDiscoveryJob(): Request[DescribeDiscoveryJobResponse, AWSError] = js.native
  def describeDiscoveryJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDiscoveryJobResponse, Unit]): Request[DescribeDiscoveryJobResponse, AWSError] = js.native
  /**
    * Returns information about a DataSync discovery job.
    */
  def describeDiscoveryJob(params: DescribeDiscoveryJobRequest): Request[DescribeDiscoveryJobResponse, AWSError] = js.native
  def describeDiscoveryJob(
    params: DescribeDiscoveryJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDiscoveryJobResponse, Unit]
  ): Request[DescribeDiscoveryJobResponse, AWSError] = js.native
  
  /**
    * Returns metadata about your DataSync location for an Amazon EFS file system.
    */
  def describeLocationEfs(): Request[DescribeLocationEfsResponse, AWSError] = js.native
  def describeLocationEfs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationEfsResponse, Unit]): Request[DescribeLocationEfsResponse, AWSError] = js.native
  /**
    * Returns metadata about your DataSync location for an Amazon EFS file system.
    */
  def describeLocationEfs(params: DescribeLocationEfsRequest): Request[DescribeLocationEfsResponse, AWSError] = js.native
  def describeLocationEfs(
    params: DescribeLocationEfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationEfsResponse, Unit]
  ): Request[DescribeLocationEfsResponse, AWSError] = js.native
  
  /**
    * Provides details about how an DataSync location for an Amazon FSx for Lustre file system is configured.
    */
  def describeLocationFsxLustre(): Request[DescribeLocationFsxLustreResponse, AWSError] = js.native
  def describeLocationFsxLustre(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationFsxLustreResponse, Unit]): Request[DescribeLocationFsxLustreResponse, AWSError] = js.native
  /**
    * Provides details about how an DataSync location for an Amazon FSx for Lustre file system is configured.
    */
  def describeLocationFsxLustre(params: DescribeLocationFsxLustreRequest): Request[DescribeLocationFsxLustreResponse, AWSError] = js.native
  def describeLocationFsxLustre(
    params: DescribeLocationFsxLustreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationFsxLustreResponse, Unit]
  ): Request[DescribeLocationFsxLustreResponse, AWSError] = js.native
  
  /**
    * Provides details about how an DataSync location for an Amazon FSx for NetApp ONTAP file system is configured.  If your location uses SMB, the DescribeLocationFsxOntap operation doesn't actually return a Password. 
    */
  def describeLocationFsxOntap(): Request[DescribeLocationFsxOntapResponse, AWSError] = js.native
  def describeLocationFsxOntap(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationFsxOntapResponse, Unit]): Request[DescribeLocationFsxOntapResponse, AWSError] = js.native
  /**
    * Provides details about how an DataSync location for an Amazon FSx for NetApp ONTAP file system is configured.  If your location uses SMB, the DescribeLocationFsxOntap operation doesn't actually return a Password. 
    */
  def describeLocationFsxOntap(params: DescribeLocationFsxOntapRequest): Request[DescribeLocationFsxOntapResponse, AWSError] = js.native
  def describeLocationFsxOntap(
    params: DescribeLocationFsxOntapRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationFsxOntapResponse, Unit]
  ): Request[DescribeLocationFsxOntapResponse, AWSError] = js.native
  
  /**
    * Provides details about how an DataSync location for an Amazon FSx for OpenZFS file system is configured.  Response elements related to SMB aren't supported with the DescribeLocationFsxOpenZfs operation. 
    */
  def describeLocationFsxOpenZfs(): Request[DescribeLocationFsxOpenZfsResponse, AWSError] = js.native
  def describeLocationFsxOpenZfs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationFsxOpenZfsResponse, Unit]): Request[DescribeLocationFsxOpenZfsResponse, AWSError] = js.native
  /**
    * Provides details about how an DataSync location for an Amazon FSx for OpenZFS file system is configured.  Response elements related to SMB aren't supported with the DescribeLocationFsxOpenZfs operation. 
    */
  def describeLocationFsxOpenZfs(params: DescribeLocationFsxOpenZfsRequest): Request[DescribeLocationFsxOpenZfsResponse, AWSError] = js.native
  def describeLocationFsxOpenZfs(
    params: DescribeLocationFsxOpenZfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationFsxOpenZfsResponse, Unit]
  ): Request[DescribeLocationFsxOpenZfsResponse, AWSError] = js.native
  
  /**
    * Returns metadata about an Amazon FSx for Windows File Server location, such as information about its path.
    */
  def describeLocationFsxWindows(): Request[DescribeLocationFsxWindowsResponse, AWSError] = js.native
  def describeLocationFsxWindows(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationFsxWindowsResponse, Unit]): Request[DescribeLocationFsxWindowsResponse, AWSError] = js.native
  /**
    * Returns metadata about an Amazon FSx for Windows File Server location, such as information about its path.
    */
  def describeLocationFsxWindows(params: DescribeLocationFsxWindowsRequest): Request[DescribeLocationFsxWindowsResponse, AWSError] = js.native
  def describeLocationFsxWindows(
    params: DescribeLocationFsxWindowsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationFsxWindowsResponse, Unit]
  ): Request[DescribeLocationFsxWindowsResponse, AWSError] = js.native
  
  /**
    * Returns metadata, such as the authentication information about the Hadoop Distributed File System (HDFS) location. 
    */
  def describeLocationHdfs(): Request[DescribeLocationHdfsResponse, AWSError] = js.native
  def describeLocationHdfs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationHdfsResponse, Unit]): Request[DescribeLocationHdfsResponse, AWSError] = js.native
  /**
    * Returns metadata, such as the authentication information about the Hadoop Distributed File System (HDFS) location. 
    */
  def describeLocationHdfs(params: DescribeLocationHdfsRequest): Request[DescribeLocationHdfsResponse, AWSError] = js.native
  def describeLocationHdfs(
    params: DescribeLocationHdfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationHdfsResponse, Unit]
  ): Request[DescribeLocationHdfsResponse, AWSError] = js.native
  
  /**
    * Returns metadata, such as the path information, about an NFS location.
    */
  def describeLocationNfs(): Request[DescribeLocationNfsResponse, AWSError] = js.native
  def describeLocationNfs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationNfsResponse, Unit]): Request[DescribeLocationNfsResponse, AWSError] = js.native
  /**
    * Returns metadata, such as the path information, about an NFS location.
    */
  def describeLocationNfs(params: DescribeLocationNfsRequest): Request[DescribeLocationNfsResponse, AWSError] = js.native
  def describeLocationNfs(
    params: DescribeLocationNfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationNfsResponse, Unit]
  ): Request[DescribeLocationNfsResponse, AWSError] = js.native
  
  /**
    * Returns metadata about your DataSync location for an object storage system.
    */
  def describeLocationObjectStorage(): Request[DescribeLocationObjectStorageResponse, AWSError] = js.native
  def describeLocationObjectStorage(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationObjectStorageResponse, Unit]): Request[DescribeLocationObjectStorageResponse, AWSError] = js.native
  /**
    * Returns metadata about your DataSync location for an object storage system.
    */
  def describeLocationObjectStorage(params: DescribeLocationObjectStorageRequest): Request[DescribeLocationObjectStorageResponse, AWSError] = js.native
  def describeLocationObjectStorage(
    params: DescribeLocationObjectStorageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationObjectStorageResponse, Unit]
  ): Request[DescribeLocationObjectStorageResponse, AWSError] = js.native
  
  /**
    * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
    */
  def describeLocationS3(): Request[DescribeLocationS3Response, AWSError] = js.native
  def describeLocationS3(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationS3Response, Unit]): Request[DescribeLocationS3Response, AWSError] = js.native
  /**
    * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
    */
  def describeLocationS3(params: DescribeLocationS3Request): Request[DescribeLocationS3Response, AWSError] = js.native
  def describeLocationS3(
    params: DescribeLocationS3Request,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationS3Response, Unit]
  ): Request[DescribeLocationS3Response, AWSError] = js.native
  
  /**
    * Returns metadata, such as the path and user information about an SMB location.
    */
  def describeLocationSmb(): Request[DescribeLocationSmbResponse, AWSError] = js.native
  def describeLocationSmb(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationSmbResponse, Unit]): Request[DescribeLocationSmbResponse, AWSError] = js.native
  /**
    * Returns metadata, such as the path and user information about an SMB location.
    */
  def describeLocationSmb(params: DescribeLocationSmbRequest): Request[DescribeLocationSmbResponse, AWSError] = js.native
  def describeLocationSmb(
    params: DescribeLocationSmbRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationSmbResponse, Unit]
  ): Request[DescribeLocationSmbResponse, AWSError] = js.native
  
  /**
    * Returns information about an on-premises storage system that you're using with DataSync Discovery.
    */
  def describeStorageSystem(): Request[DescribeStorageSystemResponse, AWSError] = js.native
  def describeStorageSystem(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStorageSystemResponse, Unit]): Request[DescribeStorageSystemResponse, AWSError] = js.native
  /**
    * Returns information about an on-premises storage system that you're using with DataSync Discovery.
    */
  def describeStorageSystem(params: DescribeStorageSystemRequest): Request[DescribeStorageSystemResponse, AWSError] = js.native
  def describeStorageSystem(
    params: DescribeStorageSystemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStorageSystemResponse, Unit]
  ): Request[DescribeStorageSystemResponse, AWSError] = js.native
  
  /**
    * Returns information, including performance data and capacity usage, which DataSync Discovery collects about a specific resource in your-premises storage system.
    */
  def describeStorageSystemResourceMetrics(): Request[DescribeStorageSystemResourceMetricsResponse, AWSError] = js.native
  def describeStorageSystemResourceMetrics(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStorageSystemResourceMetricsResponse, Unit]
  ): Request[DescribeStorageSystemResourceMetricsResponse, AWSError] = js.native
  /**
    * Returns information, including performance data and capacity usage, which DataSync Discovery collects about a specific resource in your-premises storage system.
    */
  def describeStorageSystemResourceMetrics(params: DescribeStorageSystemResourceMetricsRequest): Request[DescribeStorageSystemResourceMetricsResponse, AWSError] = js.native
  def describeStorageSystemResourceMetrics(
    params: DescribeStorageSystemResourceMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStorageSystemResourceMetricsResponse, Unit]
  ): Request[DescribeStorageSystemResourceMetricsResponse, AWSError] = js.native
  
  /**
    * Returns information that DataSync Discovery collects about resources in your on-premises storage system.
    */
  def describeStorageSystemResources(): Request[DescribeStorageSystemResourcesResponse, AWSError] = js.native
  def describeStorageSystemResources(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStorageSystemResourcesResponse, Unit]
  ): Request[DescribeStorageSystemResourcesResponse, AWSError] = js.native
  /**
    * Returns information that DataSync Discovery collects about resources in your on-premises storage system.
    */
  def describeStorageSystemResources(params: DescribeStorageSystemResourcesRequest): Request[DescribeStorageSystemResourcesResponse, AWSError] = js.native
  def describeStorageSystemResources(
    params: DescribeStorageSystemResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStorageSystemResourcesResponse, Unit]
  ): Request[DescribeStorageSystemResourcesResponse, AWSError] = js.native
  
  /**
    * Returns metadata about a task.
    */
  def describeTask(): Request[DescribeTaskResponse, AWSError] = js.native
  def describeTask(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskResponse, Unit]): Request[DescribeTaskResponse, AWSError] = js.native
  /**
    * Returns metadata about a task.
    */
  def describeTask(params: DescribeTaskRequest): Request[DescribeTaskResponse, AWSError] = js.native
  def describeTask(
    params: DescribeTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskResponse, Unit]
  ): Request[DescribeTaskResponse, AWSError] = js.native
  
  /**
    * Returns detailed metadata about a task that is being executed.
    */
  def describeTaskExecution(): Request[DescribeTaskExecutionResponse, AWSError] = js.native
  def describeTaskExecution(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskExecutionResponse, Unit]): Request[DescribeTaskExecutionResponse, AWSError] = js.native
  /**
    * Returns detailed metadata about a task that is being executed.
    */
  def describeTaskExecution(params: DescribeTaskExecutionRequest): Request[DescribeTaskExecutionResponse, AWSError] = js.native
  def describeTaskExecution(
    params: DescribeTaskExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskExecutionResponse, Unit]
  ): Request[DescribeTaskExecutionResponse, AWSError] = js.native
  
  /**
    * Creates recommendations about where to migrate your data to in Amazon Web Services. Recommendations are generated based on information that DataSync Discovery collects about your on-premises storage system's resources. For more information, see Recommendations provided by DataSync Discovery. Once generated, you can view your recommendations by using the DescribeStorageSystemResources operation.  If your discovery job completes successfully, you don't need to use this operation. DataSync Discovery generates the recommendations for you automatically. 
    */
  def generateRecommendations(): Request[GenerateRecommendationsResponse, AWSError] = js.native
  def generateRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ GenerateRecommendationsResponse, Unit]): Request[GenerateRecommendationsResponse, AWSError] = js.native
  /**
    * Creates recommendations about where to migrate your data to in Amazon Web Services. Recommendations are generated based on information that DataSync Discovery collects about your on-premises storage system's resources. For more information, see Recommendations provided by DataSync Discovery. Once generated, you can view your recommendations by using the DescribeStorageSystemResources operation.  If your discovery job completes successfully, you don't need to use this operation. DataSync Discovery generates the recommendations for you automatically. 
    */
  def generateRecommendations(params: GenerateRecommendationsRequest): Request[GenerateRecommendationsResponse, AWSError] = js.native
  def generateRecommendations(
    params: GenerateRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateRecommendationsResponse, Unit]
  ): Request[GenerateRecommendationsResponse, AWSError] = js.native
  
  /**
    * Returns a list of DataSync agents that belong to an Amazon Web Services account in the Amazon Web Services Region specified in the request. With pagination, you can reduce the number of agents returned in a response. If you get a truncated list of agents in a response, the response contains a marker that you can specify in your next request to fetch the next page of agents.  ListAgents is eventually consistent. This means the result of running the operation might not reflect that you just created or deleted an agent. For example, if you create an agent with CreateAgent and then immediately run ListAgents, that agent might not show up in the list right away. In situations like this, you can always confirm whether an agent has been created (or deleted) by using DescribeAgent.
    */
  def listAgents(): Request[ListAgentsResponse, AWSError] = js.native
  def listAgents(callback: js.Function2[/* err */ AWSError, /* data */ ListAgentsResponse, Unit]): Request[ListAgentsResponse, AWSError] = js.native
  /**
    * Returns a list of DataSync agents that belong to an Amazon Web Services account in the Amazon Web Services Region specified in the request. With pagination, you can reduce the number of agents returned in a response. If you get a truncated list of agents in a response, the response contains a marker that you can specify in your next request to fetch the next page of agents.  ListAgents is eventually consistent. This means the result of running the operation might not reflect that you just created or deleted an agent. For example, if you create an agent with CreateAgent and then immediately run ListAgents, that agent might not show up in the list right away. In situations like this, you can always confirm whether an agent has been created (or deleted) by using DescribeAgent.
    */
  def listAgents(params: ListAgentsRequest): Request[ListAgentsResponse, AWSError] = js.native
  def listAgents(
    params: ListAgentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAgentsResponse, Unit]
  ): Request[ListAgentsResponse, AWSError] = js.native
  
  /**
    * Provides a list of the existing discovery jobs in the Amazon Web Services Region and Amazon Web Services account where you're using DataSync Discovery.
    */
  def listDiscoveryJobs(): Request[ListDiscoveryJobsResponse, AWSError] = js.native
  def listDiscoveryJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListDiscoveryJobsResponse, Unit]): Request[ListDiscoveryJobsResponse, AWSError] = js.native
  /**
    * Provides a list of the existing discovery jobs in the Amazon Web Services Region and Amazon Web Services account where you're using DataSync Discovery.
    */
  def listDiscoveryJobs(params: ListDiscoveryJobsRequest): Request[ListDiscoveryJobsResponse, AWSError] = js.native
  def listDiscoveryJobs(
    params: ListDiscoveryJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDiscoveryJobsResponse, Unit]
  ): Request[ListDiscoveryJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of source and destination locations. If you have more locations than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a token that you can specify in your next request to fetch the next page of locations.
    */
  def listLocations(): Request[ListLocationsResponse, AWSError] = js.native
  def listLocations(callback: js.Function2[/* err */ AWSError, /* data */ ListLocationsResponse, Unit]): Request[ListLocationsResponse, AWSError] = js.native
  /**
    * Returns a list of source and destination locations. If you have more locations than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a token that you can specify in your next request to fetch the next page of locations.
    */
  def listLocations(params: ListLocationsRequest): Request[ListLocationsResponse, AWSError] = js.native
  def listLocations(
    params: ListLocationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLocationsResponse, Unit]
  ): Request[ListLocationsResponse, AWSError] = js.native
  
  /**
    * Lists the on-premises storage systems that you're using with DataSync Discovery.
    */
  def listStorageSystems(): Request[ListStorageSystemsResponse, AWSError] = js.native
  def listStorageSystems(callback: js.Function2[/* err */ AWSError, /* data */ ListStorageSystemsResponse, Unit]): Request[ListStorageSystemsResponse, AWSError] = js.native
  /**
    * Lists the on-premises storage systems that you're using with DataSync Discovery.
    */
  def listStorageSystems(params: ListStorageSystemsRequest): Request[ListStorageSystemsResponse, AWSError] = js.native
  def listStorageSystems(
    params: ListStorageSystemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStorageSystemsResponse, Unit]
  ): Request[ListStorageSystemsResponse, AWSError] = js.native
  
  /**
    * Returns all the tags associated with an Amazon Web Services resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns all the tags associated with an Amazon Web Services resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Returns a list of executed tasks.
    */
  def listTaskExecutions(): Request[ListTaskExecutionsResponse, AWSError] = js.native
  def listTaskExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListTaskExecutionsResponse, Unit]): Request[ListTaskExecutionsResponse, AWSError] = js.native
  /**
    * Returns a list of executed tasks.
    */
  def listTaskExecutions(params: ListTaskExecutionsRequest): Request[ListTaskExecutionsResponse, AWSError] = js.native
  def listTaskExecutions(
    params: ListTaskExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTaskExecutionsResponse, Unit]
  ): Request[ListTaskExecutionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of the DataSync tasks you created.
    */
  def listTasks(): Request[ListTasksResponse, AWSError] = js.native
  def listTasks(callback: js.Function2[/* err */ AWSError, /* data */ ListTasksResponse, Unit]): Request[ListTasksResponse, AWSError] = js.native
  /**
    * Returns a list of the DataSync tasks you created.
    */
  def listTasks(params: ListTasksRequest): Request[ListTasksResponse, AWSError] = js.native
  def listTasks(
    params: ListTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTasksResponse, Unit]
  ): Request[ListTasksResponse, AWSError] = js.native
  
  /**
    * Permanently removes a storage system resource from DataSync Discovery, including the associated discovery jobs, collected data, and recommendations.
    */
  def removeStorageSystem(): Request[RemoveStorageSystemResponse, AWSError] = js.native
  def removeStorageSystem(callback: js.Function2[/* err */ AWSError, /* data */ RemoveStorageSystemResponse, Unit]): Request[RemoveStorageSystemResponse, AWSError] = js.native
  /**
    * Permanently removes a storage system resource from DataSync Discovery, including the associated discovery jobs, collected data, and recommendations.
    */
  def removeStorageSystem(params: RemoveStorageSystemRequest): Request[RemoveStorageSystemResponse, AWSError] = js.native
  def removeStorageSystem(
    params: RemoveStorageSystemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveStorageSystemResponse, Unit]
  ): Request[RemoveStorageSystemResponse, AWSError] = js.native
  
  /**
    * Runs a DataSync discovery job on your on-premises storage system. If you haven't added the storage system to DataSync Discovery yet, do this first by using the AddStorageSystem operation.
    */
  def startDiscoveryJob(): Request[StartDiscoveryJobResponse, AWSError] = js.native
  def startDiscoveryJob(callback: js.Function2[/* err */ AWSError, /* data */ StartDiscoveryJobResponse, Unit]): Request[StartDiscoveryJobResponse, AWSError] = js.native
  /**
    * Runs a DataSync discovery job on your on-premises storage system. If you haven't added the storage system to DataSync Discovery yet, do this first by using the AddStorageSystem operation.
    */
  def startDiscoveryJob(params: StartDiscoveryJobRequest): Request[StartDiscoveryJobResponse, AWSError] = js.native
  def startDiscoveryJob(
    params: StartDiscoveryJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDiscoveryJobResponse, Unit]
  ): Request[StartDiscoveryJobResponse, AWSError] = js.native
  
  /**
    * Starts an DataSync task. For each task, you can only run one task execution at a time. There are several phases to a task execution. For more information, see Task execution statuses.  If you're planning to transfer data to or from an Amazon S3 location, review how DataSync can affect your S3 request charges and the DataSync pricing page before you begin. 
    */
  def startTaskExecution(): Request[StartTaskExecutionResponse, AWSError] = js.native
  def startTaskExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartTaskExecutionResponse, Unit]): Request[StartTaskExecutionResponse, AWSError] = js.native
  /**
    * Starts an DataSync task. For each task, you can only run one task execution at a time. There are several phases to a task execution. For more information, see Task execution statuses.  If you're planning to transfer data to or from an Amazon S3 location, review how DataSync can affect your S3 request charges and the DataSync pricing page before you begin. 
    */
  def startTaskExecution(params: StartTaskExecutionRequest): Request[StartTaskExecutionResponse, AWSError] = js.native
  def startTaskExecution(
    params: StartTaskExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTaskExecutionResponse, Unit]
  ): Request[StartTaskExecutionResponse, AWSError] = js.native
  
  /**
    * Stops a running DataSync discovery job. You can stop a discovery job anytime. A job that's stopped before it's scheduled to end likely will provide you some information about your on-premises storage system resources. To get recommendations for a stopped job, you must use the GenerateRecommendations operation.
    */
  def stopDiscoveryJob(): Request[StopDiscoveryJobResponse, AWSError] = js.native
  def stopDiscoveryJob(callback: js.Function2[/* err */ AWSError, /* data */ StopDiscoveryJobResponse, Unit]): Request[StopDiscoveryJobResponse, AWSError] = js.native
  /**
    * Stops a running DataSync discovery job. You can stop a discovery job anytime. A job that's stopped before it's scheduled to end likely will provide you some information about your on-premises storage system resources. To get recommendations for a stopped job, you must use the GenerateRecommendations operation.
    */
  def stopDiscoveryJob(params: StopDiscoveryJobRequest): Request[StopDiscoveryJobResponse, AWSError] = js.native
  def stopDiscoveryJob(
    params: StopDiscoveryJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopDiscoveryJobResponse, Unit]
  ): Request[StopDiscoveryJobResponse, AWSError] = js.native
  
  /**
    * Applies a tag to an Amazon Web Services resource. Tags are key-value pairs that can help you manage, filter, and search for your resources. These include DataSync resources, such as locations, tasks, and task executions.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Applies a tag to an Amazon Web Services resource. Tags are key-value pairs that can help you manage, filter, and search for your resources. These include DataSync resources, such as locations, tasks, and task executions.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from an Amazon Web Services resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from an Amazon Web Services resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the name of an agent.
    */
  def updateAgent(): Request[UpdateAgentResponse, AWSError] = js.native
  def updateAgent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAgentResponse, Unit]): Request[UpdateAgentResponse, AWSError] = js.native
  /**
    * Updates the name of an agent.
    */
  def updateAgent(params: UpdateAgentRequest): Request[UpdateAgentResponse, AWSError] = js.native
  def updateAgent(
    params: UpdateAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAgentResponse, Unit]
  ): Request[UpdateAgentResponse, AWSError] = js.native
  
  /**
    * Edits a DataSync discovery job configuration.
    */
  def updateDiscoveryJob(): Request[UpdateDiscoveryJobResponse, AWSError] = js.native
  def updateDiscoveryJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDiscoveryJobResponse, Unit]): Request[UpdateDiscoveryJobResponse, AWSError] = js.native
  /**
    * Edits a DataSync discovery job configuration.
    */
  def updateDiscoveryJob(params: UpdateDiscoveryJobRequest): Request[UpdateDiscoveryJobResponse, AWSError] = js.native
  def updateDiscoveryJob(
    params: UpdateDiscoveryJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDiscoveryJobResponse, Unit]
  ): Request[UpdateDiscoveryJobResponse, AWSError] = js.native
  
  /**
    * Updates some parameters of a previously created location for a Hadoop Distributed File System cluster.
    */
  def updateLocationHdfs(): Request[UpdateLocationHdfsResponse, AWSError] = js.native
  def updateLocationHdfs(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLocationHdfsResponse, Unit]): Request[UpdateLocationHdfsResponse, AWSError] = js.native
  /**
    * Updates some parameters of a previously created location for a Hadoop Distributed File System cluster.
    */
  def updateLocationHdfs(params: UpdateLocationHdfsRequest): Request[UpdateLocationHdfsResponse, AWSError] = js.native
  def updateLocationHdfs(
    params: UpdateLocationHdfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLocationHdfsResponse, Unit]
  ): Request[UpdateLocationHdfsResponse, AWSError] = js.native
  
  /**
    * Updates some of the parameters of a previously created location for Network File System (NFS) access. For information about creating an NFS location, see Creating a location for NFS.
    */
  def updateLocationNfs(): Request[UpdateLocationNfsResponse, AWSError] = js.native
  def updateLocationNfs(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLocationNfsResponse, Unit]): Request[UpdateLocationNfsResponse, AWSError] = js.native
  /**
    * Updates some of the parameters of a previously created location for Network File System (NFS) access. For information about creating an NFS location, see Creating a location for NFS.
    */
  def updateLocationNfs(params: UpdateLocationNfsRequest): Request[UpdateLocationNfsResponse, AWSError] = js.native
  def updateLocationNfs(
    params: UpdateLocationNfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLocationNfsResponse, Unit]
  ): Request[UpdateLocationNfsResponse, AWSError] = js.native
  
  /**
    * Updates some parameters of an existing object storage location that DataSync accesses for a transfer. For information about creating a self-managed object storage location, see Creating a location for object storage.
    */
  def updateLocationObjectStorage(): Request[UpdateLocationObjectStorageResponse, AWSError] = js.native
  def updateLocationObjectStorage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLocationObjectStorageResponse, Unit]): Request[UpdateLocationObjectStorageResponse, AWSError] = js.native
  /**
    * Updates some parameters of an existing object storage location that DataSync accesses for a transfer. For information about creating a self-managed object storage location, see Creating a location for object storage.
    */
  def updateLocationObjectStorage(params: UpdateLocationObjectStorageRequest): Request[UpdateLocationObjectStorageResponse, AWSError] = js.native
  def updateLocationObjectStorage(
    params: UpdateLocationObjectStorageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLocationObjectStorageResponse, Unit]
  ): Request[UpdateLocationObjectStorageResponse, AWSError] = js.native
  
  /**
    * Updates some of the parameters of a previously created location for Server Message Block (SMB) file system access. For information about creating an SMB location, see Creating a location for SMB.
    */
  def updateLocationSmb(): Request[UpdateLocationSmbResponse, AWSError] = js.native
  def updateLocationSmb(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLocationSmbResponse, Unit]): Request[UpdateLocationSmbResponse, AWSError] = js.native
  /**
    * Updates some of the parameters of a previously created location for Server Message Block (SMB) file system access. For information about creating an SMB location, see Creating a location for SMB.
    */
  def updateLocationSmb(params: UpdateLocationSmbRequest): Request[UpdateLocationSmbResponse, AWSError] = js.native
  def updateLocationSmb(
    params: UpdateLocationSmbRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLocationSmbResponse, Unit]
  ): Request[UpdateLocationSmbResponse, AWSError] = js.native
  
  /**
    * Modifies some configurations of an on-premises storage system resource that you're using with DataSync Discovery.
    */
  def updateStorageSystem(): Request[UpdateStorageSystemResponse, AWSError] = js.native
  def updateStorageSystem(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStorageSystemResponse, Unit]): Request[UpdateStorageSystemResponse, AWSError] = js.native
  /**
    * Modifies some configurations of an on-premises storage system resource that you're using with DataSync Discovery.
    */
  def updateStorageSystem(params: UpdateStorageSystemRequest): Request[UpdateStorageSystemResponse, AWSError] = js.native
  def updateStorageSystem(
    params: UpdateStorageSystemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStorageSystemResponse, Unit]
  ): Request[UpdateStorageSystemResponse, AWSError] = js.native
  
  /**
    * Updates the metadata associated with a task.
    */
  def updateTask(): Request[UpdateTaskResponse, AWSError] = js.native
  def updateTask(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskResponse, Unit]): Request[UpdateTaskResponse, AWSError] = js.native
  /**
    * Updates the metadata associated with a task.
    */
  def updateTask(params: UpdateTaskRequest): Request[UpdateTaskResponse, AWSError] = js.native
  def updateTask(
    params: UpdateTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskResponse, Unit]
  ): Request[UpdateTaskResponse, AWSError] = js.native
  
  /**
    * Modifies a running DataSync task.  Currently, the only Option that you can modify with UpdateTaskExecution is  BytesPerSecond , which throttles bandwidth for a running or queued task. 
    */
  def updateTaskExecution(): Request[UpdateTaskExecutionResponse, AWSError] = js.native
  def updateTaskExecution(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskExecutionResponse, Unit]): Request[UpdateTaskExecutionResponse, AWSError] = js.native
  /**
    * Modifies a running DataSync task.  Currently, the only Option that you can modify with UpdateTaskExecution is  BytesPerSecond , which throttles bandwidth for a running or queued task. 
    */
  def updateTaskExecution(params: UpdateTaskExecutionRequest): Request[UpdateTaskExecutionResponse, AWSError] = js.native
  def updateTaskExecution(
    params: UpdateTaskExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskExecutionResponse, Unit]
  ): Request[UpdateTaskExecutionResponse, AWSError] = js.native
}
