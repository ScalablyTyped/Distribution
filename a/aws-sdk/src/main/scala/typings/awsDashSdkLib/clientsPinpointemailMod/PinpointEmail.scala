package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinpointEmail
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_PinpointEmail: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ClientConfiguration = js.native
  /**
     * Create a configuration set. Configuration sets are groups of rules that you can apply to the emails you send using Amazon Pinpoint. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email. 
     */
  def createConfigurationSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a configuration set. Configuration sets are groups of rules that you can apply to the emails you send using Amazon Pinpoint. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email. 
     */
  def createConfigurationSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a configuration set. Configuration sets are groups of rules that you can apply to the emails you send using Amazon Pinpoint. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email. 
     */
  def createConfigurationSet(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a configuration set. Configuration sets are groups of rules that you can apply to the emails you send using Amazon Pinpoint. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email. 
     */
  def createConfigurationSet(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage. A single configuration set can include more than one event destination.
     */
  def createConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage. A single configuration set can include more than one event destination.
     */
  def createConfigurationSetEventDestination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage. A single configuration set can include more than one event destination.
     */
  def createConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetEventDestinationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage. A single configuration set can include more than one event destination.
     */
  def createConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetEventDestinationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are associated with your Amazon Pinpoint account. You can associate a pool with a configuration set. When you send an email that uses that configuration set, Amazon Pinpoint sends it using only the IP addresses in the associated pool.
     */
  def createDedicatedIpPool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDedicatedIpPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are associated with your Amazon Pinpoint account. You can associate a pool with a configuration set. When you send an email that uses that configuration set, Amazon Pinpoint sends it using only the IP addresses in the associated pool.
     */
  def createDedicatedIpPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDedicatedIpPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDedicatedIpPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are associated with your Amazon Pinpoint account. You can associate a pool with a configuration set. When you send an email that uses that configuration set, Amazon Pinpoint sends it using only the IP addresses in the associated pool.
     */
  def createDedicatedIpPool(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDedicatedIpPoolRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDedicatedIpPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are associated with your Amazon Pinpoint account. You can associate a pool with a configuration set. When you send an email that uses that configuration set, Amazon Pinpoint sends it using only the IP addresses in the associated pool.
     */
  def createDedicatedIpPool(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDedicatedIpPoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDedicatedIpPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDedicatedIpPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport operation to view the results of the test.
     */
  def createDeliverabilityTestReport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDeliverabilityTestReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport operation to view the results of the test.
     */
  def createDeliverabilityTestReport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDeliverabilityTestReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDeliverabilityTestReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport operation to view the results of the test.
     */
  def createDeliverabilityTestReport(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDeliverabilityTestReportRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDeliverabilityTestReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport operation to view the results of the test.
     */
  def createDeliverabilityTestReport(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDeliverabilityTestReportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDeliverabilityTestReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateDeliverabilityTestReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Verifies an email identity for use with Amazon Pinpoint. In Amazon Pinpoint, an identity is an email address or domain that you use when you send email. Before you can use an identity to send email with Amazon Pinpoint, you first have to verify it. By verifying an address, you demonstrate that you're the owner of the address, and that you've given Amazon Pinpoint permission to send email from the address. When you verify an email address, Amazon Pinpoint sends an email to the address. Your email address is verified as soon as you follow the link in the verification email.  When you verify a domain, this operation provides a set of DKIM tokens, which you can convert into CNAME tokens. You add these CNAME tokens to the DNS configuration for your domain. Your domain is verified when Amazon Pinpoint detects these records in the DNS configuration for your domain. It usually takes around 72 hours to complete the domain verification process.
     */
  def createEmailIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Verifies an email identity for use with Amazon Pinpoint. In Amazon Pinpoint, an identity is an email address or domain that you use when you send email. Before you can use an identity to send email with Amazon Pinpoint, you first have to verify it. By verifying an address, you demonstrate that you're the owner of the address, and that you've given Amazon Pinpoint permission to send email from the address. When you verify an email address, Amazon Pinpoint sends an email to the address. Your email address is verified as soon as you follow the link in the verification email.  When you verify a domain, this operation provides a set of DKIM tokens, which you can convert into CNAME tokens. You add these CNAME tokens to the DNS configuration for your domain. Your domain is verified when Amazon Pinpoint detects these records in the DNS configuration for your domain. It usually takes around 72 hours to complete the domain verification process.
     */
  def createEmailIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateEmailIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Verifies an email identity for use with Amazon Pinpoint. In Amazon Pinpoint, an identity is an email address or domain that you use when you send email. Before you can use an identity to send email with Amazon Pinpoint, you first have to verify it. By verifying an address, you demonstrate that you're the owner of the address, and that you've given Amazon Pinpoint permission to send email from the address. When you verify an email address, Amazon Pinpoint sends an email to the address. Your email address is verified as soon as you follow the link in the verification email.  When you verify a domain, this operation provides a set of DKIM tokens, which you can convert into CNAME tokens. You add these CNAME tokens to the DNS configuration for your domain. Your domain is verified when Amazon Pinpoint detects these records in the DNS configuration for your domain. It usually takes around 72 hours to complete the domain verification process.
     */
  def createEmailIdentity(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateEmailIdentityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Verifies an email identity for use with Amazon Pinpoint. In Amazon Pinpoint, an identity is an email address or domain that you use when you send email. Before you can use an identity to send email with Amazon Pinpoint, you first have to verify it. By verifying an address, you demonstrate that you're the owner of the address, and that you've given Amazon Pinpoint permission to send email from the address. When you verify an email address, Amazon Pinpoint sends an email to the address. Your email address is verified as soon as you follow the link in the verification email.  When you verify a domain, this operation provides a set of DKIM tokens, which you can convert into CNAME tokens. You add these CNAME tokens to the DNS configuration for your domain. Your domain is verified when Amazon Pinpoint detects these records in the DNS configuration for your domain. It usually takes around 72 hours to complete the domain verification process.
     */
  def createEmailIdentity(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateEmailIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateEmailIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.CreateEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an existing configuration set. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def deleteConfigurationSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an existing configuration set. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def deleteConfigurationSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an existing configuration set. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def deleteConfigurationSet(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an existing configuration set. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def deleteConfigurationSet(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def deleteConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def deleteConfigurationSetEventDestination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def deleteConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetEventDestinationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def deleteConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetEventDestinationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete a dedicated IP pool.
     */
  def deleteDedicatedIpPool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteDedicatedIpPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete a dedicated IP pool.
     */
  def deleteDedicatedIpPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteDedicatedIpPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteDedicatedIpPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete a dedicated IP pool.
     */
  def deleteDedicatedIpPool(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteDedicatedIpPoolRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteDedicatedIpPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Delete a dedicated IP pool.
     */
  def deleteDedicatedIpPool(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteDedicatedIpPoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteDedicatedIpPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteDedicatedIpPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an email identity that you previously verified for use with Amazon Pinpoint. An identity can be either an email address or a domain name.
     */
  def deleteEmailIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an email identity that you previously verified for use with Amazon Pinpoint. An identity can be either an email address or a domain name.
     */
  def deleteEmailIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteEmailIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an email identity that you previously verified for use with Amazon Pinpoint. An identity can be either an email address or a domain name.
     */
  def deleteEmailIdentity(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteEmailIdentityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an email identity that you previously verified for use with Amazon Pinpoint. An identity can be either an email address or a domain name.
     */
  def deleteEmailIdentity(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteEmailIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteEmailIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.DeleteEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current AWS Region.
     */
  def getAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current AWS Region.
     */
  def getAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current AWS Region.
     */
  def getAccount(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current AWS Region.
     */
  def getAccount(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
     */
  def getBlacklistReports(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetBlacklistReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
     */
  def getBlacklistReports(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetBlacklistReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetBlacklistReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
     */
  def getBlacklistReports(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetBlacklistReportsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetBlacklistReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve a list of the blacklists that your dedicated IP addresses appear on.
     */
  def getBlacklistReports(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetBlacklistReportsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetBlacklistReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetBlacklistReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get information about an existing configuration set, including the dedicated IP pool that it's associated with, whether or not it's enabled for sending email, and more. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def getConfigurationSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get information about an existing configuration set, including the dedicated IP pool that it's associated with, whether or not it's enabled for sending email, and more. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def getConfigurationSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get information about an existing configuration set, including the dedicated IP pool that it's associated with, whether or not it's enabled for sending email, and more. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def getConfigurationSet(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get information about an existing configuration set, including the dedicated IP pool that it's associated with, whether or not it's enabled for sending email, and more. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def getConfigurationSet(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve a list of event destinations that are associated with a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def getConfigurationSetEventDestinations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetEventDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve a list of event destinations that are associated with a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def getConfigurationSetEventDestinations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetEventDestinationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetEventDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve a list of event destinations that are associated with a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def getConfigurationSetEventDestinations(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetEventDestinationsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetEventDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve a list of event destinations that are associated with a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def getConfigurationSetEventDestinations(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetEventDestinationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetEventDestinationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetConfigurationSetEventDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated with, as well information about the automatic warm-up process for the address.
     */
  def getDedicatedIp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated with, as well information about the automatic warm-up process for the address.
     */
  def getDedicatedIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated with, as well information about the automatic warm-up process for the address.
     */
  def getDedicatedIp(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated with, as well information about the automatic warm-up process for the address.
     */
  def getDedicatedIp(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the dedicated IP addresses that are associated with your Amazon Pinpoint account.
     */
  def getDedicatedIps(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the dedicated IP addresses that are associated with your Amazon Pinpoint account.
     */
  def getDedicatedIps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the dedicated IP addresses that are associated with your Amazon Pinpoint account.
     */
  def getDedicatedIps(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List the dedicated IP addresses that are associated with your Amazon Pinpoint account.
     */
  def getDedicatedIps(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDedicatedIpsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Show the status of the Deliverability dashboard. When the Deliverability dashboard is enabled, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the current calendar month.
     */
  def getDeliverabilityDashboardOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityDashboardOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Show the status of the Deliverability dashboard. When the Deliverability dashboard is enabled, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the current calendar month.
     */
  def getDeliverabilityDashboardOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityDashboardOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityDashboardOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Show the status of the Deliverability dashboard. When the Deliverability dashboard is enabled, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the current calendar month.
     */
  def getDeliverabilityDashboardOptions(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityDashboardOptionsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityDashboardOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Show the status of the Deliverability dashboard. When the Deliverability dashboard is enabled, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, AWS prorates the monthly charge based on how many days have elapsed in the current calendar month.
     */
  def getDeliverabilityDashboardOptions(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityDashboardOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityDashboardOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityDashboardOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve the results of a predictive inbox placement test.
     */
  def getDeliverabilityTestReport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityTestReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve the results of a predictive inbox placement test.
     */
  def getDeliverabilityTestReport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityTestReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityTestReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve the results of a predictive inbox placement test.
     */
  def getDeliverabilityTestReport(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityTestReportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityTestReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve the results of a predictive inbox placement test.
     */
  def getDeliverabilityTestReport(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityTestReportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityTestReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDeliverabilityTestReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve inbox placement and engagement rates for the domains that you use to send email.
     */
  def getDomainStatisticsReport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDomainStatisticsReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve inbox placement and engagement rates for the domains that you use to send email.
     */
  def getDomainStatisticsReport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDomainStatisticsReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDomainStatisticsReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve inbox placement and engagement rates for the domains that you use to send email.
     */
  def getDomainStatisticsReport(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDomainStatisticsReportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDomainStatisticsReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieve inbox placement and engagement rates for the domains that you use to send email.
     */
  def getDomainStatisticsReport(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDomainStatisticsReportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDomainStatisticsReportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetDomainStatisticsReportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides information about a specific identity associated with your Amazon Pinpoint account, including the identity's verification status, its DKIM authentication status, and its custom Mail-From settings.
     */
  def getEmailIdentity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides information about a specific identity associated with your Amazon Pinpoint account, including the identity's verification status, its DKIM authentication status, and its custom Mail-From settings.
     */
  def getEmailIdentity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetEmailIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides information about a specific identity associated with your Amazon Pinpoint account, including the identity's verification status, its DKIM authentication status, and its custom Mail-From settings.
     */
  def getEmailIdentity(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetEmailIdentityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides information about a specific identity associated with your Amazon Pinpoint account, including the identity's verification status, its DKIM authentication status, and its custom Mail-From settings.
     */
  def getEmailIdentity(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetEmailIdentityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetEmailIdentityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.GetEmailIdentityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all of the configuration sets associated with your Amazon Pinpoint account in the current region. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def listConfigurationSets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListConfigurationSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all of the configuration sets associated with your Amazon Pinpoint account in the current region. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def listConfigurationSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListConfigurationSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListConfigurationSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all of the configuration sets associated with your Amazon Pinpoint account in the current region. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def listConfigurationSets(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListConfigurationSetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListConfigurationSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all of the configuration sets associated with your Amazon Pinpoint account in the current region. In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You apply a configuration set to an email by including a reference to the configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to the email.
     */
  def listConfigurationSets(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListConfigurationSetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListConfigurationSetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListConfigurationSetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.
     */
  def listDedicatedIpPools(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDedicatedIpPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.
     */
  def listDedicatedIpPools(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDedicatedIpPoolsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDedicatedIpPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.
     */
  def listDedicatedIpPools(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDedicatedIpPoolsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDedicatedIpPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.
     */
  def listDedicatedIpPools(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDedicatedIpPoolsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDedicatedIpPoolsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDedicatedIpPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For predictive inbox placement tests that are complete, you can use the GetDeliverabilityTestReport operation to view the results.
     */
  def listDeliverabilityTestReports(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDeliverabilityTestReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For predictive inbox placement tests that are complete, you can use the GetDeliverabilityTestReport operation to view the results.
     */
  def listDeliverabilityTestReports(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDeliverabilityTestReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDeliverabilityTestReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For predictive inbox placement tests that are complete, you can use the GetDeliverabilityTestReport operation to view the results.
     */
  def listDeliverabilityTestReports(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDeliverabilityTestReportsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDeliverabilityTestReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For predictive inbox placement tests that are complete, you can use the GetDeliverabilityTestReport operation to view the results.
     */
  def listDeliverabilityTestReports(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDeliverabilityTestReportsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDeliverabilityTestReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListDeliverabilityTestReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all of the email identities that are associated with your Amazon Pinpoint account. An identity can be either an email address or a domain. This operation returns identities that are verified as well as those that aren't.
     */
  def listEmailIdentities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListEmailIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all of the email identities that are associated with your Amazon Pinpoint account. An identity can be either an email address or a domain. This operation returns identities that are verified as well as those that aren't.
     */
  def listEmailIdentities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListEmailIdentitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListEmailIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all of the email identities that are associated with your Amazon Pinpoint account. An identity can be either an email address or a domain. This operation returns identities that are verified as well as those that aren't.
     */
  def listEmailIdentities(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListEmailIdentitiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListEmailIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all of the email identities that are associated with your Amazon Pinpoint account. An identity can be either an email address or a domain. This operation returns identities that are verified as well as those that aren't.
     */
  def listEmailIdentities(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListEmailIdentitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListEmailIdentitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.ListEmailIdentitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the automatic warm-up feature for dedicated IP addresses.
     */
  def putAccountDedicatedIpWarmupAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountDedicatedIpWarmupAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the automatic warm-up feature for dedicated IP addresses.
     */
  def putAccountDedicatedIpWarmupAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountDedicatedIpWarmupAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountDedicatedIpWarmupAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the automatic warm-up feature for dedicated IP addresses.
     */
  def putAccountDedicatedIpWarmupAttributes(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountDedicatedIpWarmupAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountDedicatedIpWarmupAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the automatic warm-up feature for dedicated IP addresses.
     */
  def putAccountDedicatedIpWarmupAttributes(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountDedicatedIpWarmupAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountDedicatedIpWarmupAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountDedicatedIpWarmupAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the ability of your account to send email.
     */
  def putAccountSendingAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountSendingAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the ability of your account to send email.
     */
  def putAccountSendingAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountSendingAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountSendingAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the ability of your account to send email.
     */
  def putAccountSendingAttributes(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountSendingAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountSendingAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the ability of your account to send email.
     */
  def putAccountSendingAttributes(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountSendingAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountSendingAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutAccountSendingAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of dedicated IP addresses for sending specific types of email.
     */
  def putConfigurationSetDeliveryOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetDeliveryOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of dedicated IP addresses for sending specific types of email.
     */
  def putConfigurationSetDeliveryOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetDeliveryOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetDeliveryOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of dedicated IP addresses for sending specific types of email.
     */
  def putConfigurationSetDeliveryOptions(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetDeliveryOptionsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetDeliveryOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of dedicated IP addresses for sending specific types of email.
     */
  def putConfigurationSetDeliveryOptions(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetDeliveryOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetDeliveryOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetDeliveryOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set in a specific AWS Region.
     */
  def putConfigurationSetReputationOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetReputationOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set in a specific AWS Region.
     */
  def putConfigurationSetReputationOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetReputationOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetReputationOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set in a specific AWS Region.
     */
  def putConfigurationSetReputationOptions(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetReputationOptionsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetReputationOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable collection of reputation metrics for emails that you send using a particular configuration set in a specific AWS Region.
     */
  def putConfigurationSetReputationOptions(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetReputationOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetReputationOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetReputationOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
     */
  def putConfigurationSetSendingOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetSendingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
     */
  def putConfigurationSetSendingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetSendingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetSendingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
     */
  def putConfigurationSetSendingOptions(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetSendingOptionsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetSendingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.
     */
  def putConfigurationSetSendingOptions(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetSendingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetSendingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetSendingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.
     */
  def putConfigurationSetTrackingOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.
     */
  def putConfigurationSetTrackingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetTrackingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.
     */
  def putConfigurationSetTrackingOptions(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetTrackingOptionsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.
     */
  def putConfigurationSetTrackingOptions(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetTrackingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetTrackingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutConfigurationSetTrackingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Move a dedicated IP address to an existing dedicated IP pool.  The dedicated IP address that you specify must already exist, and must be associated with your Amazon Pinpoint account.  The dedicated IP pool you specify must already exist. You can create a new pool by using the CreateDedicatedIpPool operation. 
     */
  def putDedicatedIpInPool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpInPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Move a dedicated IP address to an existing dedicated IP pool.  The dedicated IP address that you specify must already exist, and must be associated with your Amazon Pinpoint account.  The dedicated IP pool you specify must already exist. You can create a new pool by using the CreateDedicatedIpPool operation. 
     */
  def putDedicatedIpInPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpInPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpInPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Move a dedicated IP address to an existing dedicated IP pool.  The dedicated IP address that you specify must already exist, and must be associated with your Amazon Pinpoint account.  The dedicated IP pool you specify must already exist. You can create a new pool by using the CreateDedicatedIpPool operation. 
     */
  def putDedicatedIpInPool(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpInPoolRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpInPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Move a dedicated IP address to an existing dedicated IP pool.  The dedicated IP address that you specify must already exist, and must be associated with your Amazon Pinpoint account.  The dedicated IP pool you specify must already exist. You can create a new pool by using the CreateDedicatedIpPool operation. 
     */
  def putDedicatedIpInPool(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpInPoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpInPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpInPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * 
     */
  def putDedicatedIpWarmupAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpWarmupAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * 
     */
  def putDedicatedIpWarmupAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpWarmupAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpWarmupAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * 
     */
  def putDedicatedIpWarmupAttributes(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpWarmupAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpWarmupAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * 
     */
  def putDedicatedIpWarmupAttributes(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpWarmupAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpWarmupAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDedicatedIpWarmupAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, we prorate the monthly charge based on how many days have elapsed in the current calendar month.
     */
  def putDeliverabilityDashboardOption(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDeliverabilityDashboardOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, we prorate the monthly charge based on how many days have elapsed in the current calendar month.
     */
  def putDeliverabilityDashboardOption(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDeliverabilityDashboardOptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDeliverabilityDashboardOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, we prorate the monthly charge based on how many days have elapsed in the current calendar month.
     */
  def putDeliverabilityDashboardOption(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDeliverabilityDashboardOptionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDeliverabilityDashboardOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enable or disable the Deliverability dashboard. When you enable the Deliverability dashboard, you gain access to reputation metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly charge of USD$1,250.00, in addition to any other fees that you accrue by using Amazon Pinpoint. If you enable the Deliverability dashboard after the first day of a calendar month, we prorate the monthly charge based on how many days have elapsed in the current calendar month.
     */
  def putDeliverabilityDashboardOption(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDeliverabilityDashboardOptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDeliverabilityDashboardOptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutDeliverabilityDashboardOptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable DKIM authentication for an email identity.
     */
  def putEmailIdentityDkimAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityDkimAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable DKIM authentication for an email identity.
     */
  def putEmailIdentityDkimAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityDkimAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityDkimAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable DKIM authentication for an email identity.
     */
  def putEmailIdentityDkimAttributes(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityDkimAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityDkimAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable DKIM authentication for an email identity.
     */
  def putEmailIdentityDkimAttributes(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityDkimAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityDkimAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityDkimAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an identity is used to send an email that results in a bounce or complaint event. When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the original email. When you disable feedback forwarding, Amazon Pinpoint sends notifications through other mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     */
  def putEmailIdentityFeedbackAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityFeedbackAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an identity is used to send an email that results in a bounce or complaint event. When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the original email. When you disable feedback forwarding, Amazon Pinpoint sends notifications through other mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     */
  def putEmailIdentityFeedbackAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityFeedbackAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityFeedbackAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an identity is used to send an email that results in a bounce or complaint event. When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the original email. When you disable feedback forwarding, Amazon Pinpoint sends notifications through other mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     */
  def putEmailIdentityFeedbackAttributes(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityFeedbackAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityFeedbackAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an identity is used to send an email that results in a bounce or complaint event. When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce or complaint events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the original email. When you disable feedback forwarding, Amazon Pinpoint sends notifications through other mechanisms, such as by notifying an Amazon SNS topic. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     */
  def putEmailIdentityFeedbackAttributes(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityFeedbackAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityFeedbackAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityFeedbackAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     */
  def putEmailIdentityMailFromAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityMailFromAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     */
  def putEmailIdentityMailFromAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityMailFromAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityMailFromAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     */
  def putEmailIdentityMailFromAttributes(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityMailFromAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityMailFromAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used to enable or disable the custom Mail-From domain configuration for an email identity.
     */
  def putEmailIdentityMailFromAttributes(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityMailFromAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityMailFromAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.PutEmailIdentityMailFromAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends an email message. You can use the Amazon Pinpoint Email API to send two types of messages:    Simple – A standard email message. When you create this type of message, you specify the sender, the recipient, and the message body, and Amazon Pinpoint assembles the message for you.    Raw – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of the message headers, as well as the message body. You can use this message type to send messages that contain attachments. The message that you specify has to be a valid MIME message.  
     */
  def sendEmail(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.SendEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends an email message. You can use the Amazon Pinpoint Email API to send two types of messages:    Simple – A standard email message. When you create this type of message, you specify the sender, the recipient, and the message body, and Amazon Pinpoint assembles the message for you.    Raw – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of the message headers, as well as the message body. You can use this message type to send messages that contain attachments. The message that you specify has to be a valid MIME message.  
     */
  def sendEmail(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.SendEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.SendEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends an email message. You can use the Amazon Pinpoint Email API to send two types of messages:    Simple – A standard email message. When you create this type of message, you specify the sender, the recipient, and the message body, and Amazon Pinpoint assembles the message for you.    Raw – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of the message headers, as well as the message body. You can use this message type to send messages that contain attachments. The message that you specify has to be a valid MIME message.  
     */
  def sendEmail(params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.SendEmailRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.SendEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends an email message. You can use the Amazon Pinpoint Email API to send two types of messages:    Simple – A standard email message. When you create this type of message, you specify the sender, the recipient, and the message body, and Amazon Pinpoint assembles the message for you.    Raw – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of the message headers, as well as the message body. You can use this message type to send messages that contain attachments. The message that you specify has to be a valid MIME message.  
     */
  def sendEmail(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.SendEmailRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.SendEmailResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.SendEmailResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update the configuration of an event destination for a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def updateConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update the configuration of an event destination for a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def updateConfigurationSetEventDestination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.UpdateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update the configuration of an event destination for a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def updateConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.UpdateConfigurationSetEventDestinationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Update the configuration of an event destination for a configuration set. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints. Event destinations are places that you can send information about these events to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.
     */
  def updateConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.UpdateConfigurationSetEventDestinationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.UpdateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointemailMod.PinpointEmailNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

