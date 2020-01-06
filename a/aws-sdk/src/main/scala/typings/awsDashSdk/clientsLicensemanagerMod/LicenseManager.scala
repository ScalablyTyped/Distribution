package typings.awsDashSdk.clientsLicensemanagerMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseManager extends Service {
  @JSName("config")
  var config_LicenseManager: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a license configuration. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), host affinity (how long a VM must be associated with a host), and the number of licenses purchased and used.
    */
  def createLicenseConfiguration(): Request[CreateLicenseConfigurationResponse, AWSError] = js.native
  def createLicenseConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseConfigurationResponse, Unit]): Request[CreateLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Creates a license configuration. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), host affinity (how long a VM must be associated with a host), and the number of licenses purchased and used.
    */
  def createLicenseConfiguration(params: CreateLicenseConfigurationRequest): Request[CreateLicenseConfigurationResponse, AWSError] = js.native
  def createLicenseConfiguration(
    params: CreateLicenseConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseConfigurationResponse, Unit]
  ): Request[CreateLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the specified license configuration. You cannot delete a license configuration that is in use.
    */
  def deleteLicenseConfiguration(): Request[DeleteLicenseConfigurationResponse, AWSError] = js.native
  def deleteLicenseConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLicenseConfigurationResponse, Unit]): Request[DeleteLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the specified license configuration. You cannot delete a license configuration that is in use.
    */
  def deleteLicenseConfiguration(params: DeleteLicenseConfigurationRequest): Request[DeleteLicenseConfigurationResponse, AWSError] = js.native
  def deleteLicenseConfiguration(
    params: DeleteLicenseConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLicenseConfigurationResponse, Unit]
  ): Request[DeleteLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Gets detailed information about the specified license configuration.
    */
  def getLicenseConfiguration(): Request[GetLicenseConfigurationResponse, AWSError] = js.native
  def getLicenseConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetLicenseConfigurationResponse, Unit]): Request[GetLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Gets detailed information about the specified license configuration.
    */
  def getLicenseConfiguration(params: GetLicenseConfigurationRequest): Request[GetLicenseConfigurationResponse, AWSError] = js.native
  def getLicenseConfiguration(
    params: GetLicenseConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLicenseConfigurationResponse, Unit]
  ): Request[GetLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Gets the License Manager settings for the current Region.
    */
  def getServiceSettings(): Request[GetServiceSettingsResponse, AWSError] = js.native
  def getServiceSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceSettingsResponse, Unit]): Request[GetServiceSettingsResponse, AWSError] = js.native
  /**
    * Gets the License Manager settings for the current Region.
    */
  def getServiceSettings(params: GetServiceSettingsRequest): Request[GetServiceSettingsResponse, AWSError] = js.native
  def getServiceSettings(
    params: GetServiceSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceSettingsResponse, Unit]
  ): Request[GetServiceSettingsResponse, AWSError] = js.native
  /**
    * Lists the resource associations for the specified license configuration. Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped instance might not consume a license (depending on the license rules).
    */
  def listAssociationsForLicenseConfiguration(): Request[ListAssociationsForLicenseConfigurationResponse, AWSError] = js.native
  def listAssociationsForLicenseConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociationsForLicenseConfigurationResponse, Unit]
  ): Request[ListAssociationsForLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Lists the resource associations for the specified license configuration. Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped instance might not consume a license (depending on the license rules).
    */
  def listAssociationsForLicenseConfiguration(params: ListAssociationsForLicenseConfigurationRequest): Request[ListAssociationsForLicenseConfigurationResponse, AWSError] = js.native
  def listAssociationsForLicenseConfiguration(
    params: ListAssociationsForLicenseConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAssociationsForLicenseConfigurationResponse, Unit]
  ): Request[ListAssociationsForLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Lists the license configuration operations that failed.
    */
  def listFailuresForLicenseConfigurationOperations(): Request[ListFailuresForLicenseConfigurationOperationsResponse, AWSError] = js.native
  def listFailuresForLicenseConfigurationOperations(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListFailuresForLicenseConfigurationOperationsResponse, 
      Unit
    ]
  ): Request[ListFailuresForLicenseConfigurationOperationsResponse, AWSError] = js.native
  /**
    * Lists the license configuration operations that failed.
    */
  def listFailuresForLicenseConfigurationOperations(params: ListFailuresForLicenseConfigurationOperationsRequest): Request[ListFailuresForLicenseConfigurationOperationsResponse, AWSError] = js.native
  def listFailuresForLicenseConfigurationOperations(
    params: ListFailuresForLicenseConfigurationOperationsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListFailuresForLicenseConfigurationOperationsResponse, 
      Unit
    ]
  ): Request[ListFailuresForLicenseConfigurationOperationsResponse, AWSError] = js.native
  /**
    * Lists the license configurations for your account.
    */
  def listLicenseConfigurations(): Request[ListLicenseConfigurationsResponse, AWSError] = js.native
  def listLicenseConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListLicenseConfigurationsResponse, Unit]): Request[ListLicenseConfigurationsResponse, AWSError] = js.native
  /**
    * Lists the license configurations for your account.
    */
  def listLicenseConfigurations(params: ListLicenseConfigurationsRequest): Request[ListLicenseConfigurationsResponse, AWSError] = js.native
  def listLicenseConfigurations(
    params: ListLicenseConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLicenseConfigurationsResponse, Unit]
  ): Request[ListLicenseConfigurationsResponse, AWSError] = js.native
  /**
    * Describes the license configurations for the specified resource.
    */
  def listLicenseSpecificationsForResource(): Request[ListLicenseSpecificationsForResourceResponse, AWSError] = js.native
  def listLicenseSpecificationsForResource(
    callback: js.Function2[/* err */ AWSError, /* data */ ListLicenseSpecificationsForResourceResponse, Unit]
  ): Request[ListLicenseSpecificationsForResourceResponse, AWSError] = js.native
  /**
    * Describes the license configurations for the specified resource.
    */
  def listLicenseSpecificationsForResource(params: ListLicenseSpecificationsForResourceRequest): Request[ListLicenseSpecificationsForResourceResponse, AWSError] = js.native
  def listLicenseSpecificationsForResource(
    params: ListLicenseSpecificationsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLicenseSpecificationsForResourceResponse, Unit]
  ): Request[ListLicenseSpecificationsForResourceResponse, AWSError] = js.native
  /**
    * Lists resources managed using Systems Manager inventory.
    */
  def listResourceInventory(): Request[ListResourceInventoryResponse, AWSError] = js.native
  def listResourceInventory(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceInventoryResponse, Unit]): Request[ListResourceInventoryResponse, AWSError] = js.native
  /**
    * Lists resources managed using Systems Manager inventory.
    */
  def listResourceInventory(params: ListResourceInventoryRequest): Request[ListResourceInventoryResponse, AWSError] = js.native
  def listResourceInventory(
    params: ListResourceInventoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceInventoryResponse, Unit]
  ): Request[ListResourceInventoryResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified license configuration.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified license configuration.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all license usage records for a license configuration, displaying license consumption details by resource at a selected point in time. Use this action to audit the current license consumption for any license inventory and configuration.
    */
  def listUsageForLicenseConfiguration(): Request[ListUsageForLicenseConfigurationResponse, AWSError] = js.native
  def listUsageForLicenseConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsageForLicenseConfigurationResponse, Unit]
  ): Request[ListUsageForLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Lists all license usage records for a license configuration, displaying license consumption details by resource at a selected point in time. Use this action to audit the current license consumption for any license inventory and configuration.
    */
  def listUsageForLicenseConfiguration(params: ListUsageForLicenseConfigurationRequest): Request[ListUsageForLicenseConfigurationResponse, AWSError] = js.native
  def listUsageForLicenseConfiguration(
    params: ListUsageForLicenseConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsageForLicenseConfigurationResponse, Unit]
  ): Request[ListUsageForLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified license configuration.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified license configuration.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified license configuration.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified license configuration.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Modifies the attributes of an existing license configuration. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), host affinity (how long a VM must be associated with a host), and the number of licenses purchased and used.
    */
  def updateLicenseConfiguration(): Request[UpdateLicenseConfigurationResponse, AWSError] = js.native
  def updateLicenseConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLicenseConfigurationResponse, Unit]): Request[UpdateLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Modifies the attributes of an existing license configuration. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), host affinity (how long a VM must be associated with a host), and the number of licenses purchased and used.
    */
  def updateLicenseConfiguration(params: UpdateLicenseConfigurationRequest): Request[UpdateLicenseConfigurationResponse, AWSError] = js.native
  def updateLicenseConfiguration(
    params: UpdateLicenseConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLicenseConfigurationResponse, Unit]
  ): Request[UpdateLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Adds or removes the specified license configurations for the specified AWS resource. You can update the license specifications of AMIs, instances, and hosts. You cannot update the license specifications for launch templates and AWS CloudFormation templates, as they send license configurations to the operation that creates the resource.
    */
  def updateLicenseSpecificationsForResource(): Request[UpdateLicenseSpecificationsForResourceResponse, AWSError] = js.native
  def updateLicenseSpecificationsForResource(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLicenseSpecificationsForResourceResponse, Unit]
  ): Request[UpdateLicenseSpecificationsForResourceResponse, AWSError] = js.native
  /**
    * Adds or removes the specified license configurations for the specified AWS resource. You can update the license specifications of AMIs, instances, and hosts. You cannot update the license specifications for launch templates and AWS CloudFormation templates, as they send license configurations to the operation that creates the resource.
    */
  def updateLicenseSpecificationsForResource(params: UpdateLicenseSpecificationsForResourceRequest): Request[UpdateLicenseSpecificationsForResourceResponse, AWSError] = js.native
  def updateLicenseSpecificationsForResource(
    params: UpdateLicenseSpecificationsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLicenseSpecificationsForResourceResponse, Unit]
  ): Request[UpdateLicenseSpecificationsForResourceResponse, AWSError] = js.native
  /**
    * Updates License Manager settings for the current Region.
    */
  def updateServiceSettings(): Request[UpdateServiceSettingsResponse, AWSError] = js.native
  def updateServiceSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceSettingsResponse, Unit]): Request[UpdateServiceSettingsResponse, AWSError] = js.native
  /**
    * Updates License Manager settings for the current Region.
    */
  def updateServiceSettings(params: UpdateServiceSettingsRequest): Request[UpdateServiceSettingsResponse, AWSError] = js.native
  def updateServiceSettings(
    params: UpdateServiceSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceSettingsResponse, Unit]
  ): Request[UpdateServiceSettingsResponse, AWSError] = js.native
}

