package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGlobalTableOutput extends js.Object {
  /**
    * Contains the details of the global table.
    */
  var GlobalTableDescription: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.GlobalTableDescription
  ] = js.undefined
}

object UpdateGlobalTableOutput {
  @scala.inline
  def apply(GlobalTableDescription: GlobalTableDescription = null): UpdateGlobalTableOutput = {
    val __obj = js.Dynamic.literal()
    if (GlobalTableDescription != null) __obj.updateDynamic("GlobalTableDescription")(GlobalTableDescription)
    __obj.asInstanceOf[UpdateGlobalTableOutput]
  }
}

