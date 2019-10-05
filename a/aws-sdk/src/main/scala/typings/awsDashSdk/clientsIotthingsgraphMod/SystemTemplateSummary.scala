package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemTemplateSummary extends js.Object {
  /**
    * The ARN of the system.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The date when the system was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ID of the system.
    */
  var id: js.UndefOr[Urn] = js.undefined
  /**
    * The revision number of the system.
    */
  var revisionNumber: js.UndefOr[Version] = js.undefined
}

object SystemTemplateSummary {
  @scala.inline
  def apply(arn: Arn = null, createdAt: Timestamp = null, id: Urn = null, revisionNumber: Int | Double = null): SystemTemplateSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (id != null) __obj.updateDynamic("id")(id)
    if (revisionNumber != null) __obj.updateDynamic("revisionNumber")(revisionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemTemplateSummary]
  }
}

