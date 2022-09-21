package typings.awsSdk.appintegrationsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppIntegrations extends Service {
  
  @JSName("config")
  var config_AppIntegrations: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates and persists a DataIntegration resource.  You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def createDataIntegration(): Request[CreateDataIntegrationResponse, AWSError] = js.native
  def createDataIntegration(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataIntegrationResponse, Unit]): Request[CreateDataIntegrationResponse, AWSError] = js.native
  /**
    * Creates and persists a DataIntegration resource.  You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def createDataIntegration(params: CreateDataIntegrationRequest): Request[CreateDataIntegrationResponse, AWSError] = js.native
  def createDataIntegration(
    params: CreateDataIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataIntegrationResponse, Unit]
  ): Request[CreateDataIntegrationResponse, AWSError] = js.native
  
  /**
    * Creates an EventIntegration, given a specified name, description, and a reference to an Amazon EventBridge bus in your account and a partner event source that pushes events to that bus. No objects are created in the your account, only metadata that is persisted on the EventIntegration control plane.
    */
  def createEventIntegration(): Request[CreateEventIntegrationResponse, AWSError] = js.native
  def createEventIntegration(callback: js.Function2[/* err */ AWSError, /* data */ CreateEventIntegrationResponse, Unit]): Request[CreateEventIntegrationResponse, AWSError] = js.native
  /**
    * Creates an EventIntegration, given a specified name, description, and a reference to an Amazon EventBridge bus in your account and a partner event source that pushes events to that bus. No objects are created in the your account, only metadata that is persisted on the EventIntegration control plane.
    */
  def createEventIntegration(params: CreateEventIntegrationRequest): Request[CreateEventIntegrationResponse, AWSError] = js.native
  def createEventIntegration(
    params: CreateEventIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEventIntegrationResponse, Unit]
  ): Request[CreateEventIntegrationResponse, AWSError] = js.native
  
  /**
    * Deletes the DataIntegration. Only DataIntegrations that don't have any DataIntegrationAssociations can be deleted. Deleting a DataIntegration also deletes the underlying Amazon AppFlow flow and service linked role.   You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def deleteDataIntegration(): Request[DeleteDataIntegrationResponse, AWSError] = js.native
  def deleteDataIntegration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataIntegrationResponse, Unit]): Request[DeleteDataIntegrationResponse, AWSError] = js.native
  /**
    * Deletes the DataIntegration. Only DataIntegrations that don't have any DataIntegrationAssociations can be deleted. Deleting a DataIntegration also deletes the underlying Amazon AppFlow flow and service linked role.   You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def deleteDataIntegration(params: DeleteDataIntegrationRequest): Request[DeleteDataIntegrationResponse, AWSError] = js.native
  def deleteDataIntegration(
    params: DeleteDataIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataIntegrationResponse, Unit]
  ): Request[DeleteDataIntegrationResponse, AWSError] = js.native
  
  /**
    * Deletes the specified existing event integration. If the event integration is associated with clients, the request is rejected.
    */
  def deleteEventIntegration(): Request[DeleteEventIntegrationResponse, AWSError] = js.native
  def deleteEventIntegration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventIntegrationResponse, Unit]): Request[DeleteEventIntegrationResponse, AWSError] = js.native
  /**
    * Deletes the specified existing event integration. If the event integration is associated with clients, the request is rejected.
    */
  def deleteEventIntegration(params: DeleteEventIntegrationRequest): Request[DeleteEventIntegrationResponse, AWSError] = js.native
  def deleteEventIntegration(
    params: DeleteEventIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventIntegrationResponse, Unit]
  ): Request[DeleteEventIntegrationResponse, AWSError] = js.native
  
  /**
    * Returns information about the DataIntegration.  You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def getDataIntegration(): Request[GetDataIntegrationResponse, AWSError] = js.native
  def getDataIntegration(callback: js.Function2[/* err */ AWSError, /* data */ GetDataIntegrationResponse, Unit]): Request[GetDataIntegrationResponse, AWSError] = js.native
  /**
    * Returns information about the DataIntegration.  You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def getDataIntegration(params: GetDataIntegrationRequest): Request[GetDataIntegrationResponse, AWSError] = js.native
  def getDataIntegration(
    params: GetDataIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataIntegrationResponse, Unit]
  ): Request[GetDataIntegrationResponse, AWSError] = js.native
  
  /**
    * Returns information about the event integration.
    */
  def getEventIntegration(): Request[GetEventIntegrationResponse, AWSError] = js.native
  def getEventIntegration(callback: js.Function2[/* err */ AWSError, /* data */ GetEventIntegrationResponse, Unit]): Request[GetEventIntegrationResponse, AWSError] = js.native
  /**
    * Returns information about the event integration.
    */
  def getEventIntegration(params: GetEventIntegrationRequest): Request[GetEventIntegrationResponse, AWSError] = js.native
  def getEventIntegration(
    params: GetEventIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEventIntegrationResponse, Unit]
  ): Request[GetEventIntegrationResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of DataIntegration associations in the account.  You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def listDataIntegrationAssociations(): Request[ListDataIntegrationAssociationsResponse, AWSError] = js.native
  def listDataIntegrationAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataIntegrationAssociationsResponse, Unit]
  ): Request[ListDataIntegrationAssociationsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of DataIntegration associations in the account.  You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def listDataIntegrationAssociations(params: ListDataIntegrationAssociationsRequest): Request[ListDataIntegrationAssociationsResponse, AWSError] = js.native
  def listDataIntegrationAssociations(
    params: ListDataIntegrationAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataIntegrationAssociationsResponse, Unit]
  ): Request[ListDataIntegrationAssociationsResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of DataIntegrations in the account.  You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def listDataIntegrations(): Request[ListDataIntegrationsResponse, AWSError] = js.native
  def listDataIntegrations(callback: js.Function2[/* err */ AWSError, /* data */ ListDataIntegrationsResponse, Unit]): Request[ListDataIntegrationsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of DataIntegrations in the account.  You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def listDataIntegrations(params: ListDataIntegrationsRequest): Request[ListDataIntegrationsResponse, AWSError] = js.native
  def listDataIntegrations(
    params: ListDataIntegrationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataIntegrationsResponse, Unit]
  ): Request[ListDataIntegrationsResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of event integration associations in the account. 
    */
  def listEventIntegrationAssociations(): Request[ListEventIntegrationAssociationsResponse, AWSError] = js.native
  def listEventIntegrationAssociations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventIntegrationAssociationsResponse, Unit]
  ): Request[ListEventIntegrationAssociationsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of event integration associations in the account. 
    */
  def listEventIntegrationAssociations(params: ListEventIntegrationAssociationsRequest): Request[ListEventIntegrationAssociationsResponse, AWSError] = js.native
  def listEventIntegrationAssociations(
    params: ListEventIntegrationAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventIntegrationAssociationsResponse, Unit]
  ): Request[ListEventIntegrationAssociationsResponse, AWSError] = js.native
  
  /**
    * Returns a paginated list of event integrations in the account.
    */
  def listEventIntegrations(): Request[ListEventIntegrationsResponse, AWSError] = js.native
  def listEventIntegrations(callback: js.Function2[/* err */ AWSError, /* data */ ListEventIntegrationsResponse, Unit]): Request[ListEventIntegrationsResponse, AWSError] = js.native
  /**
    * Returns a paginated list of event integrations in the account.
    */
  def listEventIntegrations(params: ListEventIntegrationsRequest): Request[ListEventIntegrationsResponse, AWSError] = js.native
  def listEventIntegrations(
    params: ListEventIntegrationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventIntegrationsResponse, Unit]
  ): Request[ListEventIntegrationsResponse, AWSError] = js.native
  
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Adds the specified tags to the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the description of a DataIntegration.  You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def updateDataIntegration(): Request[UpdateDataIntegrationResponse, AWSError] = js.native
  def updateDataIntegration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataIntegrationResponse, Unit]): Request[UpdateDataIntegrationResponse, AWSError] = js.native
  /**
    * Updates the description of a DataIntegration.  You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a different DataIntegration, or recreate the DataIntegration using the CreateDataIntegration API. 
    */
  def updateDataIntegration(params: UpdateDataIntegrationRequest): Request[UpdateDataIntegrationResponse, AWSError] = js.native
  def updateDataIntegration(
    params: UpdateDataIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataIntegrationResponse, Unit]
  ): Request[UpdateDataIntegrationResponse, AWSError] = js.native
  
  /**
    * Updates the description of an event integration.
    */
  def updateEventIntegration(): Request[UpdateEventIntegrationResponse, AWSError] = js.native
  def updateEventIntegration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventIntegrationResponse, Unit]): Request[UpdateEventIntegrationResponse, AWSError] = js.native
  /**
    * Updates the description of an event integration.
    */
  def updateEventIntegration(params: UpdateEventIntegrationRequest): Request[UpdateEventIntegrationResponse, AWSError] = js.native
  def updateEventIntegration(
    params: UpdateEventIntegrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventIntegrationResponse, Unit]
  ): Request[UpdateEventIntegrationResponse, AWSError] = js.native
}
