package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupsTaggingAPI
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ResourceGroupsTaggingAPI: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Returns all the tagged or previously tagged resources that are located in the specified region for the AWS account. You can optionally specify filters (tags and resource types) in your request, depending on what information you want returned. The response includes all tags that are associated with the requested resources.  You can check the PaginationToken response parameter to determine if a query completed. Queries can occasionally return fewer results on a page than allowed. The PaginationToken response parameter value is null only when there are no more results to display.  
    */
  def getResources(): awsDashSdkLib.libRequestMod.Request[GetResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns all the tagged or previously tagged resources that are located in the specified region for the AWS account. You can optionally specify filters (tags and resource types) in your request, depending on what information you want returned. The response includes all tags that are associated with the requested resources.  You can check the PaginationToken response parameter to determine if a query completed. Queries can occasionally return fewer results on a page than allowed. The PaginationToken response parameter value is null only when there are no more results to display.  
    */
  def getResources(params: GetResourcesInput): awsDashSdkLib.libRequestMod.Request[GetResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def getTagValues(
    params: GetTagValuesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTagValuesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTagValuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the AWS Resource Groups User Guide.   Each resource can have up to 50 tags. For other limits, see Tag Restrictions in the Amazon EC2 User Guide for Linux Instances.   You can only tag resources that are located in the specified region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups User Guide.  
    */
  def tagResources(): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the AWS Resource Groups User Guide.   Each resource can have up to 50 tags. For other limits, see Tag Restrictions in the Amazon EC2 User Guide for Linux Instances.   You can only tag resources that are located in the specified region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups User Guide.  
    */
  def tagResources(params: TagResourcesInput): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResources(
    params: TagResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups User Guide.   You can only tag resources that are located in the specified region for the AWS account.  
    */
  def untagResources(): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups User Guide.   You can only tag resources that are located in the specified region for the AWS account.  
    */
  def untagResources(params: UntagResourcesInput): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResources(
    params: UntagResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

