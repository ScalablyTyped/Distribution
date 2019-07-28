package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSetOptions extends js.Object {
  /**
    * Set to true if you want to validate the type of each element in the set. Defaults to false.
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object CreateSetOptions {
  @scala.inline
  def apply(validate: js.UndefOr[Boolean] = js.undefined): CreateSetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[CreateSetOptions]
  }
}

