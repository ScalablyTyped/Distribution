package typings.awsDashSdk.clientsSesMod

import typings.awsDashSdk.Anon_Waiter
import typings.awsDashSdk.awsDashSdkStrings.identityExists
import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SES extends Service {
  @JSName("config")
  var config_SES: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a receipt rule set by cloning an existing one. All receipt rules and configurations are copied to the new receipt rule set and are completely independent of the source rule set. For information about setting up rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def cloneReceiptRuleSet(): Request[CloneReceiptRuleSetResponse, AWSError] = js.native
  def cloneReceiptRuleSet(callback: js.Function2[/* err */ AWSError, /* data */ CloneReceiptRuleSetResponse, Unit]): Request[CloneReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Creates a receipt rule set by cloning an existing one. All receipt rules and configurations are copied to the new receipt rule set and are completely independent of the source rule set. For information about setting up rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def cloneReceiptRuleSet(params: CloneReceiptRuleSetRequest): Request[CloneReceiptRuleSetResponse, AWSError] = js.native
  def cloneReceiptRuleSet(
    params: CloneReceiptRuleSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CloneReceiptRuleSetResponse, Unit]
  ): Request[CloneReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Creates a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createConfigurationSet(): Request[CreateConfigurationSetResponse, AWSError] = js.native
  def createConfigurationSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetResponse, Unit]): Request[CreateConfigurationSetResponse, AWSError] = js.native
  /**
    * Creates a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResponse, AWSError] = js.native
  def createConfigurationSet(
    params: CreateConfigurationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetResponse, Unit]
  ): Request[CreateConfigurationSetResponse, AWSError] = js.native
  /**
    * Creates a configuration set event destination.  When you create or update an event destination, you must provide one, and only one, destination. The destination can be CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createConfigurationSetEventDestination(): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def createConfigurationSetEventDestination(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetEventDestinationResponse, Unit]
  ): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Creates a configuration set event destination.  When you create or update an event destination, you must provide one, and only one, destination. The destination can be CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def createConfigurationSetEventDestination(
    params: CreateConfigurationSetEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetEventDestinationResponse, Unit]
  ): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Creates an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
    */
  def createConfigurationSetTrackingOptions(): Request[CreateConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  def createConfigurationSetTrackingOptions(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetTrackingOptionsResponse, Unit]
  ): Request[CreateConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  /**
    * Creates an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
    */
  def createConfigurationSetTrackingOptions(params: CreateConfigurationSetTrackingOptionsRequest): Request[CreateConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  def createConfigurationSetTrackingOptions(
    params: CreateConfigurationSetTrackingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetTrackingOptionsResponse, Unit]
  ): Request[CreateConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  /**
    * Creates a new custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createCustomVerificationEmailTemplate(): Request[js.Object, AWSError] = js.native
  def createCustomVerificationEmailTemplate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a new custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createCustomVerificationEmailTemplate(params: CreateCustomVerificationEmailTemplateRequest): Request[js.Object, AWSError] = js.native
  def createCustomVerificationEmailTemplate(
    params: CreateCustomVerificationEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates a new IP address filter. For information about setting up IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptFilter(): Request[CreateReceiptFilterResponse, AWSError] = js.native
  def createReceiptFilter(callback: js.Function2[/* err */ AWSError, /* data */ CreateReceiptFilterResponse, Unit]): Request[CreateReceiptFilterResponse, AWSError] = js.native
  /**
    * Creates a new IP address filter. For information about setting up IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptFilter(params: CreateReceiptFilterRequest): Request[CreateReceiptFilterResponse, AWSError] = js.native
  def createReceiptFilter(
    params: CreateReceiptFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReceiptFilterResponse, Unit]
  ): Request[CreateReceiptFilterResponse, AWSError] = js.native
  /**
    * Creates a receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptRule(): Request[CreateReceiptRuleResponse, AWSError] = js.native
  def createReceiptRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateReceiptRuleResponse, Unit]): Request[CreateReceiptRuleResponse, AWSError] = js.native
  /**
    * Creates a receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptRule(params: CreateReceiptRuleRequest): Request[CreateReceiptRuleResponse, AWSError] = js.native
  def createReceiptRule(
    params: CreateReceiptRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReceiptRuleResponse, Unit]
  ): Request[CreateReceiptRuleResponse, AWSError] = js.native
  /**
    * Creates an empty receipt rule set. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptRuleSet(): Request[CreateReceiptRuleSetResponse, AWSError] = js.native
  def createReceiptRuleSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateReceiptRuleSetResponse, Unit]): Request[CreateReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Creates an empty receipt rule set. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptRuleSet(params: CreateReceiptRuleSetRequest): Request[CreateReceiptRuleSetResponse, AWSError] = js.native
  def createReceiptRuleSet(
    params: CreateReceiptRuleSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReceiptRuleSetResponse, Unit]
  ): Request[CreateReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createTemplate(): Request[CreateTemplateResponse, AWSError] = js.native
  def createTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateResponse, Unit]): Request[CreateTemplateResponse, AWSError] = js.native
  /**
    * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createTemplate(params: CreateTemplateRequest): Request[CreateTemplateResponse, AWSError] = js.native
  def createTemplate(
    params: CreateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateResponse, Unit]
  ): Request[CreateTemplateResponse, AWSError] = js.native
  /**
    * Deletes a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteConfigurationSet(): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  def deleteConfigurationSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetResponse, Unit]): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  /**
    * Deletes a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  def deleteConfigurationSet(
    params: DeleteConfigurationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetResponse, Unit]
  ): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  /**
    * Deletes a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteConfigurationSetEventDestination(): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  def deleteConfigurationSetEventDestination(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetEventDestinationResponse, Unit]
  ): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Deletes a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  def deleteConfigurationSetEventDestination(
    params: DeleteConfigurationSetEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetEventDestinationResponse, Unit]
  ): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Deletes an association between a configuration set and a custom domain for open and click event tracking. By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.  Deleting this kind of association will result in emails sent using the specified configuration set to capture open and click events using the standard, Amazon SES-operated domains. 
    */
  def deleteConfigurationSetTrackingOptions(): Request[DeleteConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  def deleteConfigurationSetTrackingOptions(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetTrackingOptionsResponse, Unit]
  ): Request[DeleteConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  /**
    * Deletes an association between a configuration set and a custom domain for open and click event tracking. By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.  Deleting this kind of association will result in emails sent using the specified configuration set to capture open and click events using the standard, Amazon SES-operated domains. 
    */
  def deleteConfigurationSetTrackingOptions(params: DeleteConfigurationSetTrackingOptionsRequest): Request[DeleteConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  def deleteConfigurationSetTrackingOptions(
    params: DeleteConfigurationSetTrackingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetTrackingOptionsResponse, Unit]
  ): Request[DeleteConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  /**
    * Deletes an existing custom verification email template.  For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteCustomVerificationEmailTemplate(): Request[js.Object, AWSError] = js.native
  def deleteCustomVerificationEmailTemplate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing custom verification email template.  For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteCustomVerificationEmailTemplate(params: DeleteCustomVerificationEmailTemplateRequest): Request[js.Object, AWSError] = js.native
  def deleteCustomVerificationEmailTemplate(
    params: DeleteCustomVerificationEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified identity (an email address or a domain) from the list of verified identities. You can execute this operation no more than once per second.
    */
  def deleteIdentity(): Request[DeleteIdentityResponse, AWSError] = js.native
  def deleteIdentity(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIdentityResponse, Unit]): Request[DeleteIdentityResponse, AWSError] = js.native
  /**
    * Deletes the specified identity (an email address or a domain) from the list of verified identities. You can execute this operation no more than once per second.
    */
  def deleteIdentity(params: DeleteIdentityRequest): Request[DeleteIdentityResponse, AWSError] = js.native
  def deleteIdentity(
    params: DeleteIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIdentityResponse, Unit]
  ): Request[DeleteIdentityResponse, AWSError] = js.native
  /**
    * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This API returns successfully even if a policy with the specified name does not exist.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteIdentityPolicy(): Request[DeleteIdentityPolicyResponse, AWSError] = js.native
  def deleteIdentityPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIdentityPolicyResponse, Unit]): Request[DeleteIdentityPolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This API returns successfully even if a policy with the specified name does not exist.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteIdentityPolicy(params: DeleteIdentityPolicyRequest): Request[DeleteIdentityPolicyResponse, AWSError] = js.native
  def deleteIdentityPolicy(
    params: DeleteIdentityPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIdentityPolicyResponse, Unit]
  ): Request[DeleteIdentityPolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified IP address filter. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptFilter(): Request[DeleteReceiptFilterResponse, AWSError] = js.native
  def deleteReceiptFilter(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReceiptFilterResponse, Unit]): Request[DeleteReceiptFilterResponse, AWSError] = js.native
  /**
    * Deletes the specified IP address filter. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptFilter(params: DeleteReceiptFilterRequest): Request[DeleteReceiptFilterResponse, AWSError] = js.native
  def deleteReceiptFilter(
    params: DeleteReceiptFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReceiptFilterResponse, Unit]
  ): Request[DeleteReceiptFilterResponse, AWSError] = js.native
  /**
    * Deletes the specified receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptRule(): Request[DeleteReceiptRuleResponse, AWSError] = js.native
  def deleteReceiptRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReceiptRuleResponse, Unit]): Request[DeleteReceiptRuleResponse, AWSError] = js.native
  /**
    * Deletes the specified receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptRule(params: DeleteReceiptRuleRequest): Request[DeleteReceiptRuleResponse, AWSError] = js.native
  def deleteReceiptRule(
    params: DeleteReceiptRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReceiptRuleResponse, Unit]
  ): Request[DeleteReceiptRuleResponse, AWSError] = js.native
  /**
    * Deletes the specified receipt rule set and all of the receipt rules it contains.  The currently active rule set cannot be deleted.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptRuleSet(): Request[DeleteReceiptRuleSetResponse, AWSError] = js.native
  def deleteReceiptRuleSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReceiptRuleSetResponse, Unit]): Request[DeleteReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Deletes the specified receipt rule set and all of the receipt rules it contains.  The currently active rule set cannot be deleted.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptRuleSet(params: DeleteReceiptRuleSetRequest): Request[DeleteReceiptRuleSetResponse, AWSError] = js.native
  def deleteReceiptRuleSet(
    params: DeleteReceiptRuleSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReceiptRuleSetResponse, Unit]
  ): Request[DeleteReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Deletes an email template. You can execute this operation no more than once per second.
    */
  def deleteTemplate(): Request[DeleteTemplateResponse, AWSError] = js.native
  def deleteTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateResponse, Unit]): Request[DeleteTemplateResponse, AWSError] = js.native
  /**
    * Deletes an email template. You can execute this operation no more than once per second.
    */
  def deleteTemplate(params: DeleteTemplateRequest): Request[DeleteTemplateResponse, AWSError] = js.native
  def deleteTemplate(
    params: DeleteTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateResponse, Unit]
  ): Request[DeleteTemplateResponse, AWSError] = js.native
  /**
    * Deprecated. Use the DeleteIdentity operation to delete email addresses and domains.
    */
  def deleteVerifiedEmailAddress(): Request[js.Object, AWSError] = js.native
  def deleteVerifiedEmailAddress(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deprecated. Use the DeleteIdentity operation to delete email addresses and domains.
    */
  def deleteVerifiedEmailAddress(params: DeleteVerifiedEmailAddressRequest): Request[js.Object, AWSError] = js.native
  def deleteVerifiedEmailAddress(
    params: DeleteVerifiedEmailAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns the metadata and receipt rules for the receipt rule set that is currently active. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeActiveReceiptRuleSet(): Request[DescribeActiveReceiptRuleSetResponse, AWSError] = js.native
  def describeActiveReceiptRuleSet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeActiveReceiptRuleSetResponse, Unit]): Request[DescribeActiveReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Returns the metadata and receipt rules for the receipt rule set that is currently active. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeActiveReceiptRuleSet(params: DescribeActiveReceiptRuleSetRequest): Request[DescribeActiveReceiptRuleSetResponse, AWSError] = js.native
  def describeActiveReceiptRuleSet(
    params: DescribeActiveReceiptRuleSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeActiveReceiptRuleSetResponse, Unit]
  ): Request[DescribeActiveReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Returns the details of the specified configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeConfigurationSet(): Request[DescribeConfigurationSetResponse, AWSError] = js.native
  def describeConfigurationSet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationSetResponse, Unit]): Request[DescribeConfigurationSetResponse, AWSError] = js.native
  /**
    * Returns the details of the specified configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeConfigurationSet(params: DescribeConfigurationSetRequest): Request[DescribeConfigurationSetResponse, AWSError] = js.native
  def describeConfigurationSet(
    params: DescribeConfigurationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationSetResponse, Unit]
  ): Request[DescribeConfigurationSetResponse, AWSError] = js.native
  /**
    * Returns the details of the specified receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeReceiptRule(): Request[DescribeReceiptRuleResponse, AWSError] = js.native
  def describeReceiptRule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReceiptRuleResponse, Unit]): Request[DescribeReceiptRuleResponse, AWSError] = js.native
  /**
    * Returns the details of the specified receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeReceiptRule(params: DescribeReceiptRuleRequest): Request[DescribeReceiptRuleResponse, AWSError] = js.native
  def describeReceiptRule(
    params: DescribeReceiptRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReceiptRuleResponse, Unit]
  ): Request[DescribeReceiptRuleResponse, AWSError] = js.native
  /**
    * Returns the details of the specified receipt rule set. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeReceiptRuleSet(): Request[DescribeReceiptRuleSetResponse, AWSError] = js.native
  def describeReceiptRuleSet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReceiptRuleSetResponse, Unit]): Request[DescribeReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Returns the details of the specified receipt rule set. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeReceiptRuleSet(params: DescribeReceiptRuleSetRequest): Request[DescribeReceiptRuleSetResponse, AWSError] = js.native
  def describeReceiptRuleSet(
    params: DescribeReceiptRuleSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReceiptRuleSetResponse, Unit]
  ): Request[DescribeReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Returns the email sending status of the Amazon SES account for the current region. You can execute this operation no more than once per second.
    */
  def getAccountSendingEnabled(): Request[GetAccountSendingEnabledResponse, AWSError] = js.native
  def getAccountSendingEnabled(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSendingEnabledResponse, Unit]): Request[GetAccountSendingEnabledResponse, AWSError] = js.native
  /**
    * Returns the custom email verification template for the template name you specify. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getCustomVerificationEmailTemplate(): Request[GetCustomVerificationEmailTemplateResponse, AWSError] = js.native
  def getCustomVerificationEmailTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ GetCustomVerificationEmailTemplateResponse, Unit]
  ): Request[GetCustomVerificationEmailTemplateResponse, AWSError] = js.native
  /**
    * Returns the custom email verification template for the template name you specify. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getCustomVerificationEmailTemplate(params: GetCustomVerificationEmailTemplateRequest): Request[GetCustomVerificationEmailTemplateResponse, AWSError] = js.native
  def getCustomVerificationEmailTemplate(
    params: GetCustomVerificationEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCustomVerificationEmailTemplateResponse, Unit]
  ): Request[GetCustomVerificationEmailTemplateResponse, AWSError] = js.native
  /**
    * Returns the current status of Easy DKIM signing for an entity. For domain name identities, this operation also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified that these tokens have been published. This operation takes a list of identities as input and returns the following information for each:   Whether Easy DKIM signing is enabled or disabled.   A set of DKIM tokens that represent the identity. If the identity is an email address, the tokens represent the domain of that address.   Whether Amazon SES has successfully verified the DKIM tokens published in the domain's DNS. This information is only returned for domain name identities, not for email addresses.   This operation is throttled at one request per second and can only get DKIM attributes for up to 100 identities at a time. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
    */
  def getIdentityDkimAttributes(): Request[GetIdentityDkimAttributesResponse, AWSError] = js.native
  def getIdentityDkimAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityDkimAttributesResponse, Unit]): Request[GetIdentityDkimAttributesResponse, AWSError] = js.native
  /**
    * Returns the current status of Easy DKIM signing for an entity. For domain name identities, this operation also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified that these tokens have been published. This operation takes a list of identities as input and returns the following information for each:   Whether Easy DKIM signing is enabled or disabled.   A set of DKIM tokens that represent the identity. If the identity is an email address, the tokens represent the domain of that address.   Whether Amazon SES has successfully verified the DKIM tokens published in the domain's DNS. This information is only returned for domain name identities, not for email addresses.   This operation is throttled at one request per second and can only get DKIM attributes for up to 100 identities at a time. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
    */
  def getIdentityDkimAttributes(params: GetIdentityDkimAttributesRequest): Request[GetIdentityDkimAttributesResponse, AWSError] = js.native
  def getIdentityDkimAttributes(
    params: GetIdentityDkimAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityDkimAttributesResponse, Unit]
  ): Request[GetIdentityDkimAttributesResponse, AWSError] = js.native
  /**
    * Returns the custom MAIL FROM attributes for a list of identities (email addresses : domains). This operation is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100 identities at a time.
    */
  def getIdentityMailFromDomainAttributes(): Request[GetIdentityMailFromDomainAttributesResponse, AWSError] = js.native
  def getIdentityMailFromDomainAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityMailFromDomainAttributesResponse, Unit]
  ): Request[GetIdentityMailFromDomainAttributesResponse, AWSError] = js.native
  /**
    * Returns the custom MAIL FROM attributes for a list of identities (email addresses : domains). This operation is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100 identities at a time.
    */
  def getIdentityMailFromDomainAttributes(params: GetIdentityMailFromDomainAttributesRequest): Request[GetIdentityMailFromDomainAttributesResponse, AWSError] = js.native
  def getIdentityMailFromDomainAttributes(
    params: GetIdentityMailFromDomainAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityMailFromDomainAttributesResponse, Unit]
  ): Request[GetIdentityMailFromDomainAttributesResponse, AWSError] = js.native
  /**
    * Given a list of verified identities (email addresses and/or domains), returns a structure describing identity notification attributes. This operation is throttled at one request per second and can only get notification attributes for up to 100 identities at a time. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def getIdentityNotificationAttributes(): Request[GetIdentityNotificationAttributesResponse, AWSError] = js.native
  def getIdentityNotificationAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityNotificationAttributesResponse, Unit]
  ): Request[GetIdentityNotificationAttributesResponse, AWSError] = js.native
  /**
    * Given a list of verified identities (email addresses and/or domains), returns a structure describing identity notification attributes. This operation is throttled at one request per second and can only get notification attributes for up to 100 identities at a time. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def getIdentityNotificationAttributes(params: GetIdentityNotificationAttributesRequest): Request[GetIdentityNotificationAttributesResponse, AWSError] = js.native
  def getIdentityNotificationAttributes(
    params: GetIdentityNotificationAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityNotificationAttributesResponse, Unit]
  ): Request[GetIdentityNotificationAttributesResponse, AWSError] = js.native
  /**
    * Returns the requested sending authorization policies for the given identity (an email address or a domain). The policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a time.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getIdentityPolicies(): Request[GetIdentityPoliciesResponse, AWSError] = js.native
  def getIdentityPolicies(callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityPoliciesResponse, Unit]): Request[GetIdentityPoliciesResponse, AWSError] = js.native
  /**
    * Returns the requested sending authorization policies for the given identity (an email address or a domain). The policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a time.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getIdentityPolicies(params: GetIdentityPoliciesRequest): Request[GetIdentityPoliciesResponse, AWSError] = js.native
  def getIdentityPolicies(
    params: GetIdentityPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityPoliciesResponse, Unit]
  ): Request[GetIdentityPoliciesResponse, AWSError] = js.native
  /**
    * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain identities) the verification token for each identity. The verification status of an email address is "Pending" until the email address owner clicks the link within the verification email that Amazon SES sent to that address. If the email address owner clicks the link within 24 hours, the verification status of the email address changes to "Success". If the link is not clicked within 24 hours, the verification status changes to "Failed." In that case, if you still want to verify the email address, you must restart the verification process from the beginning. For domain identities, the domain's verification status is "Pending" as Amazon SES searches for the required TXT record in the DNS settings of the domain. When Amazon SES detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify the domain, you must restart the verification process from the beginning. This operation is throttled at one request per second and can only get verification attributes for up to 100 identities at a time.
    */
  def getIdentityVerificationAttributes(): Request[GetIdentityVerificationAttributesResponse, AWSError] = js.native
  def getIdentityVerificationAttributes(
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityVerificationAttributesResponse, Unit]
  ): Request[GetIdentityVerificationAttributesResponse, AWSError] = js.native
  /**
    * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain identities) the verification token for each identity. The verification status of an email address is "Pending" until the email address owner clicks the link within the verification email that Amazon SES sent to that address. If the email address owner clicks the link within 24 hours, the verification status of the email address changes to "Success". If the link is not clicked within 24 hours, the verification status changes to "Failed." In that case, if you still want to verify the email address, you must restart the verification process from the beginning. For domain identities, the domain's verification status is "Pending" as Amazon SES searches for the required TXT record in the DNS settings of the domain. When Amazon SES detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify the domain, you must restart the verification process from the beginning. This operation is throttled at one request per second and can only get verification attributes for up to 100 identities at a time.
    */
  def getIdentityVerificationAttributes(params: GetIdentityVerificationAttributesRequest): Request[GetIdentityVerificationAttributesResponse, AWSError] = js.native
  def getIdentityVerificationAttributes(
    params: GetIdentityVerificationAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityVerificationAttributesResponse, Unit]
  ): Request[GetIdentityVerificationAttributesResponse, AWSError] = js.native
  /**
    * Provides the sending limits for the Amazon SES account.  You can execute this operation no more than once per second.
    */
  def getSendQuota(): Request[GetSendQuotaResponse, AWSError] = js.native
  def getSendQuota(callback: js.Function2[/* err */ AWSError, /* data */ GetSendQuotaResponse, Unit]): Request[GetSendQuotaResponse, AWSError] = js.native
  /**
    * Provides sending statistics for the current AWS Region. The result is a list of data points, representing the last two weeks of sending activity. Each data point in the list contains statistics for a 15-minute period of time. You can execute this operation no more than once per second.
    */
  def getSendStatistics(): Request[GetSendStatisticsResponse, AWSError] = js.native
  def getSendStatistics(callback: js.Function2[/* err */ AWSError, /* data */ GetSendStatisticsResponse, Unit]): Request[GetSendStatisticsResponse, AWSError] = js.native
  /**
    * Displays the template object (which includes the Subject line, HTML part and text part) for the template you specify. You can execute this operation no more than once per second.
    */
  def getTemplate(): Request[GetTemplateResponse, AWSError] = js.native
  def getTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateResponse, Unit]): Request[GetTemplateResponse, AWSError] = js.native
  /**
    * Displays the template object (which includes the Subject line, HTML part and text part) for the template you specify. You can execute this operation no more than once per second.
    */
  def getTemplate(params: GetTemplateRequest): Request[GetTemplateResponse, AWSError] = js.native
  def getTemplate(
    params: GetTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateResponse, Unit]
  ): Request[GetTemplateResponse, AWSError] = js.native
  /**
    * Provides a list of the configuration sets associated with your Amazon SES account in the current AWS Region. For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.  You can execute this operation no more than once per second. This operation will return up to 1,000 configuration sets each time it is run. If your Amazon SES account has more than 1,000 configuration sets, this operation will also return a NextToken element. You can then execute the ListConfigurationSets operation again, passing the NextToken parameter and the value of the NextToken element to retrieve additional results.
    */
  def listConfigurationSets(): Request[ListConfigurationSetsResponse, AWSError] = js.native
  def listConfigurationSets(callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationSetsResponse, Unit]): Request[ListConfigurationSetsResponse, AWSError] = js.native
  /**
    * Provides a list of the configuration sets associated with your Amazon SES account in the current AWS Region. For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.  You can execute this operation no more than once per second. This operation will return up to 1,000 configuration sets each time it is run. If your Amazon SES account has more than 1,000 configuration sets, this operation will also return a NextToken element. You can then execute the ListConfigurationSets operation again, passing the NextToken parameter and the value of the NextToken element to retrieve additional results.
    */
  def listConfigurationSets(params: ListConfigurationSetsRequest): Request[ListConfigurationSetsResponse, AWSError] = js.native
  def listConfigurationSets(
    params: ListConfigurationSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationSetsResponse, Unit]
  ): Request[ListConfigurationSetsResponse, AWSError] = js.native
  /**
    * Lists the existing custom verification email templates for your account in the current AWS Region. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listCustomVerificationEmailTemplates(): Request[ListCustomVerificationEmailTemplatesResponse, AWSError] = js.native
  def listCustomVerificationEmailTemplates(
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomVerificationEmailTemplatesResponse, Unit]
  ): Request[ListCustomVerificationEmailTemplatesResponse, AWSError] = js.native
  /**
    * Lists the existing custom verification email templates for your account in the current AWS Region. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listCustomVerificationEmailTemplates(params: ListCustomVerificationEmailTemplatesRequest): Request[ListCustomVerificationEmailTemplatesResponse, AWSError] = js.native
  def listCustomVerificationEmailTemplates(
    params: ListCustomVerificationEmailTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomVerificationEmailTemplatesResponse, Unit]
  ): Request[ListCustomVerificationEmailTemplatesResponse, AWSError] = js.native
  /**
    * Returns a list containing all of the identities (email addresses and domains) for your AWS account in the current AWS Region, regardless of verification status. You can execute this operation no more than once per second.
    */
  def listIdentities(): Request[ListIdentitiesResponse, AWSError] = js.native
  def listIdentities(callback: js.Function2[/* err */ AWSError, /* data */ ListIdentitiesResponse, Unit]): Request[ListIdentitiesResponse, AWSError] = js.native
  /**
    * Returns a list containing all of the identities (email addresses and domains) for your AWS account in the current AWS Region, regardless of verification status. You can execute this operation no more than once per second.
    */
  def listIdentities(params: ListIdentitiesRequest): Request[ListIdentitiesResponse, AWSError] = js.native
  def listIdentities(
    params: ListIdentitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIdentitiesResponse, Unit]
  ): Request[ListIdentitiesResponse, AWSError] = js.native
  /**
    * Returns a list of sending authorization policies that are attached to the given identity (an email address or a domain). This API returns only a list. If you want the actual policy content, you can use GetIdentityPolicies.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listIdentityPolicies(): Request[ListIdentityPoliciesResponse, AWSError] = js.native
  def listIdentityPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityPoliciesResponse, Unit]): Request[ListIdentityPoliciesResponse, AWSError] = js.native
  /**
    * Returns a list of sending authorization policies that are attached to the given identity (an email address or a domain). This API returns only a list. If you want the actual policy content, you can use GetIdentityPolicies.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listIdentityPolicies(params: ListIdentityPoliciesRequest): Request[ListIdentityPoliciesResponse, AWSError] = js.native
  def listIdentityPolicies(
    params: ListIdentityPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityPoliciesResponse, Unit]
  ): Request[ListIdentityPoliciesResponse, AWSError] = js.native
  /**
    * Lists the IP address filters associated with your AWS account in the current AWS Region. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listReceiptFilters(): Request[ListReceiptFiltersResponse, AWSError] = js.native
  def listReceiptFilters(callback: js.Function2[/* err */ AWSError, /* data */ ListReceiptFiltersResponse, Unit]): Request[ListReceiptFiltersResponse, AWSError] = js.native
  /**
    * Lists the IP address filters associated with your AWS account in the current AWS Region. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listReceiptFilters(params: ListReceiptFiltersRequest): Request[ListReceiptFiltersResponse, AWSError] = js.native
  def listReceiptFilters(
    params: ListReceiptFiltersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReceiptFiltersResponse, Unit]
  ): Request[ListReceiptFiltersResponse, AWSError] = js.native
  /**
    * Lists the receipt rule sets that exist under your AWS account in the current AWS Region. If there are additional receipt rule sets to be retrieved, you will receive a NextToken that you can provide to the next call to ListReceiptRuleSets to retrieve the additional entries. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listReceiptRuleSets(): Request[ListReceiptRuleSetsResponse, AWSError] = js.native
  def listReceiptRuleSets(callback: js.Function2[/* err */ AWSError, /* data */ ListReceiptRuleSetsResponse, Unit]): Request[ListReceiptRuleSetsResponse, AWSError] = js.native
  /**
    * Lists the receipt rule sets that exist under your AWS account in the current AWS Region. If there are additional receipt rule sets to be retrieved, you will receive a NextToken that you can provide to the next call to ListReceiptRuleSets to retrieve the additional entries. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listReceiptRuleSets(params: ListReceiptRuleSetsRequest): Request[ListReceiptRuleSetsResponse, AWSError] = js.native
  def listReceiptRuleSets(
    params: ListReceiptRuleSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReceiptRuleSetsResponse, Unit]
  ): Request[ListReceiptRuleSetsResponse, AWSError] = js.native
  /**
    * Lists the email templates present in your Amazon SES account in the current AWS Region. You can execute this operation no more than once per second.
    */
  def listTemplates(): Request[ListTemplatesResponse, AWSError] = js.native
  def listTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplatesResponse, Unit]): Request[ListTemplatesResponse, AWSError] = js.native
  /**
    * Lists the email templates present in your Amazon SES account in the current AWS Region. You can execute this operation no more than once per second.
    */
  def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse, AWSError] = js.native
  def listTemplates(
    params: ListTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplatesResponse, Unit]
  ): Request[ListTemplatesResponse, AWSError] = js.native
  /**
    * Deprecated. Use the ListIdentities operation to list the email addresses and domains associated with your account.
    */
  def listVerifiedEmailAddresses(): Request[ListVerifiedEmailAddressesResponse, AWSError] = js.native
  def listVerifiedEmailAddresses(callback: js.Function2[/* err */ AWSError, /* data */ ListVerifiedEmailAddressesResponse, Unit]): Request[ListVerifiedEmailAddressesResponse, AWSError] = js.native
  /**
    * Adds or updates the delivery options for a configuration set.
    */
  def putConfigurationSetDeliveryOptions(): Request[PutConfigurationSetDeliveryOptionsResponse, AWSError] = js.native
  def putConfigurationSetDeliveryOptions(
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetDeliveryOptionsResponse, Unit]
  ): Request[PutConfigurationSetDeliveryOptionsResponse, AWSError] = js.native
  /**
    * Adds or updates the delivery options for a configuration set.
    */
  def putConfigurationSetDeliveryOptions(params: PutConfigurationSetDeliveryOptionsRequest): Request[PutConfigurationSetDeliveryOptionsResponse, AWSError] = js.native
  def putConfigurationSetDeliveryOptions(
    params: PutConfigurationSetDeliveryOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationSetDeliveryOptionsResponse, Unit]
  ): Request[PutConfigurationSetDeliveryOptionsResponse, AWSError] = js.native
  /**
    * Adds or updates a sending authorization policy for the specified identity (an email address or a domain).  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def putIdentityPolicy(): Request[PutIdentityPolicyResponse, AWSError] = js.native
  def putIdentityPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutIdentityPolicyResponse, Unit]): Request[PutIdentityPolicyResponse, AWSError] = js.native
  /**
    * Adds or updates a sending authorization policy for the specified identity (an email address or a domain).  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def putIdentityPolicy(params: PutIdentityPolicyRequest): Request[PutIdentityPolicyResponse, AWSError] = js.native
  def putIdentityPolicy(
    params: PutIdentityPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutIdentityPolicyResponse, Unit]
  ): Request[PutIdentityPolicyResponse, AWSError] = js.native
  /**
    * Reorders the receipt rules within a receipt rule set.  All of the rules in the rule set must be represented in this request. That is, this API will return an error if the reorder request doesn't explicitly position all of the rules.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def reorderReceiptRuleSet(): Request[ReorderReceiptRuleSetResponse, AWSError] = js.native
  def reorderReceiptRuleSet(callback: js.Function2[/* err */ AWSError, /* data */ ReorderReceiptRuleSetResponse, Unit]): Request[ReorderReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Reorders the receipt rules within a receipt rule set.  All of the rules in the rule set must be represented in this request. That is, this API will return an error if the reorder request doesn't explicitly position all of the rules.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def reorderReceiptRuleSet(params: ReorderReceiptRuleSetRequest): Request[ReorderReceiptRuleSetResponse, AWSError] = js.native
  def reorderReceiptRuleSet(
    params: ReorderReceiptRuleSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReorderReceiptRuleSetResponse, Unit]
  ): Request[ReorderReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Generates and sends a bounce message to the sender of an email you received through Amazon SES. You can only use this API on an email up to 24 hours after you receive it.  You cannot use this API to send generic bounces for mail that was not received by Amazon SES.  For information about receiving email through Amazon SES, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def sendBounce(): Request[SendBounceResponse, AWSError] = js.native
  def sendBounce(callback: js.Function2[/* err */ AWSError, /* data */ SendBounceResponse, Unit]): Request[SendBounceResponse, AWSError] = js.native
  /**
    * Generates and sends a bounce message to the sender of an email you received through Amazon SES. You can only use this API on an email up to 24 hours after you receive it.  You cannot use this API to send generic bounces for mail that was not received by Amazon SES.  For information about receiving email through Amazon SES, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def sendBounce(params: SendBounceRequest): Request[SendBounceResponse, AWSError] = js.native
  def sendBounce(
    params: SendBounceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendBounceResponse, Unit]
  ): Request[SendBounceResponse, AWSError] = js.native
  /**
    * Composes an email message to multiple destinations. The message body is created using an email template. In order to send email using the SendBulkTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Each Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendBulkTemplatedEmail operation several times to send the message to each group.   The number of destinations you can contact in a single call to the API may be limited by your account's maximum sending rate.  
    */
  def sendBulkTemplatedEmail(): Request[SendBulkTemplatedEmailResponse, AWSError] = js.native
  def sendBulkTemplatedEmail(callback: js.Function2[/* err */ AWSError, /* data */ SendBulkTemplatedEmailResponse, Unit]): Request[SendBulkTemplatedEmailResponse, AWSError] = js.native
  /**
    * Composes an email message to multiple destinations. The message body is created using an email template. In order to send email using the SendBulkTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Each Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendBulkTemplatedEmail operation several times to send the message to each group.   The number of destinations you can contact in a single call to the API may be limited by your account's maximum sending rate.  
    */
  def sendBulkTemplatedEmail(params: SendBulkTemplatedEmailRequest): Request[SendBulkTemplatedEmailResponse, AWSError] = js.native
  def sendBulkTemplatedEmail(
    params: SendBulkTemplatedEmailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendBulkTemplatedEmailResponse, Unit]
  ): Request[SendBulkTemplatedEmailResponse, AWSError] = js.native
  /**
    * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. As a result of executing this operation, a customized verification email is sent to the specified address. To use this operation, you must first create a custom verification email template. For more information about creating and using custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def sendCustomVerificationEmail(): Request[SendCustomVerificationEmailResponse, AWSError] = js.native
  def sendCustomVerificationEmail(callback: js.Function2[/* err */ AWSError, /* data */ SendCustomVerificationEmailResponse, Unit]): Request[SendCustomVerificationEmailResponse, AWSError] = js.native
  /**
    * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. As a result of executing this operation, a customized verification email is sent to the specified address. To use this operation, you must first create a custom verification email template. For more information about creating and using custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def sendCustomVerificationEmail(params: SendCustomVerificationEmailRequest): Request[SendCustomVerificationEmailResponse, AWSError] = js.native
  def sendCustomVerificationEmail(
    params: SendCustomVerificationEmailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendCustomVerificationEmailResponse, Unit]
  ): Request[SendCustomVerificationEmailResponse, AWSError] = js.native
  /**
    * Composes an email message and immediately queues it for sending. In order to send email using the SendEmail operation, your message must meet the following requirements:   The message must be sent from a verified email address or domain. If you attempt to send email using a non-verified address or domain, the operation will result in an "Email address not verified" error.    If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   The message must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendEmail operation several times to send the message to each group.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.  
    */
  def sendEmail(): Request[SendEmailResponse, AWSError] = js.native
  def sendEmail(callback: js.Function2[/* err */ AWSError, /* data */ SendEmailResponse, Unit]): Request[SendEmailResponse, AWSError] = js.native
  /**
    * Composes an email message and immediately queues it for sending. In order to send email using the SendEmail operation, your message must meet the following requirements:   The message must be sent from a verified email address or domain. If you attempt to send email using a non-verified address or domain, the operation will result in an "Email address not verified" error.    If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   The message must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendEmail operation several times to send the message to each group.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.  
    */
  def sendEmail(params: SendEmailRequest): Request[SendEmailResponse, AWSError] = js.native
  def sendEmail(
    params: SendEmailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendEmailResponse, Unit]
  ): Request[SendEmailResponse, AWSError] = js.native
  /**
    * Composes an email message and immediately queues it for sending. This operation is more flexible than the SendEmail API operation. When you use the SendRawEmail operation, you can specify the headers of the message as well as its content. This flexibility is useful, for example, when you want to send a multipart MIME email (such a message that contains both a text and an HTML version). You can also use this operation to send messages that include attachments. The SendRawEmail operation has the following requirements:   You can only send email from verified email addresses or domains. If you try to send email from an address that isn't verified, the operation results in an "Email address not verified" error.   If your account is still in the Amazon SES sandbox, you can only send email to other verified addresses in your account, or to addresses that are associated with the Amazon SES mailbox simulator.   The maximum message size, including attachments, is 10 MB.   Each message has to include at least one recipient address. A recipient address includes any address on the To:, CC:, or BCC: lines.   If you send a single message to more than one recipient address, and one of the recipient addresses isn't in a valid format (that is, it's not in the format UserName@[SubDomain.]Domain.TopLevelDomain), Amazon SES rejects the entire message, even if the other addresses are valid.   Each message can include up to 50 recipient addresses across the To:, CC:, or BCC: lines. If you need to send a single message to more than 50 recipients, you have to split the list of recipient addresses into groups of less than 50 recipients, and send separate messages to each group.   Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME message parts. However, if Amazon SES has to modify the contents of your message (for example, if you use open and click tracking), 8-bit content isn't preserved. For this reason, we highly recommend that you encode all content that isn't 7-bit ASCII. For more information, see MIME Encoding in the Amazon SES Developer Guide.   Additionally, keep the following considerations in mind when using the SendRawEmail operation:   Although you can customize the message headers when using the SendRawEmail operation, Amazon SES will automatically apply its own Message-ID and Date headers; if you passed these headers when creating the message, they will be overwritten by the values that Amazon SES provides.   If you are using sending authorization to send on behalf of another user, SendRawEmail enables you to specify the cross-account identity for the email's Source, From, and Return-Path parameters in one of two ways: you can pass optional parameters SourceArn, FromArn, and/or ReturnPathArn to the API, or you can include the following X-headers in the header of your raw email:    X-SES-SOURCE-ARN     X-SES-FROM-ARN     X-SES-RETURN-PATH-ARN     Don't include these X-headers in the DKIM signature. Amazon SES removes these before it sends the email.  If you only specify the SourceIdentityArn parameter, Amazon SES sets the From and Return-Path addresses to the same identity that you specified. For more information about sending authorization, see the Using Sending Authorization with Amazon SES in the Amazon SES Developer Guide.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.   
    */
  def sendRawEmail(): Request[SendRawEmailResponse, AWSError] = js.native
  def sendRawEmail(callback: js.Function2[/* err */ AWSError, /* data */ SendRawEmailResponse, Unit]): Request[SendRawEmailResponse, AWSError] = js.native
  /**
    * Composes an email message and immediately queues it for sending. This operation is more flexible than the SendEmail API operation. When you use the SendRawEmail operation, you can specify the headers of the message as well as its content. This flexibility is useful, for example, when you want to send a multipart MIME email (such a message that contains both a text and an HTML version). You can also use this operation to send messages that include attachments. The SendRawEmail operation has the following requirements:   You can only send email from verified email addresses or domains. If you try to send email from an address that isn't verified, the operation results in an "Email address not verified" error.   If your account is still in the Amazon SES sandbox, you can only send email to other verified addresses in your account, or to addresses that are associated with the Amazon SES mailbox simulator.   The maximum message size, including attachments, is 10 MB.   Each message has to include at least one recipient address. A recipient address includes any address on the To:, CC:, or BCC: lines.   If you send a single message to more than one recipient address, and one of the recipient addresses isn't in a valid format (that is, it's not in the format UserName@[SubDomain.]Domain.TopLevelDomain), Amazon SES rejects the entire message, even if the other addresses are valid.   Each message can include up to 50 recipient addresses across the To:, CC:, or BCC: lines. If you need to send a single message to more than 50 recipients, you have to split the list of recipient addresses into groups of less than 50 recipients, and send separate messages to each group.   Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME message parts. However, if Amazon SES has to modify the contents of your message (for example, if you use open and click tracking), 8-bit content isn't preserved. For this reason, we highly recommend that you encode all content that isn't 7-bit ASCII. For more information, see MIME Encoding in the Amazon SES Developer Guide.   Additionally, keep the following considerations in mind when using the SendRawEmail operation:   Although you can customize the message headers when using the SendRawEmail operation, Amazon SES will automatically apply its own Message-ID and Date headers; if you passed these headers when creating the message, they will be overwritten by the values that Amazon SES provides.   If you are using sending authorization to send on behalf of another user, SendRawEmail enables you to specify the cross-account identity for the email's Source, From, and Return-Path parameters in one of two ways: you can pass optional parameters SourceArn, FromArn, and/or ReturnPathArn to the API, or you can include the following X-headers in the header of your raw email:    X-SES-SOURCE-ARN     X-SES-FROM-ARN     X-SES-RETURN-PATH-ARN     Don't include these X-headers in the DKIM signature. Amazon SES removes these before it sends the email.  If you only specify the SourceIdentityArn parameter, Amazon SES sets the From and Return-Path addresses to the same identity that you specified. For more information about sending authorization, see the Using Sending Authorization with Amazon SES in the Amazon SES Developer Guide.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.   
    */
  def sendRawEmail(params: SendRawEmailRequest): Request[SendRawEmailResponse, AWSError] = js.native
  def sendRawEmail(
    params: SendRawEmailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendRawEmailResponse, Unit]
  ): Request[SendRawEmailResponse, AWSError] = js.native
  /**
    * Composes an email message using an email template and immediately queues it for sending. In order to send email using the SendTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Calls to the SendTemplatedEmail operation may only include one Destination parameter. A destination is a set of recipients who will receive the same version of the email. The Destination parameter can include up to 50 recipients, across the To:, CC: and BCC: fields.   The Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.    If your call to the SendTemplatedEmail operation includes all of the required parameters, Amazon SES accepts it and returns a Message ID. However, if Amazon SES can't render the email because the template contains errors, it doesn't send the email. Additionally, because it already accepted the message, Amazon SES doesn't return a message stating that it was unable to send the email. For these reasons, we highly recommend that you set up Amazon SES to send you notifications when Rendering Failure events occur. For more information, see Sending Personalized Email Using the Amazon SES API in the Amazon Simple Email Service Developer Guide. 
    */
  def sendTemplatedEmail(): Request[SendTemplatedEmailResponse, AWSError] = js.native
  def sendTemplatedEmail(callback: js.Function2[/* err */ AWSError, /* data */ SendTemplatedEmailResponse, Unit]): Request[SendTemplatedEmailResponse, AWSError] = js.native
  /**
    * Composes an email message using an email template and immediately queues it for sending. In order to send email using the SendTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Calls to the SendTemplatedEmail operation may only include one Destination parameter. A destination is a set of recipients who will receive the same version of the email. The Destination parameter can include up to 50 recipients, across the To:, CC: and BCC: fields.   The Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.    If your call to the SendTemplatedEmail operation includes all of the required parameters, Amazon SES accepts it and returns a Message ID. However, if Amazon SES can't render the email because the template contains errors, it doesn't send the email. Additionally, because it already accepted the message, Amazon SES doesn't return a message stating that it was unable to send the email. For these reasons, we highly recommend that you set up Amazon SES to send you notifications when Rendering Failure events occur. For more information, see Sending Personalized Email Using the Amazon SES API in the Amazon Simple Email Service Developer Guide. 
    */
  def sendTemplatedEmail(params: SendTemplatedEmailRequest): Request[SendTemplatedEmailResponse, AWSError] = js.native
  def sendTemplatedEmail(
    params: SendTemplatedEmailRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendTemplatedEmailResponse, Unit]
  ): Request[SendTemplatedEmailResponse, AWSError] = js.native
  /**
    * Sets the specified receipt rule set as the active receipt rule set.  To disable your email-receiving through Amazon SES completely, you can call this API with RuleSetName set to null.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def setActiveReceiptRuleSet(): Request[SetActiveReceiptRuleSetResponse, AWSError] = js.native
  def setActiveReceiptRuleSet(callback: js.Function2[/* err */ AWSError, /* data */ SetActiveReceiptRuleSetResponse, Unit]): Request[SetActiveReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Sets the specified receipt rule set as the active receipt rule set.  To disable your email-receiving through Amazon SES completely, you can call this API with RuleSetName set to null.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def setActiveReceiptRuleSet(params: SetActiveReceiptRuleSetRequest): Request[SetActiveReceiptRuleSetResponse, AWSError] = js.native
  def setActiveReceiptRuleSet(
    params: SetActiveReceiptRuleSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetActiveReceiptRuleSetResponse, Unit]
  ): Request[SetActiveReceiptRuleSetResponse, AWSError] = js.native
  /**
    * Enables or disables Easy DKIM signing of email sent from an identity. If Easy DKIM signing is enabled for a domain, then Amazon SES uses DKIM to sign all email that it sends from addresses on that domain. If Easy DKIM signing is enabled for an email address, then Amazon SES uses DKIM to sign all email it sends from that address.  For email addresses (for example, user@example.com), you can only enable DKIM signing if the corresponding domain (in this case, example.com) has been set up to use Easy DKIM.  You can enable DKIM signing for an identity at any time after you start the verification process for the identity, even if the verification process isn't complete.  You can execute this operation no more than once per second. For more information about Easy DKIM signing, go to the Amazon SES Developer Guide.
    */
  def setIdentityDkimEnabled(): Request[SetIdentityDkimEnabledResponse, AWSError] = js.native
  def setIdentityDkimEnabled(callback: js.Function2[/* err */ AWSError, /* data */ SetIdentityDkimEnabledResponse, Unit]): Request[SetIdentityDkimEnabledResponse, AWSError] = js.native
  /**
    * Enables or disables Easy DKIM signing of email sent from an identity. If Easy DKIM signing is enabled for a domain, then Amazon SES uses DKIM to sign all email that it sends from addresses on that domain. If Easy DKIM signing is enabled for an email address, then Amazon SES uses DKIM to sign all email it sends from that address.  For email addresses (for example, user@example.com), you can only enable DKIM signing if the corresponding domain (in this case, example.com) has been set up to use Easy DKIM.  You can enable DKIM signing for an identity at any time after you start the verification process for the identity, even if the verification process isn't complete.  You can execute this operation no more than once per second. For more information about Easy DKIM signing, go to the Amazon SES Developer Guide.
    */
  def setIdentityDkimEnabled(params: SetIdentityDkimEnabledRequest): Request[SetIdentityDkimEnabledResponse, AWSError] = js.native
  def setIdentityDkimEnabled(
    params: SetIdentityDkimEnabledRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetIdentityDkimEnabledResponse, Unit]
  ): Request[SetIdentityDkimEnabledResponse, AWSError] = js.native
  /**
    * Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and complaint notifications as email. Feedback forwarding can only be disabled when Amazon Simple Notification Service (Amazon SNS) topics are specified for both bounces and complaints.  Feedback forwarding does not apply to delivery notifications. Delivery notifications are only available through Amazon SNS.  You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def setIdentityFeedbackForwardingEnabled(): Request[SetIdentityFeedbackForwardingEnabledResponse, AWSError] = js.native
  def setIdentityFeedbackForwardingEnabled(
    callback: js.Function2[/* err */ AWSError, /* data */ SetIdentityFeedbackForwardingEnabledResponse, Unit]
  ): Request[SetIdentityFeedbackForwardingEnabledResponse, AWSError] = js.native
  /**
    * Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and complaint notifications as email. Feedback forwarding can only be disabled when Amazon Simple Notification Service (Amazon SNS) topics are specified for both bounces and complaints.  Feedback forwarding does not apply to delivery notifications. Delivery notifications are only available through Amazon SNS.  You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def setIdentityFeedbackForwardingEnabled(params: SetIdentityFeedbackForwardingEnabledRequest): Request[SetIdentityFeedbackForwardingEnabledResponse, AWSError] = js.native
  def setIdentityFeedbackForwardingEnabled(
    params: SetIdentityFeedbackForwardingEnabledRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetIdentityFeedbackForwardingEnabledResponse, Unit]
  ): Request[SetIdentityFeedbackForwardingEnabledResponse, AWSError] = js.native
  /**
    * Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type. You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def setIdentityHeadersInNotificationsEnabled(): Request[SetIdentityHeadersInNotificationsEnabledResponse, AWSError] = js.native
  def setIdentityHeadersInNotificationsEnabled(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ SetIdentityHeadersInNotificationsEnabledResponse, 
      Unit
    ]
  ): Request[SetIdentityHeadersInNotificationsEnabledResponse, AWSError] = js.native
  /**
    * Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type. You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def setIdentityHeadersInNotificationsEnabled(params: SetIdentityHeadersInNotificationsEnabledRequest): Request[SetIdentityHeadersInNotificationsEnabledResponse, AWSError] = js.native
  def setIdentityHeadersInNotificationsEnabled(
    params: SetIdentityHeadersInNotificationsEnabledRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ SetIdentityHeadersInNotificationsEnabledResponse, 
      Unit
    ]
  ): Request[SetIdentityHeadersInNotificationsEnabledResponse, AWSError] = js.native
  /**
    * Enables or disables the custom MAIL FROM domain setup for a verified identity (an email address or a domain).  To send emails using the specified MAIL FROM domain, you must add an MX record to your MAIL FROM domain's DNS settings. If you want your emails to pass Sender Policy Framework (SPF) checks, you must also add or update an SPF record. For more information, see the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
    */
  def setIdentityMailFromDomain(): Request[SetIdentityMailFromDomainResponse, AWSError] = js.native
  def setIdentityMailFromDomain(callback: js.Function2[/* err */ AWSError, /* data */ SetIdentityMailFromDomainResponse, Unit]): Request[SetIdentityMailFromDomainResponse, AWSError] = js.native
  /**
    * Enables or disables the custom MAIL FROM domain setup for a verified identity (an email address or a domain).  To send emails using the specified MAIL FROM domain, you must add an MX record to your MAIL FROM domain's DNS settings. If you want your emails to pass Sender Policy Framework (SPF) checks, you must also add or update an SPF record. For more information, see the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
    */
  def setIdentityMailFromDomain(params: SetIdentityMailFromDomainRequest): Request[SetIdentityMailFromDomainResponse, AWSError] = js.native
  def setIdentityMailFromDomain(
    params: SetIdentityMailFromDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetIdentityMailFromDomainResponse, Unit]
  ): Request[SetIdentityMailFromDomainResponse, AWSError] = js.native
  /**
    * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when delivering notifications. When you use this operation, you specify a verified identity, such as an email address or domain. When you send an email that uses the chosen identity in the Source field, Amazon SES sends notifications to the topic you specified. You can send bounce, complaint, or delivery notifications (or any combination of the three) to the Amazon SNS topic that you specify. You can execute this operation no more than once per second. For more information about feedback notification, see the Amazon SES Developer Guide.
    */
  def setIdentityNotificationTopic(): Request[SetIdentityNotificationTopicResponse, AWSError] = js.native
  def setIdentityNotificationTopic(callback: js.Function2[/* err */ AWSError, /* data */ SetIdentityNotificationTopicResponse, Unit]): Request[SetIdentityNotificationTopicResponse, AWSError] = js.native
  /**
    * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when delivering notifications. When you use this operation, you specify a verified identity, such as an email address or domain. When you send an email that uses the chosen identity in the Source field, Amazon SES sends notifications to the topic you specified. You can send bounce, complaint, or delivery notifications (or any combination of the three) to the Amazon SNS topic that you specify. You can execute this operation no more than once per second. For more information about feedback notification, see the Amazon SES Developer Guide.
    */
  def setIdentityNotificationTopic(params: SetIdentityNotificationTopicRequest): Request[SetIdentityNotificationTopicResponse, AWSError] = js.native
  def setIdentityNotificationTopic(
    params: SetIdentityNotificationTopicRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetIdentityNotificationTopicResponse, Unit]
  ): Request[SetIdentityNotificationTopicResponse, AWSError] = js.native
  /**
    * Sets the position of the specified receipt rule in the receipt rule set. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def setReceiptRulePosition(): Request[SetReceiptRulePositionResponse, AWSError] = js.native
  def setReceiptRulePosition(callback: js.Function2[/* err */ AWSError, /* data */ SetReceiptRulePositionResponse, Unit]): Request[SetReceiptRulePositionResponse, AWSError] = js.native
  /**
    * Sets the position of the specified receipt rule in the receipt rule set. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def setReceiptRulePosition(params: SetReceiptRulePositionRequest): Request[SetReceiptRulePositionResponse, AWSError] = js.native
  def setReceiptRulePosition(
    params: SetReceiptRulePositionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetReceiptRulePositionResponse, Unit]
  ): Request[SetReceiptRulePositionResponse, AWSError] = js.native
  /**
    * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data. You can execute this operation no more than once per second.
    */
  def testRenderTemplate(): Request[TestRenderTemplateResponse, AWSError] = js.native
  def testRenderTemplate(callback: js.Function2[/* err */ AWSError, /* data */ TestRenderTemplateResponse, Unit]): Request[TestRenderTemplateResponse, AWSError] = js.native
  /**
    * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data. You can execute this operation no more than once per second.
    */
  def testRenderTemplate(params: TestRenderTemplateRequest): Request[TestRenderTemplateResponse, AWSError] = js.native
  def testRenderTemplate(
    params: TestRenderTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TestRenderTemplateResponse, Unit]
  ): Request[TestRenderTemplateResponse, AWSError] = js.native
  /**
    * Enables or disables email sending across your entire Amazon SES account in the current AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending across your Amazon SES account in a given AWS Region when reputation metrics (such as your bounce or complaint rates) reach certain thresholds. You can execute this operation no more than once per second.
    */
  def updateAccountSendingEnabled(): Request[js.Object, AWSError] = js.native
  def updateAccountSendingEnabled(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables or disables email sending across your entire Amazon SES account in the current AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending across your Amazon SES account in a given AWS Region when reputation metrics (such as your bounce or complaint rates) reach certain thresholds. You can execute this operation no more than once per second.
    */
  def updateAccountSendingEnabled(params: UpdateAccountSendingEnabledRequest): Request[js.Object, AWSError] = js.native
  def updateAccountSendingEnabled(
    params: UpdateAccountSendingEnabledRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the event destination of a configuration set. Event destinations are associated with configuration sets, which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS). For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.   When you create or update an event destination, you must provide one, and only one, destination. The destination can be Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  You can execute this operation no more than once per second.
    */
  def updateConfigurationSetEventDestination(): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def updateConfigurationSetEventDestination(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationSetEventDestinationResponse, Unit]
  ): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Updates the event destination of a configuration set. Event destinations are associated with configuration sets, which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS). For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.   When you create or update an event destination, you must provide one, and only one, destination. The destination can be Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  You can execute this operation no more than once per second.
    */
  def updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def updateConfigurationSetEventDestination(
    params: UpdateConfigurationSetEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationSetEventDestinationResponse, Unit]
  ): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Enables or disables the publishing of reputation metrics for emails sent using a specific configuration set in a given AWS Region. Reputation metrics include bounce and complaint rates. These metrics are published to Amazon CloudWatch. By using CloudWatch, you can create alarms when bounce or complaint rates exceed certain thresholds. You can execute this operation no more than once per second.
    */
  def updateConfigurationSetReputationMetricsEnabled(): Request[js.Object, AWSError] = js.native
  def updateConfigurationSetReputationMetricsEnabled(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables or disables the publishing of reputation metrics for emails sent using a specific configuration set in a given AWS Region. Reputation metrics include bounce and complaint rates. These metrics are published to Amazon CloudWatch. By using CloudWatch, you can create alarms when bounce or complaint rates exceed certain thresholds. You can execute this operation no more than once per second.
    */
  def updateConfigurationSetReputationMetricsEnabled(params: UpdateConfigurationSetReputationMetricsEnabledRequest): Request[js.Object, AWSError] = js.native
  def updateConfigurationSetReputationMetricsEnabled(
    params: UpdateConfigurationSetReputationMetricsEnabledRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Enables or disables email sending for messages sent using a specific configuration set in a given AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending for a configuration set when the reputation metrics for that configuration set (such as your bounce on complaint rate) exceed certain thresholds. You can execute this operation no more than once per second.
    */
  def updateConfigurationSetSendingEnabled(): Request[js.Object, AWSError] = js.native
  def updateConfigurationSetSendingEnabled(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables or disables email sending for messages sent using a specific configuration set in a given AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending for a configuration set when the reputation metrics for that configuration set (such as your bounce on complaint rate) exceed certain thresholds. You can execute this operation no more than once per second.
    */
  def updateConfigurationSetSendingEnabled(params: UpdateConfigurationSetSendingEnabledRequest): Request[js.Object, AWSError] = js.native
  def updateConfigurationSetSendingEnabled(
    params: UpdateConfigurationSetSendingEnabledRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Modifies an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
    */
  def updateConfigurationSetTrackingOptions(): Request[UpdateConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  def updateConfigurationSetTrackingOptions(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationSetTrackingOptionsResponse, Unit]
  ): Request[UpdateConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  /**
    * Modifies an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
    */
  def updateConfigurationSetTrackingOptions(params: UpdateConfigurationSetTrackingOptionsRequest): Request[UpdateConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  def updateConfigurationSetTrackingOptions(
    params: UpdateConfigurationSetTrackingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationSetTrackingOptionsResponse, Unit]
  ): Request[UpdateConfigurationSetTrackingOptionsResponse, AWSError] = js.native
  /**
    * Updates an existing custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateCustomVerificationEmailTemplate(): Request[js.Object, AWSError] = js.native
  def updateCustomVerificationEmailTemplate(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an existing custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateCustomVerificationEmailTemplate(params: UpdateCustomVerificationEmailTemplateRequest): Request[js.Object, AWSError] = js.native
  def updateCustomVerificationEmailTemplate(
    params: UpdateCustomVerificationEmailTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates a receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateReceiptRule(): Request[UpdateReceiptRuleResponse, AWSError] = js.native
  def updateReceiptRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateReceiptRuleResponse, Unit]): Request[UpdateReceiptRuleResponse, AWSError] = js.native
  /**
    * Updates a receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateReceiptRule(params: UpdateReceiptRuleRequest): Request[UpdateReceiptRuleResponse, AWSError] = js.native
  def updateReceiptRule(
    params: UpdateReceiptRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateReceiptRuleResponse, Unit]
  ): Request[UpdateReceiptRuleResponse, AWSError] = js.native
  /**
    * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateTemplate(): Request[UpdateTemplateResponse, AWSError] = js.native
  def updateTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateResponse, Unit]): Request[UpdateTemplateResponse, AWSError] = js.native
  /**
    * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateTemplate(params: UpdateTemplateRequest): Request[UpdateTemplateResponse, AWSError] = js.native
  def updateTemplate(
    params: UpdateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateResponse, Unit]
  ): Request[UpdateTemplateResponse, AWSError] = js.native
  /**
    * Returns a set of DKIM tokens for a domain identity.  When you execute the VerifyDomainDkim operation, the domain that you specify is added to the list of identities that are associated with your account. This is true even if you haven't already associated the domain with your account by using the VerifyDomainIdentity operation. However, you can't send email from the domain until you either successfully verify it or you successfully set up DKIM for it.  You use the tokens that are generated by this operation to create CNAME records. When Amazon SES detects that you've added these records to the DNS configuration for a domain, you can start sending email from that domain. You can start sending email even if you haven't added the TXT record provided by the VerifyDomainIdentity operation to the DNS configuration for your domain. All email that you send from the domain is authenticated using DKIM. To create the CNAME records for DKIM authentication, use the following values:    Name: token._domainkey.example.com     Type: CNAME    Value: token.dkim.amazonses.com   In the preceding example, replace token with one of the tokens that are generated when you execute this operation. Replace example.com with your domain. Repeat this process for each token that's generated by this operation. You can execute this operation no more than once per second.
    */
  def verifyDomainDkim(): Request[VerifyDomainDkimResponse, AWSError] = js.native
  def verifyDomainDkim(callback: js.Function2[/* err */ AWSError, /* data */ VerifyDomainDkimResponse, Unit]): Request[VerifyDomainDkimResponse, AWSError] = js.native
  /**
    * Returns a set of DKIM tokens for a domain identity.  When you execute the VerifyDomainDkim operation, the domain that you specify is added to the list of identities that are associated with your account. This is true even if you haven't already associated the domain with your account by using the VerifyDomainIdentity operation. However, you can't send email from the domain until you either successfully verify it or you successfully set up DKIM for it.  You use the tokens that are generated by this operation to create CNAME records. When Amazon SES detects that you've added these records to the DNS configuration for a domain, you can start sending email from that domain. You can start sending email even if you haven't added the TXT record provided by the VerifyDomainIdentity operation to the DNS configuration for your domain. All email that you send from the domain is authenticated using DKIM. To create the CNAME records for DKIM authentication, use the following values:    Name: token._domainkey.example.com     Type: CNAME    Value: token.dkim.amazonses.com   In the preceding example, replace token with one of the tokens that are generated when you execute this operation. Replace example.com with your domain. Repeat this process for each token that's generated by this operation. You can execute this operation no more than once per second.
    */
  def verifyDomainDkim(params: VerifyDomainDkimRequest): Request[VerifyDomainDkimResponse, AWSError] = js.native
  def verifyDomainDkim(
    params: VerifyDomainDkimRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VerifyDomainDkimResponse, Unit]
  ): Request[VerifyDomainDkimResponse, AWSError] = js.native
  /**
    * Adds a domain to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. For more information about verifying domains, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
    */
  def verifyDomainIdentity(): Request[VerifyDomainIdentityResponse, AWSError] = js.native
  def verifyDomainIdentity(callback: js.Function2[/* err */ AWSError, /* data */ VerifyDomainIdentityResponse, Unit]): Request[VerifyDomainIdentityResponse, AWSError] = js.native
  /**
    * Adds a domain to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. For more information about verifying domains, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
    */
  def verifyDomainIdentity(params: VerifyDomainIdentityRequest): Request[VerifyDomainIdentityResponse, AWSError] = js.native
  def verifyDomainIdentity(
    params: VerifyDomainIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VerifyDomainIdentityResponse, Unit]
  ): Request[VerifyDomainIdentityResponse, AWSError] = js.native
  /**
    * Deprecated. Use the VerifyEmailIdentity operation to verify a new email address.
    */
  def verifyEmailAddress(): Request[js.Object, AWSError] = js.native
  def verifyEmailAddress(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deprecated. Use the VerifyEmailIdentity operation to verify a new email address.
    */
  def verifyEmailAddress(params: VerifyEmailAddressRequest): Request[js.Object, AWSError] = js.native
  def verifyEmailAddress(
    params: VerifyEmailAddressRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Adds an email address to the list of identities for your Amazon SES account in the current AWS region and attempts to verify it. As a result of executing this operation, a verification email is sent to the specified address. You can execute this operation no more than once per second.
    */
  def verifyEmailIdentity(): Request[VerifyEmailIdentityResponse, AWSError] = js.native
  def verifyEmailIdentity(callback: js.Function2[/* err */ AWSError, /* data */ VerifyEmailIdentityResponse, Unit]): Request[VerifyEmailIdentityResponse, AWSError] = js.native
  /**
    * Adds an email address to the list of identities for your Amazon SES account in the current AWS region and attempts to verify it. As a result of executing this operation, a verification email is sent to the specified address. You can execute this operation no more than once per second.
    */
  def verifyEmailIdentity(params: VerifyEmailIdentityRequest): Request[VerifyEmailIdentityResponse, AWSError] = js.native
  def verifyEmailIdentity(
    params: VerifyEmailIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ VerifyEmailIdentityResponse, Unit]
  ): Request[VerifyEmailIdentityResponse, AWSError] = js.native
  /**
    * Waits for the identityExists state by periodically calling the underlying SES.getIdentityVerificationAttributesoperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_identityExists(state: identityExists): Request[GetIdentityVerificationAttributesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_identityExists(
    state: identityExists,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityVerificationAttributesResponse, Unit]
  ): Request[GetIdentityVerificationAttributesResponse, AWSError] = js.native
  /**
    * Waits for the identityExists state by periodically calling the underlying SES.getIdentityVerificationAttributesoperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_identityExists(state: identityExists, params: GetIdentityVerificationAttributesRequest with Anon_Waiter): Request[GetIdentityVerificationAttributesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_identityExists(
    state: identityExists,
    params: GetIdentityVerificationAttributesRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityVerificationAttributesResponse, Unit]
  ): Request[GetIdentityVerificationAttributesResponse, AWSError] = js.native
}

