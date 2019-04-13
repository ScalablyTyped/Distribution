package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddLayerVersionPermissionResponse extends js.Object {
  /**
    * A unique identifier for the current revision of the policy.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * The permission statement.
    */
  var Statement: js.UndefOr[String] = js.undefined
}

object AddLayerVersionPermissionResponse {
  @scala.inline
  def apply(RevisionId: String = null, Statement: String = null): AddLayerVersionPermissionResponse = {
    val __obj = js.Dynamic.literal()
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    if (Statement != null) __obj.updateDynamic("Statement")(Statement)
    __obj.asInstanceOf[AddLayerVersionPermissionResponse]
  }
}

