package typings
package awsDashSdkLib.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroups
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ResourceGroups: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ClientConfiguration = js.native
  /**
    * Creates a group with a specified name, description, and resource query.
    */
  def createGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.CreateGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.CreateGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.CreateGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a group with a specified name, description, and resource query.
    */
  def createGroup(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.CreateGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.CreateGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGroup(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.CreateGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.CreateGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.CreateGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the group; it only deletes the group structure.
    */
  def deleteGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.DeleteGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.DeleteGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.DeleteGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified resource group. Deleting a resource group does not delete resources that are members of the group; it only deletes the group structure.
    */
  def deleteGroup(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.DeleteGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.DeleteGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteGroup(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.DeleteGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.DeleteGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.DeleteGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specified resource group.
    */
  def getGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specified resource group.
    */
  def getGroup(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGroup(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the resource query associated with the specified resource group.
    */
  def getGroupQuery(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGroupQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the resource query associated with the specified resource group.
    */
  def getGroupQuery(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupQueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGroupQuery(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetGroupQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of tags that are associated with a resource, specified by an ARN.
    */
  def getTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of tags that are associated with a resource, specified by an ARN.
    */
  def getTags(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTags(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.GetTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of ARNs of resources that are members of a specified resource group.
    */
  def listGroupResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listGroupResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of ARNs of resources that are members of a specified resource group.
    */
  def listGroupResources(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupResourcesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listGroupResources(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing resource groups in your account.
    */
  def listGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing resource groups in your account.
    */
  def listGroups(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listGroups(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.ListGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a resource query in a CreateGroup or UpdateGroupQuery operation.
    */
  def searchResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.SearchResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.SearchResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.SearchResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of AWS resource identifiers that matches a specified query. The query uses the same format as a resource query in a CreateGroup or UpdateGroupQuery operation.
    */
  def searchResources(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.SearchResourcesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.SearchResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchResources(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.SearchResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.SearchResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.SearchResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they are not specified in the request parameters.
    */
  def tag(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.TagOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tag(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.TagOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.TagOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds tags to a resource group with the specified ARN. Existing tags on a resource group are not changed if they are not specified in the request parameters.
    */
  def tag(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.TagInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.TagOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tag(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.TagInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.TagOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.TagOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes specified tags from a specified resource.
    */
  def untag(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UntagOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untag(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UntagOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UntagOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes specified tags from a specified resource.
    */
  def untag(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UntagInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UntagOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untag(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UntagInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UntagOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UntagOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing group with a new or changed description. You cannot update the name of a resource group.
    */
  def updateGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing group with a new or changed description. You cannot update the name of a resource group.
    */
  def updateGroup(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGroup(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the resource query of a group.
    */
  def updateGroupQuery(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGroupQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the resource query of a group.
    */
  def updateGroupQuery(params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupQueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGroupQuery(
    params: awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupsMod.ResourceGroupsNs.UpdateGroupQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

