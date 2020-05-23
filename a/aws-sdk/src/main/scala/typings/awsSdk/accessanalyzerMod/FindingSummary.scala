package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingSummary extends js.Object {
  /**
    * The action in the analyzed policy statement that an external principal has permission to use.
    */
  var action: js.UndefOr[ActionList] = js.native
  /**
    * The time at which the resource-based policy that generated the finding was analyzed.
    */
  var analyzedAt: Timestamp = js.native
  /**
    * The condition in the analyzed policy statement that resulted in a finding.
    */
  var condition: ConditionKeyMap = js.native
  /**
    * The time at which the finding was created.
    */
  var createdAt: Timestamp = js.native
  /**
    * The error that resulted in an Error finding.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * The ID of the finding.
    */
  var id: FindingId = js.native
  /**
    * Indicates whether the finding reports a resource that has a policy that allows public access.
    */
  var isPublic: js.UndefOr[Boolean] = js.native
  /**
    * The external principal that has access to a resource within the zone of trust.
    */
  var principal: js.UndefOr[PrincipalMap] = js.native
  /**
    * The resource that the external principal has access to.
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * The AWS account ID that owns the resource.
    */
  var resourceOwnerAccount: String = js.native
  /**
    * The type of the resource that the external principal has access to.
    */
  var resourceType: ResourceType = js.native
  /**
    * The sources of the finding. This indicates how the access that generated the finding is granted. It is populated for Amazon S3 bucket findings.
    */
  var sources: js.UndefOr[FindingSourceList] = js.native
  /**
    * The status of the finding.
    */
  var status: FindingStatus = js.native
  /**
    * The time at which the finding was most recently updated.
    */
  var updatedAt: Timestamp = js.native
}

object FindingSummary {
  @scala.inline
  def apply(
    analyzedAt: Timestamp,
    condition: ConditionKeyMap,
    createdAt: Timestamp,
    id: FindingId,
    resourceOwnerAccount: String,
    resourceType: ResourceType,
    status: FindingStatus,
    updatedAt: Timestamp,
    action: ActionList = null,
    error: String = null,
    isPublic: js.UndefOr[Boolean] = js.undefined,
    principal: PrincipalMap = null,
    resource: String = null,
    sources: FindingSourceList = null
  ): FindingSummary = {
    val __obj = js.Dynamic.literal(analyzedAt = analyzedAt.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isPublic)) __obj.updateDynamic("isPublic")(isPublic.get.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingSummary]
  }
}

