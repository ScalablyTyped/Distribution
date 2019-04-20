package typings
package awsDashSdkLib.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroups
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ResourceGroups: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a group with a specified name, description, and resource query.
    */
  def createGroup(): awsDashSdkLib.libRequestMod.Request[CreateGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a group with a specified name, description, and resource query.
    */
  def createGroup(params: CreateGroupInput): awsDashSdkLib.libRequestMod.Request[CreateGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroup(
    params: CreateGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the group; it only deletes the group structure.
    */
  def deleteGroup(): awsDashSdkLib.libRequestMod.Request[DeleteGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the group; it only deletes the group structure.
    */
  def deleteGroup(params: DeleteGroupInput): awsDashSdkLib.libRequestMod.Request[DeleteGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specified resource group.
    */
  def getGroup(): awsDashSdkLib.libRequestMod.Request[GetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetGroupOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a specified resource group.
    */
  def getGroup(params: GetGroupInput): awsDashSdkLib.libRequestMod.Request[GetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroup(
    params: GetGroupInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetGroupOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the resource query associated with the specified resource group.
    */
  def getGroupQuery(): awsDashSdkLib.libRequestMod.Request[GetGroupQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroupQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the resource query associated with the specified resource group.
    */
  def getGroupQuery(params: GetGroupQueryInput): awsDashSdkLib.libRequestMod.Request[GetGroupQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroupQuery(
    params: GetGroupQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of tags that are associated with a resource group, specified by an ARN.
    */
  def getTags(): awsDashSdkLib.libRequestMod.Request[GetTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of tags that are associated with a resource group, specified by an ARN.
    */
  def getTags(params: GetTagsInput): awsDashSdkLib.libRequestMod.Request[GetTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTags(
    params: GetTagsInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTagsOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of ARNs of resources that are members of a specified resource group.
    */
  def listGroupResources(): awsDashSdkLib.libRequestMod.Request[ListGroupResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroupResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of ARNs of resources that are members of a specified resource group.
    */
  def listGroupResources(params: ListGroupResourcesInput): awsDashSdkLib.libRequestMod.Request[ListGroupResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroupResources(
    params: ListGroupResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of existing resource groups in your account.
    */
  def listGroups(): awsDashSdkLib.libRequestMod.Request[ListGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of existing resource groups in your account.
    */
  def listGroups(params: ListGroupsInput): awsDashSdkLib.libRequestMod.Request[ListGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroups(
    params: ListGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a resource query in a CreateGroup or UpdateGroupQuery operation.
    */
  def searchResources(): awsDashSdkLib.libRequestMod.Request[SearchResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a resource query in a CreateGroup or UpdateGroupQuery operation.
    */
  def searchResources(params: SearchResourcesInput): awsDashSdkLib.libRequestMod.Request[SearchResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchResources(
    params: SearchResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they are not specified in the request parameters.
    */
  def tag(): awsDashSdkLib.libRequestMod.Request[TagOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tag(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[TagOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they are not specified in the request parameters.
    */
  def tag(params: TagInput): awsDashSdkLib.libRequestMod.Request[TagOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tag(
    params: TagInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[TagOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes specified tags from a specified resource.
    */
  def untag(): awsDashSdkLib.libRequestMod.Request[UntagOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untag(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UntagOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UntagOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes specified tags from a specified resource.
    */
  def untag(params: UntagInput): awsDashSdkLib.libRequestMod.Request[UntagOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untag(
    params: UntagInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ UntagOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[UntagOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing group with a new or changed description. You cannot update the name of a resource group.
    */
  def updateGroup(): awsDashSdkLib.libRequestMod.Request[UpdateGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing group with a new or changed description. You cannot update the name of a resource group.
    */
  def updateGroup(params: UpdateGroupInput): awsDashSdkLib.libRequestMod.Request[UpdateGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroup(
    params: UpdateGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the resource query of a group.
    */
  def updateGroupQuery(): awsDashSdkLib.libRequestMod.Request[UpdateGroupQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroupQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the resource query of a group.
    */
  def updateGroupQuery(params: UpdateGroupQueryInput): awsDashSdkLib.libRequestMod.Request[UpdateGroupQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroupQuery(
    params: UpdateGroupQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

