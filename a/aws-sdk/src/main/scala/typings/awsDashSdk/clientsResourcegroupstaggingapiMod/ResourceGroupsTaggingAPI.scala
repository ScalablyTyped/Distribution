package typings.awsDashSdk.clientsResourcegroupstaggingapiMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupsTaggingAPI extends Service {
  @JSName("config")
  var config_ResourceGroupsTaggingAPI: ConfigBase with ClientConfiguration = js.native
  /**
    * Returns all the tagged or previously tagged resources that are located in the specified region for the AWS account. You can optionally specify filters (tags and resource types) in your request, depending on what information you want returned. The response includes all tags that are associated with the requested resources.  You can check the PaginationToken response parameter to determine if a query completed. Queries can occasionally return fewer results on a page than allowed. The PaginationToken response parameter value is null only when there are no more results to display.  
    */
  def getResources(): Request[GetResourcesOutput, AWSError] = js.native
  def getResources(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcesOutput, Unit]): Request[GetResourcesOutput, AWSError] = js.native
  /**
    * Returns all the tagged or previously tagged resources that are located in the specified region for the AWS account. You can optionally specify filters (tags and resource types) in your request, depending on what information you want returned. The response includes all tags that are associated with the requested resources.  You can check the PaginationToken response parameter to determine if a query completed. Queries can occasionally return fewer results on a page than allowed. The PaginationToken response parameter value is null only when there are no more results to display.  
    */
  def getResources(params: GetResourcesInput): Request[GetResourcesOutput, AWSError] = js.native
  def getResources(
    params: GetResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcesOutput, Unit]
  ): Request[GetResourcesOutput, AWSError] = js.native
  /**
    * Returns all tag keys in the specified region for the AWS account.
    */
  def getTagKeys(): Request[GetTagKeysOutput, AWSError] = js.native
  def getTagKeys(callback: js.Function2[/* err */ AWSError, /* data */ GetTagKeysOutput, Unit]): Request[GetTagKeysOutput, AWSError] = js.native
  /**
    * Returns all tag keys in the specified region for the AWS account.
    */
  def getTagKeys(params: GetTagKeysInput): Request[GetTagKeysOutput, AWSError] = js.native
  def getTagKeys(
    params: GetTagKeysInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTagKeysOutput, Unit]
  ): Request[GetTagKeysOutput, AWSError] = js.native
  /**
    * Returns all tag values for the specified key in the specified region for the AWS account.
    */
  def getTagValues(): Request[GetTagValuesOutput, AWSError] = js.native
  def getTagValues(callback: js.Function2[/* err */ AWSError, /* data */ GetTagValuesOutput, Unit]): Request[GetTagValuesOutput, AWSError] = js.native
  /**
    * Returns all tag values for the specified key in the specified region for the AWS account.
    */
  def getTagValues(params: GetTagValuesInput): Request[GetTagValuesOutput, AWSError] = js.native
  def getTagValues(
    params: GetTagValuesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTagValuesOutput, Unit]
  ): Request[GetTagValuesOutput, AWSError] = js.native
  /**
    * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the AWS Resource Groups User Guide.   Each resource can have up to 50 tags. For other limits, see Tag Restrictions in the Amazon EC2 User Guide for Linux Instances.   You can only tag resources that are located in the specified region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups User Guide.  
    */
  def tagResources(): Request[TagResourcesOutput, AWSError] = js.native
  def tagResources(callback: js.Function2[/* err */ AWSError, /* data */ TagResourcesOutput, Unit]): Request[TagResourcesOutput, AWSError] = js.native
  /**
    * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the AWS Resource Groups User Guide.   Each resource can have up to 50 tags. For other limits, see Tag Restrictions in the Amazon EC2 User Guide for Linux Instances.   You can only tag resources that are located in the specified region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups User Guide.  
    */
  def tagResources(params: TagResourcesInput): Request[TagResourcesOutput, AWSError] = js.native
  def tagResources(
    params: TagResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourcesOutput, Unit]
  ): Request[TagResourcesOutput, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups User Guide.   You can only tag resources that are located in the specified region for the AWS account.  
    */
  def untagResources(): Request[UntagResourcesOutput, AWSError] = js.native
  def untagResources(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourcesOutput, Unit]): Request[UntagResourcesOutput, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups User Guide.   You can only tag resources that are located in the specified region for the AWS account.  
    */
  def untagResources(params: UntagResourcesInput): Request[UntagResourcesOutput, AWSError] = js.native
  def untagResources(
    params: UntagResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourcesOutput, Unit]
  ): Request[UntagResourcesOutput, AWSError] = js.native
}

