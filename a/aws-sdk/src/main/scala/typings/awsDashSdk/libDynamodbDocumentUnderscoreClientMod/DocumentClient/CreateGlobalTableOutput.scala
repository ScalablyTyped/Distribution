package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGlobalTableOutput extends js.Object {
  /**
    * Contains the details of the global table.
    */
  var GlobalTableDescription: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.GlobalTableDescription
  ] = js.undefined
}

object CreateGlobalTableOutput {
  @scala.inline
  def apply(GlobalTableDescription: GlobalTableDescription = null): CreateGlobalTableOutput = {
    val __obj = js.Dynamic.literal()
    if (GlobalTableDescription != null) __obj.updateDynamic("GlobalTableDescription")(GlobalTableDescription)
    __obj.asInstanceOf[CreateGlobalTableOutput]
  }
}

