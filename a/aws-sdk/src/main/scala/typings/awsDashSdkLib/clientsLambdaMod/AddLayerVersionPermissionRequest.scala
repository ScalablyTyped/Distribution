package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddLayerVersionPermissionRequest extends js.Object {
  /**
    * The API action that grants access to the layer. For example, lambda:GetLayerVersion.
    */
  var Action: LayerPermissionAllowedAction
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: awsDashSdkLib.clientsLambdaMod.LayerName
  /**
    * With the principal set to *, grant permission to all accounts in the specified organization.
    */
  var OrganizationId: js.UndefOr[OrganizationId] = js.undefined
  /**
    * An account ID, or * to grant permission to all AWS accounts.
    */
  var Principal: LayerPermissionAllowedPrincipal
  /**
    * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * An identifier that distinguishes the policy from others on the same layer version.
    */
  var StatementId: awsDashSdkLib.clientsLambdaMod.StatementId
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber
}

object AddLayerVersionPermissionRequest {
  @scala.inline
  def apply(
    Action: LayerPermissionAllowedAction,
    LayerName: LayerName,
    Principal: LayerPermissionAllowedPrincipal,
    StatementId: StatementId,
    VersionNumber: LayerVersionNumber,
    OrganizationId: OrganizationId = null,
    RevisionId: String = null
  ): AddLayerVersionPermissionRequest = {
    val __obj = js.Dynamic.literal(Action = Action, LayerName = LayerName, Principal = Principal, StatementId = StatementId, VersionNumber = VersionNumber)
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    __obj.asInstanceOf[AddLayerVersionPermissionRequest]
  }
}

