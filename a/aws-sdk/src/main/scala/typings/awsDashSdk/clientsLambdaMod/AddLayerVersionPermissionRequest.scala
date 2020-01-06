package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddLayerVersionPermissionRequest extends js.Object {
  /**
    * The API action that grants access to the layer. For example, lambda:GetLayerVersion.
    */
  var Action: LayerPermissionAllowedAction = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsDashSdk.clientsLambdaMod.LayerName = js.native
  /**
    * With the principal set to *, grant permission to all accounts in the specified organization.
    */
  var OrganizationId: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.OrganizationId] = js.native
  /**
    * An account ID, or * to grant permission to all AWS accounts.
    */
  var Principal: LayerPermissionAllowedPrincipal = js.native
  /**
    * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * An identifier that distinguishes the policy from others on the same layer version.
    */
  var StatementId: typings.awsDashSdk.clientsLambdaMod.StatementId = js.native
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber = js.native
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
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddLayerVersionPermissionRequest]
  }
}

