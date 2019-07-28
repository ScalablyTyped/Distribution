package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareError extends js.Object {
  /**
    * List of accounts impacted by the error.
    */
  var Accounts: js.UndefOr[Namespaces] = js.undefined
  /**
    * Error type that happened when processing the operation.
    */
  var Error: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Error] = js.undefined
  /**
    * Information about the error.
    */
  var Message: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Message] = js.undefined
}

object ShareError {
  @scala.inline
  def apply(Accounts: Namespaces = null, Error: Error = null, Message: Message = null): ShareError = {
    val __obj = js.Dynamic.literal()
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts)
    if (Error != null) __obj.updateDynamic("Error")(Error)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[ShareError]
  }
}

