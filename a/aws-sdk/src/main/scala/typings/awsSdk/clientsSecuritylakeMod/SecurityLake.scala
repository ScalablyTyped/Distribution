package typings.awsSdk.clientsSecuritylakeMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityLake extends Service {
  
  @JSName("config")
  var config_SecurityLake: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Adds a natively supported Amazon Web Service as an Amazon Security Lake source. Enables source types for member accounts in required Amazon Web Services Regions, based on the parameters you specify. You can choose any source type in any Region for either accounts that are part of a trusted organization or standalone accounts. At least one of the three dimensions is a mandatory input to this API. However, you can supply any combination of the three dimensions to this API.  By default, a dimension refers to the entire set. When you don't provide a dimension, Security Lake assumes that the missing dimension refers to the entire set. This is overridden when you supply any one of the inputs. For instance, when you do not specify members, the API enables all Security Lake member accounts for all sources. Similarly, when you do not specify Regions, Security Lake is enabled for all the Regions where Security Lake is available as a service. You can use this API only to enable natively supported Amazon Web Services as a source. Use CreateCustomLogSource to enable data collection from a custom source. 
    */
  def createAwsLogSource(): Request[CreateAwsLogSourceResponse, AWSError] = js.native
  def createAwsLogSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateAwsLogSourceResponse, Unit]): Request[CreateAwsLogSourceResponse, AWSError] = js.native
  /**
    * Adds a natively supported Amazon Web Service as an Amazon Security Lake source. Enables source types for member accounts in required Amazon Web Services Regions, based on the parameters you specify. You can choose any source type in any Region for either accounts that are part of a trusted organization or standalone accounts. At least one of the three dimensions is a mandatory input to this API. However, you can supply any combination of the three dimensions to this API.  By default, a dimension refers to the entire set. When you don't provide a dimension, Security Lake assumes that the missing dimension refers to the entire set. This is overridden when you supply any one of the inputs. For instance, when you do not specify members, the API enables all Security Lake member accounts for all sources. Similarly, when you do not specify Regions, Security Lake is enabled for all the Regions where Security Lake is available as a service. You can use this API only to enable natively supported Amazon Web Services as a source. Use CreateCustomLogSource to enable data collection from a custom source. 
    */
  def createAwsLogSource(params: CreateAwsLogSourceRequest): Request[CreateAwsLogSourceResponse, AWSError] = js.native
  def createAwsLogSource(
    params: CreateAwsLogSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAwsLogSourceResponse, Unit]
  ): Request[CreateAwsLogSourceResponse, AWSError] = js.native
  
  /**
    * Adds a third-party custom source in Amazon Security Lake, from the Amazon Web Services Region where you want to create a custom source. Security Lake can collect logs and events from third-party custom sources. After creating the appropriate IAM role to invoke Glue crawler, use this API to add a custom source name in Security Lake. This operation creates a partition in the Amazon S3 bucket for Security Lake as the target location for log files from the custom source in addition to an associated Glue table and an Glue crawler.
    */
  def createCustomLogSource(): Request[CreateCustomLogSourceResponse, AWSError] = js.native
  def createCustomLogSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomLogSourceResponse, Unit]): Request[CreateCustomLogSourceResponse, AWSError] = js.native
  /**
    * Adds a third-party custom source in Amazon Security Lake, from the Amazon Web Services Region where you want to create a custom source. Security Lake can collect logs and events from third-party custom sources. After creating the appropriate IAM role to invoke Glue crawler, use this API to add a custom source name in Security Lake. This operation creates a partition in the Amazon S3 bucket for Security Lake as the target location for log files from the custom source in addition to an associated Glue table and an Glue crawler.
    */
  def createCustomLogSource(params: CreateCustomLogSourceRequest): Request[CreateCustomLogSourceResponse, AWSError] = js.native
  def createCustomLogSource(
    params: CreateCustomLogSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCustomLogSourceResponse, Unit]
  ): Request[CreateCustomLogSourceResponse, AWSError] = js.native
  
  /**
    * Initializes an Amazon Security Lake instance with the provided (or default) configuration. You can enable Security Lake in Amazon Web Services Regions with customized settings before enabling log collection in Regions. You can either use the enableAll parameter to specify all Regions or specify the Regions where you want to enable Security Lake. To specify particular Regions, use the Regions parameter and then configure these Regions using the configurations parameter. If you have already enabled Security Lake in a Region when you call this command, the command will update the Region if you provide new configuration parameters. If you have not already enabled Security Lake in the Region when you call this API, it will set up the data lake in the Region with the specified configurations. When you enable Security Lake, it starts ingesting security data after the CreateAwsLogSource call. This includes ingesting security data from sources, storing data, and making data accessible to subscribers. Security Lake also enables all the existing settings and resources that it stores or maintains for your Amazon Web Services account in the current Region, including security log and event data. For more information, see the Amazon Security Lake User Guide.
    */
  def createDatalake(): Request[CreateDatalakeResponse, AWSError] = js.native
  def createDatalake(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatalakeResponse, Unit]): Request[CreateDatalakeResponse, AWSError] = js.native
  /**
    * Initializes an Amazon Security Lake instance with the provided (or default) configuration. You can enable Security Lake in Amazon Web Services Regions with customized settings before enabling log collection in Regions. You can either use the enableAll parameter to specify all Regions or specify the Regions where you want to enable Security Lake. To specify particular Regions, use the Regions parameter and then configure these Regions using the configurations parameter. If you have already enabled Security Lake in a Region when you call this command, the command will update the Region if you provide new configuration parameters. If you have not already enabled Security Lake in the Region when you call this API, it will set up the data lake in the Region with the specified configurations. When you enable Security Lake, it starts ingesting security data after the CreateAwsLogSource call. This includes ingesting security data from sources, storing data, and making data accessible to subscribers. Security Lake also enables all the existing settings and resources that it stores or maintains for your Amazon Web Services account in the current Region, including security log and event data. For more information, see the Amazon Security Lake User Guide.
    */
  def createDatalake(params: CreateDatalakeRequest): Request[CreateDatalakeResponse, AWSError] = js.native
  def createDatalake(
    params: CreateDatalakeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatalakeResponse, Unit]
  ): Request[CreateDatalakeResponse, AWSError] = js.native
  
  /**
    * Automatically enables Amazon Security Lake for new member accounts in your organization. Security Lake is not automatically enabled for any existing member accounts in your organization.
    */
  def createDatalakeAutoEnable(): Request[CreateDatalakeAutoEnableResponse, AWSError] = js.native
  def createDatalakeAutoEnable(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatalakeAutoEnableResponse, Unit]): Request[CreateDatalakeAutoEnableResponse, AWSError] = js.native
  /**
    * Automatically enables Amazon Security Lake for new member accounts in your organization. Security Lake is not automatically enabled for any existing member accounts in your organization.
    */
  def createDatalakeAutoEnable(params: CreateDatalakeAutoEnableRequest): Request[CreateDatalakeAutoEnableResponse, AWSError] = js.native
  def createDatalakeAutoEnable(
    params: CreateDatalakeAutoEnableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatalakeAutoEnableResponse, Unit]
  ): Request[CreateDatalakeAutoEnableResponse, AWSError] = js.native
  
  /**
    * Designates the Amazon Security Lake delegated administrator account for the organization. This API can only be called by the organization management account. The organization management account cannot be the delegated administrator account.
    */
  def createDatalakeDelegatedAdmin(): Request[CreateDatalakeDelegatedAdminResponse, AWSError] = js.native
  def createDatalakeDelegatedAdmin(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatalakeDelegatedAdminResponse, Unit]): Request[CreateDatalakeDelegatedAdminResponse, AWSError] = js.native
  /**
    * Designates the Amazon Security Lake delegated administrator account for the organization. This API can only be called by the organization management account. The organization management account cannot be the delegated administrator account.
    */
  def createDatalakeDelegatedAdmin(params: CreateDatalakeDelegatedAdminRequest): Request[CreateDatalakeDelegatedAdminResponse, AWSError] = js.native
  def createDatalakeDelegatedAdmin(
    params: CreateDatalakeDelegatedAdminRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatalakeDelegatedAdminResponse, Unit]
  ): Request[CreateDatalakeDelegatedAdminResponse, AWSError] = js.native
  
  /**
    * Creates the specified notification subscription in Amazon Security Lake for the organization you specify.
    */
  def createDatalakeExceptionsSubscription(): Request[CreateDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  def createDatalakeExceptionsSubscription(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatalakeExceptionsSubscriptionResponse, Unit]
  ): Request[CreateDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  /**
    * Creates the specified notification subscription in Amazon Security Lake for the organization you specify.
    */
  def createDatalakeExceptionsSubscription(params: CreateDatalakeExceptionsSubscriptionRequest): Request[CreateDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  def createDatalakeExceptionsSubscription(
    params: CreateDatalakeExceptionsSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatalakeExceptionsSubscriptionResponse, Unit]
  ): Request[CreateDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  
  /**
    * Creates a subscription permission for accounts that are already enabled in Amazon Security Lake. You can create a subscriber with access to data in the current Amazon Web Services Region.
    */
  def createSubscriber(): Request[CreateSubscriberResponse, AWSError] = js.native
  def createSubscriber(callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriberResponse, Unit]): Request[CreateSubscriberResponse, AWSError] = js.native
  /**
    * Creates a subscription permission for accounts that are already enabled in Amazon Security Lake. You can create a subscriber with access to data in the current Amazon Web Services Region.
    */
  def createSubscriber(params: CreateSubscriberRequest): Request[CreateSubscriberResponse, AWSError] = js.native
  def createSubscriber(
    params: CreateSubscriberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriberResponse, Unit]
  ): Request[CreateSubscriberResponse, AWSError] = js.native
  
  /**
    * Notifies the subscriber when new data is written to the data lake for the sources that the subscriber consumes in Security Lake. You can create only one subscriber notification per subscriber.
    */
  def createSubscriptionNotificationConfiguration(): Request[CreateSubscriptionNotificationConfigurationResponse, AWSError] = js.native
  def createSubscriptionNotificationConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateSubscriptionNotificationConfigurationResponse, 
      Unit
    ]
  ): Request[CreateSubscriptionNotificationConfigurationResponse, AWSError] = js.native
  /**
    * Notifies the subscriber when new data is written to the data lake for the sources that the subscriber consumes in Security Lake. You can create only one subscriber notification per subscriber.
    */
  def createSubscriptionNotificationConfiguration(params: CreateSubscriptionNotificationConfigurationRequest): Request[CreateSubscriptionNotificationConfigurationResponse, AWSError] = js.native
  def createSubscriptionNotificationConfiguration(
    params: CreateSubscriptionNotificationConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ CreateSubscriptionNotificationConfigurationResponse, 
      Unit
    ]
  ): Request[CreateSubscriptionNotificationConfigurationResponse, AWSError] = js.native
  
  /**
    * Removes a natively supported Amazon Web Service as an Amazon Security Lake source. When you remove the source, Security Lake stops collecting data from that source, and subscribers can no longer consume new data from the source. Subscribers can still consume data that Security Lake collected from the source before disablement. You can choose any source type in any Amazon Web Services Region for either accounts that are part of a trusted organization or standalone accounts. At least one of the three dimensions is a mandatory input to this API. However, you can supply any combination of the three dimensions to this API.  By default, a dimension refers to the entire set. This is overridden when you supply any one of the inputs. For instance, when you do not specify members, the API disables all Security Lake member accounts for sources. Similarly, when you do not specify Regions, Security Lake is disabled for all the Regions where Security Lake is available as a service. When you don't provide a dimension, Security Lake assumes that the missing dimension refers to the entire set. For example, if you don't provide specific accounts, the API applies to the entire set of accounts in your organization.
    */
  def deleteAwsLogSource(): Request[DeleteAwsLogSourceResponse, AWSError] = js.native
  def deleteAwsLogSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAwsLogSourceResponse, Unit]): Request[DeleteAwsLogSourceResponse, AWSError] = js.native
  /**
    * Removes a natively supported Amazon Web Service as an Amazon Security Lake source. When you remove the source, Security Lake stops collecting data from that source, and subscribers can no longer consume new data from the source. Subscribers can still consume data that Security Lake collected from the source before disablement. You can choose any source type in any Amazon Web Services Region for either accounts that are part of a trusted organization or standalone accounts. At least one of the three dimensions is a mandatory input to this API. However, you can supply any combination of the three dimensions to this API.  By default, a dimension refers to the entire set. This is overridden when you supply any one of the inputs. For instance, when you do not specify members, the API disables all Security Lake member accounts for sources. Similarly, when you do not specify Regions, Security Lake is disabled for all the Regions where Security Lake is available as a service. When you don't provide a dimension, Security Lake assumes that the missing dimension refers to the entire set. For example, if you don't provide specific accounts, the API applies to the entire set of accounts in your organization.
    */
  def deleteAwsLogSource(params: DeleteAwsLogSourceRequest): Request[DeleteAwsLogSourceResponse, AWSError] = js.native
  def deleteAwsLogSource(
    params: DeleteAwsLogSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAwsLogSourceResponse, Unit]
  ): Request[DeleteAwsLogSourceResponse, AWSError] = js.native
  
  /**
    * Removes a custom log source from Amazon Security Lake.
    */
  def deleteCustomLogSource(): Request[DeleteCustomLogSourceResponse, AWSError] = js.native
  def deleteCustomLogSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomLogSourceResponse, Unit]): Request[DeleteCustomLogSourceResponse, AWSError] = js.native
  /**
    * Removes a custom log source from Amazon Security Lake.
    */
  def deleteCustomLogSource(params: DeleteCustomLogSourceRequest): Request[DeleteCustomLogSourceResponse, AWSError] = js.native
  def deleteCustomLogSource(
    params: DeleteCustomLogSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomLogSourceResponse, Unit]
  ): Request[DeleteCustomLogSourceResponse, AWSError] = js.native
  
  /**
    * When you delete Amazon Security Lake from your account, Security Lake is disabled in all Amazon Web Services Regions. Also, this API automatically takes steps to remove the account from Security Lake .  This operation disables security data collection from sources, deletes data stored, and stops making data accessible to subscribers. Security Lake also deletes all the existing settings and resources that it stores or maintains for your Amazon Web Services account in the current Region, including security log and event data. The DeleteDatalake operation does not delete the Amazon S3 bucket, which is owned by your Amazon Web Services account. For more information, see the Amazon Security Lake User Guide.
    */
  def deleteDatalake(): Request[DeleteDatalakeResponse, AWSError] = js.native
  def deleteDatalake(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatalakeResponse, Unit]): Request[DeleteDatalakeResponse, AWSError] = js.native
  /**
    * When you delete Amazon Security Lake from your account, Security Lake is disabled in all Amazon Web Services Regions. Also, this API automatically takes steps to remove the account from Security Lake .  This operation disables security data collection from sources, deletes data stored, and stops making data accessible to subscribers. Security Lake also deletes all the existing settings and resources that it stores or maintains for your Amazon Web Services account in the current Region, including security log and event data. The DeleteDatalake operation does not delete the Amazon S3 bucket, which is owned by your Amazon Web Services account. For more information, see the Amazon Security Lake User Guide.
    */
  def deleteDatalake(params: DeleteDatalakeRequest): Request[DeleteDatalakeResponse, AWSError] = js.native
  def deleteDatalake(
    params: DeleteDatalakeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatalakeResponse, Unit]
  ): Request[DeleteDatalakeResponse, AWSError] = js.native
  
  /**
    *  DeleteDatalakeAutoEnable removes automatic enablement of configuration settings for new member accounts (but keeps settings for the delegated administrator) from Amazon Security Lake. You must run this API using credentials of the delegated administrator. When you run this API, new member accounts that are added after the organization enables Security Lake won't contribute to the data lake.
    */
  def deleteDatalakeAutoEnable(): Request[DeleteDatalakeAutoEnableResponse, AWSError] = js.native
  def deleteDatalakeAutoEnable(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatalakeAutoEnableResponse, Unit]): Request[DeleteDatalakeAutoEnableResponse, AWSError] = js.native
  /**
    *  DeleteDatalakeAutoEnable removes automatic enablement of configuration settings for new member accounts (but keeps settings for the delegated administrator) from Amazon Security Lake. You must run this API using credentials of the delegated administrator. When you run this API, new member accounts that are added after the organization enables Security Lake won't contribute to the data lake.
    */
  def deleteDatalakeAutoEnable(params: DeleteDatalakeAutoEnableRequest): Request[DeleteDatalakeAutoEnableResponse, AWSError] = js.native
  def deleteDatalakeAutoEnable(
    params: DeleteDatalakeAutoEnableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatalakeAutoEnableResponse, Unit]
  ): Request[DeleteDatalakeAutoEnableResponse, AWSError] = js.native
  
  /**
    * Deletes the Amazon Security Lake delegated administrator account for the organization. This API can only be called by the organization management account. The organization management account cannot be the delegated administrator account.
    */
  def deleteDatalakeDelegatedAdmin(): Request[DeleteDatalakeDelegatedAdminResponse, AWSError] = js.native
  def deleteDatalakeDelegatedAdmin(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatalakeDelegatedAdminResponse, Unit]): Request[DeleteDatalakeDelegatedAdminResponse, AWSError] = js.native
  /**
    * Deletes the Amazon Security Lake delegated administrator account for the organization. This API can only be called by the organization management account. The organization management account cannot be the delegated administrator account.
    */
  def deleteDatalakeDelegatedAdmin(params: DeleteDatalakeDelegatedAdminRequest): Request[DeleteDatalakeDelegatedAdminResponse, AWSError] = js.native
  def deleteDatalakeDelegatedAdmin(
    params: DeleteDatalakeDelegatedAdminRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatalakeDelegatedAdminResponse, Unit]
  ): Request[DeleteDatalakeDelegatedAdminResponse, AWSError] = js.native
  
  /**
    * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
    */
  def deleteDatalakeExceptionsSubscription(): Request[DeleteDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  def deleteDatalakeExceptionsSubscription(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatalakeExceptionsSubscriptionResponse, Unit]
  ): Request[DeleteDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  /**
    * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
    */
  def deleteDatalakeExceptionsSubscription(params: DeleteDatalakeExceptionsSubscriptionRequest): Request[DeleteDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  def deleteDatalakeExceptionsSubscription(
    params: DeleteDatalakeExceptionsSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatalakeExceptionsSubscriptionResponse, Unit]
  ): Request[DeleteDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  
  /**
    * Deletes the subscription permission for accounts that are already enabled in Amazon Security Lake. You can delete a subscriber and remove access to data in the current Amazon Web Services Region.
    */
  def deleteSubscriber(): Request[DeleteSubscriberResponse, AWSError] = js.native
  def deleteSubscriber(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriberResponse, Unit]): Request[DeleteSubscriberResponse, AWSError] = js.native
  /**
    * Deletes the subscription permission for accounts that are already enabled in Amazon Security Lake. You can delete a subscriber and remove access to data in the current Amazon Web Services Region.
    */
  def deleteSubscriber(params: DeleteSubscriberRequest): Request[DeleteSubscriberResponse, AWSError] = js.native
  def deleteSubscriber(
    params: DeleteSubscriberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriberResponse, Unit]
  ): Request[DeleteSubscriberResponse, AWSError] = js.native
  
  /**
    * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
    */
  def deleteSubscriptionNotificationConfiguration(): Request[DeleteSubscriptionNotificationConfigurationResponse, AWSError] = js.native
  def deleteSubscriptionNotificationConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteSubscriptionNotificationConfigurationResponse, 
      Unit
    ]
  ): Request[DeleteSubscriptionNotificationConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the specified notification subscription in Amazon Security Lake for the organization you specify.
    */
  def deleteSubscriptionNotificationConfiguration(params: DeleteSubscriptionNotificationConfigurationRequest): Request[DeleteSubscriptionNotificationConfigurationResponse, AWSError] = js.native
  def deleteSubscriptionNotificationConfiguration(
    params: DeleteSubscriptionNotificationConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteSubscriptionNotificationConfigurationResponse, 
      Unit
    ]
  ): Request[DeleteSubscriptionNotificationConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves the Amazon Security Lake configuration object for the specified Amazon Web Services account ID. You can use the GetDatalake API to know whether Security Lake is enabled for the current Region. This API does not take input parameters. 
    */
  def getDatalake(): Request[GetDatalakeResponse, AWSError] = js.native
  def getDatalake(callback: js.Function2[/* err */ AWSError, /* data */ GetDatalakeResponse, Unit]): Request[GetDatalakeResponse, AWSError] = js.native
  /**
    * Retrieves the Amazon Security Lake configuration object for the specified Amazon Web Services account ID. You can use the GetDatalake API to know whether Security Lake is enabled for the current Region. This API does not take input parameters. 
    */
  def getDatalake(params: GetDatalakeRequest): Request[GetDatalakeResponse, AWSError] = js.native
  def getDatalake(
    params: GetDatalakeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatalakeResponse, Unit]
  ): Request[GetDatalakeResponse, AWSError] = js.native
  
  /**
    * Retrieves the configuration that will be automatically set up for accounts added to the organization after the organization has onboarded to Amazon Security Lake. This API does not take input parameters.
    */
  def getDatalakeAutoEnable(): Request[GetDatalakeAutoEnableResponse, AWSError] = js.native
  def getDatalakeAutoEnable(callback: js.Function2[/* err */ AWSError, /* data */ GetDatalakeAutoEnableResponse, Unit]): Request[GetDatalakeAutoEnableResponse, AWSError] = js.native
  /**
    * Retrieves the configuration that will be automatically set up for accounts added to the organization after the organization has onboarded to Amazon Security Lake. This API does not take input parameters.
    */
  def getDatalakeAutoEnable(params: GetDatalakeAutoEnableRequest): Request[GetDatalakeAutoEnableResponse, AWSError] = js.native
  def getDatalakeAutoEnable(
    params: GetDatalakeAutoEnableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatalakeAutoEnableResponse, Unit]
  ): Request[GetDatalakeAutoEnableResponse, AWSError] = js.native
  
  /**
    * Retrieves the expiration period and time-to-live (TTL) for which the exception message will remain. Exceptions are stored by default, for 2 weeks from when a record was created in Amazon Security Lake. This API does not take input parameters.
    */
  def getDatalakeExceptionsExpiry(): Request[GetDatalakeExceptionsExpiryResponse, AWSError] = js.native
  def getDatalakeExceptionsExpiry(callback: js.Function2[/* err */ AWSError, /* data */ GetDatalakeExceptionsExpiryResponse, Unit]): Request[GetDatalakeExceptionsExpiryResponse, AWSError] = js.native
  /**
    * Retrieves the expiration period and time-to-live (TTL) for which the exception message will remain. Exceptions are stored by default, for 2 weeks from when a record was created in Amazon Security Lake. This API does not take input parameters.
    */
  def getDatalakeExceptionsExpiry(params: GetDatalakeExceptionsExpiryRequest): Request[GetDatalakeExceptionsExpiryResponse, AWSError] = js.native
  def getDatalakeExceptionsExpiry(
    params: GetDatalakeExceptionsExpiryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatalakeExceptionsExpiryResponse, Unit]
  ): Request[GetDatalakeExceptionsExpiryResponse, AWSError] = js.native
  
  /**
    * Retrieves the details of exception notifications for the account in Amazon Security Lake.
    */
  def getDatalakeExceptionsSubscription(): Request[GetDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  def getDatalakeExceptionsSubscription(
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatalakeExceptionsSubscriptionResponse, Unit]
  ): Request[GetDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  /**
    * Retrieves the details of exception notifications for the account in Amazon Security Lake.
    */
  def getDatalakeExceptionsSubscription(params: GetDatalakeExceptionsSubscriptionRequest): Request[GetDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  def getDatalakeExceptionsSubscription(
    params: GetDatalakeExceptionsSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatalakeExceptionsSubscriptionResponse, Unit]
  ): Request[GetDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  
  /**
    * Retrieves a snapshot of the current Region, including whether Amazon Security Lake is enabled for those accounts and which sources Security Lake is collecting data from. 
    */
  def getDatalakeStatus(): Request[GetDatalakeStatusResponse, AWSError] = js.native
  def getDatalakeStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetDatalakeStatusResponse, Unit]): Request[GetDatalakeStatusResponse, AWSError] = js.native
  /**
    * Retrieves a snapshot of the current Region, including whether Amazon Security Lake is enabled for those accounts and which sources Security Lake is collecting data from. 
    */
  def getDatalakeStatus(params: GetDatalakeStatusRequest): Request[GetDatalakeStatusResponse, AWSError] = js.native
  def getDatalakeStatus(
    params: GetDatalakeStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatalakeStatusResponse, Unit]
  ): Request[GetDatalakeStatusResponse, AWSError] = js.native
  
  /**
    * Retrieves the subscription information for the specified subscription ID. You can get information about a specific subscriber.
    */
  def getSubscriber(): Request[GetSubscriberResponse, AWSError] = js.native
  def getSubscriber(callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriberResponse, Unit]): Request[GetSubscriberResponse, AWSError] = js.native
  /**
    * Retrieves the subscription information for the specified subscription ID. You can get information about a specific subscriber.
    */
  def getSubscriber(params: GetSubscriberRequest): Request[GetSubscriberResponse, AWSError] = js.native
  def getSubscriber(
    params: GetSubscriberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriberResponse, Unit]
  ): Request[GetSubscriberResponse, AWSError] = js.native
  
  /**
    * Lists the Amazon Security Lake exceptions that you can use to find the source of problems and fix them.
    */
  def listDatalakeExceptions(): Request[ListDatalakeExceptionsResponse, AWSError] = js.native
  def listDatalakeExceptions(callback: js.Function2[/* err */ AWSError, /* data */ ListDatalakeExceptionsResponse, Unit]): Request[ListDatalakeExceptionsResponse, AWSError] = js.native
  /**
    * Lists the Amazon Security Lake exceptions that you can use to find the source of problems and fix them.
    */
  def listDatalakeExceptions(params: ListDatalakeExceptionsRequest): Request[ListDatalakeExceptionsResponse, AWSError] = js.native
  def listDatalakeExceptions(
    params: ListDatalakeExceptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatalakeExceptionsResponse, Unit]
  ): Request[ListDatalakeExceptionsResponse, AWSError] = js.native
  
  /**
    * Retrieves the log sources in the current Amazon Web Services Region. 
    */
  def listLogSources(): Request[ListLogSourcesResponse, AWSError] = js.native
  def listLogSources(callback: js.Function2[/* err */ AWSError, /* data */ ListLogSourcesResponse, Unit]): Request[ListLogSourcesResponse, AWSError] = js.native
  /**
    * Retrieves the log sources in the current Amazon Web Services Region. 
    */
  def listLogSources(params: ListLogSourcesRequest): Request[ListLogSourcesResponse, AWSError] = js.native
  def listLogSources(
    params: ListLogSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLogSourcesResponse, Unit]
  ): Request[ListLogSourcesResponse, AWSError] = js.native
  
  /**
    * List all subscribers for the specific Amazon Security Lake account ID. You can retrieve a list of subscriptions associated with a specific organization or Amazon Web Services account.
    */
  def listSubscribers(): Request[ListSubscribersResponse, AWSError] = js.native
  def listSubscribers(callback: js.Function2[/* err */ AWSError, /* data */ ListSubscribersResponse, Unit]): Request[ListSubscribersResponse, AWSError] = js.native
  /**
    * List all subscribers for the specific Amazon Security Lake account ID. You can retrieve a list of subscriptions associated with a specific organization or Amazon Web Services account.
    */
  def listSubscribers(params: ListSubscribersRequest): Request[ListSubscribersResponse, AWSError] = js.native
  def listSubscribers(
    params: ListSubscribersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSubscribersResponse, Unit]
  ): Request[ListSubscribersResponse, AWSError] = js.native
  
  /**
    * Specifies where to store your security data and for how long. You can add a rollup Region to consolidate data from multiple Amazon Web Services Regions. 
    */
  def updateDatalake(): Request[UpdateDatalakeResponse, AWSError] = js.native
  def updateDatalake(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatalakeResponse, Unit]): Request[UpdateDatalakeResponse, AWSError] = js.native
  /**
    * Specifies where to store your security data and for how long. You can add a rollup Region to consolidate data from multiple Amazon Web Services Regions. 
    */
  def updateDatalake(params: UpdateDatalakeRequest): Request[UpdateDatalakeResponse, AWSError] = js.native
  def updateDatalake(
    params: UpdateDatalakeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatalakeResponse, Unit]
  ): Request[UpdateDatalakeResponse, AWSError] = js.native
  
  /**
    * Update the expiration period for the exception message to your preferred time, and control the time-to-live (TTL) for the exception message to remain. Exceptions are stored by default for 2 weeks from when a record was created in Amazon Security Lake. 
    */
  def updateDatalakeExceptionsExpiry(): Request[UpdateDatalakeExceptionsExpiryResponse, AWSError] = js.native
  def updateDatalakeExceptionsExpiry(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatalakeExceptionsExpiryResponse, Unit]
  ): Request[UpdateDatalakeExceptionsExpiryResponse, AWSError] = js.native
  /**
    * Update the expiration period for the exception message to your preferred time, and control the time-to-live (TTL) for the exception message to remain. Exceptions are stored by default for 2 weeks from when a record was created in Amazon Security Lake. 
    */
  def updateDatalakeExceptionsExpiry(params: UpdateDatalakeExceptionsExpiryRequest): Request[UpdateDatalakeExceptionsExpiryResponse, AWSError] = js.native
  def updateDatalakeExceptionsExpiry(
    params: UpdateDatalakeExceptionsExpiryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatalakeExceptionsExpiryResponse, Unit]
  ): Request[UpdateDatalakeExceptionsExpiryResponse, AWSError] = js.native
  
  /**
    * Updates the specified notification subscription in Amazon Security Lake for the organization you specify.
    */
  def updateDatalakeExceptionsSubscription(): Request[UpdateDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  def updateDatalakeExceptionsSubscription(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatalakeExceptionsSubscriptionResponse, Unit]
  ): Request[UpdateDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  /**
    * Updates the specified notification subscription in Amazon Security Lake for the organization you specify.
    */
  def updateDatalakeExceptionsSubscription(params: UpdateDatalakeExceptionsSubscriptionRequest): Request[UpdateDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  def updateDatalakeExceptionsSubscription(
    params: UpdateDatalakeExceptionsSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatalakeExceptionsSubscriptionResponse, Unit]
  ): Request[UpdateDatalakeExceptionsSubscriptionResponse, AWSError] = js.native
  
  /**
    * Updates an existing subscription for the given Amazon Security Lake account ID. You can update a subscriber by changing the sources that the subscriber consumes data from. 
    */
  def updateSubscriber(): Request[UpdateSubscriberResponse, AWSError] = js.native
  def updateSubscriber(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriberResponse, Unit]): Request[UpdateSubscriberResponse, AWSError] = js.native
  /**
    * Updates an existing subscription for the given Amazon Security Lake account ID. You can update a subscriber by changing the sources that the subscriber consumes data from. 
    */
  def updateSubscriber(params: UpdateSubscriberRequest): Request[UpdateSubscriberResponse, AWSError] = js.native
  def updateSubscriber(
    params: UpdateSubscriberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriberResponse, Unit]
  ): Request[UpdateSubscriberResponse, AWSError] = js.native
  
  /**
    * Updates an existing notification method for the subscription (SQS or HTTPs endpoint) or switches the notification subscription endpoint for a subscriber.
    */
  def updateSubscriptionNotificationConfiguration(): Request[UpdateSubscriptionNotificationConfigurationResponse, AWSError] = js.native
  def updateSubscriptionNotificationConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateSubscriptionNotificationConfigurationResponse, 
      Unit
    ]
  ): Request[UpdateSubscriptionNotificationConfigurationResponse, AWSError] = js.native
  /**
    * Updates an existing notification method for the subscription (SQS or HTTPs endpoint) or switches the notification subscription endpoint for a subscriber.
    */
  def updateSubscriptionNotificationConfiguration(params: UpdateSubscriptionNotificationConfigurationRequest): Request[UpdateSubscriptionNotificationConfigurationResponse, AWSError] = js.native
  def updateSubscriptionNotificationConfiguration(
    params: UpdateSubscriptionNotificationConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateSubscriptionNotificationConfigurationResponse, 
      Unit
    ]
  ): Request[UpdateSubscriptionNotificationConfigurationResponse, AWSError] = js.native
}
