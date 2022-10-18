package typings.awsSdk.clientsIottwinmakerMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoTTwinMaker extends Service {
  
  /**
    * Sets values for multiple time series properties.
    */
  def batchPutPropertyValues(): Request[BatchPutPropertyValuesResponse, AWSError] = js.native
  def batchPutPropertyValues(callback: js.Function2[/* err */ AWSError, /* data */ BatchPutPropertyValuesResponse, Unit]): Request[BatchPutPropertyValuesResponse, AWSError] = js.native
  /**
    * Sets values for multiple time series properties.
    */
  def batchPutPropertyValues(params: BatchPutPropertyValuesRequest): Request[BatchPutPropertyValuesResponse, AWSError] = js.native
  def batchPutPropertyValues(
    params: BatchPutPropertyValuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchPutPropertyValuesResponse, Unit]
  ): Request[BatchPutPropertyValuesResponse, AWSError] = js.native
  
  @JSName("config")
  var config_IoTTwinMaker: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a component type.
    */
  def createComponentType(): Request[CreateComponentTypeResponse, AWSError] = js.native
  def createComponentType(callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentTypeResponse, Unit]): Request[CreateComponentTypeResponse, AWSError] = js.native
  /**
    * Creates a component type.
    */
  def createComponentType(params: CreateComponentTypeRequest): Request[CreateComponentTypeResponse, AWSError] = js.native
  def createComponentType(
    params: CreateComponentTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentTypeResponse, Unit]
  ): Request[CreateComponentTypeResponse, AWSError] = js.native
  
  /**
    * Creates an entity.
    */
  def createEntity(): Request[CreateEntityResponse, AWSError] = js.native
  def createEntity(callback: js.Function2[/* err */ AWSError, /* data */ CreateEntityResponse, Unit]): Request[CreateEntityResponse, AWSError] = js.native
  /**
    * Creates an entity.
    */
  def createEntity(params: CreateEntityRequest): Request[CreateEntityResponse, AWSError] = js.native
  def createEntity(
    params: CreateEntityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEntityResponse, Unit]
  ): Request[CreateEntityResponse, AWSError] = js.native
  
  /**
    * Creates a scene.
    */
  def createScene(): Request[CreateSceneResponse, AWSError] = js.native
  def createScene(callback: js.Function2[/* err */ AWSError, /* data */ CreateSceneResponse, Unit]): Request[CreateSceneResponse, AWSError] = js.native
  /**
    * Creates a scene.
    */
  def createScene(params: CreateSceneRequest): Request[CreateSceneResponse, AWSError] = js.native
  def createScene(
    params: CreateSceneRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSceneResponse, Unit]
  ): Request[CreateSceneResponse, AWSError] = js.native
  
  /**
    * Creates a workplace.
    */
  def createWorkspace(): Request[CreateWorkspaceResponse, AWSError] = js.native
  def createWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceResponse, Unit]): Request[CreateWorkspaceResponse, AWSError] = js.native
  /**
    * Creates a workplace.
    */
  def createWorkspace(params: CreateWorkspaceRequest): Request[CreateWorkspaceResponse, AWSError] = js.native
  def createWorkspace(
    params: CreateWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceResponse, Unit]
  ): Request[CreateWorkspaceResponse, AWSError] = js.native
  
  /**
    * Deletes a component type.
    */
  def deleteComponentType(): Request[DeleteComponentTypeResponse, AWSError] = js.native
  def deleteComponentType(callback: js.Function2[/* err */ AWSError, /* data */ DeleteComponentTypeResponse, Unit]): Request[DeleteComponentTypeResponse, AWSError] = js.native
  /**
    * Deletes a component type.
    */
  def deleteComponentType(params: DeleteComponentTypeRequest): Request[DeleteComponentTypeResponse, AWSError] = js.native
  def deleteComponentType(
    params: DeleteComponentTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteComponentTypeResponse, Unit]
  ): Request[DeleteComponentTypeResponse, AWSError] = js.native
  
  /**
    * Deletes an entity.
    */
  def deleteEntity(): Request[DeleteEntityResponse, AWSError] = js.native
  def deleteEntity(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEntityResponse, Unit]): Request[DeleteEntityResponse, AWSError] = js.native
  /**
    * Deletes an entity.
    */
  def deleteEntity(params: DeleteEntityRequest): Request[DeleteEntityResponse, AWSError] = js.native
  def deleteEntity(
    params: DeleteEntityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEntityResponse, Unit]
  ): Request[DeleteEntityResponse, AWSError] = js.native
  
  /**
    * Deletes a scene.
    */
  def deleteScene(): Request[DeleteSceneResponse, AWSError] = js.native
  def deleteScene(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSceneResponse, Unit]): Request[DeleteSceneResponse, AWSError] = js.native
  /**
    * Deletes a scene.
    */
  def deleteScene(params: DeleteSceneRequest): Request[DeleteSceneResponse, AWSError] = js.native
  def deleteScene(
    params: DeleteSceneRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSceneResponse, Unit]
  ): Request[DeleteSceneResponse, AWSError] = js.native
  
  /**
    * Deletes a workspace.
    */
  def deleteWorkspace(): Request[DeleteWorkspaceResponse, AWSError] = js.native
  def deleteWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceResponse, Unit]): Request[DeleteWorkspaceResponse, AWSError] = js.native
  /**
    * Deletes a workspace.
    */
  def deleteWorkspace(params: DeleteWorkspaceRequest): Request[DeleteWorkspaceResponse, AWSError] = js.native
  def deleteWorkspace(
    params: DeleteWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceResponse, Unit]
  ): Request[DeleteWorkspaceResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a component type.
    */
  def getComponentType(): Request[GetComponentTypeResponse, AWSError] = js.native
  def getComponentType(callback: js.Function2[/* err */ AWSError, /* data */ GetComponentTypeResponse, Unit]): Request[GetComponentTypeResponse, AWSError] = js.native
  /**
    * Retrieves information about a component type.
    */
  def getComponentType(params: GetComponentTypeRequest): Request[GetComponentTypeResponse, AWSError] = js.native
  def getComponentType(
    params: GetComponentTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentTypeResponse, Unit]
  ): Request[GetComponentTypeResponse, AWSError] = js.native
  
  /**
    * Retrieves information about an entity.
    */
  def getEntity(): Request[GetEntityResponse, AWSError] = js.native
  def getEntity(callback: js.Function2[/* err */ AWSError, /* data */ GetEntityResponse, Unit]): Request[GetEntityResponse, AWSError] = js.native
  /**
    * Retrieves information about an entity.
    */
  def getEntity(params: GetEntityRequest): Request[GetEntityResponse, AWSError] = js.native
  def getEntity(
    params: GetEntityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEntityResponse, Unit]
  ): Request[GetEntityResponse, AWSError] = js.native
  
  /**
    * Gets the property values for a component, component type, entity, or workspace. You must specify a value for either componentName, componentTypeId, entityId, or workspaceId.
    */
  def getPropertyValue(): Request[GetPropertyValueResponse, AWSError] = js.native
  def getPropertyValue(callback: js.Function2[/* err */ AWSError, /* data */ GetPropertyValueResponse, Unit]): Request[GetPropertyValueResponse, AWSError] = js.native
  /**
    * Gets the property values for a component, component type, entity, or workspace. You must specify a value for either componentName, componentTypeId, entityId, or workspaceId.
    */
  def getPropertyValue(params: GetPropertyValueRequest): Request[GetPropertyValueResponse, AWSError] = js.native
  def getPropertyValue(
    params: GetPropertyValueRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPropertyValueResponse, Unit]
  ): Request[GetPropertyValueResponse, AWSError] = js.native
  
  /**
    * Retrieves information about the history of a time series property value for a component, component type, entity, or workspace. You must specify a value for workspaceId. For entity-specific queries, specify values for componentName and entityId. For cross-entity quries, specify a value for componentTypeId.
    */
  def getPropertyValueHistory(): Request[GetPropertyValueHistoryResponse, AWSError] = js.native
  def getPropertyValueHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetPropertyValueHistoryResponse, Unit]): Request[GetPropertyValueHistoryResponse, AWSError] = js.native
  /**
    * Retrieves information about the history of a time series property value for a component, component type, entity, or workspace. You must specify a value for workspaceId. For entity-specific queries, specify values for componentName and entityId. For cross-entity quries, specify a value for componentTypeId.
    */
  def getPropertyValueHistory(params: GetPropertyValueHistoryRequest): Request[GetPropertyValueHistoryResponse, AWSError] = js.native
  def getPropertyValueHistory(
    params: GetPropertyValueHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPropertyValueHistoryResponse, Unit]
  ): Request[GetPropertyValueHistoryResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a scene.
    */
  def getScene(): Request[GetSceneResponse, AWSError] = js.native
  def getScene(callback: js.Function2[/* err */ AWSError, /* data */ GetSceneResponse, Unit]): Request[GetSceneResponse, AWSError] = js.native
  /**
    * Retrieves information about a scene.
    */
  def getScene(params: GetSceneRequest): Request[GetSceneResponse, AWSError] = js.native
  def getScene(
    params: GetSceneRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSceneResponse, Unit]
  ): Request[GetSceneResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a workspace.
    */
  def getWorkspace(): Request[GetWorkspaceResponse, AWSError] = js.native
  def getWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ GetWorkspaceResponse, Unit]): Request[GetWorkspaceResponse, AWSError] = js.native
  /**
    * Retrieves information about a workspace.
    */
  def getWorkspace(params: GetWorkspaceRequest): Request[GetWorkspaceResponse, AWSError] = js.native
  def getWorkspace(
    params: GetWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWorkspaceResponse, Unit]
  ): Request[GetWorkspaceResponse, AWSError] = js.native
  
  /**
    * Lists all component types in a workspace.
    */
  def listComponentTypes(): Request[ListComponentTypesResponse, AWSError] = js.native
  def listComponentTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListComponentTypesResponse, Unit]): Request[ListComponentTypesResponse, AWSError] = js.native
  /**
    * Lists all component types in a workspace.
    */
  def listComponentTypes(params: ListComponentTypesRequest): Request[ListComponentTypesResponse, AWSError] = js.native
  def listComponentTypes(
    params: ListComponentTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentTypesResponse, Unit]
  ): Request[ListComponentTypesResponse, AWSError] = js.native
  
  /**
    * Lists all entities in a workspace.
    */
  def listEntities(): Request[ListEntitiesResponse, AWSError] = js.native
  def listEntities(callback: js.Function2[/* err */ AWSError, /* data */ ListEntitiesResponse, Unit]): Request[ListEntitiesResponse, AWSError] = js.native
  /**
    * Lists all entities in a workspace.
    */
  def listEntities(params: ListEntitiesRequest): Request[ListEntitiesResponse, AWSError] = js.native
  def listEntities(
    params: ListEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEntitiesResponse, Unit]
  ): Request[ListEntitiesResponse, AWSError] = js.native
  
  /**
    * Lists all scenes in a workspace.
    */
  def listScenes(): Request[ListScenesResponse, AWSError] = js.native
  def listScenes(callback: js.Function2[/* err */ AWSError, /* data */ ListScenesResponse, Unit]): Request[ListScenesResponse, AWSError] = js.native
  /**
    * Lists all scenes in a workspace.
    */
  def listScenes(params: ListScenesRequest): Request[ListScenesResponse, AWSError] = js.native
  def listScenes(
    params: ListScenesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListScenesResponse, Unit]
  ): Request[ListScenesResponse, AWSError] = js.native
  
  /**
    * Lists all tags associated with a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all tags associated with a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves information about workspaces in the current account.
    */
  def listWorkspaces(): Request[ListWorkspacesResponse, AWSError] = js.native
  def listWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkspacesResponse, Unit]): Request[ListWorkspacesResponse, AWSError] = js.native
  /**
    * Retrieves information about workspaces in the current account.
    */
  def listWorkspaces(params: ListWorkspacesRequest): Request[ListWorkspacesResponse, AWSError] = js.native
  def listWorkspaces(
    params: ListWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkspacesResponse, Unit]
  ): Request[ListWorkspacesResponse, AWSError] = js.native
  
  /**
    * Adds tags to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds tags to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates information in a component type.
    */
  def updateComponentType(): Request[UpdateComponentTypeResponse, AWSError] = js.native
  def updateComponentType(callback: js.Function2[/* err */ AWSError, /* data */ UpdateComponentTypeResponse, Unit]): Request[UpdateComponentTypeResponse, AWSError] = js.native
  /**
    * Updates information in a component type.
    */
  def updateComponentType(params: UpdateComponentTypeRequest): Request[UpdateComponentTypeResponse, AWSError] = js.native
  def updateComponentType(
    params: UpdateComponentTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateComponentTypeResponse, Unit]
  ): Request[UpdateComponentTypeResponse, AWSError] = js.native
  
  /**
    * Updates an entity.
    */
  def updateEntity(): Request[UpdateEntityResponse, AWSError] = js.native
  def updateEntity(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEntityResponse, Unit]): Request[UpdateEntityResponse, AWSError] = js.native
  /**
    * Updates an entity.
    */
  def updateEntity(params: UpdateEntityRequest): Request[UpdateEntityResponse, AWSError] = js.native
  def updateEntity(
    params: UpdateEntityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEntityResponse, Unit]
  ): Request[UpdateEntityResponse, AWSError] = js.native
  
  /**
    * Updates a scene.
    */
  def updateScene(): Request[UpdateSceneResponse, AWSError] = js.native
  def updateScene(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSceneResponse, Unit]): Request[UpdateSceneResponse, AWSError] = js.native
  /**
    * Updates a scene.
    */
  def updateScene(params: UpdateSceneRequest): Request[UpdateSceneResponse, AWSError] = js.native
  def updateScene(
    params: UpdateSceneRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSceneResponse, Unit]
  ): Request[UpdateSceneResponse, AWSError] = js.native
  
  /**
    * Updates a workspace.
    */
  def updateWorkspace(): Request[UpdateWorkspaceResponse, AWSError] = js.native
  def updateWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkspaceResponse, Unit]): Request[UpdateWorkspaceResponse, AWSError] = js.native
  /**
    * Updates a workspace.
    */
  def updateWorkspace(params: UpdateWorkspaceRequest): Request[UpdateWorkspaceResponse, AWSError] = js.native
  def updateWorkspace(
    params: UpdateWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWorkspaceResponse, Unit]
  ): Request[UpdateWorkspaceResponse, AWSError] = js.native
}
