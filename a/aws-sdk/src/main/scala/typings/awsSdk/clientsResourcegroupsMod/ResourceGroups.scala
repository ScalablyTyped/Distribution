package typings.awsSdk.clientsResourcegroupsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceGroups extends Service {
  
  @JSName("config")
  var config_ResourceGroups: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a resource group with the specified name and description. You can optionally include either a resource query or a service configuration. For more information about constructing a resource query, see Build queries and groups in Resource Groups in the Resource Groups User Guide. For more information about service-linked groups and service configurations, see Service configurations for Resource Groups.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:CreateGroup   
    */
  def createGroup(): Request[CreateGroupOutput, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupOutput, Unit]): Request[CreateGroupOutput, AWSError] = js.native
  /**
    * Creates a resource group with the specified name and description. You can optionally include either a resource query or a service configuration. For more information about constructing a resource query, see Build queries and groups in Resource Groups in the Resource Groups User Guide. For more information about service-linked groups and service configurations, see Service configurations for Resource Groups.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:CreateGroup   
    */
  def createGroup(params: CreateGroupInput): Request[CreateGroupOutput, AWSError] = js.native
  def createGroup(
    params: CreateGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupOutput, Unit]
  ): Request[CreateGroupOutput, AWSError] = js.native
  
  /**
    * Deletes the specified resource group. Deleting a resource group does not delete any resources that are members of the group; it only deletes the group structure.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:DeleteGroup   
    */
  def deleteGroup(): Request[DeleteGroupOutput, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupOutput, Unit]): Request[DeleteGroupOutput, AWSError] = js.native
  /**
    * Deletes the specified resource group. Deleting a resource group does not delete any resources that are members of the group; it only deletes the group structure.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:DeleteGroup   
    */
  def deleteGroup(params: DeleteGroupInput): Request[DeleteGroupOutput, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupOutput, Unit]
  ): Request[DeleteGroupOutput, AWSError] = js.native
  
  /**
    * Retrieves the current status of optional features in Resource Groups.
    */
  def getAccountSettings(): Request[GetAccountSettingsOutput, AWSError] = js.native
  def getAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSettingsOutput, Unit]): Request[GetAccountSettingsOutput, AWSError] = js.native
  
  /**
    * Returns information about a specified resource group.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:GetGroup   
    */
  def getGroup(): Request[GetGroupOutput, AWSError] = js.native
  def getGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupOutput, Unit]): Request[GetGroupOutput, AWSError] = js.native
  /**
    * Returns information about a specified resource group.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:GetGroup   
    */
  def getGroup(params: GetGroupInput): Request[GetGroupOutput, AWSError] = js.native
  def getGroup(params: GetGroupInput, callback: js.Function2[/* err */ AWSError, /* data */ GetGroupOutput, Unit]): Request[GetGroupOutput, AWSError] = js.native
  
  /**
    * Retrieves the service configuration associated with the specified resource group. For details about the service configuration syntax, see Service configurations for Resource Groups.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:GetGroupConfiguration   
    */
  def getGroupConfiguration(): Request[GetGroupConfigurationOutput, AWSError] = js.native
  def getGroupConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupConfigurationOutput, Unit]): Request[GetGroupConfigurationOutput, AWSError] = js.native
  /**
    * Retrieves the service configuration associated with the specified resource group. For details about the service configuration syntax, see Service configurations for Resource Groups.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:GetGroupConfiguration   
    */
  def getGroupConfiguration(params: GetGroupConfigurationInput): Request[GetGroupConfigurationOutput, AWSError] = js.native
  def getGroupConfiguration(
    params: GetGroupConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupConfigurationOutput, Unit]
  ): Request[GetGroupConfigurationOutput, AWSError] = js.native
  
  /**
    * Retrieves the resource query associated with the specified resource group. For more information about resource queries, see Create a tag-based group in Resource Groups.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:GetGroupQuery   
    */
  def getGroupQuery(): Request[GetGroupQueryOutput, AWSError] = js.native
  def getGroupQuery(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupQueryOutput, Unit]): Request[GetGroupQueryOutput, AWSError] = js.native
  /**
    * Retrieves the resource query associated with the specified resource group. For more information about resource queries, see Create a tag-based group in Resource Groups.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:GetGroupQuery   
    */
  def getGroupQuery(params: GetGroupQueryInput): Request[GetGroupQueryOutput, AWSError] = js.native
  def getGroupQuery(
    params: GetGroupQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupQueryOutput, Unit]
  ): Request[GetGroupQueryOutput, AWSError] = js.native
  
  /**
    * Returns a list of tags that are associated with a resource group, specified by an ARN.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:GetTags   
    */
  def getTags(): Request[GetTagsOutput, AWSError] = js.native
  def getTags(callback: js.Function2[/* err */ AWSError, /* data */ GetTagsOutput, Unit]): Request[GetTagsOutput, AWSError] = js.native
  /**
    * Returns a list of tags that are associated with a resource group, specified by an ARN.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:GetTags   
    */
  def getTags(params: GetTagsInput): Request[GetTagsOutput, AWSError] = js.native
  def getTags(params: GetTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ GetTagsOutput, Unit]): Request[GetTagsOutput, AWSError] = js.native
  
  /**
    * Adds the specified resources to the specified group.  You can use this operation with only resource groups that are configured with the following types:    AWS::EC2::HostManagement     AWS::EC2::CapacityReservationPool    Other resource group type and resource types aren't currently supported by this operation.   Minimum permissions  To run this command, you must have the following permissions:    resource-groups:GroupResources   
    */
  def groupResources(): Request[GroupResourcesOutput, AWSError] = js.native
  def groupResources(callback: js.Function2[/* err */ AWSError, /* data */ GroupResourcesOutput, Unit]): Request[GroupResourcesOutput, AWSError] = js.native
  /**
    * Adds the specified resources to the specified group.  You can use this operation with only resource groups that are configured with the following types:    AWS::EC2::HostManagement     AWS::EC2::CapacityReservationPool    Other resource group type and resource types aren't currently supported by this operation.   Minimum permissions  To run this command, you must have the following permissions:    resource-groups:GroupResources   
    */
  def groupResources(params: GroupResourcesInput): Request[GroupResourcesOutput, AWSError] = js.native
  def groupResources(
    params: GroupResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GroupResourcesOutput, Unit]
  ): Request[GroupResourcesOutput, AWSError] = js.native
  
  /**
    * Returns a list of ARNs of the resources that are members of a specified resource group.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:ListGroupResources     cloudformation:DescribeStacks     cloudformation:ListStackResources     tag:GetResources   
    */
  def listGroupResources(): Request[ListGroupResourcesOutput, AWSError] = js.native
  def listGroupResources(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupResourcesOutput, Unit]): Request[ListGroupResourcesOutput, AWSError] = js.native
  /**
    * Returns a list of ARNs of the resources that are members of a specified resource group.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:ListGroupResources     cloudformation:DescribeStacks     cloudformation:ListStackResources     tag:GetResources   
    */
  def listGroupResources(params: ListGroupResourcesInput): Request[ListGroupResourcesOutput, AWSError] = js.native
  def listGroupResources(
    params: ListGroupResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupResourcesOutput, Unit]
  ): Request[ListGroupResourcesOutput, AWSError] = js.native
  
  /**
    * Returns a list of existing Resource Groups in your account.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:ListGroups   
    */
  def listGroups(): Request[ListGroupsOutput, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsOutput, Unit]): Request[ListGroupsOutput, AWSError] = js.native
  /**
    * Returns a list of existing Resource Groups in your account.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:ListGroups   
    */
  def listGroups(params: ListGroupsInput): Request[ListGroupsOutput, AWSError] = js.native
  def listGroups(
    params: ListGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsOutput, Unit]
  ): Request[ListGroupsOutput, AWSError] = js.native
  
  /**
    * Attaches a service configuration to the specified group. This occurs asynchronously, and can take time to complete. You can use GetGroupConfiguration to check the status of the update.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:PutGroupConfiguration   
    */
  def putGroupConfiguration(): Request[PutGroupConfigurationOutput, AWSError] = js.native
  def putGroupConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutGroupConfigurationOutput, Unit]): Request[PutGroupConfigurationOutput, AWSError] = js.native
  /**
    * Attaches a service configuration to the specified group. This occurs asynchronously, and can take time to complete. You can use GetGroupConfiguration to check the status of the update.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:PutGroupConfiguration   
    */
  def putGroupConfiguration(params: PutGroupConfigurationInput): Request[PutGroupConfigurationOutput, AWSError] = js.native
  def putGroupConfiguration(
    params: PutGroupConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutGroupConfigurationOutput, Unit]
  ): Request[PutGroupConfigurationOutput, AWSError] = js.native
  
  /**
    * Returns a list of Amazon Web Services resource identifiers that matches the specified query. The query uses the same format as a resource query in a CreateGroup or UpdateGroupQuery operation.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:SearchResources     cloudformation:DescribeStacks     cloudformation:ListStackResources     tag:GetResources   
    */
  def searchResources(): Request[SearchResourcesOutput, AWSError] = js.native
  def searchResources(callback: js.Function2[/* err */ AWSError, /* data */ SearchResourcesOutput, Unit]): Request[SearchResourcesOutput, AWSError] = js.native
  /**
    * Returns a list of Amazon Web Services resource identifiers that matches the specified query. The query uses the same format as a resource query in a CreateGroup or UpdateGroupQuery operation.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:SearchResources     cloudformation:DescribeStacks     cloudformation:ListStackResources     tag:GetResources   
    */
  def searchResources(params: SearchResourcesInput): Request[SearchResourcesOutput, AWSError] = js.native
  def searchResources(
    params: SearchResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchResourcesOutput, Unit]
  ): Request[SearchResourcesOutput, AWSError] = js.native
  
  /**
    * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they are not specified in the request parameters.  Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We use tags to provide you with billing and administration services. Tags are not intended to be used for private or sensitive data.   Minimum permissions  To run this command, you must have the following permissions:    resource-groups:Tag   
    */
  def tag(): Request[TagOutput, AWSError] = js.native
  def tag(callback: js.Function2[/* err */ AWSError, /* data */ TagOutput, Unit]): Request[TagOutput, AWSError] = js.native
  /**
    * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they are not specified in the request parameters.  Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We use tags to provide you with billing and administration services. Tags are not intended to be used for private or sensitive data.   Minimum permissions  To run this command, you must have the following permissions:    resource-groups:Tag   
    */
  def tag(params: TagInput): Request[TagOutput, AWSError] = js.native
  def tag(params: TagInput, callback: js.Function2[/* err */ AWSError, /* data */ TagOutput, Unit]): Request[TagOutput, AWSError] = js.native
  
  /**
    * Removes the specified resources from the specified group. This operation works only with static groups that you populated using the GroupResources operation. It doesn't work with any resource groups that are automatically populated by tag-based or CloudFormation stack-based queries.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:UngroupResources   
    */
  def ungroupResources(): Request[UngroupResourcesOutput, AWSError] = js.native
  def ungroupResources(callback: js.Function2[/* err */ AWSError, /* data */ UngroupResourcesOutput, Unit]): Request[UngroupResourcesOutput, AWSError] = js.native
  /**
    * Removes the specified resources from the specified group. This operation works only with static groups that you populated using the GroupResources operation. It doesn't work with any resource groups that are automatically populated by tag-based or CloudFormation stack-based queries.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:UngroupResources   
    */
  def ungroupResources(params: UngroupResourcesInput): Request[UngroupResourcesOutput, AWSError] = js.native
  def ungroupResources(
    params: UngroupResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UngroupResourcesOutput, Unit]
  ): Request[UngroupResourcesOutput, AWSError] = js.native
  
  /**
    * Deletes tags from a specified resource group.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:Untag   
    */
  def untag(): Request[UntagOutput, AWSError] = js.native
  def untag(callback: js.Function2[/* err */ AWSError, /* data */ UntagOutput, Unit]): Request[UntagOutput, AWSError] = js.native
  /**
    * Deletes tags from a specified resource group.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:Untag   
    */
  def untag(params: UntagInput): Request[UntagOutput, AWSError] = js.native
  def untag(params: UntagInput, callback: js.Function2[/* err */ AWSError, /* data */ UntagOutput, Unit]): Request[UntagOutput, AWSError] = js.native
  
  /**
    * Turns on or turns off optional features in Resource Groups. The preceding example shows that the request to turn on group lifecycle events is IN_PROGRESS. You can call the GetAccountSettings operation to check for completion by looking for GroupLifecycleEventsStatus to change to ACTIVE.
    */
  def updateAccountSettings(): Request[UpdateAccountSettingsOutput, AWSError] = js.native
  def updateAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsOutput, Unit]): Request[UpdateAccountSettingsOutput, AWSError] = js.native
  /**
    * Turns on or turns off optional features in Resource Groups. The preceding example shows that the request to turn on group lifecycle events is IN_PROGRESS. You can call the GetAccountSettings operation to check for completion by looking for GroupLifecycleEventsStatus to change to ACTIVE.
    */
  def updateAccountSettings(params: UpdateAccountSettingsInput): Request[UpdateAccountSettingsOutput, AWSError] = js.native
  def updateAccountSettings(
    params: UpdateAccountSettingsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsOutput, Unit]
  ): Request[UpdateAccountSettingsOutput, AWSError] = js.native
  
  /**
    * Updates the description for an existing group. You cannot update the name of a resource group.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:UpdateGroup   
    */
  def updateGroup(): Request[UpdateGroupOutput, AWSError] = js.native
  def updateGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupOutput, Unit]): Request[UpdateGroupOutput, AWSError] = js.native
  /**
    * Updates the description for an existing group. You cannot update the name of a resource group.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:UpdateGroup   
    */
  def updateGroup(params: UpdateGroupInput): Request[UpdateGroupOutput, AWSError] = js.native
  def updateGroup(
    params: UpdateGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupOutput, Unit]
  ): Request[UpdateGroupOutput, AWSError] = js.native
  
  /**
    * Updates the resource query of a group. For more information about resource queries, see Create a tag-based group in Resource Groups.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:UpdateGroupQuery   
    */
  def updateGroupQuery(): Request[UpdateGroupQueryOutput, AWSError] = js.native
  def updateGroupQuery(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupQueryOutput, Unit]): Request[UpdateGroupQueryOutput, AWSError] = js.native
  /**
    * Updates the resource query of a group. For more information about resource queries, see Create a tag-based group in Resource Groups.  Minimum permissions  To run this command, you must have the following permissions:    resource-groups:UpdateGroupQuery   
    */
  def updateGroupQuery(params: UpdateGroupQueryInput): Request[UpdateGroupQueryOutput, AWSError] = js.native
  def updateGroupQuery(
    params: UpdateGroupQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupQueryOutput, Unit]
  ): Request[UpdateGroupQueryOutput, AWSError] = js.native
}
