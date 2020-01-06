package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemTemplateSummary extends js.Object {
  /**
    * The ARN of the system.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The date when the system was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The ID of the system.
    */
  var id: js.UndefOr[Urn] = js.native
  /**
    * The revision number of the system.
    */
  var revisionNumber: js.UndefOr[Version] = js.native
}

object SystemTemplateSummary {
  @scala.inline
  def apply(arn: Arn = null, createdAt: Timestamp = null, id: Urn = null, revisionNumber: Int | Double = null): SystemTemplateSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (revisionNumber != null) __obj.updateDynamic("revisionNumber")(revisionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemTemplateSummary]
  }
}

