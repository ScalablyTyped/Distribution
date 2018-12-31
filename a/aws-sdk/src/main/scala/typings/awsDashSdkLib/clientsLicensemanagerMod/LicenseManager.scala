package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseManager
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_LicenseManager: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ClientConfiguration = js.native
  /**
    * Creates a new license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance, Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the number of licenses purchased and used.
    */
  def createLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.CreateLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.CreateLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.CreateLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance, Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the number of licenses purchased and used.
    */
  def createLicenseConfiguration(params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.CreateLicenseConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.CreateLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createLicenseConfiguration(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.CreateLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.CreateLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.CreateLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing license configuration. This action fails if the configuration is in use.
    */
  def deleteLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.DeleteLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.DeleteLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.DeleteLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing license configuration. This action fails if the configuration is in use.
    */
  def deleteLicenseConfiguration(params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.DeleteLicenseConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.DeleteLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteLicenseConfiguration(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.DeleteLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.DeleteLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.DeleteLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a detailed description of a license configuration.
    */
  def getLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a detailed description of a license configuration.
    */
  def getLicenseConfiguration(params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetLicenseConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLicenseConfiguration(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection. 
    */
  def getServiceSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetServiceSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getServiceSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetServiceSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetServiceSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection. 
    */
  def getServiceSettings(params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetServiceSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetServiceSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getServiceSettings(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetServiceSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetServiceSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.GetServiceSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the resource associations for a license configuration. Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the license rules). Use this operation to find all resources associated with a license configuration.
    */
  def listAssociationsForLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListAssociationsForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAssociationsForLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListAssociationsForLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListAssociationsForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the resource associations for a license configuration. Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the license rules). Use this operation to find all resources associated with a license configuration.
    */
  def listAssociationsForLicenseConfiguration(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListAssociationsForLicenseConfigurationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListAssociationsForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAssociationsForLicenseConfiguration(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListAssociationsForLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListAssociationsForLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListAssociationsForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists license configuration objects for an account, each containing the name, description, license type, and other license terms modeled from a license agreement.
    */
  def listLicenseConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listLicenseConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists license configuration objects for an account, each containing the name, description, license type, and other license terms modeled from a license agreement.
    */
  def listLicenseConfigurations(params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listLicenseConfigurations(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the license configuration for a resource.
    */
  def listLicenseSpecificationsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseSpecificationsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listLicenseSpecificationsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseSpecificationsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseSpecificationsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the license configuration for a resource.
    */
  def listLicenseSpecificationsForResource(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseSpecificationsForResourceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseSpecificationsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listLicenseSpecificationsForResource(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseSpecificationsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseSpecificationsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListLicenseSpecificationsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a detailed list of resources.
    */
  def listResourceInventory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListResourceInventoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listResourceInventory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListResourceInventoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListResourceInventoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a detailed list of resources.
    */
  def listResourceInventory(params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListResourceInventoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListResourceInventoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listResourceInventory(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListResourceInventoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListResourceInventoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListResourceInventoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists tags attached to a resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists tags attached to a resource.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all license usage records for a license configuration, displaying license consumption details by resource at a selected point in time. Use this action to audit the current license consumption for any license inventory and configuration.
    */
  def listUsageForLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListUsageForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsageForLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListUsageForLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListUsageForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all license usage records for a license configuration, displaying license consumption details by resource at a selected point in time. Use this action to audit the current license consumption for any license inventory and configuration.
    */
  def listUsageForLicenseConfiguration(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListUsageForLicenseConfigurationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListUsageForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsageForLicenseConfiguration(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListUsageForLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListUsageForLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.ListUsageForLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attach one of more tags to any resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Attach one of more tags to any resource.
    */
  def tagResource(params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Remove tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Remove tags from a resource.
    */
  def untagResource(params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host affinity (how long a VM is associated with a host), the number of licenses purchased and used.
    */
  def updateLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateLicenseConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host affinity (how long a VM is associated with a host), the number of licenses purchased and used.
    */
  def updateLicenseConfiguration(params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateLicenseConfiguration(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or removes license configurations for a specified AWS resource. This operation currently supports updating the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are not managed from this operation as those resources send the license configurations directly to a resource creation operation, such as RunInstances.
    */
  def updateLicenseSpecificationsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseSpecificationsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateLicenseSpecificationsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseSpecificationsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseSpecificationsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or removes license configurations for a specified AWS resource. This operation currently supports updating the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are not managed from this operation as those resources send the license configurations directly to a resource creation operation, such as RunInstances.
    */
  def updateLicenseSpecificationsForResource(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseSpecificationsForResourceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseSpecificationsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateLicenseSpecificationsForResource(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseSpecificationsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseSpecificationsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateLicenseSpecificationsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates License Manager service settings.
    */
  def updateServiceSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateServiceSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateServiceSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateServiceSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateServiceSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates License Manager service settings.
    */
  def updateServiceSettings(params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateServiceSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateServiceSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateServiceSettings(
    params: awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateServiceSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateServiceSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLicensemanagerMod.LicenseManagerNs.UpdateServiceSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

