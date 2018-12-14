package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/resourcegroupstaggingapi", "ResourceGroupsTaggingAPI")
@js.native
object ResourceGroupsTaggingAPINs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait FailedResourcesMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[FailureInfo]
  
  
  trait FailureInfo extends js.Object {
    /**
         * The code of the common error. Valid values include InternalServiceException, InvalidParameterException, and any valid error code returned by the AWS service that hosts the resource that you want to tag.
         */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
         * The message of the common error.
         */
    var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
    /**
         * The HTTP status code of the common error.
         */
    var StatusCode: js.UndefOr[StatusCode] = js.undefined
  }
  
  
  trait GetResourcesInput extends js.Object {
    /**
         * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
         */
    var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The constraints on the resources that you want returned. The format of each resource type is service[:resourceType]. For example, specifying a resource type of ec2 returns all tagged Amazon EC2 resources (which includes tagged EC2 instances). Specifying a resource type of ec2:instance returns only EC2 instances.  The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource Name (ARN). Consult the AWS General Reference for the following:   For a list of service name strings, see AWS Service Namespaces.   For resource type strings, see Example ARNs.   For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.  
         */
    var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.undefined
    /**
         * A limit that restricts the number of resources returned by GetResources in paginated output. You can set ResourcesPerPage to a minimum of 1 item and the maximum of 50 items. 
         */
    var ResourcesPerPage: js.UndefOr[ResourcesPerPage] = js.undefined
    /**
         * A list of tags (keys and values). A request can include up to 50 keys, and each key can include up to 20 values. If you specify multiple filters connected by an AND operator in a single request, the response returns only those resources that are associated with every specified filter. If you specify multiple filters connected by an OR operator in a single request, the response returns all resources that are associated with at least one or possibly more of the specified filters.
         */
    var TagFilters: js.UndefOr[TagFilterList] = js.undefined
    /**
         * A limit that restricts the number of tags (key and value pairs) returned by GetResources in paginated output. A resource with no tags is counted as having one tag (one key and value pair).  GetResources does not split a resource and its associated tags across pages. If the specified TagsPerPage would cause such a break, a PaginationToken is returned in place of the affected resource and its tags. Use that token in another request to get the remaining data. For example, if you specify a TagsPerPage of 100 and the account has 22 resources with 10 tags each (meaning that each resource has 10 key and value pairs), the output will consist of 3 pages, with the first page displaying the first 10 resources, each with its 10 tags, the second page displaying the next 10 resources each with its 10 tags, and the third page displaying the remaining 2 resources, each with its 10 tags.  You can set TagsPerPage to a minimum of 100 items and the maximum of 500 items.
         */
    var TagsPerPage: js.UndefOr[TagsPerPage] = js.undefined
  }
  
  
  trait GetResourcesOutput extends js.Object {
    /**
         * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
         */
    var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * A list of resource ARNs and the tags (keys and values) associated with each.
         */
    var ResourceTagMappingList: js.UndefOr[ResourceTagMappingList] = js.undefined
  }
  
  
  trait GetTagKeysInput extends js.Object {
    /**
         * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
         */
    var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait GetTagKeysOutput extends js.Object {
    /**
         * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
         */
    var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * A list of all tag keys in the AWS account.
         */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
  }
  
  
  trait GetTagValuesInput extends js.Object {
    /**
         * The key for which you want to list all existing values in the specified region for the AWS account.
         */
    var Key: TagKey
    /**
         * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
         */
    var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait GetTagValuesOutput extends js.Object {
    /**
         * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
         */
    var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * A list of all tag values for the specified key in the AWS account.
         */
    var TagValues: js.UndefOr[TagValuesOutputList] = js.undefined
  }
  
  
  trait ResourceTagMapping extends js.Object {
    /**
         * An array of resource ARN(s).
         */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
         * The tags that have been applied to one or more AWS resources.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait Tag extends js.Object {
    /**
         * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values.
         */
    var Key: TagKey
    /**
         * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
         */
    var Value: TagValue
  }
  
  
  trait TagFilter extends js.Object {
    /**
         * One part of a key-value pair that make up a tag. A key is a general label that acts like a category for more specific tag values.
         */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
         * The optional part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key).
         */
    var Values: js.UndefOr[TagValueList] = js.undefined
  }
  
  
  trait TagMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
  
  trait TagResourcesInput extends js.Object {
    /**
         * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and a maximum of 20 ARNs (resources) to tag. An ARN can be set to a maximum of 1600 characters. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
         */
    var ResourceARNList: ResourceARNList
    /**
         * The tags that you want to add to the specified resources. A tag consists of a key and a value that you define.
         */
    var Tags: TagMap
  }
  
  
  trait TagResourcesOutput extends js.Object {
    /**
         * Details of resources that could not be tagged. An error code, status code, and error message are returned for each failed item.
         */
    var FailedResourcesMap: js.UndefOr[FailedResourcesMap] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Returns all the tagged resources that are associated with the specified tags (keys and values) located in the specified region for the AWS account. The tags and the resource types that you specify in the request are known as filters. The response includes all tags that are associated with the requested resources. If no filter is provided, this action returns a paginated resource list with the associated tags.
       */
    def getResources(): awsDashSdkLib.libRequestMod.Request[GetResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all the tagged resources that are associated with the specified tags (keys and values) located in the specified region for the AWS account. The tags and the resource types that you specify in the request are known as filters. The response includes all tags that are associated with the requested resources. If no filter is provided, this action returns a paginated resource list with the associated tags.
       */
    def getResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all the tagged resources that are associated with the specified tags (keys and values) located in the specified region for the AWS account. The tags and the resource types that you specify in the request are known as filters. The response includes all tags that are associated with the requested resources. If no filter is provided, this action returns a paginated resource list with the associated tags.
       */
    def getResources(params: GetResourcesInput): awsDashSdkLib.libRequestMod.Request[GetResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all the tagged resources that are associated with the specified tags (keys and values) located in the specified region for the AWS account. The tags and the resource types that you specify in the request are known as filters. The response includes all tags that are associated with the requested resources. If no filter is provided, this action returns a paginated resource list with the associated tags.
       */
    def getResources(
      params: GetResourcesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tag keys in the specified region for the AWS account.
       */
    def getTagKeys(): awsDashSdkLib.libRequestMod.Request[GetTagKeysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tag keys in the specified region for the AWS account.
       */
    def getTagKeys(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTagKeysOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTagKeysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tag keys in the specified region for the AWS account.
       */
    def getTagKeys(params: GetTagKeysInput): awsDashSdkLib.libRequestMod.Request[GetTagKeysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tag keys in the specified region for the AWS account.
       */
    def getTagKeys(
      params: GetTagKeysInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTagKeysOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTagKeysOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tag values for the specified key in the specified region for the AWS account.
       */
    def getTagValues(): awsDashSdkLib.libRequestMod.Request[GetTagValuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tag values for the specified key in the specified region for the AWS account.
       */
    def getTagValues(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTagValuesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTagValuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tag values for the specified key in the specified region for the AWS account.
       */
    def getTagValues(params: GetTagValuesInput): awsDashSdkLib.libRequestMod.Request[GetTagValuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all tag values for the specified key in the specified region for the AWS account.
       */
    def getTagValues(
      params: GetTagValuesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTagValuesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTagValuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the AWS Resource Groups and Tag Editor User Guide.   Each resource can have up to 50 tags. For other limits, see Tag Restrictions in the Amazon EC2 User Guide for Linux Instances.   You can only tag resources that are located in the specified region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.  
       */
    def tagResources(): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the AWS Resource Groups and Tag Editor User Guide.   Each resource can have up to 50 tags. For other limits, see Tag Restrictions in the Amazon EC2 User Guide for Linux Instances.   You can only tag resources that are located in the specified region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.  
       */
    def tagResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the AWS Resource Groups and Tag Editor User Guide.   Each resource can have up to 50 tags. For other limits, see Tag Restrictions in the Amazon EC2 User Guide for Linux Instances.   You can only tag resources that are located in the specified region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.  
       */
    def tagResources(params: TagResourcesInput): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the AWS Resource Groups and Tag Editor User Guide.   Each resource can have up to 50 tags. For other limits, see Tag Restrictions in the Amazon EC2 User Guide for Linux Instances.   You can only tag resources that are located in the specified region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.  
       */
    def tagResources(
      params: TagResourcesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.   You can only tag resources that are located in the specified region for the AWS account.  
       */
    def untagResources(): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.   You can only tag resources that are located in the specified region for the AWS account.  
       */
    def untagResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.   You can only tag resources that are located in the specified region for the AWS account.  
       */
    def untagResources(params: UntagResourcesInput): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.   You can only tag resources that are located in the specified region for the AWS account.  
       */
    def untagResources(
      params: UntagResourcesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UntagResourcesInput extends js.Object {
    /**
         * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
         */
    var ResourceARNList: ResourceARNList
    /**
         * A list of the tag keys that you want to remove from the specified resources.
         */
    var TagKeys: TagKeyListForUntag
  }
  
  
  trait UntagResourcesOutput extends js.Object {
    /**
         * Details of resources that could not be untagged. An error code, status code, and error message are returned for each failed item.
         */
    var FailedResourcesMap: js.UndefOr[FailedResourcesMap] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AmazonResourceType = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ErrorCode = awsDashSdkLib.awsDashSdkLibStrings.InternalServiceException | awsDashSdkLib.awsDashSdkLibStrings.InvalidParameterException | java.lang.String
  type ErrorMessage = java.lang.String
  type PaginationToken = java.lang.String
  type ResourceARN = java.lang.String
  type ResourceARNList = js.Array[ResourceARN]
  type ResourceTagMappingList = js.Array[ResourceTagMapping]
  type ResourceTypeFilterList = js.Array[AmazonResourceType]
  type ResourcesPerPage = scala.Double
  type StatusCode = scala.Double
  type TagFilterList = js.Array[TagFilter]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagKeyListForUntag = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TagValueList = js.Array[TagValue]
  type TagValuesOutputList = js.Array[TagValue]
  type TagsPerPage = scala.Double
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-01-26` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

