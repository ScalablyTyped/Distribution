package typings
package awsDashSdkLib.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobOutput extends js.Object {
  var ArtifactList: js.UndefOr[ArtifactList] = js.undefined
  var Success: js.UndefOr[Success] = js.undefined
  var WarningMessage: js.UndefOr[WarningMessage] = js.undefined
}

object UpdateJobOutput {
  @scala.inline
  def apply(
    ArtifactList: ArtifactList = null,
    Success: js.UndefOr[Success] = js.undefined,
    WarningMessage: WarningMessage = null
  ): UpdateJobOutput = {
    val __obj = js.Dynamic.literal()
    if (ArtifactList != null) __obj.updateDynamic("ArtifactList")(ArtifactList)
    if (!js.isUndefined(Success)) __obj.updateDynamic("Success")(Success)
    if (WarningMessage != null) __obj.updateDynamic("WarningMessage")(WarningMessage)
    __obj.asInstanceOf[UpdateJobOutput]
  }
}

