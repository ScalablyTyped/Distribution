package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContinuousBackupsOutput extends js.Object {
  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  var ContinuousBackupsDescription: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ContinuousBackupsDescription
  ] = js.native
}

object UpdateContinuousBackupsOutput {
  @scala.inline
  def apply(ContinuousBackupsDescription: ContinuousBackupsDescription = null): UpdateContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal()
    if (ContinuousBackupsDescription != null) __obj.updateDynamic("ContinuousBackupsDescription")(ContinuousBackupsDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContinuousBackupsOutput]
  }
}

