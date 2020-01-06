package typings.awsDashSdk.clientsAccessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Finding extends js.Object {
  /**
    * The action in the analyzed policy statement that an external principal has permission to use.
    */
  var action: js.UndefOr[ActionList] = js.native
  /**
    * The time at which the resource was analyzed.
    */
  var analyzedAt: Timestamp = js.native
  /**
    * The condition in the analyzed policy statement that resulted in a finding.
    */
  var condition: ConditionKeyMap = js.native
  /**
    * The time at which the finding was generated.
    */
  var createdAt: Timestamp = js.native
  /**
    * An error.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * The ID of the finding.
    */
  var id: FindingId = js.native
  /**
    * Indicates whether the policy that generated the finding allows public access to the resource.
    */
  var isPublic: js.UndefOr[Boolean] = js.native
  /**
    * The external principal that access to a resource within the zone of trust.
    */
  var principal: js.UndefOr[PrincipalMap] = js.native
  /**
    * The resource that an external principal has access to.
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * The type of the resource reported in the finding.
    */
  var resourceType: ResourceType = js.native
  /**
    * The current status of the finding.
    */
  var status: FindingStatus = js.native
  /**
    * The time at which the finding was updated.
    */
  var updatedAt: Timestamp = js.native
}

object Finding {
  @scala.inline
  def apply(
    analyzedAt: Timestamp,
    condition: ConditionKeyMap,
    createdAt: Timestamp,
    id: FindingId,
    resourceType: ResourceType,
    status: FindingStatus,
    updatedAt: Timestamp,
    action: ActionList = null,
    error: String = null,
    isPublic: js.UndefOr[scala.Boolean] = js.undefined,
    principal: PrincipalMap = null,
    resource: String = null
  ): Finding = {
    val __obj = js.Dynamic.literal(analyzedAt = analyzedAt.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isPublic)) __obj.updateDynamic("isPublic")(isPublic.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
}

