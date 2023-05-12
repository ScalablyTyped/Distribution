package typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseManagerLinuxSubscriptions extends Service {
  
  @JSName("config")
  var config_LicenseManagerLinuxSubscriptions: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Lists the Linux subscriptions service settings.
    */
  def getServiceSettings(): Request[GetServiceSettingsResponse, AWSError] = js.native
  def getServiceSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetServiceSettingsResponse, Unit]): Request[GetServiceSettingsResponse, AWSError] = js.native
  /**
    * Lists the Linux subscriptions service settings.
    */
  def getServiceSettings(params: GetServiceSettingsRequest): Request[GetServiceSettingsResponse, AWSError] = js.native
  def getServiceSettings(
    params: GetServiceSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServiceSettingsResponse, Unit]
  ): Request[GetServiceSettingsResponse, AWSError] = js.native
  
  /**
    * Lists the running Amazon EC2 instances that were discovered with commercial Linux subscriptions.
    */
  def listLinuxSubscriptionInstances(): Request[ListLinuxSubscriptionInstancesResponse, AWSError] = js.native
  def listLinuxSubscriptionInstances(
    callback: js.Function2[/* err */ AWSError, /* data */ ListLinuxSubscriptionInstancesResponse, Unit]
  ): Request[ListLinuxSubscriptionInstancesResponse, AWSError] = js.native
  /**
    * Lists the running Amazon EC2 instances that were discovered with commercial Linux subscriptions.
    */
  def listLinuxSubscriptionInstances(params: ListLinuxSubscriptionInstancesRequest): Request[ListLinuxSubscriptionInstancesResponse, AWSError] = js.native
  def listLinuxSubscriptionInstances(
    params: ListLinuxSubscriptionInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLinuxSubscriptionInstancesResponse, Unit]
  ): Request[ListLinuxSubscriptionInstancesResponse, AWSError] = js.native
  
  /**
    * Lists the Linux subscriptions that have been discovered. If you have linked your organization, the returned results will include data aggregated across your accounts in Organizations.
    */
  def listLinuxSubscriptions(): Request[ListLinuxSubscriptionsResponse, AWSError] = js.native
  def listLinuxSubscriptions(callback: js.Function2[/* err */ AWSError, /* data */ ListLinuxSubscriptionsResponse, Unit]): Request[ListLinuxSubscriptionsResponse, AWSError] = js.native
  /**
    * Lists the Linux subscriptions that have been discovered. If you have linked your organization, the returned results will include data aggregated across your accounts in Organizations.
    */
  def listLinuxSubscriptions(params: ListLinuxSubscriptionsRequest): Request[ListLinuxSubscriptionsResponse, AWSError] = js.native
  def listLinuxSubscriptions(
    params: ListLinuxSubscriptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLinuxSubscriptionsResponse, Unit]
  ): Request[ListLinuxSubscriptionsResponse, AWSError] = js.native
  
  /**
    * Updates the service settings for Linux subscriptions.
    */
  def updateServiceSettings(): Request[UpdateServiceSettingsResponse, AWSError] = js.native
  def updateServiceSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceSettingsResponse, Unit]): Request[UpdateServiceSettingsResponse, AWSError] = js.native
  /**
    * Updates the service settings for Linux subscriptions.
    */
  def updateServiceSettings(params: UpdateServiceSettingsRequest): Request[UpdateServiceSettingsResponse, AWSError] = js.native
  def updateServiceSettings(
    params: UpdateServiceSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceSettingsResponse, Unit]
  ): Request[UpdateServiceSettingsResponse, AWSError] = js.native
}
