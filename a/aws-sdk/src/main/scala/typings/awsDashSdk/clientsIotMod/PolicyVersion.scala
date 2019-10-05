package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyVersion extends js.Object {
  /**
    * The date and time the policy was created.
    */
  var createDate: js.UndefOr[DateType] = js.undefined
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined
  /**
    * The policy version ID.
    */
  var versionId: js.UndefOr[PolicyVersionId] = js.undefined
}

object PolicyVersion {
  @scala.inline
  def apply(
    createDate: DateType = null,
    isDefaultVersion: js.UndefOr[scala.Boolean] = js.undefined,
    versionId: PolicyVersionId = null
  ): PolicyVersion = {
    val __obj = js.Dynamic.literal()
    if (createDate != null) __obj.updateDynamic("createDate")(createDate)
    if (!js.isUndefined(isDefaultVersion)) __obj.updateDynamic("isDefaultVersion")(isDefaultVersion)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[PolicyVersion]
  }
}

