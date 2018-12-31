package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SES
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SES: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsSesMod.SESNs.ClientConfiguration = js.native
  /**
    * Creates a receipt rule set by cloning an existing one. All receipt rules and configurations are copied to the new receipt rule set and are completely independent of the source rule set. For information about setting up rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def cloneReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CloneReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cloneReceiptRuleSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CloneReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CloneReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a receipt rule set by cloning an existing one. All receipt rules and configurations are copied to the new receipt rule set and are completely independent of the source rule set. For information about setting up rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def cloneReceiptRuleSet(params: awsDashSdkLib.clientsSesMod.SESNs.CloneReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CloneReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cloneReceiptRuleSet(
    params: awsDashSdkLib.clientsSesMod.SESNs.CloneReceiptRuleSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CloneReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CloneReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createConfigurationSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createConfigurationSet(params: awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationSet(
    params: awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a configuration set event destination.  When you create or update an event destination, you must provide one, and only one, destination. The destination can be CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationSetEventDestination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a configuration set event destination.  When you create or update an event destination, you must provide one, and only one, destination. The destination can be CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createConfigurationSetEventDestination(params: awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetEventDestinationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetEventDestinationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
    */
  def createConfigurationSetTrackingOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationSetTrackingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetTrackingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
    */
  def createConfigurationSetTrackingOptions(params: awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetTrackingOptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationSetTrackingOptions(
    params: awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetTrackingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetTrackingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createCustomVerificationEmailTemplate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCustomVerificationEmailTemplate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createCustomVerificationEmailTemplate(params: awsDashSdkLib.clientsSesMod.SESNs.CreateCustomVerificationEmailTemplateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCustomVerificationEmailTemplate(
    params: awsDashSdkLib.clientsSesMod.SESNs.CreateCustomVerificationEmailTemplateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new IP address filter. For information about setting up IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptFilter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReceiptFilter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new IP address filter. For information about setting up IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptFilter(params: awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptFilterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReceiptFilter(
    params: awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptFilterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReceiptRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptRule(params: awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReceiptRule(
    params: awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an empty receipt rule set. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReceiptRuleSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an empty receipt rule set. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createReceiptRuleSet(params: awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createReceiptRuleSet(
    params: awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def createTemplate(params: awsDashSdkLib.clientsSesMod.SESNs.CreateTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTemplate(
    params: awsDashSdkLib.clientsSesMod.SESNs.CreateTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.CreateTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.CreateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteConfigurationSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConfigurationSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteConfigurationSet(params: awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConfigurationSet(
    params: awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConfigurationSetEventDestination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteConfigurationSetEventDestination(params: awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetEventDestinationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetEventDestinationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an association between a configuration set and a custom domain for open and click event tracking. By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.  Deleting this kind of association will result in emails sent using the specified configuration set to capture open and click events using the standard, Amazon SES-operated domains. 
    */
  def deleteConfigurationSetTrackingOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConfigurationSetTrackingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetTrackingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an association between a configuration set and a custom domain for open and click event tracking. By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.  Deleting this kind of association will result in emails sent using the specified configuration set to capture open and click events using the standard, Amazon SES-operated domains. 
    */
  def deleteConfigurationSetTrackingOptions(params: awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetTrackingOptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConfigurationSetTrackingOptions(
    params: awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetTrackingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetTrackingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing custom verification email template.  For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteCustomVerificationEmailTemplate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCustomVerificationEmailTemplate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing custom verification email template.  For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteCustomVerificationEmailTemplate(params: awsDashSdkLib.clientsSesMod.SESNs.DeleteCustomVerificationEmailTemplateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCustomVerificationEmailTemplate(
    params: awsDashSdkLib.clientsSesMod.SESNs.DeleteCustomVerificationEmailTemplateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified identity (an email address or a domain) from the list of verified identities. You can execute this operation no more than once per second.
    */
  def deleteIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified identity (an email address or a domain) from the list of verified identities. You can execute this operation no more than once per second.
    */
  def deleteIdentity(params: awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteIdentity(
    params: awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This API returns successfully even if a policy with the specified name does not exist.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteIdentityPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteIdentityPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified sending authorization policy for the given identity (an email address or a domain). This API returns successfully even if a policy with the specified name does not exist.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteIdentityPolicy(params: awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteIdentityPolicy(
    params: awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteIdentityPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified IP address filter. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptFilter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReceiptFilter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified IP address filter. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptFilter(params: awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptFilterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReceiptFilter(
    params: awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptFilterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptFilterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptFilterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReceiptRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptRule(params: awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReceiptRule(
    params: awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified receipt rule set and all of the receipt rules it contains.  The currently active rule set cannot be deleted.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReceiptRuleSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified receipt rule set and all of the receipt rules it contains.  The currently active rule set cannot be deleted.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def deleteReceiptRuleSet(params: awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteReceiptRuleSet(
    params: awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an email template. You can execute this operation no more than once per second.
    */
  def deleteTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an email template. You can execute this operation no more than once per second.
    */
  def deleteTemplate(params: awsDashSdkLib.clientsSesMod.SESNs.DeleteTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTemplate(
    params: awsDashSdkLib.clientsSesMod.SESNs.DeleteTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DeleteTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DeleteTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deprecated. Use the DeleteIdentity operation to delete email addresses and domains.
    */
  def deleteVerifiedEmailAddress(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVerifiedEmailAddress(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecated. Use the DeleteIdentity operation to delete email addresses and domains.
    */
  def deleteVerifiedEmailAddress(params: awsDashSdkLib.clientsSesMod.SESNs.DeleteVerifiedEmailAddressRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVerifiedEmailAddress(
    params: awsDashSdkLib.clientsSesMod.SESNs.DeleteVerifiedEmailAddressRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the metadata and receipt rules for the receipt rule set that is currently active. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeActiveReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeActiveReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeActiveReceiptRuleSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DescribeActiveReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeActiveReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the metadata and receipt rules for the receipt rule set that is currently active. For information about setting up receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeActiveReceiptRuleSet(params: awsDashSdkLib.clientsSesMod.SESNs.DescribeActiveReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeActiveReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeActiveReceiptRuleSet(
    params: awsDashSdkLib.clientsSesMod.SESNs.DescribeActiveReceiptRuleSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DescribeActiveReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeActiveReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of the specified configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeConfigurationSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DescribeConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of the specified configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeConfigurationSet(params: awsDashSdkLib.clientsSesMod.SESNs.DescribeConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationSet(
    params: awsDashSdkLib.clientsSesMod.SESNs.DescribeConfigurationSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DescribeConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of the specified receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeReceiptRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReceiptRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of the specified receipt rule. For information about setting up receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeReceiptRule(params: awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReceiptRule(
    params: awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of the specified receipt rule set. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReceiptRuleSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of the specified receipt rule set. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def describeReceiptRuleSet(params: awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeReceiptRuleSet(
    params: awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.DescribeReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the email sending status of the Amazon SES account for the current region. You can execute this operation no more than once per second.
    */
  def getAccountSendingEnabled(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetAccountSendingEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAccountSendingEnabled(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetAccountSendingEnabledResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetAccountSendingEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the custom email verification template for the template name you specify. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getCustomVerificationEmailTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetCustomVerificationEmailTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCustomVerificationEmailTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetCustomVerificationEmailTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetCustomVerificationEmailTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the custom email verification template for the template name you specify. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getCustomVerificationEmailTemplate(params: awsDashSdkLib.clientsSesMod.SESNs.GetCustomVerificationEmailTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetCustomVerificationEmailTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCustomVerificationEmailTemplate(
    params: awsDashSdkLib.clientsSesMod.SESNs.GetCustomVerificationEmailTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetCustomVerificationEmailTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetCustomVerificationEmailTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current status of Easy DKIM signing for an entity. For domain name identities, this operation also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified that these tokens have been published. This operation takes a list of identities as input and returns the following information for each:   Whether Easy DKIM signing is enabled or disabled.   A set of DKIM tokens that represent the identity. If the identity is an email address, the tokens represent the domain of that address.   Whether Amazon SES has successfully verified the DKIM tokens published in the domain's DNS. This information is only returned for domain name identities, not for email addresses.   This operation is throttled at one request per second and can only get DKIM attributes for up to 100 identities at a time. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
    */
  def getIdentityDkimAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityDkimAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityDkimAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityDkimAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityDkimAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current status of Easy DKIM signing for an entity. For domain name identities, this operation also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified that these tokens have been published. This operation takes a list of identities as input and returns the following information for each:   Whether Easy DKIM signing is enabled or disabled.   A set of DKIM tokens that represent the identity. If the identity is an email address, the tokens represent the domain of that address.   Whether Amazon SES has successfully verified the DKIM tokens published in the domain's DNS. This information is only returned for domain name identities, not for email addresses.   This operation is throttled at one request per second and can only get DKIM attributes for up to 100 identities at a time. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
    */
  def getIdentityDkimAttributes(params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityDkimAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityDkimAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityDkimAttributes(
    params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityDkimAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityDkimAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityDkimAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the custom MAIL FROM attributes for a list of identities (email addresses : domains). This operation is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100 identities at a time.
    */
  def getIdentityMailFromDomainAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityMailFromDomainAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityMailFromDomainAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityMailFromDomainAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityMailFromDomainAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the custom MAIL FROM attributes for a list of identities (email addresses : domains). This operation is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100 identities at a time.
    */
  def getIdentityMailFromDomainAttributes(params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityMailFromDomainAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityMailFromDomainAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityMailFromDomainAttributes(
    params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityMailFromDomainAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityMailFromDomainAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityMailFromDomainAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a list of verified identities (email addresses and/or domains), returns a structure describing identity notification attributes. This operation is throttled at one request per second and can only get notification attributes for up to 100 identities at a time. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def getIdentityNotificationAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityNotificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityNotificationAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityNotificationAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityNotificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a list of verified identities (email addresses and/or domains), returns a structure describing identity notification attributes. This operation is throttled at one request per second and can only get notification attributes for up to 100 identities at a time. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def getIdentityNotificationAttributes(params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityNotificationAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityNotificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityNotificationAttributes(
    params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityNotificationAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityNotificationAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityNotificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the requested sending authorization policies for the given identity (an email address or a domain). The policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a time.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getIdentityPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the requested sending authorization policies for the given identity (an email address or a domain). The policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a time.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def getIdentityPolicies(params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityPolicies(
    params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain identities) the verification token for each identity. The verification status of an email address is "Pending" until the email address owner clicks the link within the verification email that Amazon SES sent to that address. If the email address owner clicks the link within 24 hours, the verification status of the email address changes to "Success". If the link is not clicked within 24 hours, the verification status changes to "Failed." In that case, if you still want to verify the email address, you must restart the verification process from the beginning. For domain identities, the domain's verification status is "Pending" as Amazon SES searches for the required TXT record in the DNS settings of the domain. When Amazon SES detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify the domain, you must restart the verification process from the beginning. This operation is throttled at one request per second and can only get verification attributes for up to 100 identities at a time.
    */
  def getIdentityVerificationAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityVerificationAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain identities) the verification token for each identity. The verification status of an email address is "Pending" until the email address owner clicks the link within the verification email that Amazon SES sent to that address. If the email address owner clicks the link within 24 hours, the verification status of the email address changes to "Success". If the link is not clicked within 24 hours, the verification status changes to "Failed." In that case, if you still want to verify the email address, you must restart the verification process from the beginning. For domain identities, the domain's verification status is "Pending" as Amazon SES searches for the required TXT record in the DNS settings of the domain. When Amazon SES detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify the domain, you must restart the verification process from the beginning. This operation is throttled at one request per second and can only get verification attributes for up to 100 identities at a time.
    */
  def getIdentityVerificationAttributes(params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityVerificationAttributes(
    params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides the sending limits for the Amazon SES account.  You can execute this operation no more than once per second.
    */
  def getSendQuota(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetSendQuotaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSendQuota(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetSendQuotaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetSendQuotaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides sending statistics for the current AWS Region. The result is a list of data points, representing the last two weeks of sending activity. Each data point in the list contains statistics for a 15-minute period of time. You can execute this operation no more than once per second.
    */
  def getSendStatistics(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetSendStatisticsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSendStatistics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetSendStatisticsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetSendStatisticsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays the template object (which includes the Subject line, HTML part and text part) for the template you specify. You can execute this operation no more than once per second.
    */
  def getTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Displays the template object (which includes the Subject line, HTML part and text part) for the template you specify. You can execute this operation no more than once per second.
    */
  def getTemplate(params: awsDashSdkLib.clientsSesMod.SESNs.GetTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTemplate(
    params: awsDashSdkLib.clientsSesMod.SESNs.GetTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a list of the configuration sets associated with your Amazon SES account in the current AWS Region. For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.  You can execute this operation no more than once per second. This operation will return up to 1,000 configuration sets each time it is run. If your Amazon SES account has more than 1,000 configuration sets, this operation will also return a NextToken element. You can then execute the ListConfigurationSets operation again, passing the NextToken parameter and the value of the NextToken element to retrieve additional results.
    */
  def listConfigurationSets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListConfigurationSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listConfigurationSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListConfigurationSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListConfigurationSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a list of the configuration sets associated with your Amazon SES account in the current AWS Region. For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.  You can execute this operation no more than once per second. This operation will return up to 1,000 configuration sets each time it is run. If your Amazon SES account has more than 1,000 configuration sets, this operation will also return a NextToken element. You can then execute the ListConfigurationSets operation again, passing the NextToken parameter and the value of the NextToken element to retrieve additional results.
    */
  def listConfigurationSets(params: awsDashSdkLib.clientsSesMod.SESNs.ListConfigurationSetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListConfigurationSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listConfigurationSets(
    params: awsDashSdkLib.clientsSesMod.SESNs.ListConfigurationSetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListConfigurationSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListConfigurationSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the existing custom verification email templates for your account in the current AWS Region. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listCustomVerificationEmailTemplates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListCustomVerificationEmailTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listCustomVerificationEmailTemplates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListCustomVerificationEmailTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListCustomVerificationEmailTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the existing custom verification email templates for your account in the current AWS Region. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listCustomVerificationEmailTemplates(params: awsDashSdkLib.clientsSesMod.SESNs.ListCustomVerificationEmailTemplatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListCustomVerificationEmailTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listCustomVerificationEmailTemplates(
    params: awsDashSdkLib.clientsSesMod.SESNs.ListCustomVerificationEmailTemplatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListCustomVerificationEmailTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListCustomVerificationEmailTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list containing all of the identities (email addresses and domains) for your AWS account in the current AWS Region, regardless of verification status. You can execute this operation no more than once per second.
    */
  def listIdentities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listIdentities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListIdentitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list containing all of the identities (email addresses and domains) for your AWS account in the current AWS Region, regardless of verification status. You can execute this operation no more than once per second.
    */
  def listIdentities(params: awsDashSdkLib.clientsSesMod.SESNs.ListIdentitiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listIdentities(
    params: awsDashSdkLib.clientsSesMod.SESNs.ListIdentitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListIdentitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of sending authorization policies that are attached to the given identity (an email address or a domain). This API returns only a list. If you want the actual policy content, you can use GetIdentityPolicies.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listIdentityPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListIdentityPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listIdentityPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListIdentityPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListIdentityPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of sending authorization policies that are attached to the given identity (an email address or a domain). This API returns only a list. If you want the actual policy content, you can use GetIdentityPolicies.  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listIdentityPolicies(params: awsDashSdkLib.clientsSesMod.SESNs.ListIdentityPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListIdentityPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listIdentityPolicies(
    params: awsDashSdkLib.clientsSesMod.SESNs.ListIdentityPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListIdentityPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListIdentityPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the IP address filters associated with your AWS account in the current AWS Region. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listReceiptFilters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListReceiptFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listReceiptFilters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListReceiptFiltersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListReceiptFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the IP address filters associated with your AWS account in the current AWS Region. For information about managing IP address filters, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listReceiptFilters(params: awsDashSdkLib.clientsSesMod.SESNs.ListReceiptFiltersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListReceiptFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listReceiptFilters(
    params: awsDashSdkLib.clientsSesMod.SESNs.ListReceiptFiltersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListReceiptFiltersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListReceiptFiltersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the receipt rule sets that exist under your AWS account in the current AWS Region. If there are additional receipt rule sets to be retrieved, you will receive a NextToken that you can provide to the next call to ListReceiptRuleSets to retrieve the additional entries. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listReceiptRuleSets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListReceiptRuleSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listReceiptRuleSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListReceiptRuleSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListReceiptRuleSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the receipt rule sets that exist under your AWS account in the current AWS Region. If there are additional receipt rule sets to be retrieved, you will receive a NextToken that you can provide to the next call to ListReceiptRuleSets to retrieve the additional entries. For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def listReceiptRuleSets(params: awsDashSdkLib.clientsSesMod.SESNs.ListReceiptRuleSetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListReceiptRuleSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listReceiptRuleSets(
    params: awsDashSdkLib.clientsSesMod.SESNs.ListReceiptRuleSetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListReceiptRuleSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListReceiptRuleSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the email templates present in your Amazon SES account in the current AWS Region. You can execute this operation no more than once per second.
    */
  def listTemplates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTemplates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the email templates present in your Amazon SES account in the current AWS Region. You can execute this operation no more than once per second.
    */
  def listTemplates(params: awsDashSdkLib.clientsSesMod.SESNs.ListTemplatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTemplates(
    params: awsDashSdkLib.clientsSesMod.SESNs.ListTemplatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListTemplatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListTemplatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deprecated. Use the ListIdentities operation to list the email addresses and domains associated with your account.
    */
  def listVerifiedEmailAddresses(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListVerifiedEmailAddressesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVerifiedEmailAddresses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ListVerifiedEmailAddressesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ListVerifiedEmailAddressesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or updates a sending authorization policy for the specified identity (an email address or a domain).  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def putIdentityPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.PutIdentityPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putIdentityPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.PutIdentityPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.PutIdentityPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or updates a sending authorization policy for the specified identity (an email address or a domain).  This API is for the identity owner only. If you have not verified the identity, this API will return an error.  Sending authorization is a feature that enables an identity owner to authorize other senders to use its identities. For information about using sending authorization, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def putIdentityPolicy(params: awsDashSdkLib.clientsSesMod.SESNs.PutIdentityPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.PutIdentityPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putIdentityPolicy(
    params: awsDashSdkLib.clientsSesMod.SESNs.PutIdentityPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.PutIdentityPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.PutIdentityPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Reorders the receipt rules within a receipt rule set.  All of the rules in the rule set must be represented in this request. That is, this API will return an error if the reorder request doesn't explicitly position all of the rules.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def reorderReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ReorderReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def reorderReceiptRuleSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ReorderReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ReorderReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Reorders the receipt rules within a receipt rule set.  All of the rules in the rule set must be represented in this request. That is, this API will return an error if the reorder request doesn't explicitly position all of the rules.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def reorderReceiptRuleSet(params: awsDashSdkLib.clientsSesMod.SESNs.ReorderReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ReorderReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def reorderReceiptRuleSet(
    params: awsDashSdkLib.clientsSesMod.SESNs.ReorderReceiptRuleSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.ReorderReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.ReorderReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates and sends a bounce message to the sender of an email you received through Amazon SES. You can only use this API on an email up to 24 hours after you receive it.  You cannot use this API to send generic bounces for mail that was not received by Amazon SES.  For information about receiving email through Amazon SES, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def sendBounce(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendBounceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendBounce(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendBounceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendBounceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates and sends a bounce message to the sender of an email you received through Amazon SES. You can only use this API on an email up to 24 hours after you receive it.  You cannot use this API to send generic bounces for mail that was not received by Amazon SES.  For information about receiving email through Amazon SES, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def sendBounce(params: awsDashSdkLib.clientsSesMod.SESNs.SendBounceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendBounceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendBounce(
    params: awsDashSdkLib.clientsSesMod.SESNs.SendBounceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendBounceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendBounceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Composes an email message to multiple destinations. The message body is created using an email template. In order to send email using the SendBulkTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Each Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendBulkTemplatedEmail operation several times to send the message to each group.   The number of destinations you can contact in a single call to the API may be limited by your account's maximum sending rate.  
    */
  def sendBulkTemplatedEmail(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendBulkTemplatedEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendBulkTemplatedEmail(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendBulkTemplatedEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendBulkTemplatedEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Composes an email message to multiple destinations. The message body is created using an email template. In order to send email using the SendBulkTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Each Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendBulkTemplatedEmail operation several times to send the message to each group.   The number of destinations you can contact in a single call to the API may be limited by your account's maximum sending rate.  
    */
  def sendBulkTemplatedEmail(params: awsDashSdkLib.clientsSesMod.SESNs.SendBulkTemplatedEmailRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendBulkTemplatedEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendBulkTemplatedEmail(
    params: awsDashSdkLib.clientsSesMod.SESNs.SendBulkTemplatedEmailRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendBulkTemplatedEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendBulkTemplatedEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. As a result of executing this operation, a customized verification email is sent to the specified address. To use this operation, you must first create a custom verification email template. For more information about creating and using custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def sendCustomVerificationEmail(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendCustomVerificationEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendCustomVerificationEmail(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendCustomVerificationEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendCustomVerificationEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. As a result of executing this operation, a customized verification email is sent to the specified address. To use this operation, you must first create a custom verification email template. For more information about creating and using custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def sendCustomVerificationEmail(params: awsDashSdkLib.clientsSesMod.SESNs.SendCustomVerificationEmailRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendCustomVerificationEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendCustomVerificationEmail(
    params: awsDashSdkLib.clientsSesMod.SESNs.SendCustomVerificationEmailRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendCustomVerificationEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendCustomVerificationEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Composes an email message and immediately queues it for sending. In order to send email using the SendEmail operation, your message must meet the following requirements:   The message must be sent from a verified email address or domain. If you attempt to send email using a non-verified address or domain, the operation will result in an "Email address not verified" error.    If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   The message must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendEmail operation several times to send the message to each group.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.  
    */
  def sendEmail(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendEmail(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Composes an email message and immediately queues it for sending. In order to send email using the SendEmail operation, your message must meet the following requirements:   The message must be sent from a verified email address or domain. If you attempt to send email using a non-verified address or domain, the operation will result in an "Email address not verified" error.    If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   The message must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call the SendEmail operation several times to send the message to each group.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.  
    */
  def sendEmail(params: awsDashSdkLib.clientsSesMod.SESNs.SendEmailRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendEmail(
    params: awsDashSdkLib.clientsSesMod.SESNs.SendEmailRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Composes an email message and immediately queues it for sending. This operation is more flexible than the SendEmail API operation. When you use the SendRawEmail operation, you can specify the headers of the message as well as its content. This flexibility is useful, for example, when you want to send a multipart MIME email (such a message that contains both a text and an HTML version). You can also use this operation to send messages that include attachments. The SendRawEmail operation has the following requirements:   You can only send email from verified email addresses or domains. If you try to send email from an address that isn't verified, the operation results in an "Email address not verified" error.   If your account is still in the Amazon SES sandbox, you can only send email to other verified addresses in your account, or to addresses that are associated with the Amazon SES mailbox simulator.   The maximum message size, including attachments, is 10 MB.   Each message has to include at least one recipient address. A recipient address includes any address on the To:, CC:, or BCC: lines.   If you send a single message to more than one recipient address, and one of the recipient addresses isn't in a valid format (that is, it's not in the format UserName@[SubDomain.]Domain.TopLevelDomain), Amazon SES rejects the entire message, even if the other addresses are valid.   Each message can include up to 50 recipient addresses across the To:, CC:, or BCC: lines. If you need to send a single message to more than 50 recipients, you have to split the list of recipient addresses into groups of less than 50 recipients, and send separate messages to each group.   Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME message parts. However, if Amazon SES has to modify the contents of your message (for example, if you use open and click tracking), 8-bit content isn't preserved. For this reason, we highly recommend that you encode all content that isn't 7-bit ASCII. For more information, see MIME Encoding in the Amazon SES Developer Guide.   Additionally, keep the following considerations in mind when using the SendRawEmail operation:   Although you can customize the message headers when using the SendRawEmail operation, Amazon SES will automatically apply its own Message-ID and Date headers; if you passed these headers when creating the message, they will be overwritten by the values that Amazon SES provides.   If you are using sending authorization to send on behalf of another user, SendRawEmail enables you to specify the cross-account identity for the email's Source, From, and Return-Path parameters in one of two ways: you can pass optional parameters SourceArn, FromArn, and/or ReturnPathArn to the API, or you can include the following X-headers in the header of your raw email:    X-SES-SOURCE-ARN     X-SES-FROM-ARN     X-SES-RETURN-PATH-ARN     Do not include these X-headers in the DKIM signature; Amazon SES will remove them before sending the email.  For most common sending authorization scenarios, we recommend that you specify the SourceIdentityArn parameter and not the FromIdentityArn or ReturnPathIdentityArn parameters. If you only specify the SourceIdentityArn parameter, Amazon SES will set the From and Return Path addresses to the identity specified in SourceIdentityArn. For more information about sending authorization, see the Using Sending Authorization with Amazon SES in the Amazon SES Developer Guide.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.   
    */
  def sendRawEmail(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendRawEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendRawEmail(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendRawEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendRawEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Composes an email message and immediately queues it for sending. This operation is more flexible than the SendEmail API operation. When you use the SendRawEmail operation, you can specify the headers of the message as well as its content. This flexibility is useful, for example, when you want to send a multipart MIME email (such a message that contains both a text and an HTML version). You can also use this operation to send messages that include attachments. The SendRawEmail operation has the following requirements:   You can only send email from verified email addresses or domains. If you try to send email from an address that isn't verified, the operation results in an "Email address not verified" error.   If your account is still in the Amazon SES sandbox, you can only send email to other verified addresses in your account, or to addresses that are associated with the Amazon SES mailbox simulator.   The maximum message size, including attachments, is 10 MB.   Each message has to include at least one recipient address. A recipient address includes any address on the To:, CC:, or BCC: lines.   If you send a single message to more than one recipient address, and one of the recipient addresses isn't in a valid format (that is, it's not in the format UserName@[SubDomain.]Domain.TopLevelDomain), Amazon SES rejects the entire message, even if the other addresses are valid.   Each message can include up to 50 recipient addresses across the To:, CC:, or BCC: lines. If you need to send a single message to more than 50 recipients, you have to split the list of recipient addresses into groups of less than 50 recipients, and send separate messages to each group.   Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME message parts. However, if Amazon SES has to modify the contents of your message (for example, if you use open and click tracking), 8-bit content isn't preserved. For this reason, we highly recommend that you encode all content that isn't 7-bit ASCII. For more information, see MIME Encoding in the Amazon SES Developer Guide.   Additionally, keep the following considerations in mind when using the SendRawEmail operation:   Although you can customize the message headers when using the SendRawEmail operation, Amazon SES will automatically apply its own Message-ID and Date headers; if you passed these headers when creating the message, they will be overwritten by the values that Amazon SES provides.   If you are using sending authorization to send on behalf of another user, SendRawEmail enables you to specify the cross-account identity for the email's Source, From, and Return-Path parameters in one of two ways: you can pass optional parameters SourceArn, FromArn, and/or ReturnPathArn to the API, or you can include the following X-headers in the header of your raw email:    X-SES-SOURCE-ARN     X-SES-FROM-ARN     X-SES-RETURN-PATH-ARN     Do not include these X-headers in the DKIM signature; Amazon SES will remove them before sending the email.  For most common sending authorization scenarios, we recommend that you specify the SourceIdentityArn parameter and not the FromIdentityArn or ReturnPathIdentityArn parameters. If you only specify the SourceIdentityArn parameter, Amazon SES will set the From and Return Path addresses to the identity specified in SourceIdentityArn. For more information about sending authorization, see the Using Sending Authorization with Amazon SES in the Amazon SES Developer Guide.    For every message that you send, the total number of recipients (including each recipient in the To:, CC: and BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES Sending Limits in the Amazon SES Developer Guide.   
    */
  def sendRawEmail(params: awsDashSdkLib.clientsSesMod.SESNs.SendRawEmailRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendRawEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendRawEmail(
    params: awsDashSdkLib.clientsSesMod.SESNs.SendRawEmailRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendRawEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendRawEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Composes an email message using an email template and immediately queues it for sending. In order to send email using the SendTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Calls to the SendTemplatedEmail operation may only include one Destination parameter. A destination is a set of recipients who will receive the same version of the email. The Destination parameter can include up to 50 recipients, across the To:, CC: and BCC: fields.   The Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.    If your call to the SendTemplatedEmail operation includes all of the required parameters, Amazon SES accepts it and returns a Message ID. However, if Amazon SES can't render the email because the template contains errors, it doesn't send the email. Additionally, because it already accepted the message, Amazon SES doesn't return a message stating that it was unable to send the email. For these reasons, we highly recommend that you set up Amazon SES to send you notifications when Rendering Failure events occur. For more information, see Sending Personalized Email Using the Amazon SES API in the Amazon Simple Email Service Developer Guide. 
    */
  def sendTemplatedEmail(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendTemplatedEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendTemplatedEmail(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendTemplatedEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendTemplatedEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Composes an email message using an email template and immediately queues it for sending. In order to send email using the SendTemplatedEmail operation, your call to the API must meet the following requirements:   The call must refer to an existing email template. You can create email templates using the CreateTemplate operation.   The message must be sent from a verified email address or domain.   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.    The maximum message size is 10 MB.   Calls to the SendTemplatedEmail operation may only include one Destination parameter. A destination is a set of recipients who will receive the same version of the email. The Destination parameter can include up to 50 recipients, across the To:, CC: and BCC: fields.   The Destination parameter must include at least one recipient email address. The recipient address can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message contains other recipients that are valid.    If your call to the SendTemplatedEmail operation includes all of the required parameters, Amazon SES accepts it and returns a Message ID. However, if Amazon SES can't render the email because the template contains errors, it doesn't send the email. Additionally, because it already accepted the message, Amazon SES doesn't return a message stating that it was unable to send the email. For these reasons, we highly recommend that you set up Amazon SES to send you notifications when Rendering Failure events occur. For more information, see Sending Personalized Email Using the Amazon SES API in the Amazon Simple Email Service Developer Guide. 
    */
  def sendTemplatedEmail(params: awsDashSdkLib.clientsSesMod.SESNs.SendTemplatedEmailRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendTemplatedEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendTemplatedEmail(
    params: awsDashSdkLib.clientsSesMod.SESNs.SendTemplatedEmailRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SendTemplatedEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SendTemplatedEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the specified receipt rule set as the active receipt rule set.  To disable your email-receiving through Amazon SES completely, you can call this API with RuleSetName set to null.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def setActiveReceiptRuleSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetActiveReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setActiveReceiptRuleSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetActiveReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetActiveReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the specified receipt rule set as the active receipt rule set.  To disable your email-receiving through Amazon SES completely, you can call this API with RuleSetName set to null.  For information about managing receipt rule sets, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def setActiveReceiptRuleSet(params: awsDashSdkLib.clientsSesMod.SESNs.SetActiveReceiptRuleSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetActiveReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setActiveReceiptRuleSet(
    params: awsDashSdkLib.clientsSesMod.SESNs.SetActiveReceiptRuleSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetActiveReceiptRuleSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetActiveReceiptRuleSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables or disables Easy DKIM signing of email sent from an identity:   If Easy DKIM signing is enabled for a domain name identity (such as example.com), then Amazon SES will DKIM-sign all email sent by addresses under that domain name (for example, user@example.com).   If Easy DKIM signing is enabled for an email address, then Amazon SES will DKIM-sign all email sent by that email address.   For email addresses (for example, user@example.com), you can only enable Easy DKIM signing if the corresponding domain (in this case, example.com) has been set up for Easy DKIM using the AWS Console or the VerifyDomainDkim operation. You can execute this operation no more than once per second. For more information about Easy DKIM signing, go to the Amazon SES Developer Guide.
    */
  def setIdentityDkimEnabled(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityDkimEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIdentityDkimEnabled(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetIdentityDkimEnabledResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityDkimEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables or disables Easy DKIM signing of email sent from an identity:   If Easy DKIM signing is enabled for a domain name identity (such as example.com), then Amazon SES will DKIM-sign all email sent by addresses under that domain name (for example, user@example.com).   If Easy DKIM signing is enabled for an email address, then Amazon SES will DKIM-sign all email sent by that email address.   For email addresses (for example, user@example.com), you can only enable Easy DKIM signing if the corresponding domain (in this case, example.com) has been set up for Easy DKIM using the AWS Console or the VerifyDomainDkim operation. You can execute this operation no more than once per second. For more information about Easy DKIM signing, go to the Amazon SES Developer Guide.
    */
  def setIdentityDkimEnabled(params: awsDashSdkLib.clientsSesMod.SESNs.SetIdentityDkimEnabledRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityDkimEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIdentityDkimEnabled(
    params: awsDashSdkLib.clientsSesMod.SESNs.SetIdentityDkimEnabledRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetIdentityDkimEnabledResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityDkimEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and complaint notifications as email. Feedback forwarding can only be disabled when Amazon Simple Notification Service (Amazon SNS) topics are specified for both bounces and complaints.  Feedback forwarding does not apply to delivery notifications. Delivery notifications are only available through Amazon SNS.  You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def setIdentityFeedbackForwardingEnabled(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityFeedbackForwardingEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIdentityFeedbackForwardingEnabled(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetIdentityFeedbackForwardingEnabledResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityFeedbackForwardingEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and complaint notifications as email. Feedback forwarding can only be disabled when Amazon Simple Notification Service (Amazon SNS) topics are specified for both bounces and complaints.  Feedback forwarding does not apply to delivery notifications. Delivery notifications are only available through Amazon SNS.  You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def setIdentityFeedbackForwardingEnabled(params: awsDashSdkLib.clientsSesMod.SESNs.SetIdentityFeedbackForwardingEnabledRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityFeedbackForwardingEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIdentityFeedbackForwardingEnabled(
    params: awsDashSdkLib.clientsSesMod.SESNs.SetIdentityFeedbackForwardingEnabledRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetIdentityFeedbackForwardingEnabledResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityFeedbackForwardingEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type. You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def setIdentityHeadersInNotificationsEnabled(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityHeadersInNotificationsEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIdentityHeadersInNotificationsEnabled(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetIdentityHeadersInNotificationsEnabledResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityHeadersInNotificationsEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type. You can execute this operation no more than once per second. For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.
    */
  def setIdentityHeadersInNotificationsEnabled(params: awsDashSdkLib.clientsSesMod.SESNs.SetIdentityHeadersInNotificationsEnabledRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityHeadersInNotificationsEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIdentityHeadersInNotificationsEnabled(
    params: awsDashSdkLib.clientsSesMod.SESNs.SetIdentityHeadersInNotificationsEnabledRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetIdentityHeadersInNotificationsEnabledResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityHeadersInNotificationsEnabledResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables or disables the custom MAIL FROM domain setup for a verified identity (an email address or a domain).  To send emails using the specified MAIL FROM domain, you must add an MX record to your MAIL FROM domain's DNS settings. If you want your emails to pass Sender Policy Framework (SPF) checks, you must also add or update an SPF record. For more information, see the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
    */
  def setIdentityMailFromDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityMailFromDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIdentityMailFromDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetIdentityMailFromDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityMailFromDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables or disables the custom MAIL FROM domain setup for a verified identity (an email address or a domain).  To send emails using the specified MAIL FROM domain, you must add an MX record to your MAIL FROM domain's DNS settings. If you want your emails to pass Sender Policy Framework (SPF) checks, you must also add or update an SPF record. For more information, see the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
    */
  def setIdentityMailFromDomain(params: awsDashSdkLib.clientsSesMod.SESNs.SetIdentityMailFromDomainRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityMailFromDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIdentityMailFromDomain(
    params: awsDashSdkLib.clientsSesMod.SESNs.SetIdentityMailFromDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetIdentityMailFromDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityMailFromDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when delivering notifications. When you use this operation, you specify a verified identity, such as an email address or domain. When you send an email that uses the chosen identity in the Source field, Amazon SES sends notifications to the topic you specified. You can send bounce, complaint, or delivery notifications (or any combination of the three) to the Amazon SNS topic that you specify. You can execute this operation no more than once per second. For more information about feedback notification, see the Amazon SES Developer Guide.
    */
  def setIdentityNotificationTopic(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityNotificationTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIdentityNotificationTopic(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetIdentityNotificationTopicResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityNotificationTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when delivering notifications. When you use this operation, you specify a verified identity, such as an email address or domain. When you send an email that uses the chosen identity in the Source field, Amazon SES sends notifications to the topic you specified. You can send bounce, complaint, or delivery notifications (or any combination of the three) to the Amazon SNS topic that you specify. You can execute this operation no more than once per second. For more information about feedback notification, see the Amazon SES Developer Guide.
    */
  def setIdentityNotificationTopic(params: awsDashSdkLib.clientsSesMod.SESNs.SetIdentityNotificationTopicRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityNotificationTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setIdentityNotificationTopic(
    params: awsDashSdkLib.clientsSesMod.SESNs.SetIdentityNotificationTopicRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetIdentityNotificationTopicResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetIdentityNotificationTopicResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the position of the specified receipt rule in the receipt rule set. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def setReceiptRulePosition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetReceiptRulePositionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setReceiptRulePosition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetReceiptRulePositionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetReceiptRulePositionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the position of the specified receipt rule in the receipt rule set. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def setReceiptRulePosition(params: awsDashSdkLib.clientsSesMod.SESNs.SetReceiptRulePositionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetReceiptRulePositionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setReceiptRulePosition(
    params: awsDashSdkLib.clientsSesMod.SESNs.SetReceiptRulePositionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.SetReceiptRulePositionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.SetReceiptRulePositionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data. You can execute this operation no more than once per second.
    */
  def testRenderTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.TestRenderTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testRenderTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.TestRenderTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.TestRenderTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a preview of the MIME content of an email when provided with a template and a set of replacement data. You can execute this operation no more than once per second.
    */
  def testRenderTemplate(params: awsDashSdkLib.clientsSesMod.SESNs.TestRenderTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.TestRenderTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def testRenderTemplate(
    params: awsDashSdkLib.clientsSesMod.SESNs.TestRenderTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.TestRenderTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.TestRenderTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables or disables email sending across your entire Amazon SES account in the current AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending across your Amazon SES account in a given AWS Region when reputation metrics (such as your bounce or complaint rates) reach certain thresholds. You can execute this operation no more than once per second.
    */
  def updateAccountSendingEnabled(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccountSendingEnabled(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables or disables email sending across your entire Amazon SES account in the current AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending across your Amazon SES account in a given AWS Region when reputation metrics (such as your bounce or complaint rates) reach certain thresholds. You can execute this operation no more than once per second.
    */
  def updateAccountSendingEnabled(params: awsDashSdkLib.clientsSesMod.SESNs.UpdateAccountSendingEnabledRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccountSendingEnabled(
    params: awsDashSdkLib.clientsSesMod.SESNs.UpdateAccountSendingEnabledRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the event destination of a configuration set. Event destinations are associated with configuration sets, which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS). For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.   When you create or update an event destination, you must provide one, and only one, destination. The destination can be Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  You can execute this operation no more than once per second.
    */
  def updateConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConfigurationSetEventDestination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the event destination of a configuration set. Event destinations are associated with configuration sets, which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS). For information about using configuration sets, see Monitoring Your Amazon SES Sending Activity in the Amazon SES Developer Guide.   When you create or update an event destination, you must provide one, and only one, destination. The destination can be Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).  You can execute this operation no more than once per second.
    */
  def updateConfigurationSetEventDestination(params: awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetEventDestinationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetEventDestinationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables or disables the publishing of reputation metrics for emails sent using a specific configuration set in a given AWS Region. Reputation metrics include bounce and complaint rates. These metrics are published to Amazon CloudWatch. By using CloudWatch, you can create alarms when bounce or complaint rates exceed certain thresholds. You can execute this operation no more than once per second.
    */
  def updateConfigurationSetReputationMetricsEnabled(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConfigurationSetReputationMetricsEnabled(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables or disables the publishing of reputation metrics for emails sent using a specific configuration set in a given AWS Region. Reputation metrics include bounce and complaint rates. These metrics are published to Amazon CloudWatch. By using CloudWatch, you can create alarms when bounce or complaint rates exceed certain thresholds. You can execute this operation no more than once per second.
    */
  def updateConfigurationSetReputationMetricsEnabled(params: awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetReputationMetricsEnabledRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConfigurationSetReputationMetricsEnabled(
    params: awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetReputationMetricsEnabledRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables or disables email sending for messages sent using a specific configuration set in a given AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending for a configuration set when the reputation metrics for that configuration set (such as your bounce on complaint rate) exceed certain thresholds. You can execute this operation no more than once per second.
    */
  def updateConfigurationSetSendingEnabled(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConfigurationSetSendingEnabled(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables or disables email sending for messages sent using a specific configuration set in a given AWS Region. You can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending for a configuration set when the reputation metrics for that configuration set (such as your bounce on complaint rate) exceed certain thresholds. You can execute this operation no more than once per second.
    */
  def updateConfigurationSetSendingEnabled(params: awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetSendingEnabledRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConfigurationSetSendingEnabled(
    params: awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetSendingEnabledRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
    */
  def updateConfigurationSetTrackingOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConfigurationSetTrackingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetTrackingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an association between a configuration set and a custom domain for open and click event tracking.  By default, images and links used for tracking open and click events are hosted on domains operated by Amazon SES. You can configure a subdomain of your own to handle these events. For information about using custom domains, see the Amazon SES Developer Guide.
    */
  def updateConfigurationSetTrackingOptions(params: awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetTrackingOptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConfigurationSetTrackingOptions(
    params: awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetTrackingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetTrackingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateCustomVerificationEmailTemplate(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCustomVerificationEmailTemplate(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing custom verification email template. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateCustomVerificationEmailTemplate(params: awsDashSdkLib.clientsSesMod.SESNs.UpdateCustomVerificationEmailTemplateRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCustomVerificationEmailTemplate(
    params: awsDashSdkLib.clientsSesMod.SESNs.UpdateCustomVerificationEmailTemplateRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateReceiptRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateReceiptRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.UpdateReceiptRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a receipt rule. For information about managing receipt rules, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateReceiptRule(params: awsDashSdkLib.clientsSesMod.SESNs.UpdateReceiptRuleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateReceiptRule(
    params: awsDashSdkLib.clientsSesMod.SESNs.UpdateReceiptRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.UpdateReceiptRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateReceiptRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateTemplate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateTemplate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.UpdateTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an email template. Email templates enable you to send personalized email to one or more destinations in a single API operation. For more information, see the Amazon SES Developer Guide. You can execute this operation no more than once per second.
    */
  def updateTemplate(params: awsDashSdkLib.clientsSesMod.SESNs.UpdateTemplateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateTemplate(
    params: awsDashSdkLib.clientsSesMod.SESNs.UpdateTemplateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.UpdateTemplateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.UpdateTemplateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a set of DKIM tokens for a domain. DKIM tokens are character strings that represent your domain's identity. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign email originating from that domain. You can execute this operation no more than once per second. To enable or disable Easy DKIM signing for a domain, use the SetIdentityDkimEnabled operation. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
    */
  def verifyDomainDkim(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainDkimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifyDomainDkim(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainDkimResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainDkimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a set of DKIM tokens for a domain. DKIM tokens are character strings that represent your domain's identity. Using these tokens, you will need to create DNS CNAME records that point to DKIM public keys hosted by Amazon SES. Amazon Web Services will eventually detect that you have updated your DNS records; this detection process may take up to 72 hours. Upon successful detection, Amazon SES will be able to DKIM-sign email originating from that domain. You can execute this operation no more than once per second. To enable or disable Easy DKIM signing for a domain, use the SetIdentityDkimEnabled operation. For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer Guide.
    */
  def verifyDomainDkim(params: awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainDkimRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainDkimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifyDomainDkim(
    params: awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainDkimRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainDkimResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainDkimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a domain to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. For more information about verifying domains, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
    */
  def verifyDomainIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifyDomainIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a domain to the list of identities for your Amazon SES account in the current AWS Region and attempts to verify it. For more information about verifying domains, see Verifying Email Addresses and Domains in the Amazon SES Developer Guide.  You can execute this operation no more than once per second.
    */
  def verifyDomainIdentity(params: awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainIdentityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifyDomainIdentity(
    params: awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyDomainIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deprecated. Use the VerifyEmailIdentity operation to verify a new email address.
    */
  def verifyEmailAddress(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def verifyEmailAddress(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deprecated. Use the VerifyEmailIdentity operation to verify a new email address.
    */
  def verifyEmailAddress(params: awsDashSdkLib.clientsSesMod.SESNs.VerifyEmailAddressRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def verifyEmailAddress(
    params: awsDashSdkLib.clientsSesMod.SESNs.VerifyEmailAddressRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds an email address to the list of identities for your Amazon SES account in the current AWS region and attempts to verify it. As a result of executing this operation, a verification email is sent to the specified address. You can execute this operation no more than once per second.
    */
  def verifyEmailIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifyEmailIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.VerifyEmailIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds an email address to the list of identities for your Amazon SES account in the current AWS region and attempts to verify it. As a result of executing this operation, a verification email is sent to the specified address. You can execute this operation no more than once per second.
    */
  def verifyEmailIdentity(params: awsDashSdkLib.clientsSesMod.SESNs.VerifyEmailIdentityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifyEmailIdentity(
    params: awsDashSdkLib.clientsSesMod.SESNs.VerifyEmailIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.VerifyEmailIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.VerifyEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the identityExists state by periodically calling the underlying SES.getIdentityVerificationAttributesoperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_identityExists(state: awsDashSdkLib.awsDashSdkLibStrings.identityExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_identityExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.identityExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the identityExists state by periodically calling the underlying SES.getIdentityVerificationAttributesoperation every 3 seconds (at most 20 times).
    */
  @JSName("waitFor")
  def waitFor_identityExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.identityExists,
    params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_identityExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.identityExists,
    params: awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSesMod.SESNs.GetIdentityVerificationAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

