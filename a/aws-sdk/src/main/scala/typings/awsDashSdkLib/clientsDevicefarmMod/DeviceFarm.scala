package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceFarm
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DeviceFarm: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ClientConfiguration = js.native
  /**
     * Creates a device pool.
     */
  def createDevicePool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a device pool.
     */
  def createDevicePool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a device pool.
     */
  def createDevicePool(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateDevicePoolRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a device pool.
     */
  def createDevicePool(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateDevicePoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a profile that can be applied to one or more private fleet device instances.
     */
  def createInstanceProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a profile that can be applied to one or more private fleet device instances.
     */
  def createInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a profile that can be applied to one or more private fleet device instances.
     */
  def createInstanceProfile(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a profile that can be applied to one or more private fleet device instances.
     */
  def createInstanceProfile(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a network profile.
     */
  def createNetworkProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a network profile.
     */
  def createNetworkProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a network profile.
     */
  def createNetworkProfile(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateNetworkProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a network profile.
     */
  def createNetworkProfile(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateNetworkProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new project.
     */
  def createProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new project.
     */
  def createProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new project.
     */
  def createProject(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new project.
     */
  def createProject(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specifies and starts a remote access session.
     */
  def createRemoteAccessSession(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specifies and starts a remote access session.
     */
  def createRemoteAccessSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specifies and starts a remote access session.
     */
  def createRemoteAccessSession(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateRemoteAccessSessionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specifies and starts a remote access session.
     */
  def createRemoteAccessSession(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateRemoteAccessSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an app or test scripts.
     */
  def createUpload(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an app or test scripts.
     */
  def createUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an app or test scripts.
     */
  def createUpload(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateUploadRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Uploads an app or test scripts.
     */
  def createUpload(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def createVPCEConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def createVPCEConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def createVPCEConfiguration(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateVPCEConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def createVPCEConfiguration(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateVPCEConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.CreateVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
     */
  def deleteDevicePool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
     */
  def deleteDevicePool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
     */
  def deleteDevicePool(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteDevicePoolRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
     */
  def deleteDevicePool(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteDevicePoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a profile that can be applied to one or more private device instances.
     */
  def deleteInstanceProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a profile that can be applied to one or more private device instances.
     */
  def deleteInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a profile that can be applied to one or more private device instances.
     */
  def deleteInstanceProfile(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a profile that can be applied to one or more private device instances.
     */
  def deleteInstanceProfile(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a network profile.
     */
  def deleteNetworkProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a network profile.
     */
  def deleteNetworkProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a network profile.
     */
  def deleteNetworkProfile(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteNetworkProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a network profile.
     */
  def deleteNetworkProfile(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteNetworkProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an AWS Device Farm project, given the project ARN.  Note Deleting this resource does not stop an in-progress run.
     */
  def deleteProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an AWS Device Farm project, given the project ARN.  Note Deleting this resource does not stop an in-progress run.
     */
  def deleteProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an AWS Device Farm project, given the project ARN.  Note Deleting this resource does not stop an in-progress run.
     */
  def deleteProject(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an AWS Device Farm project, given the project ARN.  Note Deleting this resource does not stop an in-progress run.
     */
  def deleteProject(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a completed remote access session and its results.
     */
  def deleteRemoteAccessSession(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a completed remote access session and its results.
     */
  def deleteRemoteAccessSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a completed remote access session and its results.
     */
  def deleteRemoteAccessSession(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRemoteAccessSessionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a completed remote access session and its results.
     */
  def deleteRemoteAccessSession(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRemoteAccessSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the run, given the run ARN.  Note Deleting this resource does not stop an in-progress run.
     */
  def deleteRun(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the run, given the run ARN.  Note Deleting this resource does not stop an in-progress run.
     */
  def deleteRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRunResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the run, given the run ARN.  Note Deleting this resource does not stop an in-progress run.
     */
  def deleteRun(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRunRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the run, given the run ARN.  Note Deleting this resource does not stop an in-progress run.
     */
  def deleteRun(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRunResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an upload given the upload ARN.
     */
  def deleteUpload(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an upload given the upload ARN.
     */
  def deleteUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an upload given the upload ARN.
     */
  def deleteUpload(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteUploadRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an upload given the upload ARN.
     */
  def deleteUpload(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def deleteVPCEConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def deleteVPCEConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def deleteVPCEConfiguration(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteVPCEConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def deleteVPCEConfiguration(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteVPCEConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.DeleteVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.
     */
  def getAccountSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetAccountSettingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.
     */
  def getAccountSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetAccountSettingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetAccountSettingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.
     */
  def getAccountSettings(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetAccountSettingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.
     */
  def getAccountSettings(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetAccountSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetAccountSettingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetAccountSettingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a unique device type.
     */
  def getDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a unique device type.
     */
  def getDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a unique device type.
     */
  def getDevice(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a unique device type.
     */
  def getDevice(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a device instance belonging to a private device fleet.
     */
  def getDeviceInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a device instance belonging to a private device fleet.
     */
  def getDeviceInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a device instance belonging to a private device fleet.
     */
  def getDeviceInstance(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a device instance belonging to a private device fleet.
     */
  def getDeviceInstance(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDeviceInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a device pool.
     */
  def getDevicePool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a device pool.
     */
  def getDevicePool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a device pool.
     */
  def getDevicePool(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a device pool.
     */
  def getDevicePool(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about compatibility with a device pool.
     */
  def getDevicePoolCompatibility(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolCompatibilityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about compatibility with a device pool.
     */
  def getDevicePoolCompatibility(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolCompatibilityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolCompatibilityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about compatibility with a device pool.
     */
  def getDevicePoolCompatibility(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolCompatibilityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolCompatibilityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about compatibility with a device pool.
     */
  def getDevicePoolCompatibility(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolCompatibilityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolCompatibilityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetDevicePoolCompatibilityResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified instance profile.
     */
  def getInstanceProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified instance profile.
     */
  def getInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified instance profile.
     */
  def getInstanceProfile(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the specified instance profile.
     */
  def getInstanceProfile(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a job.
     */
  def getJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a job.
     */
  def getJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a job.
     */
  def getJob(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a job.
     */
  def getJob(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a network profile.
     */
  def getNetworkProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a network profile.
     */
  def getNetworkProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a network profile.
     */
  def getNetworkProfile(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetNetworkProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a network profile.
     */
  def getNetworkProfile(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetNetworkProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the current status and future status of all offerings purchased by an AWS account. The response indicates how many offerings are currently available and the offerings that will be available in the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def getOfferingStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetOfferingStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the current status and future status of all offerings purchased by an AWS account. The response indicates how many offerings are currently available and the offerings that will be available in the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def getOfferingStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetOfferingStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetOfferingStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the current status and future status of all offerings purchased by an AWS account. The response indicates how many offerings are currently available and the offerings that will be available in the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def getOfferingStatus(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetOfferingStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetOfferingStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the current status and future status of all offerings purchased by an AWS account. The response indicates how many offerings are currently available and the offerings that will be available in the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def getOfferingStatus(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetOfferingStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetOfferingStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetOfferingStatusResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a project.
     */
  def getProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a project.
     */
  def getProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a project.
     */
  def getProject(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a project.
     */
  def getProject(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a link to a currently running remote access session.
     */
  def getRemoteAccessSession(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a link to a currently running remote access session.
     */
  def getRemoteAccessSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a link to a currently running remote access session.
     */
  def getRemoteAccessSession(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRemoteAccessSessionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a link to a currently running remote access session.
     */
  def getRemoteAccessSession(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRemoteAccessSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a run.
     */
  def getRun(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a run.
     */
  def getRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRunResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a run.
     */
  def getRun(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRunRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a run.
     */
  def getRun(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRunResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a suite.
     */
  def getSuite(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetSuiteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a suite.
     */
  def getSuite(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetSuiteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetSuiteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a suite.
     */
  def getSuite(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetSuiteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetSuiteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a suite.
     */
  def getSuite(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetSuiteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetSuiteResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetSuiteResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a test.
     */
  def getTest(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetTestResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a test.
     */
  def getTest(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetTestResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetTestResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a test.
     */
  def getTest(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetTestRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetTestResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about a test.
     */
  def getTest(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetTestRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetTestResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetTestResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an upload.
     */
  def getUpload(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an upload.
     */
  def getUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an upload.
     */
  def getUpload(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetUploadRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about an upload.
     */
  def getUpload(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def getVPCEConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def getVPCEConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def getVPCEConfiguration(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetVPCEConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
     */
  def getVPCEConfiguration(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetVPCEConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.GetVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Installs an application to the device in a remote access session. For Android applications, the file must be in .apk format. For iOS applications, the file must be in .ipa format.
     */
  def installToRemoteAccessSession(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.InstallToRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Installs an application to the device in a remote access session. For Android applications, the file must be in .apk format. For iOS applications, the file must be in .ipa format.
     */
  def installToRemoteAccessSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.InstallToRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.InstallToRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Installs an application to the device in a remote access session. For Android applications, the file must be in .apk format. For iOS applications, the file must be in .ipa format.
     */
  def installToRemoteAccessSession(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.InstallToRemoteAccessSessionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.InstallToRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Installs an application to the device in a remote access session. For Android applications, the file must be in .apk format. For iOS applications, the file must be in .ipa format.
     */
  def installToRemoteAccessSession(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.InstallToRemoteAccessSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.InstallToRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.InstallToRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about artifacts.
     */
  def listArtifacts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListArtifactsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about artifacts.
     */
  def listArtifacts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListArtifactsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListArtifactsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about artifacts.
     */
  def listArtifacts(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListArtifactsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListArtifactsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about artifacts.
     */
  def listArtifacts(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListArtifactsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListArtifactsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListArtifactsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the private device instances associated with one or more AWS accounts.
     */
  def listDeviceInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDeviceInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the private device instances associated with one or more AWS accounts.
     */
  def listDeviceInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDeviceInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDeviceInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the private device instances associated with one or more AWS accounts.
     */
  def listDeviceInstances(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDeviceInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDeviceInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about the private device instances associated with one or more AWS accounts.
     */
  def listDeviceInstances(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDeviceInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDeviceInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDeviceInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about device pools.
     */
  def listDevicePools(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicePoolsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about device pools.
     */
  def listDevicePools(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicePoolsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicePoolsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about device pools.
     */
  def listDevicePools(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicePoolsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicePoolsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about device pools.
     */
  def listDevicePools(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicePoolsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicePoolsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicePoolsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about unique device types.
     */
  def listDevices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about unique device types.
     */
  def listDevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about unique device types.
     */
  def listDevices(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about unique device types.
     */
  def listDevices(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListDevicesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all the instance profiles in an AWS account.
     */
  def listInstanceProfiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListInstanceProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all the instance profiles in an AWS account.
     */
  def listInstanceProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListInstanceProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListInstanceProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all the instance profiles in an AWS account.
     */
  def listInstanceProfiles(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListInstanceProfilesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListInstanceProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all the instance profiles in an AWS account.
     */
  def listInstanceProfiles(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListInstanceProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListInstanceProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListInstanceProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about jobs for a given test run.
     */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about jobs for a given test run.
     */
  def listJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListJobsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about jobs for a given test run.
     */
  def listJobs(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about jobs for a given test run.
     */
  def listJobs(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListJobsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListJobsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the list of available network profiles.
     */
  def listNetworkProfiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListNetworkProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the list of available network profiles.
     */
  def listNetworkProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListNetworkProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListNetworkProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the list of available network profiles.
     */
  def listNetworkProfiles(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListNetworkProfilesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListNetworkProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the list of available network profiles.
     */
  def listNetworkProfiles(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListNetworkProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListNetworkProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListNetworkProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the promotion. The API returns a NotEligible error if the caller is not permitted to invoke the operation. Contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferingPromotions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingPromotionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the promotion. The API returns a NotEligible error if the caller is not permitted to invoke the operation. Contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferingPromotions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingPromotionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingPromotionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the promotion. The API returns a NotEligible error if the caller is not permitted to invoke the operation. Contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferingPromotions(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingPromotionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingPromotionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the promotion. The API returns a NotEligible error if the caller is not permitted to invoke the operation. Contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferingPromotions(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingPromotionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingPromotionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingPromotionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferingTransactions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingTransactionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferingTransactions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingTransactionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingTransactionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferingTransactions(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingTransactionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingTransactionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferingTransactions(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingTransactionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingTransactionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingTransactionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of products or offerings that the user can manage through the API. Each offering record indicates the recurring price per unit and the frequency for that offering. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of products or offerings that the user can manage through the API. Each offering record indicates the recurring price per unit and the frequency for that offering. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of products or offerings that the user can manage through the API. Each offering record indicates the recurring price per unit and the frequency for that offering. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferings(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of products or offerings that the user can manage through the API. Each offering record indicates the recurring price per unit and the frequency for that offering. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def listOfferings(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListOfferingsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about projects.
     */
  def listProjects(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about projects.
     */
  def listProjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListProjectsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about projects.
     */
  def listProjects(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListProjectsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about projects.
     */
  def listProjects(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListProjectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListProjectsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListProjectsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all currently running remote access sessions.
     */
  def listRemoteAccessSessions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRemoteAccessSessionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all currently running remote access sessions.
     */
  def listRemoteAccessSessions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRemoteAccessSessionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRemoteAccessSessionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all currently running remote access sessions.
     */
  def listRemoteAccessSessions(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRemoteAccessSessionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRemoteAccessSessionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all currently running remote access sessions.
     */
  def listRemoteAccessSessions(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRemoteAccessSessionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRemoteAccessSessionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRemoteAccessSessionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about runs, given an AWS Device Farm project ARN.
     */
  def listRuns(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRunsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about runs, given an AWS Device Farm project ARN.
     */
  def listRuns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRunsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRunsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about runs, given an AWS Device Farm project ARN.
     */
  def listRuns(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRunsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRunsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about runs, given an AWS Device Farm project ARN.
     */
  def listRuns(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRunsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRunsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListRunsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about samples, given an AWS Device Farm project ARN
     */
  def listSamples(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSamplesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about samples, given an AWS Device Farm project ARN
     */
  def listSamples(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSamplesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSamplesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about samples, given an AWS Device Farm project ARN
     */
  def listSamples(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSamplesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSamplesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about samples, given an AWS Device Farm project ARN
     */
  def listSamples(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSamplesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSamplesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSamplesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about test suites for a given job.
     */
  def listSuites(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSuitesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about test suites for a given job.
     */
  def listSuites(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSuitesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSuitesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about test suites for a given job.
     */
  def listSuites(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSuitesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSuitesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about test suites for a given job.
     */
  def listSuites(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSuitesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSuitesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListSuitesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about tests in a given test suite.
     */
  def listTests(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListTestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about tests in a given test suite.
     */
  def listTests(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListTestsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListTestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about tests in a given test suite.
     */
  def listTests(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListTestsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListTestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about tests in a given test suite.
     */
  def listTests(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListTestsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListTestsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListTestsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about unique problems.
     */
  def listUniqueProblems(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUniqueProblemsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about unique problems.
     */
  def listUniqueProblems(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUniqueProblemsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUniqueProblemsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about unique problems.
     */
  def listUniqueProblems(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUniqueProblemsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUniqueProblemsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about unique problems.
     */
  def listUniqueProblems(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUniqueProblemsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUniqueProblemsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUniqueProblemsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about uploads, given an AWS Device Farm project ARN.
     */
  def listUploads(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUploadsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about uploads, given an AWS Device Farm project ARN.
     */
  def listUploads(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUploadsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUploadsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about uploads, given an AWS Device Farm project ARN.
     */
  def listUploads(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUploadsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUploadsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets information about uploads, given an AWS Device Farm project ARN.
     */
  def listUploads(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUploadsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUploadsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListUploadsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
     */
  def listVPCEConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListVPCEConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
     */
  def listVPCEConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListVPCEConfigurationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListVPCEConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
     */
  def listVPCEConfigurations(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListVPCEConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListVPCEConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
     */
  def listVPCEConfigurations(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListVPCEConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListVPCEConfigurationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ListVPCEConfigurationsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for an offering, unless the renewal was overridden. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def purchaseOffering(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.PurchaseOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for an offering, unless the renewal was overridden. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def purchaseOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.PurchaseOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.PurchaseOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for an offering, unless the renewal was overridden. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def purchaseOffering(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.PurchaseOfferingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.PurchaseOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for an offering, unless the renewal was overridden. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def purchaseOffering(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.PurchaseOfferingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.PurchaseOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.PurchaseOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Explicitly sets the quantity of devices to renew for an offering, starting from the effectiveDate of the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def renewOffering(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.RenewOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Explicitly sets the quantity of devices to renew for an offering, starting from the effectiveDate of the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def renewOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.RenewOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.RenewOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Explicitly sets the quantity of devices to renew for an offering, starting from the effectiveDate of the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def renewOffering(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.RenewOfferingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.RenewOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Explicitly sets the quantity of devices to renew for an offering, starting from the effectiveDate of the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
     */
  def renewOffering(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.RenewOfferingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.RenewOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.RenewOfferingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Schedules a run.
     */
  def scheduleRun(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ScheduleRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Schedules a run.
     */
  def scheduleRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ScheduleRunResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ScheduleRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Schedules a run.
     */
  def scheduleRun(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ScheduleRunRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ScheduleRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Schedules a run.
     */
  def scheduleRun(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ScheduleRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ScheduleRunResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.ScheduleRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where tests have not started executing, and you will not be billed for this device. On the device where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     */
  def stopJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where tests have not started executing, and you will not be billed for this device. On the device where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     */
  def stopJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where tests have not started executing, and you will not be billed for this device. On the device where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     */
  def stopJob(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where tests have not started executing, and you will not be billed for this device. On the device where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     */
  def stopJob(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopJobResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopJobResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Ends a specified remote access session.
     */
  def stopRemoteAccessSession(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Ends a specified remote access session.
     */
  def stopRemoteAccessSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Ends a specified remote access session.
     */
  def stopRemoteAccessSession(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRemoteAccessSessionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Ends a specified remote access session.
     */
  def stopRemoteAccessSession(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRemoteAccessSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRemoteAccessSessionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where tests have not started executing, and you will not be billed for these devices. On devices where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     */
  def stopRun(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where tests have not started executing, and you will not be billed for these devices. On devices where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     */
  def stopRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRunResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where tests have not started executing, and you will not be billed for these devices. On devices where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     */
  def stopRun(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRunRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where tests have not started executing, and you will not be billed for these devices. On devices where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
     */
  def stopRun(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRunResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.StopRunResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing private device instance.
     */
  def updateDeviceInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDeviceInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing private device instance.
     */
  def updateDeviceInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDeviceInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDeviceInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing private device instance.
     */
  def updateDeviceInstance(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDeviceInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDeviceInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing private device instance.
     */
  def updateDeviceInstance(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDeviceInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDeviceInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDeviceInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates are all-or-nothing, meaning they can only be updated as a whole (or not at all).
     */
  def updateDevicePool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates are all-or-nothing, meaning they can only be updated as a whole (or not at all).
     */
  def updateDevicePool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates are all-or-nothing, meaning they can only be updated as a whole (or not at all).
     */
  def updateDevicePool(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDevicePoolRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates are all-or-nothing, meaning they can only be updated as a whole (or not at all).
     */
  def updateDevicePool(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDevicePoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateDevicePoolResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing private device instance profile.
     */
  def updateInstanceProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing private device instance profile.
     */
  def updateInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing private device instance profile.
     */
  def updateInstanceProfile(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing private device instance profile.
     */
  def updateInstanceProfile(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateInstanceProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the network profile with specific settings.
     */
  def updateNetworkProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the network profile with specific settings.
     */
  def updateNetworkProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the network profile with specific settings.
     */
  def updateNetworkProfile(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateNetworkProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the network profile with specific settings.
     */
  def updateNetworkProfile(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateNetworkProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateNetworkProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified project name, given the project ARN and a new name.
     */
  def updateProject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified project name, given the project ARN and a new name.
     */
  def updateProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified project name, given the project ARN and a new name.
     */
  def updateProject(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateProjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Modifies the specified project name, given the project ARN and a new name.
     */
  def updateProject(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateProjectResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an uploaded test specification (test spec).
     */
  def updateUpload(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an uploaded test specification (test spec).
     */
  def updateUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an uploaded test specification (test spec).
     */
  def updateUpload(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateUploadRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update an uploaded test specification (test spec).
     */
  def updateUpload(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateUploadResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.
     */
  def updateVPCEConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.
     */
  def updateVPCEConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.
     */
  def updateVPCEConfiguration(params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateVPCEConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.
     */
  def updateVPCEConfiguration(
    params: awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateVPCEConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsDevicefarmMod.DeviceFarmNs.UpdateVPCEConfigurationResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

