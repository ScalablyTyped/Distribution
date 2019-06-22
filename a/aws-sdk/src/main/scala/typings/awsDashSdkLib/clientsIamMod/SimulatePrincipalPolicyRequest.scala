package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimulatePrincipalPolicyRequest extends js.Object {
  /**
    * A list of names of API operations to evaluate in the simulation. Each operation is evaluated for each resource. Each operation must include the service identifier, such as iam:CreateUser.
    */
  var ActionNames: ActionNameListType
  /**
    * The ARN of the IAM user that you want to specify as the simulated caller of the API operations. If you do not specify a CallerArn, it defaults to the ARN of the user that you specify in PolicySourceArn, if you specified a user. If you include both a PolicySourceArn (for example, arn:aws:iam::123456789012:user/David) and a CallerArn (for example, arn:aws:iam::123456789012:user/Bob), the result is that you simulate calling the API operations as Bob, as if Bob had David's policies. You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a service principal.  CallerArn is required if you include a ResourcePolicy and the PolicySourceArn is not the ARN for an IAM user. This is required so that the resource-based policy's Principal element has a value to use in evaluating the policy. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var CallerArn: js.UndefOr[ResourceNameType] = js.undefined
  /**
    * A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in one of the simulated IAM permissions policies, the corresponding value is supplied.
    */
  var ContextEntries: js.UndefOr[ContextEntryListType] = js.undefined
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.undefined
  /**
    * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
    */
  var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  /**
    * An optional list of additional policy documents to include in the simulation. Each document is specified as a string containing the complete, valid JSON text of an IAM policy. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var PolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of a user, group, or role whose policies you want to include in the simulation. If you specify a user, group, or role, the simulation includes all policies that are associated with that entity. If you specify a user, the simulation also includes all policies that are attached to any groups the user belongs to. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicySourceArn: arnType
  /**
    * A list of ARNs of AWS resources to include in the simulation. If this parameter is not provided, then the value defaults to * (all resources). Each API in the ActionNames parameter is evaluated for each resource in this list. The simulation determines the access result (allowed or denied) of each combination and reports it in the response. The simulation does not automatically retrieve policies for the specified resources. If you want to include a resource policy in the simulation, then you must include the policy as a string in the ResourcePolicy parameter. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var ResourceArns: js.UndefOr[ResourceNameListType] = js.undefined
  /**
    * Specifies the type of simulation to run. Different API operations that support resource-based policies require different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does not match one of the following scenarios, then you can omit this parameter. The following list shows each of the supported scenario values and the resources that you must define to run the simulation. Each of the EC2 scenarios requires that you specify instance, image, and security group resources. If your scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes VPC, then you must supply the network interface resource. If it includes an IP subnet, then you must specify the subnet resource. For more information on the EC2 scenario options, see Supported Platforms in the Amazon EC2 User Guide.    EC2-Classic-InstanceStore  instance, image, security group    EC2-Classic-EBS  instance, image, security group, volume    EC2-VPC-InstanceStore  instance, image, security group, network interface    EC2-VPC-InstanceStore-Subnet  instance, image, security group, network interface, subnet    EC2-VPC-EBS  instance, image, security group, network interface, volume    EC2-VPC-EBS-Subnet  instance, image, security group, network interface, subnet, volume  
    */
  var ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType] = js.undefined
  /**
    * An AWS account ID that specifies the owner of any simulated resource that does not identify its owner in the resource ARN. Examples of resource ARNs include an S3 bucket or object. If ResourceOwner is specified, it is also used as the account owner of any ResourcePolicy included in the simulation. If the ResourceOwner parameter is not specified, then the owner of the resources and the resource policy defaults to the account of the identity provided in CallerArn. This parameter is required only if you specify a resource-based policy and account that owns the resource is different from the account that owns the simulated calling user CallerArn.
    */
  var ResourceOwner: js.UndefOr[ResourceNameType] = js.undefined
  /**
    * A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is treated as if it had this policy attached. You can include only one resource-based policy in a simulation. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var ResourcePolicy: js.UndefOr[policyDocumentType] = js.undefined
}

object SimulatePrincipalPolicyRequest {
  @scala.inline
  def apply(
    ActionNames: ActionNameListType,
    PolicySourceArn: arnType,
    CallerArn: ResourceNameType = null,
    ContextEntries: ContextEntryListType = null,
    Marker: markerType = null,
    MaxItems: js.UndefOr[maxItemsType] = js.undefined,
    PolicyInputList: SimulationPolicyListType = null,
    ResourceArns: ResourceNameListType = null,
    ResourceHandlingOption: ResourceHandlingOptionType = null,
    ResourceOwner: ResourceNameType = null,
    ResourcePolicy: policyDocumentType = null
  ): SimulatePrincipalPolicyRequest = {
    val __obj = js.Dynamic.literal(ActionNames = ActionNames, PolicySourceArn = PolicySourceArn)
    if (CallerArn != null) __obj.updateDynamic("CallerArn")(CallerArn)
    if (ContextEntries != null) __obj.updateDynamic("ContextEntries")(ContextEntries)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    if (PolicyInputList != null) __obj.updateDynamic("PolicyInputList")(PolicyInputList)
    if (ResourceArns != null) __obj.updateDynamic("ResourceArns")(ResourceArns)
    if (ResourceHandlingOption != null) __obj.updateDynamic("ResourceHandlingOption")(ResourceHandlingOption)
    if (ResourceOwner != null) __obj.updateDynamic("ResourceOwner")(ResourceOwner)
    if (ResourcePolicy != null) __obj.updateDynamic("ResourcePolicy")(ResourcePolicy)
    __obj.asInstanceOf[SimulatePrincipalPolicyRequest]
  }
}

