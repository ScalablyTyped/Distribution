package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceFarm
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_DeviceFarm: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a device pool.
    */
  def createDevicePool(): awsDashSdkLib.libRequestMod.Request[CreateDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDevicePool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a device pool.
    */
  def createDevicePool(params: CreateDevicePoolRequest): awsDashSdkLib.libRequestMod.Request[CreateDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDevicePool(
    params: CreateDevicePoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a profile that can be applied to one or more private fleet device instances.
    */
  def createInstanceProfile(): awsDashSdkLib.libRequestMod.Request[CreateInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a profile that can be applied to one or more private fleet device instances.
    */
  def createInstanceProfile(params: CreateInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[CreateInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInstanceProfile(
    params: CreateInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a network profile.
    */
  def createNetworkProfile(): awsDashSdkLib.libRequestMod.Request[CreateNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNetworkProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a network profile.
    */
  def createNetworkProfile(params: CreateNetworkProfileRequest): awsDashSdkLib.libRequestMod.Request[CreateNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNetworkProfile(
    params: CreateNetworkProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new project.
    */
  def createProject(): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new project.
    */
  def createProject(params: CreateProjectRequest): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Specifies and starts a remote access session.
    */
  def createRemoteAccessSession(): awsDashSdkLib.libRequestMod.Request[CreateRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRemoteAccessSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Specifies and starts a remote access session.
    */
  def createRemoteAccessSession(params: CreateRemoteAccessSessionRequest): awsDashSdkLib.libRequestMod.Request[CreateRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createRemoteAccessSession(
    params: CreateRemoteAccessSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads an app or test scripts.
    */
  def createUpload(): awsDashSdkLib.libRequestMod.Request[CreateUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads an app or test scripts.
    */
  def createUpload(params: CreateUploadRequest): awsDashSdkLib.libRequestMod.Request[CreateUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUpload(
    params: CreateUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def createVPCEConfiguration(): awsDashSdkLib.libRequestMod.Request[CreateVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVPCEConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a configuration record in Device Farm for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def createVPCEConfiguration(params: CreateVPCEConfigurationRequest): awsDashSdkLib.libRequestMod.Request[CreateVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVPCEConfiguration(
    params: CreateVPCEConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
    */
  def deleteDevicePool(): awsDashSdkLib.libRequestMod.Request[DeleteDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDevicePool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a device pool given the pool ARN. Does not allow deletion of curated pools owned by the system.
    */
  def deleteDevicePool(params: DeleteDevicePoolRequest): awsDashSdkLib.libRequestMod.Request[DeleteDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDevicePool(
    params: DeleteDevicePoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a profile that can be applied to one or more private device instances.
    */
  def deleteInstanceProfile(): awsDashSdkLib.libRequestMod.Request[DeleteInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a profile that can be applied to one or more private device instances.
    */
  def deleteInstanceProfile(params: DeleteInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[DeleteInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInstanceProfile(
    params: DeleteInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a network profile.
    */
  def deleteNetworkProfile(): awsDashSdkLib.libRequestMod.Request[DeleteNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNetworkProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a network profile.
    */
  def deleteNetworkProfile(params: DeleteNetworkProfileRequest): awsDashSdkLib.libRequestMod.Request[DeleteNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNetworkProfile(
    params: DeleteNetworkProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an AWS Device Farm project, given the project ARN.  Note Deleting this resource does not stop an in-progress run.
    */
  def deleteProject(): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an AWS Device Farm project, given the project ARN.  Note Deleting this resource does not stop an in-progress run.
    */
  def deleteProject(params: DeleteProjectRequest): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a completed remote access session and its results.
    */
  def deleteRemoteAccessSession(): awsDashSdkLib.libRequestMod.Request[DeleteRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRemoteAccessSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a completed remote access session and its results.
    */
  def deleteRemoteAccessSession(params: DeleteRemoteAccessSessionRequest): awsDashSdkLib.libRequestMod.Request[DeleteRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRemoteAccessSession(
    params: DeleteRemoteAccessSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the run, given the run ARN.  Note Deleting this resource does not stop an in-progress run.
    */
  def deleteRun(): awsDashSdkLib.libRequestMod.Request[DeleteRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRun(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DeleteRunResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the run, given the run ARN.  Note Deleting this resource does not stop an in-progress run.
    */
  def deleteRun(params: DeleteRunRequest): awsDashSdkLib.libRequestMod.Request[DeleteRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRun(
    params: DeleteRunRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DeleteRunResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[DeleteRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an upload given the upload ARN.
    */
  def deleteUpload(): awsDashSdkLib.libRequestMod.Request[DeleteUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an upload given the upload ARN.
    */
  def deleteUpload(params: DeleteUploadRequest): awsDashSdkLib.libRequestMod.Request[DeleteUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUpload(
    params: DeleteUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def deleteVPCEConfiguration(): awsDashSdkLib.libRequestMod.Request[DeleteVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVPCEConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a configuration for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def deleteVPCEConfiguration(params: DeleteVPCEConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeleteVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVPCEConfiguration(
    params: DeleteVPCEConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.
    */
  def getAccountSettings(): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAccountSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAccountSettingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the number of unmetered iOS and/or unmetered Android devices that have been purchased by the account.
    */
  def getAccountSettings(params: GetAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAccountSettings(
    params: GetAccountSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAccountSettingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a unique device type.
    */
  def getDevice(): awsDashSdkLib.libRequestMod.Request[GetDeviceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevice(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetDeviceResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetDeviceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a unique device type.
    */
  def getDevice(params: GetDeviceRequest): awsDashSdkLib.libRequestMod.Request[GetDeviceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevice(
    params: GetDeviceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetDeviceResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetDeviceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a device instance belonging to a private device fleet.
    */
  def getDeviceInstance(): awsDashSdkLib.libRequestMod.Request[GetDeviceInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeviceInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeviceInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeviceInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a device instance belonging to a private device fleet.
    */
  def getDeviceInstance(params: GetDeviceInstanceRequest): awsDashSdkLib.libRequestMod.Request[GetDeviceInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeviceInstance(
    params: GetDeviceInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeviceInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeviceInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a device pool.
    */
  def getDevicePool(): awsDashSdkLib.libRequestMod.Request[GetDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevicePool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a device pool.
    */
  def getDevicePool(params: GetDevicePoolRequest): awsDashSdkLib.libRequestMod.Request[GetDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevicePool(
    params: GetDevicePoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about compatibility with a device pool.
    */
  def getDevicePoolCompatibility(): awsDashSdkLib.libRequestMod.Request[GetDevicePoolCompatibilityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevicePoolCompatibility(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDevicePoolCompatibilityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDevicePoolCompatibilityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about compatibility with a device pool.
    */
  def getDevicePoolCompatibility(params: GetDevicePoolCompatibilityRequest): awsDashSdkLib.libRequestMod.Request[GetDevicePoolCompatibilityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevicePoolCompatibility(
    params: GetDevicePoolCompatibilityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDevicePoolCompatibilityResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDevicePoolCompatibilityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified instance profile.
    */
  def getInstanceProfile(): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified instance profile.
    */
  def getInstanceProfile(params: GetInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getInstanceProfile(
    params: GetInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a job.
    */
  def getJob(): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a job.
    */
  def getJob(params: GetJobRequest): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJob(
    params: GetJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a network profile.
    */
  def getNetworkProfile(): awsDashSdkLib.libRequestMod.Request[GetNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNetworkProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a network profile.
    */
  def getNetworkProfile(params: GetNetworkProfileRequest): awsDashSdkLib.libRequestMod.Request[GetNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNetworkProfile(
    params: GetNetworkProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the current status and future status of all offerings purchased by an AWS account. The response indicates how many offerings are currently available and the offerings that will be available in the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def getOfferingStatus(): awsDashSdkLib.libRequestMod.Request[GetOfferingStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOfferingStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOfferingStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOfferingStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the current status and future status of all offerings purchased by an AWS account. The response indicates how many offerings are currently available and the offerings that will be available in the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def getOfferingStatus(params: GetOfferingStatusRequest): awsDashSdkLib.libRequestMod.Request[GetOfferingStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getOfferingStatus(
    params: GetOfferingStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetOfferingStatusResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetOfferingStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a project.
    */
  def getProject(): awsDashSdkLib.libRequestMod.Request[GetProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a project.
    */
  def getProject(params: GetProjectRequest): awsDashSdkLib.libRequestMod.Request[GetProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getProject(
    params: GetProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a link to a currently running remote access session.
    */
  def getRemoteAccessSession(): awsDashSdkLib.libRequestMod.Request[GetRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRemoteAccessSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a link to a currently running remote access session.
    */
  def getRemoteAccessSession(params: GetRemoteAccessSessionRequest): awsDashSdkLib.libRequestMod.Request[GetRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRemoteAccessSession(
    params: GetRemoteAccessSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a run.
    */
  def getRun(): awsDashSdkLib.libRequestMod.Request[GetRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRun(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRunResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a run.
    */
  def getRun(params: GetRunRequest): awsDashSdkLib.libRequestMod.Request[GetRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getRun(
    params: GetRunRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRunResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a suite.
    */
  def getSuite(): awsDashSdkLib.libRequestMod.Request[GetSuiteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSuite(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetSuiteResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetSuiteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a suite.
    */
  def getSuite(params: GetSuiteRequest): awsDashSdkLib.libRequestMod.Request[GetSuiteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSuite(
    params: GetSuiteRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetSuiteResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetSuiteResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a test.
    */
  def getTest(): awsDashSdkLib.libRequestMod.Request[GetTestResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTest(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTestResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetTestResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a test.
    */
  def getTest(params: GetTestRequest): awsDashSdkLib.libRequestMod.Request[GetTestResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTest(
    params: GetTestRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTestResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetTestResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about an upload.
    */
  def getUpload(): awsDashSdkLib.libRequestMod.Request[GetUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUpload(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUploadResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about an upload.
    */
  def getUpload(params: GetUploadRequest): awsDashSdkLib.libRequestMod.Request[GetUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUpload(
    params: GetUploadRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUploadResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def getVPCEConfiguration(): awsDashSdkLib.libRequestMod.Request[GetVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVPCEConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the configuration settings for your Amazon Virtual Private Cloud (VPC) endpoint.
    */
  def getVPCEConfiguration(params: GetVPCEConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVPCEConfiguration(
    params: GetVPCEConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Installs an application to the device in a remote access session. For Android applications, the file must be in .apk format. For iOS applications, the file must be in .ipa format.
    */
  def installToRemoteAccessSession(): awsDashSdkLib.libRequestMod.Request[InstallToRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def installToRemoteAccessSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InstallToRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InstallToRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Installs an application to the device in a remote access session. For Android applications, the file must be in .apk format. For iOS applications, the file must be in .ipa format.
    */
  def installToRemoteAccessSession(params: InstallToRemoteAccessSessionRequest): awsDashSdkLib.libRequestMod.Request[InstallToRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def installToRemoteAccessSession(
    params: InstallToRemoteAccessSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InstallToRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InstallToRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about artifacts.
    */
  def listArtifacts(): awsDashSdkLib.libRequestMod.Request[ListArtifactsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listArtifacts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListArtifactsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListArtifactsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about artifacts.
    */
  def listArtifacts(params: ListArtifactsRequest): awsDashSdkLib.libRequestMod.Request[ListArtifactsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listArtifacts(
    params: ListArtifactsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListArtifactsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListArtifactsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the private device instances associated with one or more AWS accounts.
    */
  def listDeviceInstances(): awsDashSdkLib.libRequestMod.Request[ListDeviceInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeviceInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeviceInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeviceInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the private device instances associated with one or more AWS accounts.
    */
  def listDeviceInstances(params: ListDeviceInstancesRequest): awsDashSdkLib.libRequestMod.Request[ListDeviceInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeviceInstances(
    params: ListDeviceInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeviceInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeviceInstancesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about device pools.
    */
  def listDevicePools(): awsDashSdkLib.libRequestMod.Request[ListDevicePoolsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevicePools(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevicePoolsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevicePoolsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about device pools.
    */
  def listDevicePools(params: ListDevicePoolsRequest): awsDashSdkLib.libRequestMod.Request[ListDevicePoolsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevicePools(
    params: ListDevicePoolsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevicePoolsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevicePoolsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about unique device types.
    */
  def listDevices(): awsDashSdkLib.libRequestMod.Request[ListDevicesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevicesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevicesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about unique device types.
    */
  def listDevices(params: ListDevicesRequest): awsDashSdkLib.libRequestMod.Request[ListDevicesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevices(
    params: ListDevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevicesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevicesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all the instance profiles in an AWS account.
    */
  def listInstanceProfiles(): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInstanceProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInstanceProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all the instance profiles in an AWS account.
    */
  def listInstanceProfiles(params: ListInstanceProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInstanceProfiles(
    params: ListInstanceProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInstanceProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInstanceProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about jobs for a given test run.
    */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about jobs for a given test run.
    */
  def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of available network profiles.
    */
  def listNetworkProfiles(): awsDashSdkLib.libRequestMod.Request[ListNetworkProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNetworkProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNetworkProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNetworkProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the list of available network profiles.
    */
  def listNetworkProfiles(params: ListNetworkProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListNetworkProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNetworkProfiles(
    params: ListNetworkProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNetworkProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNetworkProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the promotion. The API returns a NotEligible error if the caller is not permitted to invoke the operation. Contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def listOfferingPromotions(): awsDashSdkLib.libRequestMod.Request[ListOfferingPromotionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOfferingPromotions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOfferingPromotionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOfferingPromotionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of offering promotions. Each offering promotion record contains the ID and description of the promotion. The API returns a NotEligible error if the caller is not permitted to invoke the operation. Contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def listOfferingPromotions(params: ListOfferingPromotionsRequest): awsDashSdkLib.libRequestMod.Request[ListOfferingPromotionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOfferingPromotions(
    params: ListOfferingPromotionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOfferingPromotionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOfferingPromotionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def listOfferingTransactions(): awsDashSdkLib.libRequestMod.Request[ListOfferingTransactionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOfferingTransactions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOfferingTransactionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOfferingTransactionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all historical purchases, renewals, and system renewal transactions for an AWS account. The list is paginated and ordered by a descending timestamp (most recent transactions are first). The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def listOfferingTransactions(params: ListOfferingTransactionsRequest): awsDashSdkLib.libRequestMod.Request[ListOfferingTransactionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOfferingTransactions(
    params: ListOfferingTransactionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOfferingTransactionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOfferingTransactionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of products or offerings that the user can manage through the API. Each offering record indicates the recurring price per unit and the frequency for that offering. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def listOfferings(): awsDashSdkLib.libRequestMod.Request[ListOfferingsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOfferings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOfferingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOfferingsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of products or offerings that the user can manage through the API. Each offering record indicates the recurring price per unit and the frequency for that offering. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def listOfferings(params: ListOfferingsRequest): awsDashSdkLib.libRequestMod.Request[ListOfferingsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listOfferings(
    params: ListOfferingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListOfferingsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListOfferingsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about projects.
    */
  def listProjects(): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProjects(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProjectsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about projects.
    */
  def listProjects(params: ListProjectsRequest): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProjectsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProjectsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all currently running remote access sessions.
    */
  def listRemoteAccessSessions(): awsDashSdkLib.libRequestMod.Request[ListRemoteAccessSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRemoteAccessSessions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRemoteAccessSessionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRemoteAccessSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of all currently running remote access sessions.
    */
  def listRemoteAccessSessions(params: ListRemoteAccessSessionsRequest): awsDashSdkLib.libRequestMod.Request[ListRemoteAccessSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRemoteAccessSessions(
    params: ListRemoteAccessSessionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRemoteAccessSessionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRemoteAccessSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about runs, given an AWS Device Farm project ARN.
    */
  def listRuns(): awsDashSdkLib.libRequestMod.Request[ListRunsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRuns(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListRunsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListRunsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about runs, given an AWS Device Farm project ARN.
    */
  def listRuns(params: ListRunsRequest): awsDashSdkLib.libRequestMod.Request[ListRunsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRuns(
    params: ListRunsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListRunsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListRunsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about samples, given an AWS Device Farm job ARN.
    */
  def listSamples(): awsDashSdkLib.libRequestMod.Request[ListSamplesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSamples(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSamplesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSamplesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about samples, given an AWS Device Farm job ARN.
    */
  def listSamples(params: ListSamplesRequest): awsDashSdkLib.libRequestMod.Request[ListSamplesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSamples(
    params: ListSamplesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSamplesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSamplesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about test suites for a given job.
    */
  def listSuites(): awsDashSdkLib.libRequestMod.Request[ListSuitesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSuites(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSuitesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSuitesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about test suites for a given job.
    */
  def listSuites(params: ListSuitesRequest): awsDashSdkLib.libRequestMod.Request[ListSuitesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSuites(
    params: ListSuitesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSuitesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSuitesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about tests in a given test suite.
    */
  def listTests(): awsDashSdkLib.libRequestMod.Request[ListTestsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTests(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTestsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListTestsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about tests in a given test suite.
    */
  def listTests(params: ListTestsRequest): awsDashSdkLib.libRequestMod.Request[ListTestsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTests(
    params: ListTestsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListTestsResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListTestsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about unique problems.
    */
  def listUniqueProblems(): awsDashSdkLib.libRequestMod.Request[ListUniqueProblemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUniqueProblems(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUniqueProblemsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUniqueProblemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about unique problems.
    */
  def listUniqueProblems(params: ListUniqueProblemsRequest): awsDashSdkLib.libRequestMod.Request[ListUniqueProblemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUniqueProblems(
    params: ListUniqueProblemsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUniqueProblemsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUniqueProblemsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about uploads, given an AWS Device Farm project ARN.
    */
  def listUploads(): awsDashSdkLib.libRequestMod.Request[ListUploadsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUploads(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUploadsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUploadsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about uploads, given an AWS Device Farm project ARN.
    */
  def listUploads(params: ListUploadsRequest): awsDashSdkLib.libRequestMod.Request[ListUploadsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUploads(
    params: ListUploadsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUploadsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUploadsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
    */
  def listVPCEConfigurations(): awsDashSdkLib.libRequestMod.Request[ListVPCEConfigurationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listVPCEConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListVPCEConfigurationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListVPCEConfigurationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about all Amazon Virtual Private Cloud (VPC) endpoint configurations in the AWS account.
    */
  def listVPCEConfigurations(params: ListVPCEConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListVPCEConfigurationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listVPCEConfigurations(
    params: ListVPCEConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListVPCEConfigurationsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListVPCEConfigurationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for an offering, unless the renewal was overridden. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def purchaseOffering(): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def purchaseOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PurchaseOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Immediately purchases offerings for an AWS account. Offerings renew with the latest total purchased quantity for an offering, unless the renewal was overridden. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def purchaseOffering(params: PurchaseOfferingRequest): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def purchaseOffering(
    params: PurchaseOfferingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PurchaseOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PurchaseOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Explicitly sets the quantity of devices to renew for an offering, starting from the effectiveDate of the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def renewOffering(): awsDashSdkLib.libRequestMod.Request[RenewOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def renewOffering(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RenewOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RenewOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Explicitly sets the quantity of devices to renew for an offering, starting from the effectiveDate of the next period. The API returns a NotEligible error if the user is not permitted to invoke the operation. Please contact aws-devicefarm-support@amazon.com if you believe that you should be able to invoke this operation.
    */
  def renewOffering(params: RenewOfferingRequest): awsDashSdkLib.libRequestMod.Request[RenewOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def renewOffering(
    params: RenewOfferingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RenewOfferingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RenewOfferingResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Schedules a run.
    */
  def scheduleRun(): awsDashSdkLib.libRequestMod.Request[ScheduleRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def scheduleRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ScheduleRunResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ScheduleRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Schedules a run.
    */
  def scheduleRun(params: ScheduleRunRequest): awsDashSdkLib.libRequestMod.Request[ScheduleRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def scheduleRun(
    params: ScheduleRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ScheduleRunResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ScheduleRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where tests have not started executing, and you will not be billed for this device. On the device where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
    */
  def stopJob(): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates a stop request for the current job. AWS Device Farm will immediately stop the job on the device where tests have not started executing, and you will not be billed for this device. On the device where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on the device. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
    */
  def stopJob(params: StopJobRequest): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopJob(
    params: StopJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopJobResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StopJobResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Ends a specified remote access session.
    */
  def stopRemoteAccessSession(): awsDashSdkLib.libRequestMod.Request[StopRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopRemoteAccessSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Ends a specified remote access session.
    */
  def stopRemoteAccessSession(params: StopRemoteAccessSessionRequest): awsDashSdkLib.libRequestMod.Request[StopRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopRemoteAccessSession(
    params: StopRemoteAccessSessionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopRemoteAccessSessionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopRemoteAccessSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where tests have not started executing, and you will not be billed for these devices. On devices where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
    */
  def stopRun(): awsDashSdkLib.libRequestMod.Request[StopRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopRun(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopRunResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StopRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates a stop request for the current test run. AWS Device Farm will immediately stop the run on devices where tests have not started executing, and you will not be billed for these devices. On devices where tests have started executing, Setup Suite and Teardown Suite tests will run to completion before stopping execution on those devices. You will be billed for Setup, Teardown, and any tests that were in progress or already completed.
    */
  def stopRun(params: StopRunRequest): awsDashSdkLib.libRequestMod.Request[StopRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopRun(
    params: StopRunRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopRunResult, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[StopRunResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates information about an existing private device instance.
    */
  def updateDeviceInstance(): awsDashSdkLib.libRequestMod.Request[UpdateDeviceInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeviceInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeviceInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeviceInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates information about an existing private device instance.
    */
  def updateDeviceInstance(params: UpdateDeviceInstanceRequest): awsDashSdkLib.libRequestMod.Request[UpdateDeviceInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeviceInstance(
    params: UpdateDeviceInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeviceInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeviceInstanceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates are all-or-nothing, meaning they can only be updated as a whole (or not at all).
    */
  def updateDevicePool(): awsDashSdkLib.libRequestMod.Request[UpdateDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDevicePool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the name, description, and rules in a device pool given the attributes and the pool ARN. Rule updates are all-or-nothing, meaning they can only be updated as a whole (or not at all).
    */
  def updateDevicePool(params: UpdateDevicePoolRequest): awsDashSdkLib.libRequestMod.Request[UpdateDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDevicePool(
    params: UpdateDevicePoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDevicePoolResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDevicePoolResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates information about an existing private device instance profile.
    */
  def updateInstanceProfile(): awsDashSdkLib.libRequestMod.Request[UpdateInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInstanceProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates information about an existing private device instance profile.
    */
  def updateInstanceProfile(params: UpdateInstanceProfileRequest): awsDashSdkLib.libRequestMod.Request[UpdateInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInstanceProfile(
    params: UpdateInstanceProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInstanceProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInstanceProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the network profile with specific settings.
    */
  def updateNetworkProfile(): awsDashSdkLib.libRequestMod.Request[UpdateNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateNetworkProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the network profile with specific settings.
    */
  def updateNetworkProfile(params: UpdateNetworkProfileRequest): awsDashSdkLib.libRequestMod.Request[UpdateNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateNetworkProfile(
    params: UpdateNetworkProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateNetworkProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateNetworkProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified project name, given the project ARN and a new name.
    */
  def updateProject(): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the specified project name, given the project ARN and a new name.
    */
  def updateProject(params: UpdateProjectRequest): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateProject(
    params: UpdateProjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateProjectResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateProjectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update an uploaded test specification (test spec).
    */
  def updateUpload(): awsDashSdkLib.libRequestMod.Request[UpdateUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUpload(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Update an uploaded test specification (test spec).
    */
  def updateUpload(params: UpdateUploadRequest): awsDashSdkLib.libRequestMod.Request[UpdateUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUpload(
    params: UpdateUploadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUploadResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUploadResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.
    */
  def updateVPCEConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateVPCEConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates information about an existing Amazon Virtual Private Cloud (VPC) endpoint configuration.
    */
  def updateVPCEConfiguration(params: UpdateVPCEConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateVPCEConfiguration(
    params: UpdateVPCEConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateVPCEConfigurationResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateVPCEConfigurationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

