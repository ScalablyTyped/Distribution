package typings.awsDashSdk.clientsShieldMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shield extends Service {
  @JSName("config")
  var config_Shield: ConfigBase with ClientConfiguration = js.native
  /**
    * Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your AWS WAF logs. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTLogBucket(): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  def associateDRTLogBucket(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTLogBucketResponse, scala.Unit]): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  /**
    * Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your AWS WAF logs. You can associate up to 10 Amazon S3 buckets with your subscription. To use the services of the DRT and make an AssociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTLogBucket(params: AssociateDRTLogBucketRequest): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  def associateDRTLogBucket(
    params: AssociateDRTLogBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTLogBucketResponse, scala.Unit]
  ): Request[AssociateDRTLogBucketResponse, AWSError] = js.native
  /**
    * Authorizes the DDoS Response team (DRT), using the specified role, to access your AWS account to assist with DDoS attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create or update AWS WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role you will specify in the request. For more information see Attaching and Detaching IAM Policies. The role must also trust the service principal  drt.shield.amazonaws.com. For more information, see IAM JSON Policy Elements: Principal. The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your behalf. The DRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a User Permissions to Pass a Role to an AWS Service.  To use the services of the DRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTRole(): Request[AssociateDRTRoleResponse, AWSError] = js.native
  def associateDRTRole(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTRoleResponse, scala.Unit]): Request[AssociateDRTRoleResponse, AWSError] = js.native
  /**
    * Authorizes the DDoS Response team (DRT), using the specified role, to access your AWS account to assist with DDoS attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create or update AWS WAF rules and web ACLs. You can associate only one RoleArn with your subscription. If you submit an AssociateDRTRole request for an account that already has an associated role, the new RoleArn will replace the existing RoleArn.  Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to the role you will specify in the request. For more information see Attaching and Detaching IAM Policies. The role must also trust the service principal  drt.shield.amazonaws.com. For more information, see IAM JSON Policy Elements: Principal. The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your behalf. The DRT takes these actions only if explicitly authorized by you. You must have the iam:PassRole permission to make an AssociateDRTRole request. For more information, see Granting a User Permissions to Pass a Role to an AWS Service.  To use the services of the DRT and make an AssociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan.
    */
  def associateDRTRole(params: AssociateDRTRoleRequest): Request[AssociateDRTRoleResponse, AWSError] = js.native
  def associateDRTRole(
    params: AssociateDRTRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDRTRoleResponse, scala.Unit]
  ): Request[AssociateDRTRoleResponse, AWSError] = js.native
  /**
    * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone. You can add protection to only a single resource with each CreateProtection request. If you want to add protection to multiple resources at once, use the AWS WAF console. For more information see Getting Started with AWS Shield Advanced and Add AWS Shield Advanced Protection to more AWS Resources.
    */
  def createProtection(): Request[CreateProtectionResponse, AWSError] = js.native
  def createProtection(callback: js.Function2[/* err */ AWSError, /* data */ CreateProtectionResponse, scala.Unit]): Request[CreateProtectionResponse, AWSError] = js.native
  /**
    * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone. You can add protection to only a single resource with each CreateProtection request. If you want to add protection to multiple resources at once, use the AWS WAF console. For more information see Getting Started with AWS Shield Advanced and Add AWS Shield Advanced Protection to more AWS Resources.
    */
  def createProtection(params: CreateProtectionRequest): Request[CreateProtectionResponse, AWSError] = js.native
  def createProtection(
    params: CreateProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProtectionResponse, scala.Unit]
  ): Request[CreateProtectionResponse, AWSError] = js.native
  /**
    * Activates AWS Shield Advanced for an account. As part of this request you can specify EmergencySettings that automaticaly grant the DDoS response team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see Authorize the DDoS Response Team to Create Rules and Web ACLs on Your Behalf. To use the services of the DRT, you must be subscribed to the Business Support plan or the Enterprise Support plan. When you initally create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
    */
  def createSubscription(): Request[CreateSubscriptionResponse, AWSError] = js.native
  def createSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriptionResponse, scala.Unit]): Request[CreateSubscriptionResponse, AWSError] = js.native
  /**
    * Activates AWS Shield Advanced for an account. As part of this request you can specify EmergencySettings that automaticaly grant the DDoS response team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see Authorize the DDoS Response Team to Create Rules and Web ACLs on Your Behalf. To use the services of the DRT, you must be subscribed to the Business Support plan or the Enterprise Support plan. When you initally create a subscription, your subscription is set to be automatically renewed at the end of the existing subscription period. You can change this by submitting an UpdateSubscription request. 
    */
  def createSubscription(params: CreateSubscriptionRequest): Request[CreateSubscriptionResponse, AWSError] = js.native
  def createSubscription(
    params: CreateSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSubscriptionResponse, scala.Unit]
  ): Request[CreateSubscriptionResponse, AWSError] = js.native
  /**
    * Deletes an AWS Shield Advanced Protection.
    */
  def deleteProtection(): Request[DeleteProtectionResponse, AWSError] = js.native
  def deleteProtection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProtectionResponse, scala.Unit]): Request[DeleteProtectionResponse, AWSError] = js.native
  /**
    * Deletes an AWS Shield Advanced Protection.
    */
  def deleteProtection(params: DeleteProtectionRequest): Request[DeleteProtectionResponse, AWSError] = js.native
  def deleteProtection(
    params: DeleteProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProtectionResponse, scala.Unit]
  ): Request[DeleteProtectionResponse, AWSError] = js.native
  /**
    * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
    */
  def deleteSubscription(): Request[DeleteSubscriptionResponse, AWSError] = js.native
  def deleteSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriptionResponse, scala.Unit]): Request[DeleteSubscriptionResponse, AWSError] = js.native
  /**
    * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You cannot delete a subscription prior to the completion of that commitment. 
    */
  def deleteSubscription(params: DeleteSubscriptionRequest): Request[DeleteSubscriptionResponse, AWSError] = js.native
  def deleteSubscription(
    params: DeleteSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSubscriptionResponse, scala.Unit]
  ): Request[DeleteSubscriptionResponse, AWSError] = js.native
  /**
    * Describes the details of a DDoS attack. 
    */
  def describeAttack(): Request[DescribeAttackResponse, AWSError] = js.native
  def describeAttack(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttackResponse, scala.Unit]): Request[DescribeAttackResponse, AWSError] = js.native
  /**
    * Describes the details of a DDoS attack. 
    */
  def describeAttack(params: DescribeAttackRequest): Request[DescribeAttackResponse, AWSError] = js.native
  def describeAttack(
    params: DescribeAttackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAttackResponse, scala.Unit]
  ): Request[DescribeAttackResponse, AWSError] = js.native
  /**
    * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your AWS account while assisting with attack mitigation.
    */
  def describeDRTAccess(): Request[DescribeDRTAccessResponse, AWSError] = js.native
  def describeDRTAccess(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDRTAccessResponse, scala.Unit]): Request[DescribeDRTAccessResponse, AWSError] = js.native
  /**
    * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your AWS account while assisting with attack mitigation.
    */
  def describeDRTAccess(params: DescribeDRTAccessRequest): Request[DescribeDRTAccessResponse, AWSError] = js.native
  def describeDRTAccess(
    params: DescribeDRTAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDRTAccessResponse, scala.Unit]
  ): Request[DescribeDRTAccessResponse, AWSError] = js.native
  /**
    * Lists the email addresses that the DRT can use to contact you during a suspected attack.
    */
  def describeEmergencyContactSettings(): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  def describeEmergencyContactSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEmergencyContactSettingsResponse, scala.Unit]
  ): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  /**
    * Lists the email addresses that the DRT can use to contact you during a suspected attack.
    */
  def describeEmergencyContactSettings(params: DescribeEmergencyContactSettingsRequest): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  def describeEmergencyContactSettings(
    params: DescribeEmergencyContactSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEmergencyContactSettingsResponse, scala.Unit]
  ): Request[DescribeEmergencyContactSettingsResponse, AWSError] = js.native
  /**
    * Lists the details of a Protection object.
    */
  def describeProtection(): Request[DescribeProtectionResponse, AWSError] = js.native
  def describeProtection(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectionResponse, scala.Unit]): Request[DescribeProtectionResponse, AWSError] = js.native
  /**
    * Lists the details of a Protection object.
    */
  def describeProtection(params: DescribeProtectionRequest): Request[DescribeProtectionResponse, AWSError] = js.native
  def describeProtection(
    params: DescribeProtectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProtectionResponse, scala.Unit]
  ): Request[DescribeProtectionResponse, AWSError] = js.native
  /**
    * Provides details about the AWS Shield Advanced subscription for an account.
    */
  def describeSubscription(): Request[DescribeSubscriptionResponse, AWSError] = js.native
  def describeSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscriptionResponse, scala.Unit]): Request[DescribeSubscriptionResponse, AWSError] = js.native
  /**
    * Provides details about the AWS Shield Advanced subscription for an account.
    */
  def describeSubscription(params: DescribeSubscriptionRequest): Request[DescribeSubscriptionResponse, AWSError] = js.native
  def describeSubscription(
    params: DescribeSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSubscriptionResponse, scala.Unit]
  ): Request[DescribeSubscriptionResponse, AWSError] = js.native
  /**
    * Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your AWS WAF logs. To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTLogBucket request to remove this access.
    */
  def disassociateDRTLogBucket(): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  def disassociateDRTLogBucket(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTLogBucketResponse, scala.Unit]
  ): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  /**
    * Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your AWS WAF logs. To make a DisassociateDRTLogBucket request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTLogBucket request to remove this access.
    */
  def disassociateDRTLogBucket(params: DisassociateDRTLogBucketRequest): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  def disassociateDRTLogBucket(
    params: DisassociateDRTLogBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTLogBucketResponse, scala.Unit]
  ): Request[DisassociateDRTLogBucketResponse, AWSError] = js.native
  /**
    * Removes the DDoS Response team's (DRT) access to your AWS account. To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTRole request to remove this access.
    */
  def disassociateDRTRole(): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  def disassociateDRTRole(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTRoleResponse, scala.Unit]): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  /**
    * Removes the DDoS Response team's (DRT) access to your AWS account. To make a DisassociateDRTRole request, you must be subscribed to the Business Support plan or the Enterprise Support plan. However, if you are not subscribed to one of these support plans, but had been previously and had granted the DRT access to your account, you can submit a DisassociateDRTRole request to remove this access.
    */
  def disassociateDRTRole(params: DisassociateDRTRoleRequest): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  def disassociateDRTRole(
    params: DisassociateDRTRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDRTRoleResponse, scala.Unit]
  ): Request[DisassociateDRTRoleResponse, AWSError] = js.native
  /**
    * Returns the SubscriptionState, either Active or Inactive.
    */
  def getSubscriptionState(): Request[GetSubscriptionStateResponse, AWSError] = js.native
  def getSubscriptionState(callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionStateResponse, scala.Unit]): Request[GetSubscriptionStateResponse, AWSError] = js.native
  /**
    * Returns the SubscriptionState, either Active or Inactive.
    */
  def getSubscriptionState(params: GetSubscriptionStateRequest): Request[GetSubscriptionStateResponse, AWSError] = js.native
  def getSubscriptionState(
    params: GetSubscriptionStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSubscriptionStateResponse, scala.Unit]
  ): Request[GetSubscriptionStateResponse, AWSError] = js.native
  /**
    * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
    */
  def listAttacks(): Request[ListAttacksResponse, AWSError] = js.native
  def listAttacks(callback: js.Function2[/* err */ AWSError, /* data */ ListAttacksResponse, scala.Unit]): Request[ListAttacksResponse, AWSError] = js.native
  /**
    * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
    */
  def listAttacks(params: ListAttacksRequest): Request[ListAttacksResponse, AWSError] = js.native
  def listAttacks(
    params: ListAttacksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttacksResponse, scala.Unit]
  ): Request[ListAttacksResponse, AWSError] = js.native
  /**
    * Lists all Protection objects for the account.
    */
  def listProtections(): Request[ListProtectionsResponse, AWSError] = js.native
  def listProtections(callback: js.Function2[/* err */ AWSError, /* data */ ListProtectionsResponse, scala.Unit]): Request[ListProtectionsResponse, AWSError] = js.native
  /**
    * Lists all Protection objects for the account.
    */
  def listProtections(params: ListProtectionsRequest): Request[ListProtectionsResponse, AWSError] = js.native
  def listProtections(
    params: ListProtectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProtectionsResponse, scala.Unit]
  ): Request[ListProtectionsResponse, AWSError] = js.native
  /**
    * Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.
    */
  def updateEmergencyContactSettings(): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  def updateEmergencyContactSettings(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmergencyContactSettingsResponse, scala.Unit]
  ): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  /**
    * Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.
    */
  def updateEmergencyContactSettings(params: UpdateEmergencyContactSettingsRequest): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  def updateEmergencyContactSettings(
    params: UpdateEmergencyContactSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEmergencyContactSettingsResponse, scala.Unit]
  ): Request[UpdateEmergencyContactSettingsResponse, AWSError] = js.native
  /**
    * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.
    */
  def updateSubscription(): Request[UpdateSubscriptionResponse, AWSError] = js.native
  def updateSubscription(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriptionResponse, scala.Unit]): Request[UpdateSubscriptionResponse, AWSError] = js.native
  /**
    * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty parameters are not updated.
    */
  def updateSubscription(params: UpdateSubscriptionRequest): Request[UpdateSubscriptionResponse, AWSError] = js.native
  def updateSubscription(
    params: UpdateSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSubscriptionResponse, scala.Unit]
  ): Request[UpdateSubscriptionResponse, AWSError] = js.native
}

