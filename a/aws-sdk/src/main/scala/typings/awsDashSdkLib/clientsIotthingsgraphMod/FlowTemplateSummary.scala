package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowTemplateSummary extends js.Object {
  /**
    * The ARN of the workflow.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The date when the workflow was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ID of the workflow.
    */
  var id: js.UndefOr[Urn] = js.undefined
  /**
    * The revision number of the workflow.
    */
  var revisionNumber: js.UndefOr[Version] = js.undefined
}

object FlowTemplateSummary {
  @scala.inline
  def apply(
    arn: Arn = null,
    createdAt: Timestamp = null,
    id: Urn = null,
    revisionNumber: js.UndefOr[Version] = js.undefined
  ): FlowTemplateSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(revisionNumber)) __obj.updateDynamic("revisionNumber")(revisionNumber)
    __obj.asInstanceOf[FlowTemplateSummary]
  }
}

