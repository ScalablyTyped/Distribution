package typings.awsSdk.clientsGreengrassv2Mod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GreengrassV2 extends Service {
  
  /**
    * Associates a Greengrass service role with IoT Greengrass for your Amazon Web Services account in this Amazon Web Services Region. IoT Greengrass uses this role to verify the identity of client devices and manage core device connectivity information. The role must include the AWSGreengrassResourceAccessRolePolicy managed policy or a custom policy that defines equivalent permissions for the IoT Greengrass features that you use. For more information, see Greengrass service role in the IoT Greengrass Version 2 Developer Guide.
    */
  def associateServiceRoleToAccount(): Request[AssociateServiceRoleToAccountResponse, AWSError] = js.native
  def associateServiceRoleToAccount(callback: js.Function2[/* err */ AWSError, /* data */ AssociateServiceRoleToAccountResponse, Unit]): Request[AssociateServiceRoleToAccountResponse, AWSError] = js.native
  /**
    * Associates a Greengrass service role with IoT Greengrass for your Amazon Web Services account in this Amazon Web Services Region. IoT Greengrass uses this role to verify the identity of client devices and manage core device connectivity information. The role must include the AWSGreengrassResourceAccessRolePolicy managed policy or a custom policy that defines equivalent permissions for the IoT Greengrass features that you use. For more information, see Greengrass service role in the IoT Greengrass Version 2 Developer Guide.
    */
  def associateServiceRoleToAccount(params: AssociateServiceRoleToAccountRequest): Request[AssociateServiceRoleToAccountResponse, AWSError] = js.native
  def associateServiceRoleToAccount(
    params: AssociateServiceRoleToAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateServiceRoleToAccountResponse, Unit]
  ): Request[AssociateServiceRoleToAccountResponse, AWSError] = js.native
  
  /**
    * Associates a list of client devices with a core device. Use this API operation to specify which client devices can discover a core device through cloud discovery. With cloud discovery, client devices connect to IoT Greengrass to retrieve associated core devices' connectivity information and certificates. For more information, see Configure cloud discovery in the IoT Greengrass V2 Developer Guide.  Client devices are local IoT devices that connect to and communicate with an IoT Greengrass core device over MQTT. You can connect client devices to a core device to sync MQTT messages and data to Amazon Web Services IoT Core and interact with client devices in Greengrass components. For more information, see Interact with local IoT devices in the IoT Greengrass V2 Developer Guide. 
    */
  def batchAssociateClientDeviceWithCoreDevice(): Request[BatchAssociateClientDeviceWithCoreDeviceResponse, AWSError] = js.native
  def batchAssociateClientDeviceWithCoreDevice(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchAssociateClientDeviceWithCoreDeviceResponse, 
      Unit
    ]
  ): Request[BatchAssociateClientDeviceWithCoreDeviceResponse, AWSError] = js.native
  /**
    * Associates a list of client devices with a core device. Use this API operation to specify which client devices can discover a core device through cloud discovery. With cloud discovery, client devices connect to IoT Greengrass to retrieve associated core devices' connectivity information and certificates. For more information, see Configure cloud discovery in the IoT Greengrass V2 Developer Guide.  Client devices are local IoT devices that connect to and communicate with an IoT Greengrass core device over MQTT. You can connect client devices to a core device to sync MQTT messages and data to Amazon Web Services IoT Core and interact with client devices in Greengrass components. For more information, see Interact with local IoT devices in the IoT Greengrass V2 Developer Guide. 
    */
  def batchAssociateClientDeviceWithCoreDevice(params: BatchAssociateClientDeviceWithCoreDeviceRequest): Request[BatchAssociateClientDeviceWithCoreDeviceResponse, AWSError] = js.native
  def batchAssociateClientDeviceWithCoreDevice(
    params: BatchAssociateClientDeviceWithCoreDeviceRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchAssociateClientDeviceWithCoreDeviceResponse, 
      Unit
    ]
  ): Request[BatchAssociateClientDeviceWithCoreDeviceResponse, AWSError] = js.native
  
  /**
    * Disassociates a list of client devices from a core device. After you disassociate a client device from a core device, the client device won't be able to use cloud discovery to retrieve the core device's connectivity information and certificates.
    */
  def batchDisassociateClientDeviceFromCoreDevice(): Request[BatchDisassociateClientDeviceFromCoreDeviceResponse, AWSError] = js.native
  def batchDisassociateClientDeviceFromCoreDevice(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchDisassociateClientDeviceFromCoreDeviceResponse, 
      Unit
    ]
  ): Request[BatchDisassociateClientDeviceFromCoreDeviceResponse, AWSError] = js.native
  /**
    * Disassociates a list of client devices from a core device. After you disassociate a client device from a core device, the client device won't be able to use cloud discovery to retrieve the core device's connectivity information and certificates.
    */
  def batchDisassociateClientDeviceFromCoreDevice(params: BatchDisassociateClientDeviceFromCoreDeviceRequest): Request[BatchDisassociateClientDeviceFromCoreDeviceResponse, AWSError] = js.native
  def batchDisassociateClientDeviceFromCoreDevice(
    params: BatchDisassociateClientDeviceFromCoreDeviceRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ BatchDisassociateClientDeviceFromCoreDeviceResponse, 
      Unit
    ]
  ): Request[BatchDisassociateClientDeviceFromCoreDeviceResponse, AWSError] = js.native
  
  /**
    * Cancels a deployment. This operation cancels the deployment for devices that haven't yet received it. If a device already received the deployment, this operation doesn't change anything for that device.
    */
  def cancelDeployment(): Request[CancelDeploymentResponse, AWSError] = js.native
  def cancelDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CancelDeploymentResponse, Unit]): Request[CancelDeploymentResponse, AWSError] = js.native
  /**
    * Cancels a deployment. This operation cancels the deployment for devices that haven't yet received it. If a device already received the deployment, this operation doesn't change anything for that device.
    */
  def cancelDeployment(params: CancelDeploymentRequest): Request[CancelDeploymentResponse, AWSError] = js.native
  def cancelDeployment(
    params: CancelDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelDeploymentResponse, Unit]
  ): Request[CancelDeploymentResponse, AWSError] = js.native
  
  @JSName("config")
  var config_GreengrassV2: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a component. Components are software that run on Greengrass core devices. After you develop and test a component on your core device, you can use this operation to upload your component to IoT Greengrass. Then, you can deploy the component to other core devices. You can use this operation to do the following:    Create components from recipes  Create a component from a recipe, which is a file that defines the component's metadata, parameters, dependencies, lifecycle, artifacts, and platform capability. For more information, see IoT Greengrass component recipe reference in the IoT Greengrass V2 Developer Guide. To create a component from a recipe, specify inlineRecipe when you call this operation.    Create components from Lambda functions  Create a component from an Lambda function that runs on IoT Greengrass. This creates a recipe and artifacts from the Lambda function's deployment package. You can use this operation to migrate Lambda functions from IoT Greengrass V1 to IoT Greengrass V2. This function only accepts Lambda functions that use the following runtimes:   Python 2.7 – python2.7    Python 3.7 – python3.7    Python 3.8 – python3.8    Python 3.9 – python3.9    Java 8 – java8    Java 11 – java11    Node.js 10 – nodejs10.x    Node.js 12 – nodejs12.x    Node.js 14 – nodejs14.x    To create a component from a Lambda function, specify lambdaFunction when you call this operation.  IoT Greengrass currently supports Lambda functions on only Linux core devices.   
    */
  def createComponentVersion(): Request[CreateComponentVersionResponse, AWSError] = js.native
  def createComponentVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentVersionResponse, Unit]): Request[CreateComponentVersionResponse, AWSError] = js.native
  /**
    * Creates a component. Components are software that run on Greengrass core devices. After you develop and test a component on your core device, you can use this operation to upload your component to IoT Greengrass. Then, you can deploy the component to other core devices. You can use this operation to do the following:    Create components from recipes  Create a component from a recipe, which is a file that defines the component's metadata, parameters, dependencies, lifecycle, artifacts, and platform capability. For more information, see IoT Greengrass component recipe reference in the IoT Greengrass V2 Developer Guide. To create a component from a recipe, specify inlineRecipe when you call this operation.    Create components from Lambda functions  Create a component from an Lambda function that runs on IoT Greengrass. This creates a recipe and artifacts from the Lambda function's deployment package. You can use this operation to migrate Lambda functions from IoT Greengrass V1 to IoT Greengrass V2. This function only accepts Lambda functions that use the following runtimes:   Python 2.7 – python2.7    Python 3.7 – python3.7    Python 3.8 – python3.8    Python 3.9 – python3.9    Java 8 – java8    Java 11 – java11    Node.js 10 – nodejs10.x    Node.js 12 – nodejs12.x    Node.js 14 – nodejs14.x    To create a component from a Lambda function, specify lambdaFunction when you call this operation.  IoT Greengrass currently supports Lambda functions on only Linux core devices.   
    */
  def createComponentVersion(params: CreateComponentVersionRequest): Request[CreateComponentVersionResponse, AWSError] = js.native
  def createComponentVersion(
    params: CreateComponentVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentVersionResponse, Unit]
  ): Request[CreateComponentVersionResponse, AWSError] = js.native
  
  /**
    * Creates a continuous deployment for a target, which is a Greengrass core device or group of core devices. When you add a new core device to a group of core devices that has a deployment, IoT Greengrass deploys that group's deployment to the new device. You can define one deployment for each target. When you create a new deployment for a target that has an existing deployment, you replace the previous deployment. IoT Greengrass applies the new deployment to the target devices. Every deployment has a revision number that indicates how many deployment revisions you define for a target. Use this operation to create a new revision of an existing deployment. For more information, see the Create deployments in the IoT Greengrass V2 Developer Guide.
    */
  def createDeployment(): Request[CreateDeploymentResponse, AWSError] = js.native
  def createDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResponse, Unit]): Request[CreateDeploymentResponse, AWSError] = js.native
  /**
    * Creates a continuous deployment for a target, which is a Greengrass core device or group of core devices. When you add a new core device to a group of core devices that has a deployment, IoT Greengrass deploys that group's deployment to the new device. You can define one deployment for each target. When you create a new deployment for a target that has an existing deployment, you replace the previous deployment. IoT Greengrass applies the new deployment to the target devices. Every deployment has a revision number that indicates how many deployment revisions you define for a target. Use this operation to create a new revision of an existing deployment. For more information, see the Create deployments in the IoT Greengrass V2 Developer Guide.
    */
  def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResponse, AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResponse, Unit]
  ): Request[CreateDeploymentResponse, AWSError] = js.native
  
  /**
    * Deletes a version of a component from IoT Greengrass.  This operation deletes the component's recipe and artifacts. As a result, deployments that refer to this component version will fail. If you have deployments that use this component version, you can remove the component from the deployment or update the deployment to use a valid version. 
    */
  def deleteComponent(): Request[js.Object, AWSError] = js.native
  def deleteComponent(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a version of a component from IoT Greengrass.  This operation deletes the component's recipe and artifacts. As a result, deployments that refer to this component version will fail. If you have deployments that use this component version, you can remove the component from the deployment or update the deployment to use a valid version. 
    */
  def deleteComponent(params: DeleteComponentRequest): Request[js.Object, AWSError] = js.native
  def deleteComponent(
    params: DeleteComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a Greengrass core device, which is an IoT thing. This operation removes the core device from the list of core devices. This operation doesn't delete the IoT thing. For more information about how to delete the IoT thing, see DeleteThing in the IoT API Reference.
    */
  def deleteCoreDevice(): Request[js.Object, AWSError] = js.native
  def deleteCoreDevice(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Greengrass core device, which is an IoT thing. This operation removes the core device from the list of core devices. This operation doesn't delete the IoT thing. For more information about how to delete the IoT thing, see DeleteThing in the IoT API Reference.
    */
  def deleteCoreDevice(params: DeleteCoreDeviceRequest): Request[js.Object, AWSError] = js.native
  def deleteCoreDevice(
    params: DeleteCoreDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a deployment. To delete an active deployment, you must first cancel it. For more information, see CancelDeployment. Deleting a deployment doesn't affect core devices that run that deployment, because core devices store the deployment's configuration on the device. Additionally, core devices can roll back to a previous deployment that has been deleted.
    */
  def deleteDeployment(): Request[js.Object, AWSError] = js.native
  def deleteDeployment(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a deployment. To delete an active deployment, you must first cancel it. For more information, see CancelDeployment. Deleting a deployment doesn't affect core devices that run that deployment, because core devices store the deployment's configuration on the device. Additionally, core devices can roll back to a previous deployment that has been deleted.
    */
  def deleteDeployment(params: DeleteDeploymentRequest): Request[js.Object, AWSError] = js.native
  def deleteDeployment(
    params: DeleteDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Retrieves metadata for a version of a component.
    */
  def describeComponent(): Request[DescribeComponentResponse, AWSError] = js.native
  def describeComponent(callback: js.Function2[/* err */ AWSError, /* data */ DescribeComponentResponse, Unit]): Request[DescribeComponentResponse, AWSError] = js.native
  /**
    * Retrieves metadata for a version of a component.
    */
  def describeComponent(params: DescribeComponentRequest): Request[DescribeComponentResponse, AWSError] = js.native
  def describeComponent(
    params: DescribeComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeComponentResponse, Unit]
  ): Request[DescribeComponentResponse, AWSError] = js.native
  
  /**
    * Disassociates the Greengrass service role from IoT Greengrass for your Amazon Web Services account in this Amazon Web Services Region. Without a service role, IoT Greengrass can't verify the identity of client devices or manage core device connectivity information. For more information, see Greengrass service role in the IoT Greengrass Version 2 Developer Guide.
    */
  def disassociateServiceRoleFromAccount(): Request[DisassociateServiceRoleFromAccountResponse, AWSError] = js.native
  def disassociateServiceRoleFromAccount(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateServiceRoleFromAccountResponse, Unit]
  ): Request[DisassociateServiceRoleFromAccountResponse, AWSError] = js.native
  /**
    * Disassociates the Greengrass service role from IoT Greengrass for your Amazon Web Services account in this Amazon Web Services Region. Without a service role, IoT Greengrass can't verify the identity of client devices or manage core device connectivity information. For more information, see Greengrass service role in the IoT Greengrass Version 2 Developer Guide.
    */
  def disassociateServiceRoleFromAccount(params: DisassociateServiceRoleFromAccountRequest): Request[DisassociateServiceRoleFromAccountResponse, AWSError] = js.native
  def disassociateServiceRoleFromAccount(
    params: DisassociateServiceRoleFromAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateServiceRoleFromAccountResponse, Unit]
  ): Request[DisassociateServiceRoleFromAccountResponse, AWSError] = js.native
  
  /**
    * Gets the recipe for a version of a component.
    */
  def getComponent(): Request[GetComponentResponse, AWSError] = js.native
  def getComponent(callback: js.Function2[/* err */ AWSError, /* data */ GetComponentResponse, Unit]): Request[GetComponentResponse, AWSError] = js.native
  /**
    * Gets the recipe for a version of a component.
    */
  def getComponent(params: GetComponentRequest): Request[GetComponentResponse, AWSError] = js.native
  def getComponent(
    params: GetComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentResponse, Unit]
  ): Request[GetComponentResponse, AWSError] = js.native
  
  /**
    * Gets the pre-signed URL to download a public or a Lambda component artifact. Core devices call this operation to identify the URL that they can use to download an artifact to install.
    */
  def getComponentVersionArtifact(): Request[GetComponentVersionArtifactResponse, AWSError] = js.native
  def getComponentVersionArtifact(callback: js.Function2[/* err */ AWSError, /* data */ GetComponentVersionArtifactResponse, Unit]): Request[GetComponentVersionArtifactResponse, AWSError] = js.native
  /**
    * Gets the pre-signed URL to download a public or a Lambda component artifact. Core devices call this operation to identify the URL that they can use to download an artifact to install.
    */
  def getComponentVersionArtifact(params: GetComponentVersionArtifactRequest): Request[GetComponentVersionArtifactResponse, AWSError] = js.native
  def getComponentVersionArtifact(
    params: GetComponentVersionArtifactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentVersionArtifactResponse, Unit]
  ): Request[GetComponentVersionArtifactResponse, AWSError] = js.native
  
  /**
    * Retrieves connectivity information for a Greengrass core device. Connectivity information includes endpoints and ports where client devices can connect to an MQTT broker on the core device. When a client device calls the IoT Greengrass discovery API, IoT Greengrass returns connectivity information for all of the core devices where the client device can connect. For more information, see Connect client devices to core devices in the IoT Greengrass Version 2 Developer Guide.
    */
  def getConnectivityInfo(): Request[GetConnectivityInfoResponse, AWSError] = js.native
  def getConnectivityInfo(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectivityInfoResponse, Unit]): Request[GetConnectivityInfoResponse, AWSError] = js.native
  /**
    * Retrieves connectivity information for a Greengrass core device. Connectivity information includes endpoints and ports where client devices can connect to an MQTT broker on the core device. When a client device calls the IoT Greengrass discovery API, IoT Greengrass returns connectivity information for all of the core devices where the client device can connect. For more information, see Connect client devices to core devices in the IoT Greengrass Version 2 Developer Guide.
    */
  def getConnectivityInfo(params: GetConnectivityInfoRequest): Request[GetConnectivityInfoResponse, AWSError] = js.native
  def getConnectivityInfo(
    params: GetConnectivityInfoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectivityInfoResponse, Unit]
  ): Request[GetConnectivityInfoResponse, AWSError] = js.native
  
  /**
    * Retrieves metadata for a Greengrass core device.  IoT Greengrass relies on individual devices to send status updates to the Amazon Web Services Cloud. If the IoT Greengrass Core software isn't running on the device, or if device isn't connected to the Amazon Web Services Cloud, then the reported status of that device might not reflect its current status. The status timestamp indicates when the device status was last updated. Core devices send status updates at the following times:   When the IoT Greengrass Core software starts   When the core device receives a deployment from the Amazon Web Services Cloud   When the status of any component on the core device becomes BROKEN    At a regular interval that you can configure, which defaults to 24 hours   For IoT Greengrass Core v2.7.0, the core device sends status updates upon local deployment and cloud deployment   
    */
  def getCoreDevice(): Request[GetCoreDeviceResponse, AWSError] = js.native
  def getCoreDevice(callback: js.Function2[/* err */ AWSError, /* data */ GetCoreDeviceResponse, Unit]): Request[GetCoreDeviceResponse, AWSError] = js.native
  /**
    * Retrieves metadata for a Greengrass core device.  IoT Greengrass relies on individual devices to send status updates to the Amazon Web Services Cloud. If the IoT Greengrass Core software isn't running on the device, or if device isn't connected to the Amazon Web Services Cloud, then the reported status of that device might not reflect its current status. The status timestamp indicates when the device status was last updated. Core devices send status updates at the following times:   When the IoT Greengrass Core software starts   When the core device receives a deployment from the Amazon Web Services Cloud   When the status of any component on the core device becomes BROKEN    At a regular interval that you can configure, which defaults to 24 hours   For IoT Greengrass Core v2.7.0, the core device sends status updates upon local deployment and cloud deployment   
    */
  def getCoreDevice(params: GetCoreDeviceRequest): Request[GetCoreDeviceResponse, AWSError] = js.native
  def getCoreDevice(
    params: GetCoreDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCoreDeviceResponse, Unit]
  ): Request[GetCoreDeviceResponse, AWSError] = js.native
  
  /**
    * Gets a deployment. Deployments define the components that run on Greengrass core devices.
    */
  def getDeployment(): Request[GetDeploymentResponse, AWSError] = js.native
  def getDeployment(callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentResponse, Unit]): Request[GetDeploymentResponse, AWSError] = js.native
  /**
    * Gets a deployment. Deployments define the components that run on Greengrass core devices.
    */
  def getDeployment(params: GetDeploymentRequest): Request[GetDeploymentResponse, AWSError] = js.native
  def getDeployment(
    params: GetDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeploymentResponse, Unit]
  ): Request[GetDeploymentResponse, AWSError] = js.native
  
  /**
    * Gets the service role associated with IoT Greengrass for your Amazon Web Services account in this Amazon Web Services Region. IoT Greengrass uses this role to verify the identity of client devices and manage core device connectivity information. For more information, see Greengrass service role in the IoT Greengrass Version 2 Developer Guide.
    */
  def getServiceRoleForAccount(): Request[GetServiceRoleForAccountResponse, AWSError] = js.native
  def getServiceRoleForAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceRoleForAccountResponse, Unit]): Request[GetServiceRoleForAccountResponse, AWSError] = js.native
  /**
    * Gets the service role associated with IoT Greengrass for your Amazon Web Services account in this Amazon Web Services Region. IoT Greengrass uses this role to verify the identity of client devices and manage core device connectivity information. For more information, see Greengrass service role in the IoT Greengrass Version 2 Developer Guide.
    */
  def getServiceRoleForAccount(params: GetServiceRoleForAccountRequest): Request[GetServiceRoleForAccountResponse, AWSError] = js.native
  def getServiceRoleForAccount(
    params: GetServiceRoleForAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceRoleForAccountResponse, Unit]
  ): Request[GetServiceRoleForAccountResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of client devices that are associated with a core device.
    */
  def listClientDevicesAssociatedWithCoreDevice(): Request[ListClientDevicesAssociatedWithCoreDeviceResponse, AWSError] = js.native
  def listClientDevicesAssociatedWithCoreDevice(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListClientDevicesAssociatedWithCoreDeviceResponse, 
      Unit
    ]
  ): Request[ListClientDevicesAssociatedWithCoreDeviceResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of client devices that are associated with a core device.
    */
  def listClientDevicesAssociatedWithCoreDevice(params: ListClientDevicesAssociatedWithCoreDeviceRequest): Request[ListClientDevicesAssociatedWithCoreDeviceResponse, AWSError] = js.native
  def listClientDevicesAssociatedWithCoreDevice(
    params: ListClientDevicesAssociatedWithCoreDeviceRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListClientDevicesAssociatedWithCoreDeviceResponse, 
      Unit
    ]
  ): Request[ListClientDevicesAssociatedWithCoreDeviceResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of all versions for a component. Greater versions are listed first.
    */
  def listComponentVersions(): Request[ListComponentVersionsResponse, AWSError] = js.native
  def listComponentVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListComponentVersionsResponse, Unit]): Request[ListComponentVersionsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of all versions for a component. Greater versions are listed first.
    */
  def listComponentVersions(params: ListComponentVersionsRequest): Request[ListComponentVersionsResponse, AWSError] = js.native
  def listComponentVersions(
    params: ListComponentVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentVersionsResponse, Unit]
  ): Request[ListComponentVersionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of component summaries. This list includes components that you have permission to view.
    */
  def listComponents(): Request[ListComponentsResponse, AWSError] = js.native
  def listComponents(callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsResponse, Unit]): Request[ListComponentsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of component summaries. This list includes components that you have permission to view.
    */
  def listComponents(params: ListComponentsRequest): Request[ListComponentsResponse, AWSError] = js.native
  def listComponents(
    params: ListComponentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsResponse, Unit]
  ): Request[ListComponentsResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of Greengrass core devices.  IoT Greengrass relies on individual devices to send status updates to the Amazon Web Services Cloud. If the IoT Greengrass Core software isn't running on the device, or if device isn't connected to the Amazon Web Services Cloud, then the reported status of that device might not reflect its current status. The status timestamp indicates when the device status was last updated. Core devices send status updates at the following times:   When the IoT Greengrass Core software starts   When the core device receives a deployment from the Amazon Web Services Cloud   When the status of any component on the core device becomes BROKEN    At a regular interval that you can configure, which defaults to 24 hours   For IoT Greengrass Core v2.7.0, the core device sends status updates upon local deployment and cloud deployment   
    */
  def listCoreDevices(): Request[ListCoreDevicesResponse, AWSError] = js.native
  def listCoreDevices(callback: js.Function2[/* err */ AWSError, /* data */ ListCoreDevicesResponse, Unit]): Request[ListCoreDevicesResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of Greengrass core devices.  IoT Greengrass relies on individual devices to send status updates to the Amazon Web Services Cloud. If the IoT Greengrass Core software isn't running on the device, or if device isn't connected to the Amazon Web Services Cloud, then the reported status of that device might not reflect its current status. The status timestamp indicates when the device status was last updated. Core devices send status updates at the following times:   When the IoT Greengrass Core software starts   When the core device receives a deployment from the Amazon Web Services Cloud   When the status of any component on the core device becomes BROKEN    At a regular interval that you can configure, which defaults to 24 hours   For IoT Greengrass Core v2.7.0, the core device sends status updates upon local deployment and cloud deployment   
    */
  def listCoreDevices(params: ListCoreDevicesRequest): Request[ListCoreDevicesResponse, AWSError] = js.native
  def listCoreDevices(
    params: ListCoreDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCoreDevicesResponse, Unit]
  ): Request[ListCoreDevicesResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of deployments.
    */
  def listDeployments(): Request[ListDeploymentsResponse, AWSError] = js.native
  def listDeployments(callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentsResponse, Unit]): Request[ListDeploymentsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of deployments.
    */
  def listDeployments(params: ListDeploymentsRequest): Request[ListDeploymentsResponse, AWSError] = js.native
  def listDeployments(
    params: ListDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeploymentsResponse, Unit]
  ): Request[ListDeploymentsResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of deployment jobs that IoT Greengrass sends to Greengrass core devices.
    */
  def listEffectiveDeployments(): Request[ListEffectiveDeploymentsResponse, AWSError] = js.native
  def listEffectiveDeployments(callback: js.Function2[/* err */ AWSError, /* data */ ListEffectiveDeploymentsResponse, Unit]): Request[ListEffectiveDeploymentsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of deployment jobs that IoT Greengrass sends to Greengrass core devices.
    */
  def listEffectiveDeployments(params: ListEffectiveDeploymentsRequest): Request[ListEffectiveDeploymentsResponse, AWSError] = js.native
  def listEffectiveDeployments(
    params: ListEffectiveDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEffectiveDeploymentsResponse, Unit]
  ): Request[ListEffectiveDeploymentsResponse, AWSError] = js.native
  
  /**
    * Retrieves a paginated list of the components that a Greengrass core device runs. By default, this list doesn't include components that are deployed as dependencies of other components. To include dependencies in the response, set the topologyFilter parameter to ALL.  IoT Greengrass relies on individual devices to send status updates to the Amazon Web Services Cloud. If the IoT Greengrass Core software isn't running on the device, or if device isn't connected to the Amazon Web Services Cloud, then the reported status of that device might not reflect its current status. The status timestamp indicates when the device status was last updated. Core devices send status updates at the following times:   When the IoT Greengrass Core software starts   When the core device receives a deployment from the Amazon Web Services Cloud   When the status of any component on the core device becomes BROKEN    At a regular interval that you can configure, which defaults to 24 hours   For IoT Greengrass Core v2.7.0, the core device sends status updates upon local deployment and cloud deployment   
    */
  def listInstalledComponents(): Request[ListInstalledComponentsResponse, AWSError] = js.native
  def listInstalledComponents(callback: js.Function2[/* err */ AWSError, /* data */ ListInstalledComponentsResponse, Unit]): Request[ListInstalledComponentsResponse, AWSError] = js.native
  /**
    * Retrieves a paginated list of the components that a Greengrass core device runs. By default, this list doesn't include components that are deployed as dependencies of other components. To include dependencies in the response, set the topologyFilter parameter to ALL.  IoT Greengrass relies on individual devices to send status updates to the Amazon Web Services Cloud. If the IoT Greengrass Core software isn't running on the device, or if device isn't connected to the Amazon Web Services Cloud, then the reported status of that device might not reflect its current status. The status timestamp indicates when the device status was last updated. Core devices send status updates at the following times:   When the IoT Greengrass Core software starts   When the core device receives a deployment from the Amazon Web Services Cloud   When the status of any component on the core device becomes BROKEN    At a regular interval that you can configure, which defaults to 24 hours   For IoT Greengrass Core v2.7.0, the core device sends status updates upon local deployment and cloud deployment   
    */
  def listInstalledComponents(params: ListInstalledComponentsRequest): Request[ListInstalledComponentsResponse, AWSError] = js.native
  def listInstalledComponents(
    params: ListInstalledComponentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstalledComponentsResponse, Unit]
  ): Request[ListInstalledComponentsResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of tags for an IoT Greengrass resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves the list of tags for an IoT Greengrass resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of components that meet the component, version, and platform requirements of a deployment. Greengrass core devices call this operation when they receive a deployment to identify the components to install. This operation identifies components that meet all dependency requirements for a deployment. If the requirements conflict, then this operation returns an error and the deployment fails. For example, this occurs if component A requires version &gt;2.0.0 and component B requires version &lt;2.0.0 of a component dependency. When you specify the component candidates to resolve, IoT Greengrass compares each component's digest from the core device with the component's digest in the Amazon Web Services Cloud. If the digests don't match, then IoT Greengrass specifies to use the version from the Amazon Web Services Cloud.  To use this operation, you must use the data plane API endpoint and authenticate with an IoT device certificate. For more information, see IoT Greengrass endpoints and quotas. 
    */
  def resolveComponentCandidates(): Request[ResolveComponentCandidatesResponse, AWSError] = js.native
  def resolveComponentCandidates(callback: js.Function2[/* err */ AWSError, /* data */ ResolveComponentCandidatesResponse, Unit]): Request[ResolveComponentCandidatesResponse, AWSError] = js.native
  /**
    * Retrieves a list of components that meet the component, version, and platform requirements of a deployment. Greengrass core devices call this operation when they receive a deployment to identify the components to install. This operation identifies components that meet all dependency requirements for a deployment. If the requirements conflict, then this operation returns an error and the deployment fails. For example, this occurs if component A requires version &gt;2.0.0 and component B requires version &lt;2.0.0 of a component dependency. When you specify the component candidates to resolve, IoT Greengrass compares each component's digest from the core device with the component's digest in the Amazon Web Services Cloud. If the digests don't match, then IoT Greengrass specifies to use the version from the Amazon Web Services Cloud.  To use this operation, you must use the data plane API endpoint and authenticate with an IoT device certificate. For more information, see IoT Greengrass endpoints and quotas. 
    */
  def resolveComponentCandidates(params: ResolveComponentCandidatesRequest): Request[ResolveComponentCandidatesResponse, AWSError] = js.native
  def resolveComponentCandidates(
    params: ResolveComponentCandidatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResolveComponentCandidatesResponse, Unit]
  ): Request[ResolveComponentCandidatesResponse, AWSError] = js.native
  
  /**
    * Adds tags to an IoT Greengrass resource. If a tag already exists for the resource, this operation updates the tag's value.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds tags to an IoT Greengrass resource. If a tag already exists for the resource, this operation updates the tag's value.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from an IoT Greengrass resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from an IoT Greengrass resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates connectivity information for a Greengrass core device. Connectivity information includes endpoints and ports where client devices can connect to an MQTT broker on the core device. When a client device calls the IoT Greengrass discovery API, IoT Greengrass returns connectivity information for all of the core devices where the client device can connect. For more information, see Connect client devices to core devices in the IoT Greengrass Version 2 Developer Guide.
    */
  def updateConnectivityInfo(): Request[UpdateConnectivityInfoResponse, AWSError] = js.native
  def updateConnectivityInfo(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectivityInfoResponse, Unit]): Request[UpdateConnectivityInfoResponse, AWSError] = js.native
  /**
    * Updates connectivity information for a Greengrass core device. Connectivity information includes endpoints and ports where client devices can connect to an MQTT broker on the core device. When a client device calls the IoT Greengrass discovery API, IoT Greengrass returns connectivity information for all of the core devices where the client device can connect. For more information, see Connect client devices to core devices in the IoT Greengrass Version 2 Developer Guide.
    */
  def updateConnectivityInfo(params: UpdateConnectivityInfoRequest): Request[UpdateConnectivityInfoResponse, AWSError] = js.native
  def updateConnectivityInfo(
    params: UpdateConnectivityInfoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConnectivityInfoResponse, Unit]
  ): Request[UpdateConnectivityInfoResponse, AWSError] = js.native
}
