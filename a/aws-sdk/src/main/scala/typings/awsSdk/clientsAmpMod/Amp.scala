package typings.awsSdk.clientsAmpMod

import typings.awsSdk.anon.DescribeWorkspaceRequestw
import typings.awsSdk.awsSdkStrings.workspaceActive
import typings.awsSdk.awsSdkStrings.workspaceDeleted
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Amp extends Service {
  
  @JSName("config")
  var config_Amp: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create an alert manager definition.
    */
  def createAlertManagerDefinition(): Request[CreateAlertManagerDefinitionResponse, AWSError] = js.native
  def createAlertManagerDefinition(callback: js.Function2[/* err */ AWSError, /* data */ CreateAlertManagerDefinitionResponse, Unit]): Request[CreateAlertManagerDefinitionResponse, AWSError] = js.native
  /**
    * Create an alert manager definition.
    */
  def createAlertManagerDefinition(params: CreateAlertManagerDefinitionRequest): Request[CreateAlertManagerDefinitionResponse, AWSError] = js.native
  def createAlertManagerDefinition(
    params: CreateAlertManagerDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAlertManagerDefinitionResponse, Unit]
  ): Request[CreateAlertManagerDefinitionResponse, AWSError] = js.native
  
  /**
    * Create logging configuration.
    */
  def createLoggingConfiguration(): Request[CreateLoggingConfigurationResponse, AWSError] = js.native
  def createLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreateLoggingConfigurationResponse, Unit]): Request[CreateLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Create logging configuration.
    */
  def createLoggingConfiguration(params: CreateLoggingConfigurationRequest): Request[CreateLoggingConfigurationResponse, AWSError] = js.native
  def createLoggingConfiguration(
    params: CreateLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLoggingConfigurationResponse, Unit]
  ): Request[CreateLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Create a rule group namespace.
    */
  def createRuleGroupsNamespace(): Request[CreateRuleGroupsNamespaceResponse, AWSError] = js.native
  def createRuleGroupsNamespace(callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleGroupsNamespaceResponse, Unit]): Request[CreateRuleGroupsNamespaceResponse, AWSError] = js.native
  /**
    * Create a rule group namespace.
    */
  def createRuleGroupsNamespace(params: CreateRuleGroupsNamespaceRequest): Request[CreateRuleGroupsNamespaceResponse, AWSError] = js.native
  def createRuleGroupsNamespace(
    params: CreateRuleGroupsNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleGroupsNamespaceResponse, Unit]
  ): Request[CreateRuleGroupsNamespaceResponse, AWSError] = js.native
  
  /**
    * Creates a new AMP workspace.
    */
  def createWorkspace(): Request[CreateWorkspaceResponse, AWSError] = js.native
  def createWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceResponse, Unit]): Request[CreateWorkspaceResponse, AWSError] = js.native
  /**
    * Creates a new AMP workspace.
    */
  def createWorkspace(params: CreateWorkspaceRequest): Request[CreateWorkspaceResponse, AWSError] = js.native
  def createWorkspace(
    params: CreateWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspaceResponse, Unit]
  ): Request[CreateWorkspaceResponse, AWSError] = js.native
  
  /**
    * Deletes an alert manager definition.
    */
  def deleteAlertManagerDefinition(): Request[js.Object, AWSError] = js.native
  def deleteAlertManagerDefinition(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an alert manager definition.
    */
  def deleteAlertManagerDefinition(params: DeleteAlertManagerDefinitionRequest): Request[js.Object, AWSError] = js.native
  def deleteAlertManagerDefinition(
    params: DeleteAlertManagerDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete logging configuration.
    */
  def deleteLoggingConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete logging configuration.
    */
  def deleteLoggingConfiguration(params: DeleteLoggingConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteLoggingConfiguration(
    params: DeleteLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Delete a rule groups namespace.
    */
  def deleteRuleGroupsNamespace(): Request[js.Object, AWSError] = js.native
  def deleteRuleGroupsNamespace(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a rule groups namespace.
    */
  def deleteRuleGroupsNamespace(params: DeleteRuleGroupsNamespaceRequest): Request[js.Object, AWSError] = js.native
  def deleteRuleGroupsNamespace(
    params: DeleteRuleGroupsNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an AMP workspace.
    */
  def deleteWorkspace(): Request[js.Object, AWSError] = js.native
  def deleteWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an AMP workspace.
    */
  def deleteWorkspace(params: DeleteWorkspaceRequest): Request[js.Object, AWSError] = js.native
  def deleteWorkspace(
    params: DeleteWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes an alert manager definition.
    */
  def describeAlertManagerDefinition(): Request[DescribeAlertManagerDefinitionResponse, AWSError] = js.native
  def describeAlertManagerDefinition(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlertManagerDefinitionResponse, Unit]
  ): Request[DescribeAlertManagerDefinitionResponse, AWSError] = js.native
  /**
    * Describes an alert manager definition.
    */
  def describeAlertManagerDefinition(params: DescribeAlertManagerDefinitionRequest): Request[DescribeAlertManagerDefinitionResponse, AWSError] = js.native
  def describeAlertManagerDefinition(
    params: DescribeAlertManagerDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlertManagerDefinitionResponse, Unit]
  ): Request[DescribeAlertManagerDefinitionResponse, AWSError] = js.native
  
  /**
    * Describes logging configuration.
    */
  def describeLoggingConfiguration(): Request[DescribeLoggingConfigurationResponse, AWSError] = js.native
  def describeLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingConfigurationResponse, Unit]): Request[DescribeLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Describes logging configuration.
    */
  def describeLoggingConfiguration(params: DescribeLoggingConfigurationRequest): Request[DescribeLoggingConfigurationResponse, AWSError] = js.native
  def describeLoggingConfiguration(
    params: DescribeLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingConfigurationResponse, Unit]
  ): Request[DescribeLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Describe a rule groups namespace.
    */
  def describeRuleGroupsNamespace(): Request[DescribeRuleGroupsNamespaceResponse, AWSError] = js.native
  def describeRuleGroupsNamespace(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRuleGroupsNamespaceResponse, Unit]): Request[DescribeRuleGroupsNamespaceResponse, AWSError] = js.native
  /**
    * Describe a rule groups namespace.
    */
  def describeRuleGroupsNamespace(params: DescribeRuleGroupsNamespaceRequest): Request[DescribeRuleGroupsNamespaceResponse, AWSError] = js.native
  def describeRuleGroupsNamespace(
    params: DescribeRuleGroupsNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRuleGroupsNamespaceResponse, Unit]
  ): Request[DescribeRuleGroupsNamespaceResponse, AWSError] = js.native
  
  /**
    * Describes an existing AMP workspace.
    */
  def describeWorkspace(): Request[DescribeWorkspaceResponse, AWSError] = js.native
  def describeWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceResponse, Unit]): Request[DescribeWorkspaceResponse, AWSError] = js.native
  /**
    * Describes an existing AMP workspace.
    */
  def describeWorkspace(params: DescribeWorkspaceRequest): Request[DescribeWorkspaceResponse, AWSError] = js.native
  def describeWorkspace(
    params: DescribeWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceResponse, Unit]
  ): Request[DescribeWorkspaceResponse, AWSError] = js.native
  
  /**
    * Lists rule groups namespaces.
    */
  def listRuleGroupsNamespaces(): Request[ListRuleGroupsNamespacesResponse, AWSError] = js.native
  def listRuleGroupsNamespaces(callback: js.Function2[/* err */ AWSError, /* data */ ListRuleGroupsNamespacesResponse, Unit]): Request[ListRuleGroupsNamespacesResponse, AWSError] = js.native
  /**
    * Lists rule groups namespaces.
    */
  def listRuleGroupsNamespaces(params: ListRuleGroupsNamespacesRequest): Request[ListRuleGroupsNamespacesResponse, AWSError] = js.native
  def listRuleGroupsNamespaces(
    params: ListRuleGroupsNamespacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRuleGroupsNamespacesResponse, Unit]
  ): Request[ListRuleGroupsNamespacesResponse, AWSError] = js.native
  
  /**
    * Lists the tags you have assigned to the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags you have assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists all AMP workspaces, including workspaces being created or deleted.
    */
  def listWorkspaces(): Request[ListWorkspacesResponse, AWSError] = js.native
  def listWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ ListWorkspacesResponse, Unit]): Request[ListWorkspacesResponse, AWSError] = js.native
  /**
    * Lists all AMP workspaces, including workspaces being created or deleted.
    */
  def listWorkspaces(params: ListWorkspacesRequest): Request[ListWorkspacesResponse, AWSError] = js.native
  def listWorkspaces(
    params: ListWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWorkspacesResponse, Unit]
  ): Request[ListWorkspacesResponse, AWSError] = js.native
  
  /**
    * Update an alert manager definition.
    */
  def putAlertManagerDefinition(): Request[PutAlertManagerDefinitionResponse, AWSError] = js.native
  def putAlertManagerDefinition(callback: js.Function2[/* err */ AWSError, /* data */ PutAlertManagerDefinitionResponse, Unit]): Request[PutAlertManagerDefinitionResponse, AWSError] = js.native
  /**
    * Update an alert manager definition.
    */
  def putAlertManagerDefinition(params: PutAlertManagerDefinitionRequest): Request[PutAlertManagerDefinitionResponse, AWSError] = js.native
  def putAlertManagerDefinition(
    params: PutAlertManagerDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAlertManagerDefinitionResponse, Unit]
  ): Request[PutAlertManagerDefinitionResponse, AWSError] = js.native
  
  /**
    * Update a rule groups namespace.
    */
  def putRuleGroupsNamespace(): Request[PutRuleGroupsNamespaceResponse, AWSError] = js.native
  def putRuleGroupsNamespace(callback: js.Function2[/* err */ AWSError, /* data */ PutRuleGroupsNamespaceResponse, Unit]): Request[PutRuleGroupsNamespaceResponse, AWSError] = js.native
  /**
    * Update a rule groups namespace.
    */
  def putRuleGroupsNamespace(params: PutRuleGroupsNamespaceRequest): Request[PutRuleGroupsNamespaceResponse, AWSError] = js.native
  def putRuleGroupsNamespace(
    params: PutRuleGroupsNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRuleGroupsNamespaceResponse, Unit]
  ): Request[PutRuleGroupsNamespaceResponse, AWSError] = js.native
  
  /**
    * Creates tags for the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Creates tags for the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Deletes tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deletes tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Update logging configuration.
    */
  def updateLoggingConfiguration(): Request[UpdateLoggingConfigurationResponse, AWSError] = js.native
  def updateLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLoggingConfigurationResponse, Unit]): Request[UpdateLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Update logging configuration.
    */
  def updateLoggingConfiguration(params: UpdateLoggingConfigurationRequest): Request[UpdateLoggingConfigurationResponse, AWSError] = js.native
  def updateLoggingConfiguration(
    params: UpdateLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLoggingConfigurationResponse, Unit]
  ): Request[UpdateLoggingConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates an AMP workspace alias.
    */
  def updateWorkspaceAlias(): Request[js.Object, AWSError] = js.native
  def updateWorkspaceAlias(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an AMP workspace alias.
    */
  def updateWorkspaceAlias(params: UpdateWorkspaceAliasRequest): Request[js.Object, AWSError] = js.native
  def updateWorkspaceAlias(
    params: UpdateWorkspaceAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Waits for the workspaceActive state by periodically calling the underlying Amp.describeWorkspaceoperation every 2 seconds (at most 60 times). Wait until a workspace reaches ACTIVE status
    */
  @JSName("waitFor")
  def waitFor_workspaceActive(state: workspaceActive): Request[DescribeWorkspaceResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_workspaceActive(
    state: workspaceActive,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceResponse, Unit]
  ): Request[DescribeWorkspaceResponse, AWSError] = js.native
  /**
    * Waits for the workspaceActive state by periodically calling the underlying Amp.describeWorkspaceoperation every 2 seconds (at most 60 times). Wait until a workspace reaches ACTIVE status
    */
  @JSName("waitFor")
  def waitFor_workspaceActive(state: workspaceActive, params: DescribeWorkspaceRequestw): Request[DescribeWorkspaceResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_workspaceActive(
    state: workspaceActive,
    params: DescribeWorkspaceRequestw,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceResponse, Unit]
  ): Request[DescribeWorkspaceResponse, AWSError] = js.native
  /**
    * Waits for the workspaceDeleted state by periodically calling the underlying Amp.describeWorkspaceoperation every 2 seconds (at most 60 times). Wait until a workspace reaches DELETED status
    */
  @JSName("waitFor")
  def waitFor_workspaceDeleted(state: workspaceDeleted): Request[DescribeWorkspaceResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_workspaceDeleted(
    state: workspaceDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceResponse, Unit]
  ): Request[DescribeWorkspaceResponse, AWSError] = js.native
  /**
    * Waits for the workspaceDeleted state by periodically calling the underlying Amp.describeWorkspaceoperation every 2 seconds (at most 60 times). Wait until a workspace reaches DELETED status
    */
  @JSName("waitFor")
  def waitFor_workspaceDeleted(state: workspaceDeleted, params: DescribeWorkspaceRequestw): Request[DescribeWorkspaceResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_workspaceDeleted(
    state: workspaceDeleted,
    params: DescribeWorkspaceRequestw,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceResponse, Unit]
  ): Request[DescribeWorkspaceResponse, AWSError] = js.native
}
