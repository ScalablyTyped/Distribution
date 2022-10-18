package typings.awsSdk.clientsCloudcontrolMod

import typings.awsSdk.anon.GetResourceRequestStatusI
import typings.awsSdk.awsSdkStrings.resourceRequestSuccess
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudControl extends Service {
  
  /**
    * Cancels the specified resource operation request. For more information, see Canceling resource operation requests in the Amazon Web Services Cloud Control API User Guide. Only resource operations requests with a status of PENDING or IN_PROGRESS can be canceled.
    */
  def cancelResourceRequest(): Request[CancelResourceRequestOutput, AWSError] = js.native
  def cancelResourceRequest(callback: js.Function2[/* err */ AWSError, /* data */ CancelResourceRequestOutput, Unit]): Request[CancelResourceRequestOutput, AWSError] = js.native
  /**
    * Cancels the specified resource operation request. For more information, see Canceling resource operation requests in the Amazon Web Services Cloud Control API User Guide. Only resource operations requests with a status of PENDING or IN_PROGRESS can be canceled.
    */
  def cancelResourceRequest(params: CancelResourceRequestInput): Request[CancelResourceRequestOutput, AWSError] = js.native
  def cancelResourceRequest(
    params: CancelResourceRequestInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelResourceRequestOutput, Unit]
  ): Request[CancelResourceRequestOutput, AWSError] = js.native
  
  @JSName("config")
  var config_CloudControl: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates the specified resource. For more information, see Creating a resource in the Amazon Web Services Cloud Control API User Guide. After you have initiated a resource creation request, you can monitor the progress of your request by calling GetResourceRequestStatus using the RequestToken of the ProgressEvent type returned by CreateResource.
    */
  def createResource(): Request[CreateResourceOutput, AWSError] = js.native
  def createResource(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceOutput, Unit]): Request[CreateResourceOutput, AWSError] = js.native
  /**
    * Creates the specified resource. For more information, see Creating a resource in the Amazon Web Services Cloud Control API User Guide. After you have initiated a resource creation request, you can monitor the progress of your request by calling GetResourceRequestStatus using the RequestToken of the ProgressEvent type returned by CreateResource.
    */
  def createResource(params: CreateResourceInput): Request[CreateResourceOutput, AWSError] = js.native
  def createResource(
    params: CreateResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceOutput, Unit]
  ): Request[CreateResourceOutput, AWSError] = js.native
  
  /**
    * Deletes the specified resource. For details, see Deleting a resource in the Amazon Web Services Cloud Control API User Guide. After you have initiated a resource deletion request, you can monitor the progress of your request by calling GetResourceRequestStatus using the RequestToken of the ProgressEvent returned by DeleteResource.
    */
  def deleteResource(): Request[DeleteResourceOutput, AWSError] = js.native
  def deleteResource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceOutput, Unit]): Request[DeleteResourceOutput, AWSError] = js.native
  /**
    * Deletes the specified resource. For details, see Deleting a resource in the Amazon Web Services Cloud Control API User Guide. After you have initiated a resource deletion request, you can monitor the progress of your request by calling GetResourceRequestStatus using the RequestToken of the ProgressEvent returned by DeleteResource.
    */
  def deleteResource(params: DeleteResourceInput): Request[DeleteResourceOutput, AWSError] = js.native
  def deleteResource(
    params: DeleteResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourceOutput, Unit]
  ): Request[DeleteResourceOutput, AWSError] = js.native
  
  /**
    * Returns information about the current state of the specified resource. For details, see Reading a resource's current state. You can use this action to return information about an existing resource in your account and Amazon Web Services Region, whether those resources were provisioned using Cloud Control API.
    */
  def getResource(): Request[GetResourceOutput, AWSError] = js.native
  def getResource(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceOutput, Unit]): Request[GetResourceOutput, AWSError] = js.native
  /**
    * Returns information about the current state of the specified resource. For details, see Reading a resource's current state. You can use this action to return information about an existing resource in your account and Amazon Web Services Region, whether those resources were provisioned using Cloud Control API.
    */
  def getResource(params: GetResourceInput): Request[GetResourceOutput, AWSError] = js.native
  def getResource(
    params: GetResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceOutput, Unit]
  ): Request[GetResourceOutput, AWSError] = js.native
  
  /**
    * Returns the current status of a resource operation request. For more information, see Tracking the progress of resource operation requests in the Amazon Web Services Cloud Control API User Guide.
    */
  def getResourceRequestStatus(): Request[GetResourceRequestStatusOutput, AWSError] = js.native
  def getResourceRequestStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceRequestStatusOutput, Unit]): Request[GetResourceRequestStatusOutput, AWSError] = js.native
  /**
    * Returns the current status of a resource operation request. For more information, see Tracking the progress of resource operation requests in the Amazon Web Services Cloud Control API User Guide.
    */
  def getResourceRequestStatus(params: GetResourceRequestStatusInput): Request[GetResourceRequestStatusOutput, AWSError] = js.native
  def getResourceRequestStatus(
    params: GetResourceRequestStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceRequestStatusOutput, Unit]
  ): Request[GetResourceRequestStatusOutput, AWSError] = js.native
  
  /**
    * Returns existing resource operation requests. This includes requests of all status types. For more information, see Listing active resource operation requests in the Amazon Web Services Cloud Control API User Guide.  Resource operation requests expire after 7 days. 
    */
  def listResourceRequests(): Request[ListResourceRequestsOutput, AWSError] = js.native
  def listResourceRequests(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceRequestsOutput, Unit]): Request[ListResourceRequestsOutput, AWSError] = js.native
  /**
    * Returns existing resource operation requests. This includes requests of all status types. For more information, see Listing active resource operation requests in the Amazon Web Services Cloud Control API User Guide.  Resource operation requests expire after 7 days. 
    */
  def listResourceRequests(params: ListResourceRequestsInput): Request[ListResourceRequestsOutput, AWSError] = js.native
  def listResourceRequests(
    params: ListResourceRequestsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceRequestsOutput, Unit]
  ): Request[ListResourceRequestsOutput, AWSError] = js.native
  
  /**
    * Returns information about the specified resources. For more information, see Discovering resources in the Amazon Web Services Cloud Control API User Guide. You can use this action to return information about existing resources in your account and Amazon Web Services Region, whether those resources were provisioned using Cloud Control API.
    */
  def listResources(): Request[ListResourcesOutput, AWSError] = js.native
  def listResources(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesOutput, Unit]): Request[ListResourcesOutput, AWSError] = js.native
  /**
    * Returns information about the specified resources. For more information, see Discovering resources in the Amazon Web Services Cloud Control API User Guide. You can use this action to return information about existing resources in your account and Amazon Web Services Region, whether those resources were provisioned using Cloud Control API.
    */
  def listResources(params: ListResourcesInput): Request[ListResourcesOutput, AWSError] = js.native
  def listResources(
    params: ListResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesOutput, Unit]
  ): Request[ListResourcesOutput, AWSError] = js.native
  
  /**
    * Updates the specified property values in the resource. You specify your resource property updates as a list of patch operations contained in a JSON patch document that adheres to the  RFC 6902 - JavaScript Object Notation (JSON) Patch  standard. For details on how Cloud Control API performs resource update operations, see Updating a resource in the Amazon Web Services Cloud Control API User Guide. After you have initiated a resource update request, you can monitor the progress of your request by calling GetResourceRequestStatus using the RequestToken of the ProgressEvent returned by UpdateResource. For more information about the properties of a specific resource, refer to the related topic for the resource in the Resource and property types reference in the CloudFormation Users Guide.
    */
  def updateResource(): Request[UpdateResourceOutput, AWSError] = js.native
  def updateResource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceOutput, Unit]): Request[UpdateResourceOutput, AWSError] = js.native
  /**
    * Updates the specified property values in the resource. You specify your resource property updates as a list of patch operations contained in a JSON patch document that adheres to the  RFC 6902 - JavaScript Object Notation (JSON) Patch  standard. For details on how Cloud Control API performs resource update operations, see Updating a resource in the Amazon Web Services Cloud Control API User Guide. After you have initiated a resource update request, you can monitor the progress of your request by calling GetResourceRequestStatus using the RequestToken of the ProgressEvent returned by UpdateResource. For more information about the properties of a specific resource, refer to the related topic for the resource in the Resource and property types reference in the CloudFormation Users Guide.
    */
  def updateResource(params: UpdateResourceInput): Request[UpdateResourceOutput, AWSError] = js.native
  def updateResource(
    params: UpdateResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceOutput, Unit]
  ): Request[UpdateResourceOutput, AWSError] = js.native
  
  /**
    * Waits for the resourceRequestSuccess state by periodically calling the underlying CloudControl.getResourceRequestStatusoperation every 5 seconds (at most 24 times). Wait until resource operation request is successful
    */
  @JSName("waitFor")
  def waitFor_resourceRequestSuccess(state: resourceRequestSuccess): Request[GetResourceRequestStatusOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_resourceRequestSuccess(
    state: resourceRequestSuccess,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceRequestStatusOutput, Unit]
  ): Request[GetResourceRequestStatusOutput, AWSError] = js.native
  /**
    * Waits for the resourceRequestSuccess state by periodically calling the underlying CloudControl.getResourceRequestStatusoperation every 5 seconds (at most 24 times). Wait until resource operation request is successful
    */
  @JSName("waitFor")
  def waitFor_resourceRequestSuccess(state: resourceRequestSuccess, params: GetResourceRequestStatusI): Request[GetResourceRequestStatusOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_resourceRequestSuccess(
    state: resourceRequestSuccess,
    params: GetResourceRequestStatusI,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceRequestStatusOutput, Unit]
  ): Request[GetResourceRequestStatusOutput, AWSError] = js.native
}
