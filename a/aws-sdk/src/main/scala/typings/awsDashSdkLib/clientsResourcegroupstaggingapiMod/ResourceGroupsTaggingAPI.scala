package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupsTaggingAPI
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ResourceGroupsTaggingAPI: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.ClientConfiguration = js.native
  /**
    * Returns all the tagged resources that are associated with the specified tags (keys and values) located in the specified region for the AWS account. The tags and the resource types that you specify in the request are known as filters. The response includes all tags that are associated with the requested resources. If no filter is provided, this action returns a paginated resource list with the associated tags.
    */
  def getResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all the tagged resources that are associated with the specified tags (keys and values) located in the specified region for the AWS account. The tags and the resource types that you specify in the request are known as filters. The response includes all tags that are associated with the requested resources. If no filter is provided, this action returns a paginated resource list with the associated tags.
    */
  def getResources(
    params: awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetResourcesInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResources(
    params: awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all tag keys in the specified region for the AWS account.
    */
  def getTagKeys(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagKeysOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTagKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagKeysOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagKeysOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all tag keys in the specified region for the AWS account.
    */
  def getTagKeys(
    params: awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagKeysInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagKeysOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTagKeys(
    params: awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagKeysInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagKeysOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagKeysOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all tag values for the specified key in the specified region for the AWS account.
    */
  def getTagValues(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagValuesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTagValues(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagValuesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagValuesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all tag values for the specified key in the specified region for the AWS account.
    */
  def getTagValues(
    params: awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagValuesInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagValuesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTagValues(
    params: awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagValuesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagValuesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.GetTagValuesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the AWS Resource Groups and Tag Editor User Guide.   Each resource can have up to 50 tags. For other limits, see Tag Restrictions in the Amazon EC2 User Guide for Linux Instances.   You can only tag resources that are located in the specified region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.  
    */
  def tagResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.TagResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.TagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.TagResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of resources that support tagging, see Supported Resources in the AWS Resource Groups and Tag Editor User Guide.   Each resource can have up to 50 tags. For other limits, see Tag Restrictions in the Amazon EC2 User Guide for Linux Instances.   You can only tag resources that are located in the specified region for the AWS account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.  
    */
  def tagResources(
    params: awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.TagResourcesInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.TagResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResources(
    params: awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.TagResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.TagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.TagResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.   You can only tag resources that are located in the specified region for the AWS account.  
    */
  def untagResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.UntagResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.UntagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.UntagResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see Obtaining Permissions for Tagging in the AWS Resource Groups and Tag Editor User Guide.   You can only tag resources that are located in the specified region for the AWS account.  
    */
  def untagResources(
    params: awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.UntagResourcesInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.UntagResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResources(
    params: awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.UntagResourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.UntagResourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsResourcegroupstaggingapiMod.ResourceGroupsTaggingAPINs.UntagResourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

