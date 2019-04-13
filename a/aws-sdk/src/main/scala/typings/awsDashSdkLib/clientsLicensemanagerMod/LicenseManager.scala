package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseManager
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_LicenseManager: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance, Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the number of licenses purchased and used.
    */
  def createLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[CreateLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance, Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the number of licenses purchased and used.
    */
  def createLicenseConfiguration(params: CreateLicenseConfigurationRequest): awsDashSdkLib.libRequestMod.Request[CreateLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLicenseConfiguration(
    params: CreateLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing license configuration. This action fails if the configuration is in use.
    */
  def deleteLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[DeleteLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing license configuration. This action fails if the configuration is in use.
    */
  def deleteLicenseConfiguration(params: DeleteLicenseConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeleteLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLicenseConfiguration(
    params: DeleteLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a detailed description of a license configuration.
    */
  def getLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[GetLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a detailed description of a license configuration.
    */
  def getLicenseConfiguration(params: GetLicenseConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLicenseConfiguration(
    params: GetLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection. 
    */
  def getServiceSettings(): awsDashSdkLib.libRequestMod.Request[GetServiceSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getServiceSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServiceSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServiceSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection. 
    */
  def getServiceSettings(params: GetServiceSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetServiceSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getServiceSettings(
    params: GetServiceSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServiceSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServiceSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the resource associations for a license configuration. Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the license rules). Use this operation to find all resources associated with a license configuration.
    */
  def listAssociationsForLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[
    ListAssociationsForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAssociationsForLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssociationsForLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    ListAssociationsForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the resource associations for a license configuration. Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the license rules). Use this operation to find all resources associated with a license configuration.
    */
  def listAssociationsForLicenseConfiguration(params: ListAssociationsForLicenseConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    ListAssociationsForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAssociationsForLicenseConfiguration(
    params: ListAssociationsForLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAssociationsForLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    ListAssociationsForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists license configuration objects for an account, each containing the name, description, license type, and other license terms modeled from a license agreement.
    */
  def listLicenseConfigurations(): awsDashSdkLib.libRequestMod.Request[ListLicenseConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLicenseConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLicenseConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLicenseConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists license configuration objects for an account, each containing the name, description, license type, and other license terms modeled from a license agreement.
    */
  def listLicenseConfigurations(params: ListLicenseConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListLicenseConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLicenseConfigurations(
    params: ListLicenseConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLicenseConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLicenseConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the license configuration for a resource.
    */
  def listLicenseSpecificationsForResource(): awsDashSdkLib.libRequestMod.Request[ListLicenseSpecificationsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLicenseSpecificationsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLicenseSpecificationsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLicenseSpecificationsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the license configuration for a resource.
    */
  def listLicenseSpecificationsForResource(params: ListLicenseSpecificationsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListLicenseSpecificationsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLicenseSpecificationsForResource(
    params: ListLicenseSpecificationsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLicenseSpecificationsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLicenseSpecificationsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a detailed list of resources.
    */
  def listResourceInventory(): awsDashSdkLib.libRequestMod.Request[ListResourceInventoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceInventory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceInventoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceInventoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a detailed list of resources.
    */
  def listResourceInventory(params: ListResourceInventoryRequest): awsDashSdkLib.libRequestMod.Request[ListResourceInventoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceInventory(
    params: ListResourceInventoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceInventoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceInventoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists tags attached to a resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists tags attached to a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all license usage records for a license configuration, displaying license consumption details by resource at a selected point in time. Use this action to audit the current license consumption for any license inventory and configuration.
    */
  def listUsageForLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[ListUsageForLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUsageForLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUsageForLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUsageForLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all license usage records for a license configuration, displaying license consumption details by resource at a selected point in time. Use this action to audit the current license consumption for any license inventory and configuration.
    */
  def listUsageForLicenseConfiguration(params: ListUsageForLicenseConfigurationRequest): awsDashSdkLib.libRequestMod.Request[ListUsageForLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUsageForLicenseConfiguration(
    params: ListUsageForLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUsageForLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUsageForLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attach one of more tags to any resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Attach one of more tags to any resource.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host affinity (how long a VM is associated with a host), the number of licenses purchased and used.
    */
  def updateLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host affinity (how long a VM is associated with a host), the number of licenses purchased and used.
    */
  def updateLicenseConfiguration(params: UpdateLicenseConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateLicenseConfiguration(
    params: UpdateLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or removes license configurations for a specified AWS resource. This operation currently supports updating the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are not managed from this operation as those resources send the license configurations directly to a resource creation operation, such as RunInstances.
    */
  def updateLicenseSpecificationsForResource(): awsDashSdkLib.libRequestMod.Request[UpdateLicenseSpecificationsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateLicenseSpecificationsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateLicenseSpecificationsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateLicenseSpecificationsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or removes license configurations for a specified AWS resource. This operation currently supports updating the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are not managed from this operation as those resources send the license configurations directly to a resource creation operation, such as RunInstances.
    */
  def updateLicenseSpecificationsForResource(params: UpdateLicenseSpecificationsForResourceRequest): awsDashSdkLib.libRequestMod.Request[UpdateLicenseSpecificationsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateLicenseSpecificationsForResource(
    params: UpdateLicenseSpecificationsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateLicenseSpecificationsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateLicenseSpecificationsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates License Manager service settings.
    */
  def updateServiceSettings(): awsDashSdkLib.libRequestMod.Request[UpdateServiceSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateServiceSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateServiceSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateServiceSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates License Manager service settings.
    */
  def updateServiceSettings(params: UpdateServiceSettingsRequest): awsDashSdkLib.libRequestMod.Request[UpdateServiceSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateServiceSettings(
    params: UpdateServiceSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateServiceSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateServiceSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

