package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveLayerVersionPermissionRequest extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: awsDashSdkLib.clientsLambdaMod.LayerName
  /**
    * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * The identifier that was specified when the statement was added.
    */
  var StatementId: awsDashSdkLib.clientsLambdaMod.StatementId
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber
}

object RemoveLayerVersionPermissionRequest {
  @scala.inline
  def apply(
    LayerName: LayerName,
    StatementId: StatementId,
    VersionNumber: LayerVersionNumber,
    RevisionId: String = null
  ): RemoveLayerVersionPermissionRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName, StatementId = StatementId, VersionNumber = VersionNumber)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    __obj.asInstanceOf[RemoveLayerVersionPermissionRequest]
  }
}

