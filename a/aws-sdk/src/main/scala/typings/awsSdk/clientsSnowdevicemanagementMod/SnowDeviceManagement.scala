package typings.awsSdk.clientsSnowdevicemanagementMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnowDeviceManagement extends Service {
  
  /**
    * Sends a cancel request for a specified task. You can cancel a task only if it's still in a QUEUED state. Tasks that are already running can't be cancelled.  A task might still run if it's processed from the queue before the CancelTask operation changes the task's state. 
    */
  def cancelTask(): Request[CancelTaskOutput, AWSError] = js.native
  def cancelTask(callback: js.Function2[/* err */ AWSError, /* data */ CancelTaskOutput, Unit]): Request[CancelTaskOutput, AWSError] = js.native
  /**
    * Sends a cancel request for a specified task. You can cancel a task only if it's still in a QUEUED state. Tasks that are already running can't be cancelled.  A task might still run if it's processed from the queue before the CancelTask operation changes the task's state. 
    */
  def cancelTask(params: CancelTaskInput): Request[CancelTaskOutput, AWSError] = js.native
  def cancelTask(
    params: CancelTaskInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelTaskOutput, Unit]
  ): Request[CancelTaskOutput, AWSError] = js.native
  
  @JSName("config")
  var config_SnowDeviceManagement: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Instructs one or more devices to start a task, such as unlocking or rebooting.
    */
  def createTask(): Request[CreateTaskOutput, AWSError] = js.native
  def createTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateTaskOutput, Unit]): Request[CreateTaskOutput, AWSError] = js.native
  /**
    * Instructs one or more devices to start a task, such as unlocking or rebooting.
    */
  def createTask(params: CreateTaskInput): Request[CreateTaskOutput, AWSError] = js.native
  def createTask(
    params: CreateTaskInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTaskOutput, Unit]
  ): Request[CreateTaskOutput, AWSError] = js.native
  
  /**
    * Checks device-specific information, such as the device type, software version, IP addresses, and lock status.
    */
  def describeDevice(): Request[DescribeDeviceOutput, AWSError] = js.native
  def describeDevice(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceOutput, Unit]): Request[DescribeDeviceOutput, AWSError] = js.native
  /**
    * Checks device-specific information, such as the device type, software version, IP addresses, and lock status.
    */
  def describeDevice(params: DescribeDeviceInput): Request[DescribeDeviceOutput, AWSError] = js.native
  def describeDevice(
    params: DescribeDeviceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceOutput, Unit]
  ): Request[DescribeDeviceOutput, AWSError] = js.native
  
  /**
    * Checks the current state of the Amazon EC2 instances. The output is similar to describeDevice, but the results are sourced from the device cache in the Amazon Web Services Cloud and include a subset of the available fields. 
    */
  def describeDeviceEc2Instances(): Request[DescribeDeviceEc2Output, AWSError] = js.native
  def describeDeviceEc2Instances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceEc2Output, Unit]): Request[DescribeDeviceEc2Output, AWSError] = js.native
  /**
    * Checks the current state of the Amazon EC2 instances. The output is similar to describeDevice, but the results are sourced from the device cache in the Amazon Web Services Cloud and include a subset of the available fields. 
    */
  def describeDeviceEc2Instances(params: DescribeDeviceEc2Input): Request[DescribeDeviceEc2Output, AWSError] = js.native
  def describeDeviceEc2Instances(
    params: DescribeDeviceEc2Input,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceEc2Output, Unit]
  ): Request[DescribeDeviceEc2Output, AWSError] = js.native
  
  /**
    * Checks the status of a remote task running on one or more target devices.
    */
  def describeExecution(): Request[DescribeExecutionOutput, AWSError] = js.native
  def describeExecution(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExecutionOutput, Unit]): Request[DescribeExecutionOutput, AWSError] = js.native
  /**
    * Checks the status of a remote task running on one or more target devices.
    */
  def describeExecution(params: DescribeExecutionInput): Request[DescribeExecutionOutput, AWSError] = js.native
  def describeExecution(
    params: DescribeExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExecutionOutput, Unit]
  ): Request[DescribeExecutionOutput, AWSError] = js.native
  
  /**
    * Checks the metadata for a given task on a device. 
    */
  def describeTask(): Request[DescribeTaskOutput, AWSError] = js.native
  def describeTask(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskOutput, Unit]): Request[DescribeTaskOutput, AWSError] = js.native
  /**
    * Checks the metadata for a given task on a device. 
    */
  def describeTask(params: DescribeTaskInput): Request[DescribeTaskOutput, AWSError] = js.native
  def describeTask(
    params: DescribeTaskInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskOutput, Unit]
  ): Request[DescribeTaskOutput, AWSError] = js.native
  
  /**
    * Returns a list of the Amazon Web Services resources available for a device. Currently, Amazon EC2 instances are the only supported resource type.
    */
  def listDeviceResources(): Request[ListDeviceResourcesOutput, AWSError] = js.native
  def listDeviceResources(callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceResourcesOutput, Unit]): Request[ListDeviceResourcesOutput, AWSError] = js.native
  /**
    * Returns a list of the Amazon Web Services resources available for a device. Currently, Amazon EC2 instances are the only supported resource type.
    */
  def listDeviceResources(params: ListDeviceResourcesInput): Request[ListDeviceResourcesOutput, AWSError] = js.native
  def listDeviceResources(
    params: ListDeviceResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceResourcesOutput, Unit]
  ): Request[ListDeviceResourcesOutput, AWSError] = js.native
  
  /**
    * Returns a list of all devices on your Amazon Web Services account that have Amazon Web Services Snow Device Management enabled in the Amazon Web Services Region where the command is run.
    */
  def listDevices(): Request[ListDevicesOutput, AWSError] = js.native
  def listDevices(callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesOutput, Unit]): Request[ListDevicesOutput, AWSError] = js.native
  /**
    * Returns a list of all devices on your Amazon Web Services account that have Amazon Web Services Snow Device Management enabled in the Amazon Web Services Region where the command is run.
    */
  def listDevices(params: ListDevicesInput): Request[ListDevicesOutput, AWSError] = js.native
  def listDevices(
    params: ListDevicesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesOutput, Unit]
  ): Request[ListDevicesOutput, AWSError] = js.native
  
  /**
    * Returns the status of tasks for one or more target devices.
    */
  def listExecutions(): Request[ListExecutionsOutput, AWSError] = js.native
  def listExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListExecutionsOutput, Unit]): Request[ListExecutionsOutput, AWSError] = js.native
  /**
    * Returns the status of tasks for one or more target devices.
    */
  def listExecutions(params: ListExecutionsInput): Request[ListExecutionsOutput, AWSError] = js.native
  def listExecutions(
    params: ListExecutionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExecutionsOutput, Unit]
  ): Request[ListExecutionsOutput, AWSError] = js.native
  
  /**
    * Returns a list of tags for a managed device or task.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Returns a list of tags for a managed device or task.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Returns a list of tasks that can be filtered by state.
    */
  def listTasks(): Request[ListTasksOutput, AWSError] = js.native
  def listTasks(callback: js.Function2[/* err */ AWSError, /* data */ ListTasksOutput, Unit]): Request[ListTasksOutput, AWSError] = js.native
  /**
    * Returns a list of tasks that can be filtered by state.
    */
  def listTasks(params: ListTasksInput): Request[ListTasksOutput, AWSError] = js.native
  def listTasks(
    params: ListTasksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTasksOutput, Unit]
  ): Request[ListTasksOutput, AWSError] = js.native
  
  /**
    * Adds or replaces tags on a device or task.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or replaces tags on a device or task.
    */
  def tagResource(params: TagResourceInput): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes a tag from a device or task.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a tag from a device or task.
    */
  def untagResource(params: UntagResourceInput): Request[js.Object, AWSError] = js.native
  def untagResource(params: UntagResourceInput, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
}
