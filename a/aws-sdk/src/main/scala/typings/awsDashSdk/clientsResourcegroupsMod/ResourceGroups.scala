package typings.awsDashSdk.clientsResourcegroupsMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroups extends Service {
  @JSName("config")
  var config_ResourceGroups: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a group with a specified name, description, and resource query.
    */
  def createGroup(): Request[CreateGroupOutput, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupOutput, Unit]): Request[CreateGroupOutput, AWSError] = js.native
  /**
    * Creates a group with a specified name, description, and resource query.
    */
  def createGroup(params: CreateGroupInput): Request[CreateGroupOutput, AWSError] = js.native
  def createGroup(
    params: CreateGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupOutput, Unit]
  ): Request[CreateGroupOutput, AWSError] = js.native
  /**
    * Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the group; it only deletes the group structure.
    */
  def deleteGroup(): Request[DeleteGroupOutput, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupOutput, Unit]): Request[DeleteGroupOutput, AWSError] = js.native
  /**
    * Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the group; it only deletes the group structure.
    */
  def deleteGroup(params: DeleteGroupInput): Request[DeleteGroupOutput, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupOutput, Unit]
  ): Request[DeleteGroupOutput, AWSError] = js.native
  /**
    * Returns information about a specified resource group.
    */
  def getGroup(): Request[GetGroupOutput, AWSError] = js.native
  def getGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupOutput, Unit]): Request[GetGroupOutput, AWSError] = js.native
  /**
    * Returns information about a specified resource group.
    */
  def getGroup(params: GetGroupInput): Request[GetGroupOutput, AWSError] = js.native
  def getGroup(params: GetGroupInput, callback: js.Function2[/* err */ AWSError, /* data */ GetGroupOutput, Unit]): Request[GetGroupOutput, AWSError] = js.native
  /**
    * Returns the resource query associated with the specified resource group.
    */
  def getGroupQuery(): Request[GetGroupQueryOutput, AWSError] = js.native
  def getGroupQuery(callback: js.Function2[/* err */ AWSError, /* data */ GetGroupQueryOutput, Unit]): Request[GetGroupQueryOutput, AWSError] = js.native
  /**
    * Returns the resource query associated with the specified resource group.
    */
  def getGroupQuery(params: GetGroupQueryInput): Request[GetGroupQueryOutput, AWSError] = js.native
  def getGroupQuery(
    params: GetGroupQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGroupQueryOutput, Unit]
  ): Request[GetGroupQueryOutput, AWSError] = js.native
  /**
    * Returns a list of tags that are associated with a resource group, specified by an ARN.
    */
  def getTags(): Request[GetTagsOutput, AWSError] = js.native
  def getTags(callback: js.Function2[/* err */ AWSError, /* data */ GetTagsOutput, Unit]): Request[GetTagsOutput, AWSError] = js.native
  /**
    * Returns a list of tags that are associated with a resource group, specified by an ARN.
    */
  def getTags(params: GetTagsInput): Request[GetTagsOutput, AWSError] = js.native
  def getTags(params: GetTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ GetTagsOutput, Unit]): Request[GetTagsOutput, AWSError] = js.native
  /**
    * Returns a list of ARNs of resources that are members of a specified resource group.
    */
  def listGroupResources(): Request[ListGroupResourcesOutput, AWSError] = js.native
  def listGroupResources(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupResourcesOutput, Unit]): Request[ListGroupResourcesOutput, AWSError] = js.native
  /**
    * Returns a list of ARNs of resources that are members of a specified resource group.
    */
  def listGroupResources(params: ListGroupResourcesInput): Request[ListGroupResourcesOutput, AWSError] = js.native
  def listGroupResources(
    params: ListGroupResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupResourcesOutput, Unit]
  ): Request[ListGroupResourcesOutput, AWSError] = js.native
  /**
    * Returns a list of existing resource groups in your account.
    */
  def listGroups(): Request[ListGroupsOutput, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsOutput, Unit]): Request[ListGroupsOutput, AWSError] = js.native
  /**
    * Returns a list of existing resource groups in your account.
    */
  def listGroups(params: ListGroupsInput): Request[ListGroupsOutput, AWSError] = js.native
  def listGroups(
    params: ListGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsOutput, Unit]
  ): Request[ListGroupsOutput, AWSError] = js.native
  /**
    * Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a resource query in a CreateGroup or UpdateGroupQuery operation.
    */
  def searchResources(): Request[SearchResourcesOutput, AWSError] = js.native
  def searchResources(callback: js.Function2[/* err */ AWSError, /* data */ SearchResourcesOutput, Unit]): Request[SearchResourcesOutput, AWSError] = js.native
  /**
    * Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a resource query in a CreateGroup or UpdateGroupQuery operation.
    */
  def searchResources(params: SearchResourcesInput): Request[SearchResourcesOutput, AWSError] = js.native
  def searchResources(
    params: SearchResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchResourcesOutput, Unit]
  ): Request[SearchResourcesOutput, AWSError] = js.native
  /**
    * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they are not specified in the request parameters.
    */
  def tag(): Request[TagOutput, AWSError] = js.native
  def tag(callback: js.Function2[/* err */ AWSError, /* data */ TagOutput, Unit]): Request[TagOutput, AWSError] = js.native
  /**
    * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they are not specified in the request parameters.
    */
  def tag(params: TagInput): Request[TagOutput, AWSError] = js.native
  def tag(params: TagInput, callback: js.Function2[/* err */ AWSError, /* data */ TagOutput, Unit]): Request[TagOutput, AWSError] = js.native
  /**
    * Deletes specified tags from a specified resource.
    */
  def untag(): Request[UntagOutput, AWSError] = js.native
  def untag(callback: js.Function2[/* err */ AWSError, /* data */ UntagOutput, Unit]): Request[UntagOutput, AWSError] = js.native
  /**
    * Deletes specified tags from a specified resource.
    */
  def untag(params: UntagInput): Request[UntagOutput, AWSError] = js.native
  def untag(params: UntagInput, callback: js.Function2[/* err */ AWSError, /* data */ UntagOutput, Unit]): Request[UntagOutput, AWSError] = js.native
  /**
    * Updates an existing group with a new or changed description. You cannot update the name of a resource group.
    */
  def updateGroup(): Request[UpdateGroupOutput, AWSError] = js.native
  def updateGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupOutput, Unit]): Request[UpdateGroupOutput, AWSError] = js.native
  /**
    * Updates an existing group with a new or changed description. You cannot update the name of a resource group.
    */
  def updateGroup(params: UpdateGroupInput): Request[UpdateGroupOutput, AWSError] = js.native
  def updateGroup(
    params: UpdateGroupInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupOutput, Unit]
  ): Request[UpdateGroupOutput, AWSError] = js.native
  /**
    * Updates the resource query of a group.
    */
  def updateGroupQuery(): Request[UpdateGroupQueryOutput, AWSError] = js.native
  def updateGroupQuery(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupQueryOutput, Unit]): Request[UpdateGroupQueryOutput, AWSError] = js.native
  /**
    * Updates the resource query of a group.
    */
  def updateGroupQuery(params: UpdateGroupQueryInput): Request[UpdateGroupQueryOutput, AWSError] = js.native
  def updateGroupQuery(
    params: UpdateGroupQueryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupQueryOutput, Unit]
  ): Request[UpdateGroupQueryOutput, AWSError] = js.native
}

