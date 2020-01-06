package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobFlowDetail extends js.Object {
  /**
    * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later, ReleaseLabel is used. To specify a custom AMI, use CustomAmiID.
    */
  var AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides a way for the automatic scaling feature to get the required permissions it needs to launch and terminate EC2 instances in an instance group.
    */
  var AutoScalingRole: js.UndefOr[XmlString] = js.native
  /**
    * A list of the bootstrap actions run by the job flow.
    */
  var BootstrapActions: js.UndefOr[BootstrapActionDetailList] = js.native
  /**
    * Describes the execution status of the job flow.
    */
  var ExecutionStatusDetail: JobFlowExecutionStatusDetail = js.native
  /**
    * Describes the Amazon EC2 instances of the job flow.
    */
  var Instances: JobFlowInstancesDetail = js.native
  /**
    * The job flow identifier.
    */
  var JobFlowId: XmlStringMaxLen256 = js.native
  /**
    * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this role.
    */
  var JobFlowRole: js.UndefOr[XmlString] = js.native
  /**
    * The location in Amazon S3 where log files for the job are stored.
    */
  var LogUri: js.UndefOr[XmlString] = js.native
  /**
    * The name of the job flow.
    */
  var Name: XmlStringMaxLen256 = js.native
  /**
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
    */
  var ScaleDownBehavior: js.UndefOr[typings.awsDashSdk.clientsEmrMod.ScaleDownBehavior] = js.native
  /**
    * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
    */
  var ServiceRole: js.UndefOr[XmlString] = js.native
  /**
    * A list of steps run by the job flow.
    */
  var Steps: js.UndefOr[StepDetailList] = js.native
  /**
    * A list of strings set by third party software when the job flow is launched. If you are not using third party software to manage the job flow this value is empty.
    */
  var SupportedProducts: js.UndefOr[SupportedProductsList] = js.native
  /**
    * Indicates whether the cluster is visible to all IAM users of the AWS account associated with the cluster. The default value, true, indicates that all IAM users in the AWS account can perform cluster actions if they have the proper IAM policy permissions. If this value is false, only the IAM user that created the cluster can perform actions. This value can be changed on a running cluster by using the SetVisibleToAllUsers action. You can override the default value of true when you create a cluster by using the VisibleToAllUsers parameter of the RunJobFlow action.
    */
  var VisibleToAllUsers: js.UndefOr[Boolean] = js.native
}

object JobFlowDetail {
  @scala.inline
  def apply(
    ExecutionStatusDetail: JobFlowExecutionStatusDetail,
    Instances: JobFlowInstancesDetail,
    JobFlowId: XmlStringMaxLen256,
    Name: XmlStringMaxLen256,
    AmiVersion: XmlStringMaxLen256 = null,
    AutoScalingRole: XmlString = null,
    BootstrapActions: BootstrapActionDetailList = null,
    JobFlowRole: XmlString = null,
    LogUri: XmlString = null,
    ScaleDownBehavior: ScaleDownBehavior = null,
    ServiceRole: XmlString = null,
    Steps: StepDetailList = null,
    SupportedProducts: SupportedProductsList = null,
    VisibleToAllUsers: js.UndefOr[scala.Boolean] = js.undefined
  ): JobFlowDetail = {
    val __obj = js.Dynamic.literal(ExecutionStatusDetail = ExecutionStatusDetail.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any], JobFlowId = JobFlowId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (AmiVersion != null) __obj.updateDynamic("AmiVersion")(AmiVersion.asInstanceOf[js.Any])
    if (AutoScalingRole != null) __obj.updateDynamic("AutoScalingRole")(AutoScalingRole.asInstanceOf[js.Any])
    if (BootstrapActions != null) __obj.updateDynamic("BootstrapActions")(BootstrapActions.asInstanceOf[js.Any])
    if (JobFlowRole != null) __obj.updateDynamic("JobFlowRole")(JobFlowRole.asInstanceOf[js.Any])
    if (LogUri != null) __obj.updateDynamic("LogUri")(LogUri.asInstanceOf[js.Any])
    if (ScaleDownBehavior != null) __obj.updateDynamic("ScaleDownBehavior")(ScaleDownBehavior.asInstanceOf[js.Any])
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole.asInstanceOf[js.Any])
    if (Steps != null) __obj.updateDynamic("Steps")(Steps.asInstanceOf[js.Any])
    if (SupportedProducts != null) __obj.updateDynamic("SupportedProducts")(SupportedProducts.asInstanceOf[js.Any])
    if (!js.isUndefined(VisibleToAllUsers)) __obj.updateDynamic("VisibleToAllUsers")(VisibleToAllUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowDetail]
  }
}

