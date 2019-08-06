package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MitigationActionIdentifier extends js.Object {
  /**
    * The IAM role ARN used to apply this mitigation action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.undefined
  /**
    * The friendly name of the mitigation action.
    */
  var actionName: js.UndefOr[MitigationActionName] = js.undefined
  /**
    * The date when this mitigation action was created.
    */
  var creationDate: js.UndefOr[Timestamp] = js.undefined
}

object MitigationActionIdentifier {
  @scala.inline
  def apply(
    actionArn: MitigationActionArn = null,
    actionName: MitigationActionName = null,
    creationDate: Timestamp = null
  ): MitigationActionIdentifier = {
    val __obj = js.Dynamic.literal()
    if (actionArn != null) __obj.updateDynamic("actionArn")(actionArn)
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    __obj.asInstanceOf[MitigationActionIdentifier]
  }
}

