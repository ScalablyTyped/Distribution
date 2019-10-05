package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemInstanceDescription extends js.Object {
  var definition: js.UndefOr[DefinitionDocument] = js.undefined
  /**
    * The AWS Identity and Access Management (IAM) role that AWS IoT Things Graph assumes during flow execution in a cloud deployment. This role must have read and write permissionss to AWS Lambda and AWS IoT and to any other AWS services that the flow uses.
    */
  var flowActionsRoleArn: js.UndefOr[RoleArn] = js.undefined
  var metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined
  /**
    * The Amazon Simple Storage Service bucket where information about a system instance is stored.
    */
  var s3BucketName: js.UndefOr[S3BucketName] = js.undefined
  /**
    * An object that contains summary information about a system instance.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.undefined
  /**
    * A list of objects that contain all of the IDs and revision numbers of workflows and systems that are used in a system instance.
    */
  var validatedDependencyRevisions: js.UndefOr[DependencyRevisions] = js.undefined
  /**
    * The version of the user's namespace against which the system instance was validated.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
}

object SystemInstanceDescription {
  @scala.inline
  def apply(
    definition: DefinitionDocument = null,
    flowActionsRoleArn: RoleArn = null,
    metricsConfiguration: MetricsConfiguration = null,
    s3BucketName: S3BucketName = null,
    summary: SystemInstanceSummary = null,
    validatedDependencyRevisions: DependencyRevisions = null,
    validatedNamespaceVersion: Int | Double = null
  ): SystemInstanceDescription = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (flowActionsRoleArn != null) __obj.updateDynamic("flowActionsRoleArn")(flowActionsRoleArn)
    if (metricsConfiguration != null) __obj.updateDynamic("metricsConfiguration")(metricsConfiguration)
    if (s3BucketName != null) __obj.updateDynamic("s3BucketName")(s3BucketName)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (validatedDependencyRevisions != null) __obj.updateDynamic("validatedDependencyRevisions")(validatedDependencyRevisions)
    if (validatedNamespaceVersion != null) __obj.updateDynamic("validatedNamespaceVersion")(validatedNamespaceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInstanceDescription]
  }
}

