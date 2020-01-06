package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobOutput extends js.Object {
  var ArtifactList: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.ArtifactList] = js.native
  var Success: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.Success] = js.native
  var WarningMessage: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.WarningMessage] = js.native
}

object UpdateJobOutput {
  @scala.inline
  def apply(
    ArtifactList: ArtifactList = null,
    Success: js.UndefOr[Boolean] = js.undefined,
    WarningMessage: WarningMessage = null
  ): UpdateJobOutput = {
    val __obj = js.Dynamic.literal()
    if (ArtifactList != null) __obj.updateDynamic("ArtifactList")(ArtifactList.asInstanceOf[js.Any])
    if (!js.isUndefined(Success)) __obj.updateDynamic("Success")(Success.asInstanceOf[js.Any])
    if (WarningMessage != null) __obj.updateDynamic("WarningMessage")(WarningMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobOutput]
  }
}

