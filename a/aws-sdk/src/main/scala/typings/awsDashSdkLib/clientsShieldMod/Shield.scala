package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shield
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Shield: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsShieldMod.ShieldNs.ClientConfiguration = js.native
  /**
    * Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your flow logs. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTLogBucket(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTLogBucketResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateDRTLogBucket(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTLogBucketResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTLogBucketResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your flow logs. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTLogBucket(params: awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTLogBucketRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTLogBucketResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateDRTLogBucket(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTLogBucketRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTLogBucketResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTLogBucketResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Authorizes the DDoS Response team (DRT), using the specified role, to access your AWS account to assist with DDoS attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create or update AWS WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role you will specify in the request. For more information see Attaching and Detaching IAM Policies. The role must also trust the service principal  drt.shield.amazonaws.com. For more information, see IAM JSON Policy Elements: Principal. The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your behalf. The DRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a User Permissions to Pass a Role to an AWS Service.  To use the services of the DRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTRole(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateDRTRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Authorizes the DDoS Response team (DRT), using the specified role, to access your AWS account to assist with DDoS attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create or update AWS WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role you will specify in the request. For more information see Attaching and Detaching IAM Policies. The role must also trust the service principal  drt.shield.amazonaws.com. For more information, see IAM JSON Policy Elements: Principal. The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your behalf. The DRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a User Permissions to Pass a Role to an AWS Service.  To use the services of the DRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTRole(params: awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTRoleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateDRTRole(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.AssociateDRTRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone. You can add protection to only a single resource with each CreateProtection request. If you want to add protection to multiple resources at once, use the AWS WAF console. For more information see Getting Started with AWS Shield Advanced and Add AWS Shield Advanced Protection to more AWS Resources.
    */
  def createProtection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.CreateProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createProtection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.CreateProtectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.CreateProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone. You can add protection to only a single resource with each CreateProtection request. If you want to add protection to multiple resources at once, use the AWS WAF console. For more information see Getting Started with AWS Shield Advanced and Add AWS Shield Advanced Protection to more AWS Resources.
    */
  def createProtection(params: awsDashSdkLib.clientsShieldMod.ShieldNs.CreateProtectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.CreateProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createProtection(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.CreateProtectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.CreateProtectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.CreateProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Activates AWS Shield Advanced for an account. As part of this request you can specify EmergencySettings that automaticaly grant the DDoS response team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see Authorize the DDoS Response Team to Create Rules and Web ACLs on Your Behalf. When you initally create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
    */
  def createSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.CreateSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.CreateSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.CreateSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Activates AWS Shield Advanced for an account. As part of this request you can specify EmergencySettings that automaticaly grant the DDoS response team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see Authorize the DDoS Response Team to Create Rules and Web ACLs on Your Behalf. When you initally create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
    */
  def createSubscription(params: awsDashSdkLib.clientsShieldMod.ShieldNs.CreateSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.CreateSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSubscription(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.CreateSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.CreateSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.CreateSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an AWS Shield Advanced Protection.
    */
  def deleteProtection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteProtection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteProtectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an AWS Shield Advanced Protection.
    */
  def deleteProtection(params: awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteProtectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteProtection(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteProtectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteProtectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
    */
  def deleteSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
    */
  def deleteSubscription(params: awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSubscription(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DeleteSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the details of a DDoS attack. 
    */
  def describeAttack(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeAttackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAttack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeAttackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeAttackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the details of a DDoS attack. 
    */
  def describeAttack(params: awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeAttackRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeAttackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAttack(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeAttackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeAttackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeAttackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your AWS account while assisting with attack mitigation.
    */
  def describeDRTAccess(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeDRTAccessResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDRTAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeDRTAccessResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeDRTAccessResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your AWS account while assisting with attack mitigation.
    */
  def describeDRTAccess(params: awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeDRTAccessRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeDRTAccessResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDRTAccess(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeDRTAccessRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeDRTAccessResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeDRTAccessResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the email addresses that the DRT can use to contact you during a suspected attack.
    */
  def describeEmergencyContactSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeEmergencyContactSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEmergencyContactSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeEmergencyContactSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeEmergencyContactSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the email addresses that the DRT can use to contact you during a suspected attack.
    */
  def describeEmergencyContactSettings(params: awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeEmergencyContactSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeEmergencyContactSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEmergencyContactSettings(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeEmergencyContactSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeEmergencyContactSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeEmergencyContactSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the details of a Protection object.
    */
  def describeProtection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeProtection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeProtectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the details of a Protection object.
    */
  def describeProtection(params: awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeProtectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeProtection(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeProtectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeProtectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeProtectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides details about the AWS Shield Advanced subscription for an account.
    */
  def describeSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides details about the AWS Shield Advanced subscription for an account.
    */
  def describeSubscription(params: awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeSubscription(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DescribeSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your flow logs. To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTLogBucket request to remove this access.
    */
  def disassociateDRTLogBucket(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTLogBucketResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateDRTLogBucket(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTLogBucketResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTLogBucketResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your flow logs. To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTLogBucket request to remove this access.
    */
  def disassociateDRTLogBucket(params: awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTLogBucketRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTLogBucketResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateDRTLogBucket(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTLogBucketRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTLogBucketResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTLogBucketResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the DDoS Response team's (DRT) access to your AWS account. To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTRole request to remove this access.
    */
  def disassociateDRTRole(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateDRTRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the DDoS Response team's (DRT) access to your AWS account. To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTRole request to remove this access.
    */
  def disassociateDRTRole(params: awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTRoleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociateDRTRole(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.DisassociateDRTRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the SubscriptionState, either Active or Inactive.
    */
  def getSubscriptionState(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.GetSubscriptionStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSubscriptionState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.GetSubscriptionStateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.GetSubscriptionStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the SubscriptionState, either Active or Inactive.
    */
  def getSubscriptionState(params: awsDashSdkLib.clientsShieldMod.ShieldNs.GetSubscriptionStateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.GetSubscriptionStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSubscriptionState(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.GetSubscriptionStateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.GetSubscriptionStateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.GetSubscriptionStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
    */
  def listAttacks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.ListAttacksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAttacks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.ListAttacksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.ListAttacksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
    */
  def listAttacks(params: awsDashSdkLib.clientsShieldMod.ShieldNs.ListAttacksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.ListAttacksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAttacks(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.ListAttacksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.ListAttacksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.ListAttacksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all Protection objects for the account.
    */
  def listProtections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.ListProtectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProtections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.ListProtectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.ListProtectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all Protection objects for the account.
    */
  def listProtections(params: awsDashSdkLib.clientsShieldMod.ShieldNs.ListProtectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.ListProtectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listProtections(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.ListProtectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.ListProtectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.ListProtectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.
    */
  def updateEmergencyContactSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateEmergencyContactSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEmergencyContactSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateEmergencyContactSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateEmergencyContactSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.
    */
  def updateEmergencyContactSettings(params: awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateEmergencyContactSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateEmergencyContactSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEmergencyContactSettings(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateEmergencyContactSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateEmergencyContactSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateEmergencyContactSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.
    */
  def updateSubscription(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSubscription(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.
    */
  def updateSubscription(params: awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateSubscriptionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateSubscription(
    params: awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateSubscriptionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateSubscriptionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsShieldMod.ShieldNs.UpdateSubscriptionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

