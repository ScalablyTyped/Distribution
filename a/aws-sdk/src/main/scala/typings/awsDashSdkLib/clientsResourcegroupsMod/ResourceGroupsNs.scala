package typings
package awsDashSdkLib.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/resourcegroups", "ResourceGroups")
@js.native
object ResourceGroupsNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateGroupInput extends js.Object {
    /**
      * The description of the resource group. Descriptions can have a maximum of 511 characters, including letters, numbers, hyphens, underscores, punctuation, and spaces.
      */
    var Description: js.UndefOr[GroupDescription] = js.undefined
    /**
      * The name of the group, which is the identifier of the group in other operations. A resource group name cannot be updated after it is created. A resource group name can have a maximum of 128 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with AWS or aws; these are reserved. A resource group name must be unique within your account.
      */
    var Name: GroupName
    /**
      * The resource query that determines which AWS resources are members of this group.
      */
    var ResourceQuery: ResourceQuery
    /**
      * The tags to add to the group. A tag is a string-to-string map of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait CreateGroupOutput extends js.Object {
    /**
      * A full description of the resource group after it is created.
      */
    var Group: js.UndefOr[Group] = js.undefined
    /**
      * The resource query associated with the group.
      */
    var ResourceQuery: js.UndefOr[ResourceQuery] = js.undefined
    /**
      * The tags associated with the group.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait DeleteGroupInput extends js.Object {
    /**
      * The name of the resource group to delete.
      */
    var GroupName: GroupName
  }
  
  trait DeleteGroupOutput extends js.Object {
    /**
      * A full description of the deleted resource group.
      */
    var Group: js.UndefOr[Group] = js.undefined
  }
  
  trait GetGroupInput extends js.Object {
    /**
      * The name of the resource group.
      */
    var GroupName: GroupName
  }
  
  trait GetGroupOutput extends js.Object {
    /**
      * A full description of the resource group.
      */
    var Group: js.UndefOr[Group] = js.undefined
  }
  
  trait GetGroupQueryInput extends js.Object {
    /**
      * The name of the resource group.
      */
    var GroupName: GroupName
  }
  
  trait GetGroupQueryOutput extends js.Object {
    /**
      * The resource query associated with the specified group.
      */
    var GroupQuery: js.UndefOr[GroupQuery] = js.undefined
  }
  
  trait GetTagsInput extends js.Object {
    /**
      * The ARN of the resource for which you want a list of tags. The resource must exist within the account you are using.
      */
    var Arn: GroupArn
  }
  
  trait GetTagsOutput extends js.Object {
    /**
      * The ARN of the tagged resource.
      */
    var Arn: js.UndefOr[GroupArn] = js.undefined
    /**
      * The tags associated with the specified resource.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait Group extends js.Object {
    /**
      * The description of the resource group.
      */
    var Description: js.UndefOr[GroupDescription] = js.undefined
    /**
      * The ARN of a resource group.
      */
    var GroupArn: GroupArn
    /**
      * The name of a resource group.
      */
    var Name: GroupName
  }
  
  trait GroupFilter extends js.Object {
    /**
      * The name of the filter. Filter names are case-sensitive.
      */
    var Name: GroupFilterName
    /**
      * One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
      */
    var Values: GroupFilterValues
  }
  
  trait GroupIdentifier extends js.Object {
    /**
      * The ARN of a resource group.
      */
    var GroupArn: js.UndefOr[GroupArn] = js.undefined
    /**
      * The name of a resource group.
      */
    var GroupName: js.UndefOr[GroupName] = js.undefined
  }
  
  trait GroupQuery extends js.Object {
    /**
      * The name of a resource group that is associated with a specific resource query.
      */
    var GroupName: GroupName
    /**
      * The resource query which determines which AWS resources are members of the associated resource group.
      */
    var ResourceQuery: ResourceQuery
  }
  
  trait ListGroupResourcesInput extends js.Object {
    /**
      * Filters, formatted as ResourceFilter objects, that you want to apply to a ListGroupResources operation.    resource-type - Filter resources by their type. Specify up to five resource types in the format AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.  
      */
    var Filters: js.UndefOr[ResourceFilterList] = js.undefined
    /**
      * The name of the resource group.
      */
    var GroupName: GroupName
    /**
      * The maximum number of group member ARNs that are returned in a single call by ListGroupResources, in paginated output. By default, this number is 50.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The NextToken value that is returned in a paginated ListGroupResources request. To get the next page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListGroupResourcesOutput extends js.Object {
    /**
      * The NextToken value to include in a subsequent ListGroupResources request, to get more results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of QueryError objects. Each error is an object that contains ErrorCode and Message structures. Possible values for ErrorCode are CLOUDFORMATION_STACK_INACTIVE and CLOUDFORMATION_STACK_NOT_EXISTING.
      */
    var QueryErrors: js.UndefOr[QueryErrorList] = js.undefined
    /**
      * The ARNs and resource types of resources that are members of the group that you specified.
      */
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
  }
  
  trait ListGroupsInput extends js.Object {
    /**
      * Filters, formatted as GroupFilter objects, that you want to apply to a ListGroups operation.    resource-type - Filter groups by resource type. Specify up to five resource types in the format AWS::ServiceCode::ResourceType. For example, AWS::EC2::Instance, or AWS::S3::Bucket.  
      */
    var Filters: js.UndefOr[GroupFilterList] = js.undefined
    /**
      * The maximum number of resource group results that are returned by ListGroups in paginated output. By default, this number is 50.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The NextToken value that is returned in a paginated ListGroups request. To get the next page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListGroupsOutput extends js.Object {
    /**
      * A list of GroupIdentifier objects. Each identifier is an object that contains both the GroupName and the GroupArn.
      */
    var GroupIdentifiers: js.UndefOr[GroupIdentifierList] = js.undefined
    /**
      * A list of resource groups.
      */
    var Groups: js.UndefOr[GroupList] = js.undefined
    /**
      * The NextToken value to include in a subsequent ListGroups request, to get more results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait QueryError extends js.Object {
    /**
      * Possible values are CLOUDFORMATION_STACK_INACTIVE and CLOUDFORMATION_STACK_NOT_EXISTING.
      */
    var ErrorCode: js.UndefOr[QueryErrorCode] = js.undefined
    /**
      * A message that explains the ErrorCode value. Messages might state that the specified CloudFormation stack does not exist (or no longer exists). For CLOUDFORMATION_STACK_INACTIVE, the message typically states that the CloudFormation stack has a status that is not (or no longer) active, such as CREATE_FAILED.
      */
    var Message: js.UndefOr[QueryErrorMessage] = js.undefined
  }
  
  trait ResourceFilter extends js.Object {
    /**
      * The name of the filter. Filter names are case-sensitive.
      */
    var Name: ResourceFilterName
    /**
      * One or more filter values. Allowed filter values vary by resource filter name, and are case-sensitive.
      */
    var Values: ResourceFilterValues
  }
  
  trait ResourceIdentifier extends js.Object {
    /**
      * The ARN of a resource.
      */
    var ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    /**
      * The resource type of a resource, such as AWS::EC2::Instance.
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  trait ResourceQuery extends js.Object {
    /**
      * The query that defines a group or a search.
      */
    var Query: Query
    /**
      * The type of the query. The valid values in this release are TAG_FILTERS_1_0 and CLOUDFORMATION_STACK_1_0.   TAG_FILTERS_1_0:  A JSON syntax that lets you specify a collection of simple tag filters for resource types and tags, as supported by the AWS Tagging API GetResources operation. If you specify more than one tag key, only resources that match all tag keys, and at least one value of each specified tag key, are returned in your query. If you specify more than one value for a tag key, a resource matches the filter if it has a tag key value that matches any of the specified values. For example, consider the following sample query for resources that have two tags, Stage and Version, with two values each. ([{"Key":"Stage","Values":["Test","Deploy"]},{"Key":"Version","Values":["1","2"]}]) The results of this query might include the following.   An EC2 instance that has the following two tags: {"Key":"Stage","Values":["Deploy"]}, and {"Key":"Version","Values":["2"]}    An S3 bucket that has the following two tags: {"Key":"Stage","Values":["Test","Deploy"]}, and {"Key":"Version","Values":["1"]}   The query would not return the following results, however. The following EC2 instance does not have all tag keys specified in the filter, so it is rejected. The RDS database has all of the tag keys, but no values that match at least one of the specified tag key values in the filter.   An EC2 instance that has only the following tag: {"Key":"Stage","Values":["Deploy"]}.   An RDS database that has the following two tags: {"Key":"Stage","Values":["Archived"]}, and {"Key":"Version","Values":["4"]}      CLOUDFORMATION_STACK_1_0:  A JSON syntax that lets you specify a CloudFormation stack ARN.
      */
    var Type: QueryType
  }
  
  trait SearchResourcesInput extends js.Object {
    /**
      * The maximum number of group member ARNs returned by SearchResources in paginated output. By default, this number is 50.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The NextToken value that is returned in a paginated SearchResources request. To get the next page of results, run the call again, add the NextToken parameter, and specify the NextToken value.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The search query, using the same formats that are supported for resource group definition.
      */
    var ResourceQuery: ResourceQuery
  }
  
  trait SearchResourcesOutput extends js.Object {
    /**
      * The NextToken value to include in a subsequent SearchResources request, to get more results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of QueryError objects. Each error is an object that contains ErrorCode and Message structures. Possible values for ErrorCode are CLOUDFORMATION_STACK_INACTIVE and CLOUDFORMATION_STACK_NOT_EXISTING.
      */
    var QueryErrors: js.UndefOr[QueryErrorList] = js.undefined
    /**
      * The ARNs and resource types of resources that are members of the group that you specified.
      */
    var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
  }
  
  trait TagInput extends js.Object {
    /**
      * The ARN of the resource to which to add tags.
      */
    var Arn: GroupArn
    /**
      * The tags to add to the specified resource. A tag is a string-to-string map of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
      */
    var Tags: Tags
  }
  
  trait TagOutput extends js.Object {
    /**
      * The ARN of the tagged resource.
      */
    var Arn: js.UndefOr[GroupArn] = js.undefined
    /**
      * The tags that have been added to the specified resource.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait Tags
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
      * Returns a list of tags that are associated with a resource, specified by an ARN.
      */
    def getTags(): awsDashSdkLib.libRequestMod.Request[GetTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of tags that are associated with a resource, specified by an ARN.
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
      * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are not specified in the request parameters.
      */
    def tag(): awsDashSdkLib.libRequestMod.Request[TagOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tag(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ TagOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[TagOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are not specified in the request parameters.
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
  
  trait UntagInput extends js.Object {
    /**
      * The ARN of the resource from which to remove tags.
      */
    var Arn: GroupArn
    /**
      * The keys of the tags to be removed.
      */
    var Keys: TagKeyList
  }
  
  trait UntagOutput extends js.Object {
    /**
      * The ARN of the resource from which tags have been removed.
      */
    var Arn: js.UndefOr[GroupArn] = js.undefined
    /**
      * The keys of tags that have been removed.
      */
    var Keys: js.UndefOr[TagKeyList] = js.undefined
  }
  
  trait UpdateGroupInput extends js.Object {
    /**
      * The description of the resource group. Descriptions can have a maximum of 511 characters, including letters, numbers, hyphens, underscores, punctuation, and spaces.
      */
    var Description: js.UndefOr[GroupDescription] = js.undefined
    /**
      * The name of the resource group for which you want to update its description.
      */
    var GroupName: GroupName
  }
  
  trait UpdateGroupOutput extends js.Object {
    /**
      * The full description of the resource group after it has been updated.
      */
    var Group: js.UndefOr[Group] = js.undefined
  }
  
  trait UpdateGroupQueryInput extends js.Object {
    /**
      * The name of the resource group for which you want to edit the query.
      */
    var GroupName: GroupName
    /**
      * The resource query that determines which AWS resources are members of the resource group.
      */
    var ResourceQuery: ResourceQuery
  }
  
  trait UpdateGroupQueryOutput extends js.Object {
    /**
      * The resource query associated with the resource group after the update.
      */
    var GroupQuery: js.UndefOr[GroupQuery] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type GroupArn = java.lang.String
  type GroupDescription = java.lang.String
  type GroupFilterList = js.Array[GroupFilter]
  type GroupFilterName = awsDashSdkLib.awsDashSdkLibStrings.`resource-type` | java.lang.String
  type GroupFilterValue = java.lang.String
  type GroupFilterValues = js.Array[GroupFilterValue]
  type GroupIdentifierList = js.Array[GroupIdentifier]
  type GroupList = js.Array[Group]
  type GroupName = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type Query = java.lang.String
  type QueryErrorCode = awsDashSdkLib.awsDashSdkLibStrings.CLOUDFORMATION_STACK_INACTIVE | awsDashSdkLib.awsDashSdkLibStrings.CLOUDFORMATION_STACK_NOT_EXISTING | java.lang.String
  type QueryErrorList = js.Array[QueryError]
  type QueryErrorMessage = java.lang.String
  type QueryType = awsDashSdkLib.awsDashSdkLibStrings.TAG_FILTERS_1_0 | awsDashSdkLib.awsDashSdkLibStrings.CLOUDFORMATION_STACK_1_0 | java.lang.String
  type ResourceArn = java.lang.String
  type ResourceFilterList = js.Array[ResourceFilter]
  type ResourceFilterName = awsDashSdkLib.awsDashSdkLibStrings.`resource-type` | java.lang.String
  type ResourceFilterValue = java.lang.String
  type ResourceFilterValues = js.Array[ResourceFilterValue]
  type ResourceIdentifierList = js.Array[ResourceIdentifier]
  type ResourceType = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagValue = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-11-27` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

