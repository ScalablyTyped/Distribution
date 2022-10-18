package typings.awsSdk.clientsLicensemanagerMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseManager extends Service {
  
  /**
    * Accepts the specified grant.
    */
  def acceptGrant(): Request[AcceptGrantResponse, AWSError] = js.native
  def acceptGrant(callback: js.Function2[/* err */ AWSError, /* data */ AcceptGrantResponse, Unit]): Request[AcceptGrantResponse, AWSError] = js.native
  /**
    * Accepts the specified grant.
    */
  def acceptGrant(params: AcceptGrantRequest): Request[AcceptGrantResponse, AWSError] = js.native
  def acceptGrant(
    params: AcceptGrantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptGrantResponse, Unit]
  ): Request[AcceptGrantResponse, AWSError] = js.native
  
  /**
    * Checks in the specified license. Check in a license when it is no longer in use.
    */
  def checkInLicense(): Request[CheckInLicenseResponse, AWSError] = js.native
  def checkInLicense(callback: js.Function2[/* err */ AWSError, /* data */ CheckInLicenseResponse, Unit]): Request[CheckInLicenseResponse, AWSError] = js.native
  /**
    * Checks in the specified license. Check in a license when it is no longer in use.
    */
  def checkInLicense(params: CheckInLicenseRequest): Request[CheckInLicenseResponse, AWSError] = js.native
  def checkInLicense(
    params: CheckInLicenseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CheckInLicenseResponse, Unit]
  ): Request[CheckInLicenseResponse, AWSError] = js.native
  
  /**
    * Checks out the specified license for offline use.
    */
  def checkoutBorrowLicense(): Request[CheckoutBorrowLicenseResponse, AWSError] = js.native
  def checkoutBorrowLicense(callback: js.Function2[/* err */ AWSError, /* data */ CheckoutBorrowLicenseResponse, Unit]): Request[CheckoutBorrowLicenseResponse, AWSError] = js.native
  /**
    * Checks out the specified license for offline use.
    */
  def checkoutBorrowLicense(params: CheckoutBorrowLicenseRequest): Request[CheckoutBorrowLicenseResponse, AWSError] = js.native
  def checkoutBorrowLicense(
    params: CheckoutBorrowLicenseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CheckoutBorrowLicenseResponse, Unit]
  ): Request[CheckoutBorrowLicenseResponse, AWSError] = js.native
  
  /**
    * Checks out the specified license.
    */
  def checkoutLicense(): Request[CheckoutLicenseResponse, AWSError] = js.native
  def checkoutLicense(callback: js.Function2[/* err */ AWSError, /* data */ CheckoutLicenseResponse, Unit]): Request[CheckoutLicenseResponse, AWSError] = js.native
  /**
    * Checks out the specified license.
    */
  def checkoutLicense(params: CheckoutLicenseRequest): Request[CheckoutLicenseResponse, AWSError] = js.native
  def checkoutLicense(
    params: CheckoutLicenseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CheckoutLicenseResponse, Unit]
  ): Request[CheckoutLicenseResponse, AWSError] = js.native
  
  @JSName("config")
  var config_LicenseManager: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a grant for the specified license. A grant shares the use of license entitlements with specific Amazon Web Services accounts.
    */
  def createGrant(): Request[CreateGrantResponse, AWSError] = js.native
  def createGrant(callback: js.Function2[/* err */ AWSError, /* data */ CreateGrantResponse, Unit]): Request[CreateGrantResponse, AWSError] = js.native
  /**
    * Creates a grant for the specified license. A grant shares the use of license entitlements with specific Amazon Web Services accounts.
    */
  def createGrant(params: CreateGrantRequest): Request[CreateGrantResponse, AWSError] = js.native
  def createGrant(
    params: CreateGrantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGrantResponse, Unit]
  ): Request[CreateGrantResponse, AWSError] = js.native
  
  /**
    * Creates a new version of the specified grant.
    */
  def createGrantVersion(): Request[CreateGrantVersionResponse, AWSError] = js.native
  def createGrantVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateGrantVersionResponse, Unit]): Request[CreateGrantVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of the specified grant.
    */
  def createGrantVersion(params: CreateGrantVersionRequest): Request[CreateGrantVersionResponse, AWSError] = js.native
  def createGrantVersion(
    params: CreateGrantVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGrantVersionResponse, Unit]
  ): Request[CreateGrantVersionResponse, AWSError] = js.native
  
  /**
    * Creates a license.
    */
  def createLicense(): Request[CreateLicenseResponse, AWSError] = js.native
  def createLicense(callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseResponse, Unit]): Request[CreateLicenseResponse, AWSError] = js.native
  /**
    * Creates a license.
    */
  def createLicense(params: CreateLicenseRequest): Request[CreateLicenseResponse, AWSError] = js.native
  def createLicense(
    params: CreateLicenseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseResponse, Unit]
  ): Request[CreateLicenseResponse, AWSError] = js.native
  
  /**
    * Creates a license configuration. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), license affinity to host (how long a license must be associated with a host), and the number of licenses purchased and used.
    */
  def createLicenseConfiguration(): Request[CreateLicenseConfigurationResponse, AWSError] = js.native
  def createLicenseConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseConfigurationResponse, Unit]): Request[CreateLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Creates a license configuration. A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), license affinity to host (how long a license must be associated with a host), and the number of licenses purchased and used.
    */
  def createLicenseConfiguration(params: CreateLicenseConfigurationRequest): Request[CreateLicenseConfigurationResponse, AWSError] = js.native
  def createLicenseConfiguration(
    params: CreateLicenseConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseConfigurationResponse, Unit]
  ): Request[CreateLicenseConfigurationResponse, AWSError] = js.native
  
  /**
    * Creates a new license conversion task.
    */
  def createLicenseConversionTaskForResource(): Request[CreateLicenseConversionTaskForResourceResponse, AWSError] = js.native
  def createLicenseConversionTaskForResource(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseConversionTaskForResourceResponse, Unit]
  ): Request[CreateLicenseConversionTaskForResourceResponse, AWSError] = js.native
  /**
    * Creates a new license conversion task.
    */
  def createLicenseConversionTaskForResource(params: CreateLicenseConversionTaskForResourceRequest): Request[CreateLicenseConversionTaskForResourceResponse, AWSError] = js.native
  def createLicenseConversionTaskForResource(
    params: CreateLicenseConversionTaskForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseConversionTaskForResourceResponse, Unit]
  ): Request[CreateLicenseConversionTaskForResourceResponse, AWSError] = js.native
  
  /**
    * Creates a report generator.
    */
  def createLicenseManagerReportGenerator(): Request[CreateLicenseManagerReportGeneratorResponse, AWSError] = js.native
  def createLicenseManagerReportGenerator(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseManagerReportGeneratorResponse, Unit]
  ): Request[CreateLicenseManagerReportGeneratorResponse, AWSError] = js.native
  /**
    * Creates a report generator.
    */
  def createLicenseManagerReportGenerator(params: CreateLicenseManagerReportGeneratorRequest): Request[CreateLicenseManagerReportGeneratorResponse, AWSError] = js.native
  def createLicenseManagerReportGenerator(
    params: CreateLicenseManagerReportGeneratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseManagerReportGeneratorResponse, Unit]
  ): Request[CreateLicenseManagerReportGeneratorResponse, AWSError] = js.native
  
  /**
    * Creates a new version of the specified license.
    */
  def createLicenseVersion(): Request[CreateLicenseVersionResponse, AWSError] = js.native
  def createLicenseVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseVersionResponse, Unit]): Request[CreateLicenseVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of the specified license.
    */
  def createLicenseVersion(params: CreateLicenseVersionRequest): Request[CreateLicenseVersionResponse, AWSError] = js.native
  def createLicenseVersion(
    params: CreateLicenseVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLicenseVersionResponse, Unit]
  ): Request[CreateLicenseVersionResponse, AWSError] = js.native
  
  /**
    * Creates a long-lived token. A refresh token is a JWT token used to get an access token. With an access token, you can call AssumeRoleWithWebIdentity to get role credentials that you can use to call License Manager to manage the specified license.
    */
  def createToken(): Request[CreateTokenResponse, AWSError] = js.native
  def createToken(callback: js.Function2[/* err */ AWSError, /* data */ CreateTokenResponse, Unit]): Request[CreateTokenResponse, AWSError] = js.native
  /**
    * Creates a long-lived token. A refresh token is a JWT token used to get an access token. With an access token, you can call AssumeRoleWithWebIdentity to get role credentials that you can use to call License Manager to manage the specified license.
    */
  def createToken(params: CreateTokenRequest): Request[CreateTokenResponse, AWSError] = js.native
  def createToken(
    params: CreateTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTokenResponse, Unit]
  ): Request[CreateTokenResponse, AWSError] = js.native
  
  /**
    * Deletes the specified grant.
    */
  def deleteGrant(): Request[DeleteGrantResponse, AWSError] = js.native
  def deleteGrant(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGrantResponse, Unit]): Request[DeleteGrantResponse, AWSError] = js.native
  /**
    * Deletes the specified grant.
    */
  def deleteGrant(params: DeleteGrantRequest): Request[DeleteGrantResponse, AWSError] = js.native
  def deleteGrant(
    params: DeleteGrantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGrantResponse, Unit]
  ): Request[DeleteGrantResponse, AWSError] = js.native
  
  /**
    * Deletes the specified license.
    */
  def deleteLicense(): Request[DeleteLicenseResponse, AWSError] = js.native
  def deleteLicense(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLicenseResponse, Unit]): Request[DeleteLicenseResponse, AWSError] = js.native
  /**
    * Deletes the specified license.
    */
  def deleteLicense(params: DeleteLicenseRequest): Request[DeleteLicenseResponse, AWSError] = js.native
  def deleteLicense(
    params: DeleteLicenseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLicenseResponse, Unit]
  ): Request[DeleteLicenseResponse, AWSError] = js.native
  
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
    * Deletes the specified report generator. This action deletes the report generator, which stops it from generating future reports. The action cannot be reversed. It has no effect on the previous reports from this generator.
    */
  def deleteLicenseManagerReportGenerator(): Request[DeleteLicenseManagerReportGeneratorResponse, AWSError] = js.native
  def deleteLicenseManagerReportGenerator(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLicenseManagerReportGeneratorResponse, Unit]
  ): Request[DeleteLicenseManagerReportGeneratorResponse, AWSError] = js.native
  /**
    * Deletes the specified report generator. This action deletes the report generator, which stops it from generating future reports. The action cannot be reversed. It has no effect on the previous reports from this generator.
    */
  def deleteLicenseManagerReportGenerator(params: DeleteLicenseManagerReportGeneratorRequest): Request[DeleteLicenseManagerReportGeneratorResponse, AWSError] = js.native
  def deleteLicenseManagerReportGenerator(
    params: DeleteLicenseManagerReportGeneratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLicenseManagerReportGeneratorResponse, Unit]
  ): Request[DeleteLicenseManagerReportGeneratorResponse, AWSError] = js.native
  
  /**
    * Deletes the specified token. Must be called in the license home Region.
    */
  def deleteToken(): Request[DeleteTokenResponse, AWSError] = js.native
  def deleteToken(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTokenResponse, Unit]): Request[DeleteTokenResponse, AWSError] = js.native
  /**
    * Deletes the specified token. Must be called in the license home Region.
    */
  def deleteToken(params: DeleteTokenRequest): Request[DeleteTokenResponse, AWSError] = js.native
  def deleteToken(
    params: DeleteTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTokenResponse, Unit]
  ): Request[DeleteTokenResponse, AWSError] = js.native
  
  /**
    * Extends the expiration date for license consumption.
    */
  def extendLicenseConsumption(): Request[ExtendLicenseConsumptionResponse, AWSError] = js.native
  def extendLicenseConsumption(callback: js.Function2[/* err */ AWSError, /* data */ ExtendLicenseConsumptionResponse, Unit]): Request[ExtendLicenseConsumptionResponse, AWSError] = js.native
  /**
    * Extends the expiration date for license consumption.
    */
  def extendLicenseConsumption(params: ExtendLicenseConsumptionRequest): Request[ExtendLicenseConsumptionResponse, AWSError] = js.native
  def extendLicenseConsumption(
    params: ExtendLicenseConsumptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExtendLicenseConsumptionResponse, Unit]
  ): Request[ExtendLicenseConsumptionResponse, AWSError] = js.native
  
  /**
    * Gets a temporary access token to use with AssumeRoleWithWebIdentity. Access tokens are valid for one hour.
    */
  def getAccessToken(): Request[GetAccessTokenResponse, AWSError] = js.native
  def getAccessToken(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessTokenResponse, Unit]): Request[GetAccessTokenResponse, AWSError] = js.native
  /**
    * Gets a temporary access token to use with AssumeRoleWithWebIdentity. Access tokens are valid for one hour.
    */
  def getAccessToken(params: GetAccessTokenRequest): Request[GetAccessTokenResponse, AWSError] = js.native
  def getAccessToken(
    params: GetAccessTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessTokenResponse, Unit]
  ): Request[GetAccessTokenResponse, AWSError] = js.native
  
  /**
    * Gets detailed information about the specified grant.
    */
  def getGrant(): Request[GetGrantResponse, AWSError] = js.native
  def getGrant(callback: js.Function2[/* err */ AWSError, /* data */ GetGrantResponse, Unit]): Request[GetGrantResponse, AWSError] = js.native
  /**
    * Gets detailed information about the specified grant.
    */
  def getGrant(params: GetGrantRequest): Request[GetGrantResponse, AWSError] = js.native
  def getGrant(
    params: GetGrantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGrantResponse, Unit]
  ): Request[GetGrantResponse, AWSError] = js.native
  
  /**
    * Gets detailed information about the specified license.
    */
  def getLicense(): Request[GetLicenseResponse, AWSError] = js.native
  def getLicense(callback: js.Function2[/* err */ AWSError, /* data */ GetLicenseResponse, Unit]): Request[GetLicenseResponse, AWSError] = js.native
  /**
    * Gets detailed information about the specified license.
    */
  def getLicense(params: GetLicenseRequest): Request[GetLicenseResponse, AWSError] = js.native
  def getLicense(
    params: GetLicenseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLicenseResponse, Unit]
  ): Request[GetLicenseResponse, AWSError] = js.native
  
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
    * Gets information about the specified license type conversion task.
    */
  def getLicenseConversionTask(): Request[GetLicenseConversionTaskResponse, AWSError] = js.native
  def getLicenseConversionTask(callback: js.Function2[/* err */ AWSError, /* data */ GetLicenseConversionTaskResponse, Unit]): Request[GetLicenseConversionTaskResponse, AWSError] = js.native
  /**
    * Gets information about the specified license type conversion task.
    */
  def getLicenseConversionTask(params: GetLicenseConversionTaskRequest): Request[GetLicenseConversionTaskResponse, AWSError] = js.native
  def getLicenseConversionTask(
    params: GetLicenseConversionTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLicenseConversionTaskResponse, Unit]
  ): Request[GetLicenseConversionTaskResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified report generator.
    */
  def getLicenseManagerReportGenerator(): Request[GetLicenseManagerReportGeneratorResponse, AWSError] = js.native
  def getLicenseManagerReportGenerator(
    callback: js.Function2[/* err */ AWSError, /* data */ GetLicenseManagerReportGeneratorResponse, Unit]
  ): Request[GetLicenseManagerReportGeneratorResponse, AWSError] = js.native
  /**
    * Gets information about the specified report generator.
    */
  def getLicenseManagerReportGenerator(params: GetLicenseManagerReportGeneratorRequest): Request[GetLicenseManagerReportGeneratorResponse, AWSError] = js.native
  def getLicenseManagerReportGenerator(
    params: GetLicenseManagerReportGeneratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLicenseManagerReportGeneratorResponse, Unit]
  ): Request[GetLicenseManagerReportGeneratorResponse, AWSError] = js.native
  
  /**
    * Gets detailed information about the usage of the specified license.
    */
  def getLicenseUsage(): Request[GetLicenseUsageResponse, AWSError] = js.native
  def getLicenseUsage(callback: js.Function2[/* err */ AWSError, /* data */ GetLicenseUsageResponse, Unit]): Request[GetLicenseUsageResponse, AWSError] = js.native
  /**
    * Gets detailed information about the usage of the specified license.
    */
  def getLicenseUsage(params: GetLicenseUsageRequest): Request[GetLicenseUsageResponse, AWSError] = js.native
  def getLicenseUsage(
    params: GetLicenseUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLicenseUsageResponse, Unit]
  ): Request[GetLicenseUsageResponse, AWSError] = js.native
  
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
    * Lists the grants distributed for the specified license.
    */
  def listDistributedGrants(): Request[ListDistributedGrantsResponse, AWSError] = js.native
  def listDistributedGrants(callback: js.Function2[/* err */ AWSError, /* data */ ListDistributedGrantsResponse, Unit]): Request[ListDistributedGrantsResponse, AWSError] = js.native
  /**
    * Lists the grants distributed for the specified license.
    */
  def listDistributedGrants(params: ListDistributedGrantsRequest): Request[ListDistributedGrantsResponse, AWSError] = js.native
  def listDistributedGrants(
    params: ListDistributedGrantsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributedGrantsResponse, Unit]
  ): Request[ListDistributedGrantsResponse, AWSError] = js.native
  
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
    * Lists the license type conversion tasks for your account.
    */
  def listLicenseConversionTasks(): Request[ListLicenseConversionTasksResponse, AWSError] = js.native
  def listLicenseConversionTasks(callback: js.Function2[/* err */ AWSError, /* data */ ListLicenseConversionTasksResponse, Unit]): Request[ListLicenseConversionTasksResponse, AWSError] = js.native
  /**
    * Lists the license type conversion tasks for your account.
    */
  def listLicenseConversionTasks(params: ListLicenseConversionTasksRequest): Request[ListLicenseConversionTasksResponse, AWSError] = js.native
  def listLicenseConversionTasks(
    params: ListLicenseConversionTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLicenseConversionTasksResponse, Unit]
  ): Request[ListLicenseConversionTasksResponse, AWSError] = js.native
  
  /**
    * Lists the report generators for your account.
    */
  def listLicenseManagerReportGenerators(): Request[ListLicenseManagerReportGeneratorsResponse, AWSError] = js.native
  def listLicenseManagerReportGenerators(
    callback: js.Function2[/* err */ AWSError, /* data */ ListLicenseManagerReportGeneratorsResponse, Unit]
  ): Request[ListLicenseManagerReportGeneratorsResponse, AWSError] = js.native
  /**
    * Lists the report generators for your account.
    */
  def listLicenseManagerReportGenerators(params: ListLicenseManagerReportGeneratorsRequest): Request[ListLicenseManagerReportGeneratorsResponse, AWSError] = js.native
  def listLicenseManagerReportGenerators(
    params: ListLicenseManagerReportGeneratorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLicenseManagerReportGeneratorsResponse, Unit]
  ): Request[ListLicenseManagerReportGeneratorsResponse, AWSError] = js.native
  
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
    * Lists all versions of the specified license.
    */
  def listLicenseVersions(): Request[ListLicenseVersionsResponse, AWSError] = js.native
  def listLicenseVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListLicenseVersionsResponse, Unit]): Request[ListLicenseVersionsResponse, AWSError] = js.native
  /**
    * Lists all versions of the specified license.
    */
  def listLicenseVersions(params: ListLicenseVersionsRequest): Request[ListLicenseVersionsResponse, AWSError] = js.native
  def listLicenseVersions(
    params: ListLicenseVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLicenseVersionsResponse, Unit]
  ): Request[ListLicenseVersionsResponse, AWSError] = js.native
  
  /**
    * Lists the licenses for your account.
    */
  def listLicenses(): Request[ListLicensesResponse, AWSError] = js.native
  def listLicenses(callback: js.Function2[/* err */ AWSError, /* data */ ListLicensesResponse, Unit]): Request[ListLicensesResponse, AWSError] = js.native
  /**
    * Lists the licenses for your account.
    */
  def listLicenses(params: ListLicensesRequest): Request[ListLicensesResponse, AWSError] = js.native
  def listLicenses(
    params: ListLicensesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLicensesResponse, Unit]
  ): Request[ListLicensesResponse, AWSError] = js.native
  
  /**
    * Lists grants that are received but not accepted.
    */
  def listReceivedGrants(): Request[ListReceivedGrantsResponse, AWSError] = js.native
  def listReceivedGrants(callback: js.Function2[/* err */ AWSError, /* data */ ListReceivedGrantsResponse, Unit]): Request[ListReceivedGrantsResponse, AWSError] = js.native
  /**
    * Lists grants that are received but not accepted.
    */
  def listReceivedGrants(params: ListReceivedGrantsRequest): Request[ListReceivedGrantsResponse, AWSError] = js.native
  def listReceivedGrants(
    params: ListReceivedGrantsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReceivedGrantsResponse, Unit]
  ): Request[ListReceivedGrantsResponse, AWSError] = js.native
  
  /**
    * Lists received licenses.
    */
  def listReceivedLicenses(): Request[ListReceivedLicensesResponse, AWSError] = js.native
  def listReceivedLicenses(callback: js.Function2[/* err */ AWSError, /* data */ ListReceivedLicensesResponse, Unit]): Request[ListReceivedLicensesResponse, AWSError] = js.native
  /**
    * Lists received licenses.
    */
  def listReceivedLicenses(params: ListReceivedLicensesRequest): Request[ListReceivedLicensesResponse, AWSError] = js.native
  def listReceivedLicenses(
    params: ListReceivedLicensesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReceivedLicensesResponse, Unit]
  ): Request[ListReceivedLicensesResponse, AWSError] = js.native
  
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
    * Lists your tokens.
    */
  def listTokens(): Request[ListTokensResponse, AWSError] = js.native
  def listTokens(callback: js.Function2[/* err */ AWSError, /* data */ ListTokensResponse, Unit]): Request[ListTokensResponse, AWSError] = js.native
  /**
    * Lists your tokens.
    */
  def listTokens(params: ListTokensRequest): Request[ListTokensResponse, AWSError] = js.native
  def listTokens(
    params: ListTokensRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTokensResponse, Unit]
  ): Request[ListTokensResponse, AWSError] = js.native
  
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
    * Rejects the specified grant.
    */
  def rejectGrant(): Request[RejectGrantResponse, AWSError] = js.native
  def rejectGrant(callback: js.Function2[/* err */ AWSError, /* data */ RejectGrantResponse, Unit]): Request[RejectGrantResponse, AWSError] = js.native
  /**
    * Rejects the specified grant.
    */
  def rejectGrant(params: RejectGrantRequest): Request[RejectGrantResponse, AWSError] = js.native
  def rejectGrant(
    params: RejectGrantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectGrantResponse, Unit]
  ): Request[RejectGrantResponse, AWSError] = js.native
  
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
    * Modifies the attributes of an existing license configuration.
    */
  def updateLicenseConfiguration(): Request[UpdateLicenseConfigurationResponse, AWSError] = js.native
  def updateLicenseConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLicenseConfigurationResponse, Unit]): Request[UpdateLicenseConfigurationResponse, AWSError] = js.native
  /**
    * Modifies the attributes of an existing license configuration.
    */
  def updateLicenseConfiguration(params: UpdateLicenseConfigurationRequest): Request[UpdateLicenseConfigurationResponse, AWSError] = js.native
  def updateLicenseConfiguration(
    params: UpdateLicenseConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLicenseConfigurationResponse, Unit]
  ): Request[UpdateLicenseConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates a report generator. After you make changes to a report generator, it starts generating new reports within 60 minutes of being updated.
    */
  def updateLicenseManagerReportGenerator(): Request[UpdateLicenseManagerReportGeneratorResponse, AWSError] = js.native
  def updateLicenseManagerReportGenerator(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLicenseManagerReportGeneratorResponse, Unit]
  ): Request[UpdateLicenseManagerReportGeneratorResponse, AWSError] = js.native
  /**
    * Updates a report generator. After you make changes to a report generator, it starts generating new reports within 60 minutes of being updated.
    */
  def updateLicenseManagerReportGenerator(params: UpdateLicenseManagerReportGeneratorRequest): Request[UpdateLicenseManagerReportGeneratorResponse, AWSError] = js.native
  def updateLicenseManagerReportGenerator(
    params: UpdateLicenseManagerReportGeneratorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLicenseManagerReportGeneratorResponse, Unit]
  ): Request[UpdateLicenseManagerReportGeneratorResponse, AWSError] = js.native
  
  /**
    * Adds or removes the specified license configurations for the specified Amazon Web Services resource. You can update the license specifications of AMIs, instances, and hosts. You cannot update the license specifications for launch templates and CloudFormation templates, as they send license configurations to the operation that creates the resource.
    */
  def updateLicenseSpecificationsForResource(): Request[UpdateLicenseSpecificationsForResourceResponse, AWSError] = js.native
  def updateLicenseSpecificationsForResource(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLicenseSpecificationsForResourceResponse, Unit]
  ): Request[UpdateLicenseSpecificationsForResourceResponse, AWSError] = js.native
  /**
    * Adds or removes the specified license configurations for the specified Amazon Web Services resource. You can update the license specifications of AMIs, instances, and hosts. You cannot update the license specifications for launch templates and CloudFormation templates, as they send license configurations to the operation that creates the resource.
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
