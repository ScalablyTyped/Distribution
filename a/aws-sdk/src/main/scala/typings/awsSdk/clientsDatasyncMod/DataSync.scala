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
    * Creates an endpoint for an Amazon S3 bucket that DataSync can access for a transfer. For more information, see Create an Amazon S3 location in the DataSync User Guide.
    */
  def createLocationS3(): Request[CreateLocationS3Response, AWSError] = js.native
  def createLocationS3(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationS3Response, Unit]): Request[CreateLocationS3Response, AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon S3 bucket that DataSync can access for a transfer. For more information, see Create an Amazon S3 location in the DataSync User Guide.
    */
  def createLocationS3(params: CreateLocationS3Request): Request[CreateLocationS3Response, AWSError] = js.native
  def createLocationS3(
    params: CreateLocationS3Request,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationS3Response, Unit]
  ): Request[CreateLocationS3Response, AWSError] = js.native
  
  /**
    * Defines a file system on a Server Message Block (SMB) server that can be read from or written to.
    */
  def createLocationSmb(): Request[CreateLocationSmbResponse, AWSError] = js.native
  def createLocationSmb(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationSmbResponse, Unit]): Request[CreateLocationSmbResponse, AWSError] = js.native
  /**
    * Defines a file system on a Server Message Block (SMB) server that can be read from or written to.
    */
  def createLocationSmb(params: CreateLocationSmbRequest): Request[CreateLocationSmbResponse, AWSError] = js.native
  def createLocationSmb(
    params: CreateLocationSmbRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationSmbResponse, Unit]
  ): Request[CreateLocationSmbResponse, AWSError] = js.native
  
  /**
    * Configures a task, which defines where and how DataSync transfers your data. A task includes a source location, a destination location, and the preferences for how and when you want to transfer your data (such as bandwidth limits, scheduling, among other options). When you create a task that transfers data between Amazon Web Services services in different Amazon Web Services Regions, one of your locations must reside in the Region where you're using DataSync. For more information, see the following topics:    Working with DataSync locations     Configure DataSync task settings   
    */
  def createTask(): Request[CreateTaskResponse, AWSError] = js.native
  def createTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateTaskResponse, Unit]): Request[CreateTaskResponse, AWSError] = js.native
  /**
    * Configures a task, which defines where and how DataSync transfers your data. A task includes a source location, a destination location, and the preferences for how and when you want to transfer your data (such as bandwidth limits, scheduling, among other options). When you create a task that transfers data between Amazon Web Services services in different Amazon Web Services Regions, one of your locations must reside in the Region where you're using DataSync. For more information, see the following topics:    Working with DataSync locations     Configure DataSync task settings   
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
    * Deletes a task.
    */
  def deleteTask(): Request[DeleteTaskResponse, AWSError] = js.native
  def deleteTask(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTaskResponse, Unit]): Request[DeleteTaskResponse, AWSError] = js.native
  /**
    * Deletes a task.
    */
  def deleteTask(params: DeleteTaskRequest): Request[DeleteTaskResponse, AWSError] = js.native
  def deleteTask(
    params: DeleteTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTaskResponse, Unit]
  ): Request[DeleteTaskResponse, AWSError] = js.native
  
  /**
    * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your request. 
    */
  def describeAgent(): Request[DescribeAgentResponse, AWSError] = js.native
  def describeAgent(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentResponse, Unit]): Request[DescribeAgentResponse, AWSError] = js.native
  /**
    * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your request. 
    */
  def describeAgent(params: DescribeAgentRequest): Request[DescribeAgentResponse, AWSError] = js.native
  def describeAgent(
    params: DescribeAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentResponse, Unit]
  ): Request[DescribeAgentResponse, AWSError] = js.native
  
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
    * Returns a list of agents owned by an Amazon Web Services account in the Amazon Web Services Region specified in the request. The returned list is ordered by agent Amazon Resource Name (ARN). By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you to optionally reduce the number of agents returned in a response. If you have more agents than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a marker that you can specify in your next request to fetch the next page of agents.
    */
  def listAgents(): Request[ListAgentsResponse, AWSError] = js.native
  def listAgents(callback: js.Function2[/* err */ AWSError, /* data */ ListAgentsResponse, Unit]): Request[ListAgentsResponse, AWSError] = js.native
  /**
    * Returns a list of agents owned by an Amazon Web Services account in the Amazon Web Services Region specified in the request. The returned list is ordered by agent Amazon Resource Name (ARN). By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you to optionally reduce the number of agents returned in a response. If you have more agents than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a marker that you can specify in your next request to fetch the next page of agents.
    */
  def listAgents(params: ListAgentsRequest): Request[ListAgentsResponse, AWSError] = js.native
  def listAgents(
    params: ListAgentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAgentsResponse, Unit]
  ): Request[ListAgentsResponse, AWSError] = js.native
  
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
    * Returns all the tags associated with a specified resource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns all the tags associated with a specified resource. 
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
    * Starts a specific invocation of a task. A TaskExecution value represents an individual run of a task. Each task can have at most one TaskExecution at a time.  TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING | VERIFYING | SUCCESS/FAILURE.  For detailed information, see the Task Execution section in the Components and Terminology topic in the DataSync User Guide.
    */
  def startTaskExecution(): Request[StartTaskExecutionResponse, AWSError] = js.native
  def startTaskExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartTaskExecutionResponse, Unit]): Request[StartTaskExecutionResponse, AWSError] = js.native
  /**
    * Starts a specific invocation of a task. A TaskExecution value represents an individual run of a task. Each task can have at most one TaskExecution at a time.  TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING | VERIFYING | SUCCESS/FAILURE.  For detailed information, see the Task Execution section in the Components and Terminology topic in the DataSync User Guide.
    */
  def startTaskExecution(params: StartTaskExecutionRequest): Request[StartTaskExecutionResponse, AWSError] = js.native
  def startTaskExecution(
    params: StartTaskExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTaskExecutionResponse, Unit]
  ): Request[StartTaskExecutionResponse, AWSError] = js.native
  
  /**
    * Applies a key-value pair to an Amazon Web Services resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Applies a key-value pair to an Amazon Web Services resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from an Amazon Web Services resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from an Amazon Web Services resource.
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
    * Updates execution of a task. You can modify bandwidth throttling for a task execution that is running or queued. For more information, see Adjusting Bandwidth Throttling for a Task Execution.  The only Option that can be modified by UpdateTaskExecution is  BytesPerSecond . 
    */
  def updateTaskExecution(): Request[UpdateTaskExecutionResponse, AWSError] = js.native
  def updateTaskExecution(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskExecutionResponse, Unit]): Request[UpdateTaskExecutionResponse, AWSError] = js.native
  /**
    * Updates execution of a task. You can modify bandwidth throttling for a task execution that is running or queued. For more information, see Adjusting Bandwidth Throttling for a Task Execution.  The only Option that can be modified by UpdateTaskExecution is  BytesPerSecond . 
    */
  def updateTaskExecution(params: UpdateTaskExecutionRequest): Request[UpdateTaskExecutionResponse, AWSError] = js.native
  def updateTaskExecution(
    params: UpdateTaskExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskExecutionResponse, Unit]
  ): Request[UpdateTaskExecutionResponse, AWSError] = js.native
}
