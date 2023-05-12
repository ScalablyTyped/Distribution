package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseManagerUserSubscriptions extends Service {
  
  /**
    * Associates the user to an EC2 instance to utilize user-based subscriptions.  Your estimated bill for charges on the number of users and related costs will take 48 hours to appear for billing periods that haven't closed (marked as Pending billing status) in Amazon Web Services Billing. For more information, see Viewing your monthly charges in the Amazon Web Services Billing User Guide. 
    */
  def associateUser(): Request[AssociateUserResponse, AWSError] = js.native
  def associateUser(callback: js.Function2[/* err */ AWSError, /* data */ AssociateUserResponse, Unit]): Request[AssociateUserResponse, AWSError] = js.native
  /**
    * Associates the user to an EC2 instance to utilize user-based subscriptions.  Your estimated bill for charges on the number of users and related costs will take 48 hours to appear for billing periods that haven't closed (marked as Pending billing status) in Amazon Web Services Billing. For more information, see Viewing your monthly charges in the Amazon Web Services Billing User Guide. 
    */
  def associateUser(params: AssociateUserRequest): Request[AssociateUserResponse, AWSError] = js.native
  def associateUser(
    params: AssociateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateUserResponse, Unit]
  ): Request[AssociateUserResponse, AWSError] = js.native
  
  @JSName("config")
  var config_LicenseManagerUserSubscriptions: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Deregisters the identity provider from providing user-based subscriptions.
    */
  def deregisterIdentityProvider(): Request[DeregisterIdentityProviderResponse, AWSError] = js.native
  def deregisterIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterIdentityProviderResponse, Unit]): Request[DeregisterIdentityProviderResponse, AWSError] = js.native
  /**
    * Deregisters the identity provider from providing user-based subscriptions.
    */
  def deregisterIdentityProvider(params: DeregisterIdentityProviderRequest): Request[DeregisterIdentityProviderResponse, AWSError] = js.native
  def deregisterIdentityProvider(
    params: DeregisterIdentityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterIdentityProviderResponse, Unit]
  ): Request[DeregisterIdentityProviderResponse, AWSError] = js.native
  
  /**
    * Disassociates the user from an EC2 instance providing user-based subscriptions.
    */
  def disassociateUser(): Request[DisassociateUserResponse, AWSError] = js.native
  def disassociateUser(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateUserResponse, Unit]): Request[DisassociateUserResponse, AWSError] = js.native
  /**
    * Disassociates the user from an EC2 instance providing user-based subscriptions.
    */
  def disassociateUser(params: DisassociateUserRequest): Request[DisassociateUserResponse, AWSError] = js.native
  def disassociateUser(
    params: DisassociateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateUserResponse, Unit]
  ): Request[DisassociateUserResponse, AWSError] = js.native
  
  /**
    * Lists the identity providers for user-based subscriptions.
    */
  def listIdentityProviders(): Request[ListIdentityProvidersResponse, AWSError] = js.native
  def listIdentityProviders(callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityProvidersResponse, Unit]): Request[ListIdentityProvidersResponse, AWSError] = js.native
  /**
    * Lists the identity providers for user-based subscriptions.
    */
  def listIdentityProviders(params: ListIdentityProvidersRequest): Request[ListIdentityProvidersResponse, AWSError] = js.native
  def listIdentityProviders(
    params: ListIdentityProvidersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityProvidersResponse, Unit]
  ): Request[ListIdentityProvidersResponse, AWSError] = js.native
  
  /**
    * Lists the EC2 instances providing user-based subscriptions.
    */
  def listInstances(): Request[ListInstancesResponse, AWSError] = js.native
  def listInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesResponse, Unit]): Request[ListInstancesResponse, AWSError] = js.native
  /**
    * Lists the EC2 instances providing user-based subscriptions.
    */
  def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse, AWSError] = js.native
  def listInstances(
    params: ListInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesResponse, Unit]
  ): Request[ListInstancesResponse, AWSError] = js.native
  
  /**
    * Lists the user-based subscription products available from an identity provider.
    */
  def listProductSubscriptions(): Request[ListProductSubscriptionsResponse, AWSError] = js.native
  def listProductSubscriptions(callback: js.Function2[/* err */ AWSError, /* data */ ListProductSubscriptionsResponse, Unit]): Request[ListProductSubscriptionsResponse, AWSError] = js.native
  /**
    * Lists the user-based subscription products available from an identity provider.
    */
  def listProductSubscriptions(params: ListProductSubscriptionsRequest): Request[ListProductSubscriptionsResponse, AWSError] = js.native
  def listProductSubscriptions(
    params: ListProductSubscriptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProductSubscriptionsResponse, Unit]
  ): Request[ListProductSubscriptionsResponse, AWSError] = js.native
  
  /**
    * Lists user associations for an identity provider.
    */
  def listUserAssociations(): Request[ListUserAssociationsResponse, AWSError] = js.native
  def listUserAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListUserAssociationsResponse, Unit]): Request[ListUserAssociationsResponse, AWSError] = js.native
  /**
    * Lists user associations for an identity provider.
    */
  def listUserAssociations(params: ListUserAssociationsRequest): Request[ListUserAssociationsResponse, AWSError] = js.native
  def listUserAssociations(
    params: ListUserAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserAssociationsResponse, Unit]
  ): Request[ListUserAssociationsResponse, AWSError] = js.native
  
  /**
    * Registers an identity provider for user-based subscriptions.
    */
  def registerIdentityProvider(): Request[RegisterIdentityProviderResponse, AWSError] = js.native
  def registerIdentityProvider(callback: js.Function2[/* err */ AWSError, /* data */ RegisterIdentityProviderResponse, Unit]): Request[RegisterIdentityProviderResponse, AWSError] = js.native
  /**
    * Registers an identity provider for user-based subscriptions.
    */
  def registerIdentityProvider(params: RegisterIdentityProviderRequest): Request[RegisterIdentityProviderResponse, AWSError] = js.native
  def registerIdentityProvider(
    params: RegisterIdentityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterIdentityProviderResponse, Unit]
  ): Request[RegisterIdentityProviderResponse, AWSError] = js.native
  
  /**
    * Starts a product subscription for a user with the specified identity provider.  Your estimated bill for charges on the number of users and related costs will take 48 hours to appear for billing periods that haven't closed (marked as Pending billing status) in Amazon Web Services Billing. For more information, see Viewing your monthly charges in the Amazon Web Services Billing User Guide. 
    */
  def startProductSubscription(): Request[StartProductSubscriptionResponse, AWSError] = js.native
  def startProductSubscription(callback: js.Function2[/* err */ AWSError, /* data */ StartProductSubscriptionResponse, Unit]): Request[StartProductSubscriptionResponse, AWSError] = js.native
  /**
    * Starts a product subscription for a user with the specified identity provider.  Your estimated bill for charges on the number of users and related costs will take 48 hours to appear for billing periods that haven't closed (marked as Pending billing status) in Amazon Web Services Billing. For more information, see Viewing your monthly charges in the Amazon Web Services Billing User Guide. 
    */
  def startProductSubscription(params: StartProductSubscriptionRequest): Request[StartProductSubscriptionResponse, AWSError] = js.native
  def startProductSubscription(
    params: StartProductSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartProductSubscriptionResponse, Unit]
  ): Request[StartProductSubscriptionResponse, AWSError] = js.native
  
  /**
    * Stops a product subscription for a user with the specified identity provider.
    */
  def stopProductSubscription(): Request[StopProductSubscriptionResponse, AWSError] = js.native
  def stopProductSubscription(callback: js.Function2[/* err */ AWSError, /* data */ StopProductSubscriptionResponse, Unit]): Request[StopProductSubscriptionResponse, AWSError] = js.native
  /**
    * Stops a product subscription for a user with the specified identity provider.
    */
  def stopProductSubscription(params: StopProductSubscriptionRequest): Request[StopProductSubscriptionResponse, AWSError] = js.native
  def stopProductSubscription(
    params: StopProductSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopProductSubscriptionResponse, Unit]
  ): Request[StopProductSubscriptionResponse, AWSError] = js.native
  
  /**
    * Updates additional product configuration settings for the registered identity provider.
    */
  def updateIdentityProviderSettings(): Request[UpdateIdentityProviderSettingsResponse, AWSError] = js.native
  def updateIdentityProviderSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIdentityProviderSettingsResponse, Unit]
  ): Request[UpdateIdentityProviderSettingsResponse, AWSError] = js.native
  /**
    * Updates additional product configuration settings for the registered identity provider.
    */
  def updateIdentityProviderSettings(params: UpdateIdentityProviderSettingsRequest): Request[UpdateIdentityProviderSettingsResponse, AWSError] = js.native
  def updateIdentityProviderSettings(
    params: UpdateIdentityProviderSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIdentityProviderSettingsResponse, Unit]
  ): Request[UpdateIdentityProviderSettingsResponse, AWSError] = js.native
}
