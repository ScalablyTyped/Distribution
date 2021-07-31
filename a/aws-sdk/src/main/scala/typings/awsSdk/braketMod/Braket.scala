package typings.awsSdk.braketMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Braket extends Service {
  
  /**
    * Cancels the specified task.
    */
  def cancelQuantumTask(): Request[CancelQuantumTaskResponse, AWSError] = js.native
  def cancelQuantumTask(callback: js.Function2[/* err */ AWSError, /* data */ CancelQuantumTaskResponse, Unit]): Request[CancelQuantumTaskResponse, AWSError] = js.native
  /**
    * Cancels the specified task.
    */
  def cancelQuantumTask(params: CancelQuantumTaskRequest): Request[CancelQuantumTaskResponse, AWSError] = js.native
  def cancelQuantumTask(
    params: CancelQuantumTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelQuantumTaskResponse, Unit]
  ): Request[CancelQuantumTaskResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Braket: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a quantum task.
    */
  def createQuantumTask(): Request[CreateQuantumTaskResponse, AWSError] = js.native
  def createQuantumTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateQuantumTaskResponse, Unit]): Request[CreateQuantumTaskResponse, AWSError] = js.native
  /**
    * Creates a quantum task.
    */
  def createQuantumTask(params: CreateQuantumTaskRequest): Request[CreateQuantumTaskResponse, AWSError] = js.native
  def createQuantumTask(
    params: CreateQuantumTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateQuantumTaskResponse, Unit]
  ): Request[CreateQuantumTaskResponse, AWSError] = js.native
  
  /**
    * Retrieves the devices available in Amazon Braket.
    */
  def getDevice(): Request[GetDeviceResponse, AWSError] = js.native
  def getDevice(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceResponse, Unit]): Request[GetDeviceResponse, AWSError] = js.native
  /**
    * Retrieves the devices available in Amazon Braket.
    */
  def getDevice(params: GetDeviceRequest): Request[GetDeviceResponse, AWSError] = js.native
  def getDevice(
    params: GetDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceResponse, Unit]
  ): Request[GetDeviceResponse, AWSError] = js.native
  
  /**
    * Retrieves the specified quantum task.
    */
  def getQuantumTask(): Request[GetQuantumTaskResponse, AWSError] = js.native
  def getQuantumTask(callback: js.Function2[/* err */ AWSError, /* data */ GetQuantumTaskResponse, Unit]): Request[GetQuantumTaskResponse, AWSError] = js.native
  /**
    * Retrieves the specified quantum task.
    */
  def getQuantumTask(params: GetQuantumTaskRequest): Request[GetQuantumTaskResponse, AWSError] = js.native
  def getQuantumTask(
    params: GetQuantumTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetQuantumTaskResponse, Unit]
  ): Request[GetQuantumTaskResponse, AWSError] = js.native
  
  /**
    * Shows the tags associated with this resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Shows the tags associated with this resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Searches for devices using the specified filters.
    */
  def searchDevices(): Request[SearchDevicesResponse, AWSError] = js.native
  def searchDevices(callback: js.Function2[/* err */ AWSError, /* data */ SearchDevicesResponse, Unit]): Request[SearchDevicesResponse, AWSError] = js.native
  /**
    * Searches for devices using the specified filters.
    */
  def searchDevices(params: SearchDevicesRequest): Request[SearchDevicesResponse, AWSError] = js.native
  def searchDevices(
    params: SearchDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchDevicesResponse, Unit]
  ): Request[SearchDevicesResponse, AWSError] = js.native
  
  /**
    * Searches for tasks that match the specified filter values.
    */
  def searchQuantumTasks(): Request[SearchQuantumTasksResponse, AWSError] = js.native
  def searchQuantumTasks(callback: js.Function2[/* err */ AWSError, /* data */ SearchQuantumTasksResponse, Unit]): Request[SearchQuantumTasksResponse, AWSError] = js.native
  /**
    * Searches for tasks that match the specified filter values.
    */
  def searchQuantumTasks(params: SearchQuantumTasksRequest): Request[SearchQuantumTasksResponse, AWSError] = js.native
  def searchQuantumTasks(
    params: SearchQuantumTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchQuantumTasksResponse, Unit]
  ): Request[SearchQuantumTasksResponse, AWSError] = js.native
  
  /**
    * Add a tag to the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Add a tag to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Remove tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Remove tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}
