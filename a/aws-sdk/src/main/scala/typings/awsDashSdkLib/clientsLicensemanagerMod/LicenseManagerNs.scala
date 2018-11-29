package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/licensemanager", "LicenseManager")
@js.native
object LicenseManagerNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait ConsumedLicenseSummary extends js.Object {
    /**
         * Number of licenses consumed by a resource.
         */
    var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
    /**
         * Resource type of the resource consuming a license (instance, host, or AMI).
         */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  
  trait CreateLicenseConfigurationRequest extends js.Object {
    /**
         * Human-friendly description of the license configuration.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Number of licenses managed by the license configuration.
         */
    var LicenseCount: js.UndefOr[BoxLong] = js.undefined
    /**
         * Flag indicating whether hard or soft license enforcement is used. Exceeding a hard limit results in the blocked deployment of new instances.
         */
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined
    /**
         * Dimension to use to track the license inventory.
         */
    var LicenseCountingType: LicenseCountingType
    /**
         * Array of configured License Manager rules.
         */
    var LicenseRules: js.UndefOr[StringList] = js.undefined
    /**
         * Name of the license configuration.
         */
    var Name: java.lang.String
    /**
         * The tags to apply to the resources during launch. You can only tag instances and volumes on launch. The specified tags are applied to all instances or volumes that are created during launch. To tag a resource after it has been created, see CreateTags . 
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait CreateLicenseConfigurationResponse extends js.Object {
    /**
         * ARN of the license configuration object after its creation.
         */
    var LicenseConfigurationArn: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait DeleteLicenseConfigurationRequest extends js.Object {
    /**
         * Unique ID of the configuration object to delete.
         */
    var LicenseConfigurationArn: java.lang.String
  }
  
  
  trait DeleteLicenseConfigurationResponse extends js.Object
  
  
  trait Filter extends js.Object {
    /**
         * Name of the filter. Filter names are case-sensitive.
         */
    var Name: js.UndefOr[FilterName] = js.undefined
    /**
         * One or more filter values. Filter values are case-sensitive.
         */
    var Values: js.UndefOr[FilterValues] = js.undefined
  }
  
  
  trait GetLicenseConfigurationRequest extends js.Object {
    /**
         * ARN of the license configuration being requested.
         */
    var LicenseConfigurationArn: java.lang.String
  }
  
  
  trait GetLicenseConfigurationResponse extends js.Object {
    /**
         * List of summaries for consumed licenses used by various resources.
         */
    var ConsumedLicenseSummaryList: js.UndefOr[ConsumedLicenseSummaryList] = js.undefined
    /**
         * Number of licenses assigned to resources.
         */
    var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
    /**
         * Description of the license configuration.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * ARN of the license configuration requested.
         */
    var LicenseConfigurationArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Unique ID for the license configuration.
         */
    var LicenseConfigurationId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Number of available licenses.
         */
    var LicenseCount: js.UndefOr[BoxLong] = js.undefined
    /**
         * Sets the number of available licenses as a hard limit.
         */
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined
    /**
         * Dimension on which the licenses are counted (for example, instances, cores, sockets, or VCPUs).
         */
    var LicenseCountingType: js.UndefOr[LicenseCountingType] = js.undefined
    /**
         * List of flexible text strings designating license rules.
         */
    var LicenseRules: js.UndefOr[StringList] = js.undefined
    /**
         * List of summaries of managed resources.
         */
    var ManagedResourceSummaryList: js.UndefOr[ManagedResourceSummaryList] = js.undefined
    /**
         * Name of the license configuration.
         */
    var Name: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Owner account ID for the license configuration.
         */
    var OwnerAccountId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * License configuration status (active, etc.).
         */
    var Status: js.UndefOr[java.lang.String] = js.undefined
    /**
         * List of tags attached to the license configuration.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait GetServiceSettingsRequest extends js.Object
  
  
  trait GetServiceSettingsResponse extends js.Object {
    /**
         * Indicates whether cross-account discovery has been enabled.
         */
    var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined
    /**
         * Indicates whether AWS Organizations has been integrated with License Manager for cross-account discovery.
         */
    var OrganizationConfiguration: js.UndefOr[OrganizationConfiguration] = js.undefined
    /**
         * Regional S3 bucket path for storing reports, license trail event data, discovery data, etc.
         */
    var S3BucketArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * SNS topic configured to receive notifications from License Manager.
         */
    var SnsTopicArn: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait InventoryFilter extends js.Object {
    /**
         * The condition of the filter.
         */
    var Condition: InventoryFilterCondition
    /**
         * The name of the filter.
         */
    var Name: java.lang.String
    /**
         * Value of the filter.
         */
    var Value: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait LicenseConfiguration extends js.Object {
    /**
         * List of summaries for licenses consumed by various resources.
         */
    var ConsumedLicenseSummaryList: js.UndefOr[ConsumedLicenseSummaryList] = js.undefined
    /**
         * Number of licenses consumed. 
         */
    var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
    /**
         * Description of the license configuration.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * ARN of the LicenseConfiguration object.
         */
    var LicenseConfigurationArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Unique ID of the LicenseConfiguration object.
         */
    var LicenseConfigurationId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Number of licenses managed by the license configuration.
         */
    var LicenseCount: js.UndefOr[BoxLong] = js.undefined
    /**
         * Sets the number of available licenses as a hard limit.
         */
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined
    /**
         * Dimension to use to track license inventory.
         */
    var LicenseCountingType: js.UndefOr[LicenseCountingType] = js.undefined
    /**
         * Array of configured License Manager rules.
         */
    var LicenseRules: js.UndefOr[StringList] = js.undefined
    /**
         * List of summaries for managed resources.
         */
    var ManagedResourceSummaryList: js.UndefOr[ManagedResourceSummaryList] = js.undefined
    /**
         * Name of the license configuration.
         */
    var Name: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Account ID of the license configuration's owner.
         */
    var OwnerAccountId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Status of the license configuration.
         */
    var Status: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait LicenseConfigurationAssociation extends js.Object {
    /**
         * Time when the license configuration was associated with the resource.
         */
    var AssociationTime: js.UndefOr[DateTime] = js.undefined
    /**
         * ARN of the resource associated with the license configuration.
         */
    var ResourceArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * ID of the AWS account that owns the resource consuming licenses.
         */
    var ResourceOwnerId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Type of server resource.
         */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  
  trait LicenseConfigurationUsage extends js.Object {
    /**
         * Time when the license configuration was initially associated with a resource.
         */
    var AssociationTime: js.UndefOr[DateTime] = js.undefined
    /**
         * Number of licenses consumed out of the total provisioned in the license configuration.
         */
    var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
    /**
         * ARN of the resource associated with a license configuration.
         */
    var ResourceArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * ID of the account that owns a resource that is associated with the license configuration.
         */
    var ResourceOwnerId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Status of a resource associated with the license configuration.
         */
    var ResourceStatus: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Type of resource associated with athe license configuration.
         */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  
  trait LicenseSpecification extends js.Object {
    /**
         * ARN of the LicenseConfiguration object.
         */
    var LicenseConfigurationArn: java.lang.String
  }
  
  
  trait ListAssociationsForLicenseConfigurationRequest extends js.Object {
    /**
         * ARN of a LicenseConfiguration object.
         */
    var LicenseConfigurationArn: java.lang.String
    /**
         * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
         */
    var MaxResults: js.UndefOr[BoxInteger] = js.undefined
    /**
         * Token for the next set of results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListAssociationsForLicenseConfigurationResponse extends js.Object {
    /**
         * Lists association objects for the license configuration, each containing the association time, number of consumed licenses, resource ARN, resource ID, account ID that owns the resource, resource size, and resource type.
         */
    var LicenseConfigurationAssociations: js.UndefOr[LicenseConfigurationAssociations] = js.undefined
    /**
         * Token for the next set of results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListLicenseConfigurationsRequest extends js.Object {
    /**
         * One or more filters.
         */
    var Filters: js.UndefOr[Filters] = js.undefined
    /**
         * An array of ARNs for the calling account’s license configurations.
         */
    var LicenseConfigurationArns: js.UndefOr[StringList] = js.undefined
    /**
         * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
         */
    var MaxResults: js.UndefOr[BoxInteger] = js.undefined
    /**
         * Token for the next set of results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListLicenseConfigurationsResponse extends js.Object {
    /**
         * Array of license configuration objects.
         */
    var LicenseConfigurations: js.UndefOr[LicenseConfigurations] = js.undefined
    /**
         * Token for the next set of results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListLicenseSpecificationsForResourceRequest extends js.Object {
    /**
         * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
         */
    var MaxResults: js.UndefOr[BoxInteger] = js.undefined
    /**
         * Token for the next set of results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * ARN of an AMI or Amazon EC2 instance that has an associated license configuration.
         */
    var ResourceArn: java.lang.String
  }
  
  
  trait ListLicenseSpecificationsForResourceResponse extends js.Object {
    /**
         * License configurations associated with a resource.
         */
    var LicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined
    /**
         * Token for the next set of results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListResourceInventoryRequest extends js.Object {
    /**
         * One or more filters.
         */
    var Filters: js.UndefOr[InventoryFilterList] = js.undefined
    /**
         * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
         */
    var MaxResults: js.UndefOr[BoxInteger] = js.undefined
    /**
         * Token for the next set of results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListResourceInventoryResponse extends js.Object {
    /**
         * Token for the next set of results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The detailed list of resources.
         */
    var ResourceInventoryList: js.UndefOr[ResourceInventoryList] = js.undefined
  }
  
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
         * ARN for the resource.
         */
    var ResourceArn: java.lang.String
  }
  
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
         * List of tags attached to the resource.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait ListUsageForLicenseConfigurationRequest extends js.Object {
    /**
         * List of filters to apply.
         */
    var Filters: js.UndefOr[Filters] = js.undefined
    /**
         * ARN of the targeted LicenseConfiguration object.
         */
    var LicenseConfigurationArn: java.lang.String
    /**
         * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
         */
    var MaxResults: js.UndefOr[BoxInteger] = js.undefined
    /**
         * Token for the next set of results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListUsageForLicenseConfigurationResponse extends js.Object {
    /**
         * An array of LicenseConfigurationUsage objects.
         */
    var LicenseConfigurationUsageList: js.UndefOr[LicenseConfigurationUsageList] = js.undefined
    /**
         * Token for the next set of results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ManagedResourceSummary extends js.Object {
    /**
         * Number of resources associated with licenses.
         */
    var AssociationCount: js.UndefOr[BoxLong] = js.undefined
    /**
         * Type of resource associated with a license (instance, host, or AMI).
         */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  
  trait OrganizationConfiguration extends js.Object {
    /**
         * Flag to activate AWS Organization integration.
         */
    var EnableIntegration: scala.Boolean
  }
  
  
  trait ResourceInventory extends js.Object {
    /**
         * The platform of the resource.
         */
    var Platform: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Platform version of the resource in the inventory.
         */
    var PlatformVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The ARN of the resource.
         */
    var ResourceArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Unique ID of the resource.
         */
    var ResourceId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Unique ID of the account that owns the resource.
         */
    var ResourceOwningAccountId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The type of resource.
         */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
  }
  
  
  trait Tag extends js.Object {
    /**
         * Key for the resource tag.
         */
    var Key: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Value for the resource tag.
         */
    var Value: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait TagResourceRequest extends js.Object {
    /**
         * Resource of the ARN to be tagged.
         */
    var ResourceArn: java.lang.String
    /**
         * Names of the tags to attach to the resource.
         */
    var Tags: TagList
  }
  
  
  trait TagResourceResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates a new license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance, Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the number of licenses purchased and used.
       */
    def createLicenseConfiguration(): awsDashSdkLib.libRequestMod.Request[CreateLicenseConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance, Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the number of licenses purchased and used.
       */
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
    /**
       * Creates a new license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance, Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the number of licenses purchased and used.
       */
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
    /**
       * Deletes an existing license configuration. This action fails if the configuration is in use.
       */
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
    /**
       * Deletes an existing license configuration. This action fails if the configuration is in use.
       */
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
    /**
       * Returns a detailed description of a license configuration.
       */
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
    /**
       * Returns a detailed description of a license configuration.
       */
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
    /**
       * Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection. 
       */
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
    /**
       * Gets License Manager settings for a region. Exposes the configured S3 bucket, SNS topic, etc., for inspection. 
       */
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
    /**
       * Lists the resource associations for a license configuration. Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the license rules). Use this operation to find all resources associated with a license configuration.
       */
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
    /**
       * Lists the resource associations for a license configuration. Resource associations need not consume licenses from a license configuration. For example, an AMI or a stopped instance may not consume a license (depending on the license rules). Use this operation to find all resources associated with a license configuration.
       */
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
    /**
       * Lists license configuration objects for an account, each containing the name, description, license type, and other license terms modeled from a license agreement.
       */
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
    /**
       * Lists license configuration objects for an account, each containing the name, description, license type, and other license terms modeled from a license agreement.
       */
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
    /**
       * Returns the license configuration for a resource.
       */
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
    /**
       * Returns the license configuration for a resource.
       */
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
    /**
       * Returns a detailed list of resources.
       */
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
    /**
       * Returns a detailed list of resources.
       */
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
    /**
       * Lists tags attached to a resource.
       */
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
    /**
       * Lists tags attached to a resource.
       */
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
    /**
       * Lists all license usage records for a license configuration, displaying license consumption details by resource at a selected point in time. Use this action to audit the current license consumption for any license inventory and configuration.
       */
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
    /**
       * Lists all license usage records for a license configuration, displaying license consumption details by resource at a selected point in time. Use this action to audit the current license consumption for any license inventory and configuration.
       */
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
    /**
       * Attach one of more tags to any resource.
       */
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
    /**
       * Attach one of more tags to any resource.
       */
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
    /**
       * Remove tags from a resource.
       */
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
    /**
       * Remove tags from a resource.
       */
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
    /**
       * Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host affinity (how long a VM is associated with a host), the number of licenses purchased and used.
       */
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
    /**
       * Modifies the attributes of an existing license configuration object. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (Instances, cores, sockets, VCPUs), tenancy (shared or Dedicated Host), host affinity (how long a VM is associated with a host), the number of licenses purchased and used.
       */
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
    /**
       * Adds or removes license configurations for a specified AWS resource. This operation currently supports updating the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are not managed from this operation as those resources send the license configurations directly to a resource creation operation, such as RunInstances.
       */
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
    /**
       * Adds or removes license configurations for a specified AWS resource. This operation currently supports updating the license specifications of AMIs, instances, and hosts. Launch templates and AWS CloudFormation templates are not managed from this operation as those resources send the license configurations directly to a resource creation operation, such as RunInstances.
       */
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
    /**
       * Updates License Manager service settings.
       */
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
    /**
       * Updates License Manager service settings.
       */
    def updateServiceSettings(
      params: UpdateServiceSettingsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateServiceSettingsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateServiceSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UntagResourceRequest extends js.Object {
    /**
         * ARN of the resource.
         */
    var ResourceArn: java.lang.String
    /**
         * List keys identifying tags to remove.
         */
    var TagKeys: TagKeyList
  }
  
  
  trait UntagResourceResponse extends js.Object
  
  
  trait UpdateLicenseConfigurationRequest extends js.Object {
    /**
         * New human-friendly description of the license configuration.
         */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * ARN for a license configuration.
         */
    var LicenseConfigurationArn: java.lang.String
    /**
         * New status of the license configuration (ACTIVE or INACTIVE).
         */
    var LicenseConfigurationStatus: js.UndefOr[LicenseConfigurationStatus] = js.undefined
    /**
         * New number of licenses managed by the license configuration.
         */
    var LicenseCount: js.UndefOr[BoxLong] = js.undefined
    /**
         * Sets the number of available licenses as a hard limit.
         */
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined
    /**
         * List of flexible text strings designating license rules.
         */
    var LicenseRules: js.UndefOr[StringList] = js.undefined
    /**
         * New name of the license configuration.
         */
    var Name: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait UpdateLicenseConfigurationResponse extends js.Object
  
  
  trait UpdateLicenseSpecificationsForResourceRequest extends js.Object {
    /**
         * License configuration ARNs to be added to a resource.
         */
    var AddLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined
    /**
         * License configuration ARNs to be removed from a resource.
         */
    var RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined
    /**
         * ARN for an AWS server resource.
         */
    var ResourceArn: java.lang.String
  }
  
  
  trait UpdateLicenseSpecificationsForResourceResponse extends js.Object
  
  
  trait UpdateServiceSettingsRequest extends js.Object {
    /**
         * Activates cross-account discovery.
         */
    var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined
    /**
         * Integrates AWS Organizations with License Manager for cross-account discovery.
         */
    var OrganizationConfiguration: js.UndefOr[OrganizationConfiguration] = js.undefined
    /**
         * ARN of the Amazon S3 bucket where License Manager information is stored.
         */
    var S3BucketArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * ARN of the Amazon SNS topic used for License Manager alerts.
         */
    var SnsTopicArn: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait UpdateServiceSettingsResponse extends js.Object
  
  val TypesNs: this.type = js.native
  type Boolean = scala.Boolean
  type BoxBoolean = scala.Boolean
  type BoxInteger = scala.Double
  type BoxLong = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConsumedLicenseSummaryList = js.Array[ConsumedLicenseSummary]
  type DateTime = stdLib.Date
  type FilterName = java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type InventoryFilterCondition = awsDashSdkLib.awsDashSdkLibStrings.EQUALS | awsDashSdkLib.awsDashSdkLibStrings.NOT_EQUALS | awsDashSdkLib.awsDashSdkLibStrings.BEGINS_WITH | awsDashSdkLib.awsDashSdkLibStrings.CONTAINS | java.lang.String
  type InventoryFilterList = js.Array[InventoryFilter]
  type LicenseConfigurationAssociations = js.Array[LicenseConfigurationAssociation]
  type LicenseConfigurationStatus = awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type LicenseConfigurationUsageList = js.Array[LicenseConfigurationUsage]
  type LicenseConfigurations = js.Array[LicenseConfiguration]
  type LicenseCountingType = awsDashSdkLib.awsDashSdkLibStrings.vCPU | awsDashSdkLib.awsDashSdkLibStrings.Instance | awsDashSdkLib.awsDashSdkLibStrings.Core | awsDashSdkLib.awsDashSdkLibStrings.Socket | java.lang.String
  type LicenseSpecifications = js.Array[LicenseSpecification]
  type ManagedResourceSummaryList = js.Array[ManagedResourceSummary]
  type ResourceInventoryList = js.Array[ResourceInventory]
  type ResourceType = awsDashSdkLib.awsDashSdkLibStrings.EC2_INSTANCE | awsDashSdkLib.awsDashSdkLibStrings.EC2_HOST | awsDashSdkLib.awsDashSdkLibStrings.EC2_AMI | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[java.lang.String]
  type TagKeyList = js.Array[java.lang.String]
  type TagList = js.Array[Tag]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-08-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

